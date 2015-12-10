package cn.xuxianping.framework.core;


/**
 * 有状态的实体接口
 * @author XU
 *
 */
public interface Stateful {
	
	public static final Long STATUS_UNAVAILABLE = 0L;
	public static final Long STATUS_AVAILABLE = 1L;
	
	public Long getStatus();
	
	public void setStatus(Long status);
}
