/**
 * 
 */
package org.alan.basic.dao;

import java.util.List;
import java.util.Map;

import org.alan.basic.model.Pager;

/**
 * @author liu
 *
 */
public class BaseDao<T> implements IbaseDao<T> {
//	private sessions

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#add(java.lang.Object)
	 */
	public T add(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#update(java.lang.Object)
	 */
	public void update(T t) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#delelte(int)
	 */
	public void delelte(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#load(int)
	 */
	public T load(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#list(java.lang.String, java.lang.Object[])
	 */
	public List<T> list(String hql, Object[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#list(java.lang.String, java.lang.Object)
	 */
	public List<T> list(String hql, Object arg) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#list(java.lang.String)
	 */
	public List<T> list(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#list(java.lang.String, java.lang.Object[], java.util.Map)
	 */
	public List<T> list(String hql, Object[] args, Map<String, Object> alias) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#list(java.lang.String, java.util.Map)
	 */
	public List<T> list(String hql, Map<String, Object> alias) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#find(java.lang.String, java.lang.Object[])
	 */
	public Pager<T> find(String hql, Object[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#find(java.lang.String, java.lang.Object)
	 */
	public Pager<T> find(String hql, Object arg) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#find(java.lang.String)
	 */
	public Pager<T> find(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#find(java.lang.String, java.lang.Object[], java.util.Map)
	 */
	public Pager<T> find(String hql, Object[] args, Map<String, Object> alias) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#find(java.lang.String, java.util.Map)
	 */
	public Pager<T> find(String hql, Map<String, Object> alias) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#queryObject(java.lang.String, java.lang.Object[])
	 */
	public Object queryObject(String hql, Object[] args) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#queryObject(java.lang.String, java.lang.Object)
	 */
	public Object queryObject(String hql, Object arg) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#queryObject(java.lang.String)
	 */
	public Object queryObject(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#updateByHql(java.lang.String, java.lang.Object[])
	 */
	public void updateByHql(String hql, Object[] args) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#updateByHql(java.lang.String, java.lang.Object)
	 */
	public void updateByHql(String hql, Object arg) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#updateByHql(java.lang.String)
	 */
	public void updateByHql(String hql) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#listBySql(java.lang.String, java.lang.Object[], java.lang.Class, boolean)
	 */
	public List<T> listBySql(String sql, Object[] args, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#listBySql(java.lang.String, java.lang.Object, java.lang.Class, boolean)
	 */
	public List<T> listBySql(String sql, Object arg, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#listBySql(java.lang.String, java.lang.Class, boolean)
	 */
	public List<T> listBySql(String sql, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#listBySql(java.lang.String, java.lang.Object[], java.util.Map, java.lang.Class, boolean)
	 */
	public List<T> listBySql(String sql, Object[] args, Map<String, Object> alias, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#listBySql(java.lang.String, java.util.Map, java.lang.Class, boolean)
	 */
	public List<T> listBySql(String sql, Map<String, Object> alias, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#findBySql(java.lang.String, java.lang.Object[], java.lang.Class, boolean)
	 */
	public Pager<T> findBySql(String sql, Object[] args, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#findBySql(java.lang.String, java.lang.Object, java.lang.Class, boolean)
	 */
	public Pager<T> findBySql(String sql, Object arg, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#findBySql(java.lang.String, java.lang.Class, boolean)
	 */
	public Pager<T> findBySql(String sql, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#findBySql(java.lang.String, java.lang.Object[], java.util.Map, java.lang.Class, boolean)
	 */
	public Pager<T> findBySql(String sql, Object[] args, Map<String, Object> alias, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.alan.basic.dao.IbaseDao#findBySql(java.lang.String, java.util.Map, java.lang.Class, boolean)
	 */
	public Pager<T> findBySql(String sql, Map<String, Object> alias, Class<T> clz, boolean hasEntity) {
		// TODO Auto-generated method stub
		return null;
	}

}
