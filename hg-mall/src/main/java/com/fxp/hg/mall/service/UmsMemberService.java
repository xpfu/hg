package com.fxp.hg.mall.service;

import com.fxp.hg.model.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 14:12
 * @description: 会员管理Service
 **/
public interface UmsMemberService {
    /**
     * 根据用户名获取会员
     */
    UmsMember getByUsername(String username);

    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 登录后获取token
     */
    String login(String username, String password);

    /**
     * 刷新token
     */
    String refreshToken(String token);
}
