package com.zhixin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhixin.entity.Module;
import com.zhixin.vo.common.ResponseEntity;
import com.zhixin.vo.request.RequestModuleSaveVo;
import com.zhixin.vo.request.RequestModuleSearchVo;
import com.zhixin.vo.response.ResponseModuleInfoVo;

/**
 * @author yutiantang
 * @create 2021/5/28 21:55
 */
public interface ModuleService extends IService<Module> {

    ResponseEntity save(RequestModuleSaveVo saveVo);

    ResponseEntity delete(Long id);

    IPage<ResponseModuleInfoVo> page(RequestModuleSearchVo searchVo);
}
