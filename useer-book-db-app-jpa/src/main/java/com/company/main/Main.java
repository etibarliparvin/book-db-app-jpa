package com.company.main;

import com.company.dao.Context;
import com.company.dao.inter.UserDaoInter;
import com.company.models.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoInter userDao = Context.getUserDao();
        List<User> users = userDao.findAll();
        System.out.println(users);
    }
}
