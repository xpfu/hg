package com.fxp.hg.dao;

import com.fxp.hg.model.UmsAdminRoleRelation;
import com.fxp.hg.model.UmsPermission;
import com.fxp.hg.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 18:25
 * @description: 后台用户与角色管理自定义Dao
 **/
public interface UmsAdminRoleRelationDao {

    // 批量插入用户角色关系
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    // 获取用于所有角色
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    // 获取用户所有角色权限
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    // 获取用户所有权限(包括+-权限)
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
