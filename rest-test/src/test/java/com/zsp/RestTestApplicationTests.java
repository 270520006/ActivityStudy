package com.zsp;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestTestApplicationTests {

    @Test
    void testCreateTable(){
//        使用xml生成activity工作流
        Logger logger = LoggerFactory.getLogger(RestTestApplicationTests.class);
//        获取activity提供的工具类
//        获取这个默认engine时就会自动创建数据库表
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(engine);

    }

}
