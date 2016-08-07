package org.alan.basic.dao;

import java.util.List;
import java.util.Map;

import org.alan.basic.model.Pager;

/**
 * 公共的DAO处理对象，这个对象包含了Hibernate的所有的基本操作和对SQL的操作
 * 
 * @author liu
 *
 * @param <T>
 */

public interface IbaseDao<T> {

	// 插入对象
	public T add(T t);

	// 更新对象
	public void update(T t);

	// 根据id删除对象
	public void delelte(int id);

	// 根据id加载对象
	public T load(int id);
	
	/**
	 * 不分页列表查询对象
	 * @param hql
	 * @param args
	 * @return
	 */
	public List<T> list(String hql, Object[] args);
	public List<T> list(String hql, Object arg);
	public List<T> list(String hql);
	/**
	 * 基于别名和查询参数的混合列表对象
	 * @param hql
	 * @param args
	 * @param alias
	 * @return
	 */
	
	public List<T> list(String hql,Object[ ] args,Map<String ,Object> alias);
	public List<T> list(String hql,Map<String ,Object> alias);
	
	/**
	 * 分页列表查询对象
	 * @param hql
	 * @param args
	 * @return
	 */
	public Pager<T> find(String hql, Object[] args);
	public Pager<T> find(String hql, Object arg);
	public Pager<T> find(String hql);
	/**
	 * 基于别名和查询参数的混合列表对象
	 * @param hql
	 * @param args
	 * @param alias 别名对象
	 * @return
	 */
	
	public Pager<T> find(String hql,Object[ ] args,Map<String ,Object> alias);
	public Pager<T> find(String hql,Map<String ,Object> alias);
	/**
	 * 根据hql查询一组对象
	 * @param hql
	 * @param args
	 * @return
	 */
	public Object queryObject(String hql,Object[] args);
	public Object queryObject(String hql,Object arg);
	public Object queryObject(String hql);
	/**
	 *  根据hql更新对象
	 * @param hql
	 * @param args
	 */
	public void updateByHql(String hql,Object[] args);
	public void updateByHql(String hql,Object arg);
	public void updateByHql(String hql); 
	/**
	 * 根据SQL查询对象，不包含关联对象
	 * @param sql 查询的sql语句
	 * @param args 查询条件
	 * @param clz 查询实体对象
	 * @param hasEntity 该对象是否是一个hibernate所管理的对象，如果不是需要使用setResultTransForm查询;
	 * @return 一组对象
	 */
	
	public List<T> listBySql (String sql,Object[] args,Class<T> clz,boolean hasEntity);
	public List<T> listBySql (String sql,Object arg,Class<T> clz,boolean hasEntity);
	public List<T> listBySql (String sql,Class<T> clz,boolean hasEntity);
	public List<T> listBySql(String sql,Object[ ] args, Map<String,Object> alias,Class<T> clz,boolean hasEntity);
	public List<T> listBySql(String sql,Map<String,Object> alias, Class<T> clz,boolean hasEntity);
	
	
	/**
	 * 根据SQL查询对象，不 包含关联对象
	 * @param sql 查询的sql语句
	 * @param args 查询条件
	 * @param clz 查询实体对象
	 * @param hasEntity 该对象是否是一个hibernate所管理的对象，如果不是需要使用setResultTransForm查询;
	 * @return 一组对象
	 */
	
	public Pager<T> findBySql (String sql,Object[] args,Class<T> clz,boolean hasEntity);
	public Pager<T> findBySql (String sql,Object arg,Class<T> clz,boolean hasEntity);
	public Pager<T> findBySql (String sql,Class<T> clz,boolean hasEntity);
	public Pager<T> findBySql(String sql,Object[ ] args, Map<String,Object> alias,Class<T> clz,boolean hasEntity);
	public Pager<T> findBySql(String sql,Map<String,Object> alias, Class<T> clz,boolean hasEntity);
	
	
	

}
