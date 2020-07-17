package com.kkb.mybatis02.dao;

import com.kkb.mybatis02.po.User;

public interface UserDao {

	User queryUserById(Integer id);
}
