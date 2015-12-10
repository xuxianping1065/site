package cn.xuxianping.site.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xuxianping.site.mappers.BlogMapper;
import cn.xuxianping.site.model.Blog;
import cn.xuxianping.site.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogMapper blogMapper;
	
	public Blog getBlogById(int id) {
		
		return blogMapper.selectBlog(id);
	}

}
