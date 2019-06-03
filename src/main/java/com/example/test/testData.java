package com.example.test;
import  com.example.dao.customerDAO;

import java.util.List;
import  com.example.model.customer;
public class testData {
    public static void main(String[] args) {
        customerDAO customerDAO = new customerDAO();
        List<customer> listC = customerDAO.getAllCustomer();
        for (customer x:listC){
            System.out.println(x.getAge_customer());
        }
    }
}
