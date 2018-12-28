package com.lyj.springbootvuedemo.user.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lyj
 * @since 2018-12-27
 */
@Data
public class User  {

    private long id ;

    private String name;

    private String password;

    private long roleid;
}
