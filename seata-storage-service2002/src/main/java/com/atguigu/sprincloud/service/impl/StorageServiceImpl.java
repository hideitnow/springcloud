package com.atguigu.sprincloud.service.impl;

import com.atguigu.sprincloud.dao.StorageDao;
import com.atguigu.sprincloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("----->storage-service中扣减库存结束");
    }
}
