package com.kkb.mybatis01.phase01.dao;


import com.kkb.mybatis01.phase01.po.User;

public interface UserDao {

	User findUserById(int id);
}
