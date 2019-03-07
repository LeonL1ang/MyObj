package wiki.leon.test.demo1.service;



import java.util.List;

import wiki.leon.test.demo1.base.BaseSQLException;
import wiki.leon.test.demo1.pojo.User;

public interface BaseService<T> {
	
    public <T> List<T> query(String sql, Object obj)throws BaseSQLException;
    public User getUserById(String sql, Object obj)throws BaseSQLException;
    public List<T> getList(String sql)throws BaseSQLException;
	public String findPassword(String loginname);
	public int updatePassword(String loginname,String password);
	public String findMobile(String loginname);
	public int updateMobile(String loginname,String mobile);

}

