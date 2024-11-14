package io.metersphere.api.service;

import io.metersphere.sdk.constants.ExecTaskType;
import io.metersphere.system.domain.ExecTask;
import io.metersphere.system.invoker.TaskRerunServiceInvoker;
import io.metersphere.system.service.TaskRerunService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: jianxing
 * @CreateTime: 2024-02-06  20:47
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ApiCaseRerunService implements TaskRerunService {

    public ApiCaseRerunService() {
        TaskRerunServiceInvoker.register(ExecTaskType.API_CASE, this);
    }

    @Override
    public void rerun(ExecTask execTask) {
        // todo
    }
}