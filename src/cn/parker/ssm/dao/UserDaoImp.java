package cn.parker.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.parker.ssm.po.User;


/*
 * dao接口实现类
 */
public class UserDaoImp extends SqlSessionDaoSupport implements UserDao{

	
	@Override
	public User findUserById(int id) throws Exception {
		//继承SqlSessionDaoSupport，通过this.getSqlSession()获取sqlSession
		SqlSession sqlSession = this.getSqlSession();
		User user = sqlSession.selectOne("test.findUserById", id);
		return user;
	}
	
}
