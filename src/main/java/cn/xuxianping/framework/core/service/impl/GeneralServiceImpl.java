package cn.xuxianping.framework.core.service.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import cn.xuxianping.framework.core.BaseEntity;
import cn.xuxianping.framework.core.parameter.BaseParameter;
import cn.xuxianping.framework.core.service.GeneralService;

@Repository
public class GeneralServiceImpl extends HibernateTemplate implements GeneralService {
	
	@Autowired
	@Qualifier(value="sessionFactory")
	private SessionFactory sessionFactory;
	
	
	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public boolean save(BaseEntity entity) {
		boolean isSuc = true;
		try {
			super.persist(entity);
		} catch (DataAccessException e) {
			e.printStackTrace();
			isSuc = false;
		}
		return isSuc;
	}

	public boolean update(BaseEntity entity) {
		return false;
	}

	public boolean saveOrUpdate(BaseEntity entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(BaseEntity baseEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<BaseEntity> getList(BaseParameter parameter) {
		// TODO Auto-generated method stub
		return null;
	}

}
