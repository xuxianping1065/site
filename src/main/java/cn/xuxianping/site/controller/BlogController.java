package cn.xuxianping.site.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xuxianping.site.model.Blog;
import cn.xuxianping.site.service.BlogService;

@Controller
public class BlogController {
	private static final Logger logger = LoggerFactory.getLogger(BlogController.class);
	
	@Autowired
	private BlogService blogService;
	
	
	@RequestMapping(value="/get_blog.do")
	@ResponseBody
	public String getUser(int id){
		logger.info("get blog");
		Blog blog = blogService.getBlogById(id);
		
		return blog.toString();		
	}
}
