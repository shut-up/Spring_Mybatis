package cn.parker.ssm.mapper;

import java.util.List;

import cn.parker.ssm.po.User;

/*
 * dao接口
 */

public interface UserMapper {
	public User findUserById(int id)throws Exception;
}
