package com.edu.springJDBC.dao;

import com.edu.springJDBC.entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookDao {

    void add(Book book);

    void update(Book book);

    void select(Book book);

    void selectOne(Book book);

    List<Book> selectList();

    void batchAddBook(List<Object[]> batchArgs);

    void deltetBatch(List<Object[]> list);
}
