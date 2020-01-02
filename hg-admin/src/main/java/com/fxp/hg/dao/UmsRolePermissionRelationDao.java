package com.fxp.hg.dao;

import com.fxp.hg.model.UmsPermission;
import com.fxp.hg.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 18:26
 * @description: 后台用户角色管理自定义Dao
 **/
public interface UmsRolePermissionRelationDao {

    // 批量插入角色和权限关系
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    // 根据角色获取权限
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
