package wiki.leon.test.demo1.base;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * ClassName:DaoReaderImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author  slj
 * @version  
 * @Date	 2015年8月6日
 */
@Component("daoReader")
public class DaoReaderImpl extends SqlMapClientDaoSupport implements IbatisDaoReaderFactory
	{

		@Resource(name="sqlMapClient")
		private SqlMapClient sqlMapClientReader;
		//实例化后调用
		@PostConstruct
	    public void initSqlMapClient(){
	        super.setSqlMapClient(sqlMapClientReader);
		} 
		
		/**
		 * 手动切换数据库时设置 SqlMapClient
		 * @Title: initSqlMapClient 
		 * @Description: TODO
		 * @param @param sqlMapClient    
		 * @return void    
		 * @throws
		 */
		public void initSqlMapClient(SqlMapClient sqlMapClient) {
			super.setSqlMapClient(sqlMapClient);
		}
		
		@SuppressWarnings("unchecked")
      public <T> T queryForObject(String statementName) throws BaseSQLException{
			Assert.notNull(statementName);
			try {
				return (T) this.getSqlMapClientTemplate().queryForObject(statementName);
			} catch (Exception e) {
				
				throw new BaseSQLException(this.getClass() + "->" + e.getMessage(), e);
			}
		}
		public <T> T queryForObject(String statementName, Object obj) {
			Assert.notNull(statementName);
			Assert.notNull(obj);
			try {
				return (T) this.getSqlMapClientTemplate().queryForObject(statementName,obj);
			} catch (Exception e) {
				
				throw new BaseSQLException(this.getClass() + "->" + e.getMessage(), e);
			}
		}
		public <T> List<T> queryForList(String statementName) {
			Assert.notNull(statementName);
			try {
				return (List<T>) this.getSqlMapClientTemplate().queryForList(statementName);
			} catch (Exception e) {
				
				throw new BaseSQLException(this.getClass() + "->" + e.getMessage(), e);
			}
		}
		public <T> List<T> queryForList(String statementName, Object obj) {
			Assert.notNull(statementName);
			Assert.notNull(obj);
			try {
				return (List<T>) this.getSqlMapClientTemplate().queryForList(statementName,obj);
			} catch (Exception e) {
				
				throw new BaseSQLException(this.getClass() + "->" + e.getMessage(), e);
			}
		}
		public <T> Map queryForMap(String statementName, Object obj,String keyProperty) {
			Assert.notNull(statementName);
			Assert.notNull(obj);
			try {
				return this.getSqlMapClientTemplate().queryForMap(statementName, obj, keyProperty);
			} catch (Exception e) {
				
			
				throw new BaseSQLException(this.getClass() + "->" + e.getMessage(), e);
			}
		}
		public <T> Map queryForMap(String statementName, Object obj,String keyProperty, String valueProperty) {
			Assert.notNull(statementName);
			Assert.notNull(obj);
			try {
				return this.getSqlMapClientTemplate().queryForMap(statementName, obj, keyProperty, valueProperty);
			} catch (Exception e) {
			
				throw new BaseSQLException(this.getClass() + "->" + e.getMessage(), e);
			}
		}
		
		public <T> T  queryForList(String statementName, Object obj, int start, int end) {
		Assert.notNull(statementName);
		Assert.notNull(obj);
		try {
			return (T) this.getSqlMapClientTemplate().queryForList(
					statementName, obj, start, end);
		} catch (Exception e) {

			throw new BaseSQLException(this.getClass() + "->" + e.getMessage(),
					e);
		}
	}

	}

