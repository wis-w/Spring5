package com.edu.springJDBC.dao;

import com.edu.springJDBC.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component(value = "userService")
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        String sql = "insert into book (username,status) values(?,?)";
        // 参数传递
        int rs = jdbcTemplate.update(sql ,book.getUsername(),book.getStatus());
        System.out.println("增加影响的行数：" +rs);
    }

    @Override
    public void update(Book book) {
        String sql = "update book set username = ?, status = ?, user_id=? where user_id = ?";
        int rs = jdbcTemplate.update(sql, book.getUsername(), book.getStatus(), book.getUserId(), book.getUserId());
        System.out.println("修改影响的行数："+rs);
    }

    @Override
    public void select(Book book) {
        String sql = "select count(1) from book";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("查询的条数："+integer);
    }

    @Override
    public void selectOne(Book book) {
        String sql = "select * from book where user_id = ?";
        // 参数1：sql语句   参数2：封装对象   参数3：sql参数
        Book book1 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), book.getUserId());
        System.out.println("查询到的对象是："+book1.toString());
    }

    @Override
    public List<Book> selectList() {
        String sql = "select * from book";
        // 参数1：sql语句   参数2：封装对象   参数3：sql参数
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into book (username,status) values(?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("操作结果："+Arrays.toString(ints));
    }

    @Override
    public void deltetBatch(List<Object[]> list) {
        String sql = "delete from book where user_id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.asList(list));
    }


}
