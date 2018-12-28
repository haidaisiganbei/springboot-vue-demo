package com.lyj.springbootvuedemo.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyj.springbootvuedemo.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lyj
 * @since 2018-12-27
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
