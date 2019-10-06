package com.fj.nacos.repository.web.app.service;

import com.baomidou.mybatisplus.service.IService;
import com.fj.nacos.common.dto.CommodityDTO;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.repository.web.app.entity.TStorage;

/**
 * 仓库服务
 *
 * * @author lidong
 * @since 2019-09-04
 */
public interface ITStorageService extends IService<TStorage> {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO);
}
