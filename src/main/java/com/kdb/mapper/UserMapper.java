package com.kdb.mapper;

import com.kdb.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findById(@Param(value = "id") Integer id);
}
