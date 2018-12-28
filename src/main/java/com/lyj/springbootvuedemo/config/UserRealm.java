package com.lyj.springbootvuedemo.config;


import com.lyj.springbootvuedemo.user.entity.User;
import com.lyj.springbootvuedemo.user.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {
    /**
     * 授权
     */
    @Autowired
    private IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String name = token.getUsername();
        String password = String.valueOf(token.getPassword());
        User user = userService.getUserByNameAndPassword(name,password);
        if (user != null){
            System.out.println("登录成功...");
            return new SimpleAuthenticationInfo(name,password,"Lyj");
        }else {
            return null;
        }
    }
}
