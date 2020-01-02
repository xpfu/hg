package com.fxp.hg.common.api;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @program: hg-master
 * @author: xp.fu
 * @create: 2019-12-26 15:13
 * @description: 分页数据封装类
 **/
public class CommonPage<T> {

    // 页码
    private Integer pageNum;
    // 页数
    private Integer pageSize;
    // 总的页数
    private Integer totalPage;
    // 总的数据
    private Long total;
    // 分页的数据
    private List<T> list;

    /***
     * @creed: Talk is cheap,show me the code
     * @Date: 2019/12/26 0026 15:14
     * @Description: 将PageHelper分页后的list转为分页信息
     * @Param list: 
     * @Return: 
     **/
    public static <T> CommonPage<T> restPage(List<T> list) {
        CommonPage<T> result = new CommonPage<T>();
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        result.setTotalPage(pageInfo.getPages());
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /***
     * @creed: Talk is cheap,show me the code
     * @Date: 2019/12/26 0026 15:15
     * @Description: 将SpringData分页后的list转为分页信息
     * @Param pageInfo: 
     * @Return: 
     **/
    public static <T> CommonPage<T> restPage(Page<T> pageInfo) {
        CommonPage<T> result = new CommonPage<T>();
        result.setTotalPage(pageInfo.getTotalPages());
        result.setPageNum(pageInfo.getNumber());
        result.setPageSize(pageInfo.getSize());
        result.setTotal(pageInfo.getTotalElements());
        result.setList(pageInfo.getContent());
        return result;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
