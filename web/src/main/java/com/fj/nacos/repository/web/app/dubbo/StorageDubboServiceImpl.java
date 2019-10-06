package com.fj.nacos.repository.web.app.dubbo;


import com.fj.nacos.common.dto.CommodityDTO;
import com.fj.nacos.common.dubbo.StorageDubboService;
import com.fj.nacos.common.response.ObjectResponse;
import com.fj.nacos.repository.web.app.service.ITStorageService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019/1/23 16:13
 */
@Service
@Slf4j
public class StorageDubboServiceImpl implements StorageDubboService {

    @Autowired
    private ITStorageService storageService;

    @Override
    public ObjectResponse decreaseStorage(CommodityDTO commodityDTO) {
        log.info("全局事务id ：" + RootContext.getXID());
        return storageService.decreaseStorage(commodityDTO);
    }
}
