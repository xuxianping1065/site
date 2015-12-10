package cn.xuxianping.site.mappers;

import org.apache.ibatis.annotations.Select;

import cn.xuxianping.site.model.Blog;

public interface BlogMapper {

	@Select("select * from blog where id = #{id}")
	public Blog selectBlog(int id);
}
