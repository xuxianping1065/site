package cn.xuxianping.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xuxianping.site.model.User;
import cn.xuxianping.site.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/save_user.do")
	@ResponseBody
	public String save(){
		User user = new User();
		user.setUsername("xuxianping");
		user.setPassword("123456");
		user.setName("徐先平");
		
		boolean suc = userService.saveUser(user);
		
		return suc+"";
	}
	
	
	@RequestMapping(value="/get_user.do")
	@ResponseBody
	public String getUser(Long id){
		
		User user = userService.getUserById(id);
		
		return user.toString();
	}
}
