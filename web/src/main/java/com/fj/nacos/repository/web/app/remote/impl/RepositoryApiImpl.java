package com.fj.nacos.repository.web.app.remote.impl;

import com.fj.nacos.repository.api.RepositoryApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
public class RepositoryApiImpl implements RepositoryApi {

    @Override
    public String deductRepository() {
        return null;
    }
}
