package com.fxp.hg.dao;

import com.fxp.hg.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 18:24
 * @description: 用户权限自定义Dao
 **/
public interface UmsAdminPermissionRelationDao {

    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
