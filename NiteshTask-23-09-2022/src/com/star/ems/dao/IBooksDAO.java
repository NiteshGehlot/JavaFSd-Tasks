package com.star.ems.dao;

import com.star.ems.bea.Books;

import java.util.List;

public interface IBooksDAO {

    public int addBooks(Books books);
    public int updateBooks(Books books);

    public int deleteBooksById(int bid);
    public Books selectBooksById(int bid);

    public List<Books> selectAllBooks();
}
