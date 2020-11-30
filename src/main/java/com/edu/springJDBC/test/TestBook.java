package com.edu.springJDBC.test;

import com.edu.springJDBC.entity.Book;
import com.edu.springJDBC.service.BookService;
import lombok.Lombok;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestBook {

    @Test
    public void bookBatchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService service = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<>();
        Object[] o1 = new Object[]{"美国陷阱", 1};
        Object[] o2 = new Object[]{"华为的冬天", 1};
        Object[] o3 = new Object[]{"浪潮之巅", 2};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        service.btachAdd(list);
    }

    @Test
    public void deleteBatch(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{5});
        list.add(new Object[]{6});
        list.add(new Object[]{7});
        list.add(new Object[]{8});
        bookService.deleteBatch(list);

    }

    @Test
    public void insertBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Book book = new Book("必然","1");
        service.addBook(book);
    }

    @Test
    public void updateBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Book book = new Book(1,"激荡30年","1");
        service.updateBook(book);
    }

    @Test
    public void selectBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Book book = new Book(1,"激荡30年","1");
        service.selectCount(book);
    }

    @Test
    public void selectOne(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService service = context.getBean("bookService", BookService.class);
        Book book = new Book(1,"激荡30年","1");
        service.selectOne(book);
    }

    @Test
    public void selectList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springJDBC.xml");
        BookService service = context.getBean("bookService", BookService.class);
        List<Book> list = service.selectList();
        list.forEach(System.out::println);
        System.out.println("****************");
        List<Book> collect = list.stream().map((book) -> {
            if(book.getUserId()>1){
                return book;
            }
            return null;
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}
