package cn.xuxianping.framework.core.service;


import java.util.List;

import cn.xuxianping.framework.core.BaseEntity;
import cn.xuxianping.framework.core.parameter.BaseParameter;

public interface GeneralService {
	
	public boolean save(BaseEntity entity);
	
	public boolean update(BaseEntity entity);
	
	public boolean saveOrUpdate(BaseEntity entity);
	
	public boolean delete(BaseEntity baseEntity);
	
	public boolean deleteById(Long id);
	
	public List<BaseEntity> getList(BaseParameter parameter);
}
