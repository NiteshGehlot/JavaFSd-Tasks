package com.star.ems.bea;

import java.sql.Date;

public class Books { // Bean , Entity , Pojo , Model , DTO , VO


    private  int bid;
    private String bname;
    private double bprice;
    private  String btype;
    private  Date doi;


    public Books() {


    }


    public Books(int bid, String bname, double bprice, String btype, Date doi) {
        super();
        this.bid = bid;
        this.bname = bname;
        this.bprice = bprice;
        this.btype = btype;
        this.doi = doi;
    }


    public int getBid() {
        return bid;
    }


    public void setBid(int bid) {
        this.bid = bid;
    }


    public String getBname() {
        return bname;
    }


    public void setBname(String bname) {
        this.bname = bname;
    }


    public double getBprice() {
        return bprice;
    }


    public void setBprice(double bprice) {
        this.bprice = bprice;
    }


    public String getBtype() {
        return btype;
    }


    public void setBtype(String btype) {
        this.btype = btype;
    }


    public Date getDoi() {
        return doi;
    }


    public void setDoi(Date doi) {
        this.doi = doi;
    }


    @Override
    public String toString() {
        return "Employee [eid=" + bid + ", ename=" + bname + ", salary=" + bprice + ", job=" + btype + ", doj=" + doi
                + ", comm=" + "]";
    }





}

