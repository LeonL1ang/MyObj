package wiki.leon.test.demo1.service.impl;

import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import wiki.leon.test.demo1.base.BaseSQLException;
import wiki.leon.test.demo1.pojo.User;
import wiki.leon.test.demo1.service.BaseService;

/**
 * ClassName:ServiceDemoimpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author  slj
 * @version  
 * @param <T>
 * @Date	 2015年9月10日
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T>{

	public <T> List<T> query(String sql, Object obj) throws BaseSQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById(String sql, Object obj) throws BaseSQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<T> getList(String sql) throws BaseSQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public String findPassword(String loginname) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updatePassword(String loginname, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String findMobile(String loginname) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateMobile(String loginname, String mobile) {
		// TODO Auto-generated method stub
		return 0;
	}

}

