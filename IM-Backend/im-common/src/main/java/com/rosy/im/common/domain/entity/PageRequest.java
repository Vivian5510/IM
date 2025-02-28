package com.rosy.im.common.domain.entity;

import com.rosy.im.common.constant.CommonConstant;
import lombok.Data;

@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField = CommonConstant.DEFAULT_SORT_FIELD;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}