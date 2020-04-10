package com.bruce.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bruce.app.User;

@Repository
public class UserDaoImpl {

	@Autowired
	private SqlSession session;

	public List<User> getUser() {
		return session.selectList("com.bruce.app.sql.selectUser");
	}
}
