package cn.parker.ssm.dao;

import cn.parker.ssm.po.User;

/*
 * dao接口
 */

public interface UserDao {
	public User findUserById(int id) throws Exception;
}
