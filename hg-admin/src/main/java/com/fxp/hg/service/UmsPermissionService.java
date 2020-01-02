package com.fxp.hg.service;

import com.fxp.hg.dto.UmsPermissionNode;
import com.fxp.hg.model.UmsPermission;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 18:32
 * @description: UmsPermissionService
 **/
public interface UmsPermissionService {
    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id,UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
}
