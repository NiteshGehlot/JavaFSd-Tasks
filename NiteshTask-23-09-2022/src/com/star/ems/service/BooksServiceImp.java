package com.star.ems.service;

import com.star.ems.bea.Books;

import java.util.List;

public class BooksServiceImp implements IBooksService {
    @Override
    public int addBooks(Books books) {
        return 0;
    }

    @Override
    public int updateBooks(Books books) {
        return 0;
    }

    @Override
    public int deleteBooksById(int bid) {
        return 0;
    }

    @Override
    public Books selectBooksById(int bid) {
        return null;
    }

    @Override
    public List<Books> selectAllBooks() {
        return null;
    }

    public static boolean validateInputs(Books books) {

        boolean isValid = false;

        if (books.getBid() > 99 && books.getBname().length() > 3 && books.getBprice() > 1000 && books.getComm() > 0) {

            isValid = true;
        }

        return isValid;
    }
}
