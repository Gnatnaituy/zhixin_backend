package com.zhixin.vo.response;

import com.zhixin.common.ResponseBaseVo;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yutiantang
 * @create 2021/6/2 17:09
 */
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class ResponseModuleInfoVo extends ResponseBaseVo {

    private Long typeId;

    private String typePath;

    private String typeName;

    private Long subTypeId;

    private String subTypeName;

    private String title;

    private String cover;

    private String description;
}
