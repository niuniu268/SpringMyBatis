package com.example.mapper;

import com.example.dao.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select( "select * from Users;" )
    public List<Users> selectAll();
}
