package com.edu.springJDBC.service;

import com.edu.springJDBC.dao.BookDao;
import com.edu.springJDBC.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void selectCount(Book book){
        bookDao.select(book);
    }

    public void selectOne(Book book){
        bookDao.selectOne(book);
    }

    public List<Book> selectList() {
        return bookDao.selectList();
    }

    public void btachAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    public void deleteBatch(List<Object[]> list) {
        bookDao.deltetBatch(list);
    }
}
