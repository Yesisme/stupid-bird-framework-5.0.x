package com.lym.business.dao;

import com.lym.business.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface UserDao {

	@Select("select * from user u where u.id in (select uu.id from user uu where uu.id between 10001 and 10100)")
	List<Map<String,Object>> query();

    @Insert({ "insert into t_user(sex, name) values(#{sex}, #{name})" })
	int insertUser(@Param("sex") int sex,@Param("name") String name);

    @Update({"update t_user set name=#{name} where id=#{id}"})
    int updateById(@Param("name") String name,@Param("id") Integer id);

    @Select({"select id,sex,name from t_user where id =#{id}"})
    User queryById(@Param("id") Integer id);
}
