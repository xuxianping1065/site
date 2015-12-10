package cn.xuxianping.framework.core.mapper;

import org.apache.ibatis.annotations.InsertProvider;

import cn.xuxianping.framework.core.BaseEntity;

public interface BaseMapper<T extends BaseEntity> {
	
	//@InsertProvider(type=BaseEntity.class, method="inserSql")
	public void save(T entity);
	
	public Class<T> getSqlClass();
}
