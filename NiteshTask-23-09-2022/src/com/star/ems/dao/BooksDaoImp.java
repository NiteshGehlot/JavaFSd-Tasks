package com.star.ems.dao;

import com.star.ems.bea.Books;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BooksDaoImp implements IBooksDAO {

    Connection conn = DBUtil.getDBConnection();

    @Override
    public int addBooks(Books books) {

        int count = 0;

        try {
            String insertQuery = "insert into books(bid,bname,bprice,btype,doi) values(?,?,?,?,current_date)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            pstmt.setInt(1, books.getBid());
            pstmt.setString(2, books.getBname());
            pstmt.setDouble(3, books.getBprice());
            pstmt.setString(4, books.getBtype());

            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return count;


    }

    @Override
    public int updateBooks(Books books) {


        int count = 0;

        try {
            String updateQuery = "update books set bname =? , bprice = ?, btype = ? where bid = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateQuery);

            pstmt.setString(1, books.getBname());
            pstmt.setDouble(2, books.getBprice());
            pstmt.setString(3, books.getBtype());
            pstmt.setInt(4, books.getBid());

            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return count;

    }

    @Override
    public int deleteBooksById(int bid) {
        String deleteQuery = "delete from books where bid = ?";

        PreparedStatement pstmt;
        int deleteCount = 0;
        try {
            pstmt = conn.prepareStatement(deleteQuery);

            pstmt.setInt(1, bid);

            deleteCount = pstmt.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return deleteCount;
    }

    @Override
    public Books selectBooksById(int bid) {
        String selectQuery = "select * from books where eid = ?";

        PreparedStatement pstmt;

        Books books = new Books();

        try {
            pstmt = conn.prepareStatement(selectQuery);

            pstmt.setInt(1, bid);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                books.setBid(rs.getInt("bid"));
                books.setBname(rs.getString("bname"));
                books.setBprice(rs.getDouble("bprice"));
                books.setDoi(rs.getDate("doi"));
                books.setBtype(rs.getString("btype"));

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return books;

    }

    @Override
    public List<Books> selectAllBooks() {
        String selectQuery = "select * from books";

        PreparedStatement pstmt;

        List<Books> list = new ArrayList<Books>();

        try {
            pstmt = conn.prepareStatement(selectQuery);

            ResultSet rs = pstmt.executeQuery();



            while (rs.next()) {

                Books books = new Books();
                books.setBid(rs.getInt("bid"));
                books.setBname(rs.getString("bname"));
                books.setBprice(rs.getDouble("bprice"));
                books.setDoi(rs.getDate("doi"));
                books.setBtype(rs.getString("btype"));

                list.add(books);

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return list;
    }

}
