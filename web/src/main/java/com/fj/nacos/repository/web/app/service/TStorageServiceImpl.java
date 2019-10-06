package com.fj.nacos.repository.web.app.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.fj.nacos.common.dto.CommodityDTO;
import com.fj.nacos.common.enums.RspStatusEnum;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.repository.web.app.entity.TStorage;
import com.fj.nacos.repository.web.app.mapper.TStorageMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  库存服务实现类
 * </p>
 *
 * * @author lidong
 * @since 2019-09-04
 */
@Service
public class TStorageServiceImpl extends ServiceImpl<TStorageMapper, TStorage> implements ITStorageService {

    @Override
    public ObjectResponse decreaseStorage(CommodityDTO commodityDTO) {
        int storage = baseMapper.decreaseStorage(commodityDTO.getCommodityCode(), commodityDTO.getCount());
        ObjectResponse<Object> response = new ObjectResponse<>();
        if (storage > 0){
            response.setStatus(RspStatusEnum.SUCCESS.getCode());
            response.setMessage(RspStatusEnum.SUCCESS.getMessage());
            return response;
        }

        response.setStatus(RspStatusEnum.FAIL.getCode());
        response.setMessage(RspStatusEnum.FAIL.getMessage());
        return response;
    }
}
