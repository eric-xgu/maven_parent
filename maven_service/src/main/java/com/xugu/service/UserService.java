package com.xugu.service;

import com.xugu.dao.UserDao;

public class UserService {
    public  static void testService(){
        System.out.println("user service");
        UserDao.testDao();
    }
}
