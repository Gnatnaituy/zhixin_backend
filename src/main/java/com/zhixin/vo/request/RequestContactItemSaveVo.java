package com.zhixin.vo.request;

import lombok.Data;

/**
 * @author yutiantang
 * @create 2021/6/2 09:36
 */
@Data
public class RequestContactItemSaveVo {

    private Long id;

    private Long contactId;

    private String name;

    private String value;

    private Integer sort;
}