package cn.xuxianping.site.mappers;

import cn.xuxianping.framework.core.mapper.BaseMapper;
import cn.xuxianping.site.model.User;

public interface UserMapper extends BaseMapper<User>{
	
	
	//@Select(value="select * from user where username='#{username}' and password='#{password}'")
//	@SelectProvider(type=User.class, method="getSql")
//	public User getUserByUsernameAndPassword(String username, String password);

}
