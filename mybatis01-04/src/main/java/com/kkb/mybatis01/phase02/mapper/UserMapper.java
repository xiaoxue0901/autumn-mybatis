package com.kkb.mybatis01.phase02.mapper;

import com.kkb.mybatis01.phase01.po.User;

public interface UserMapper {
	User findUserById(int id);
}
