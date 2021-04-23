package com.zsp;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestTestApplicationTests {

    @Test
    public void test04() {
        //获得一个构建器对象，用于加载流程定义的文件（test01.bpmn，test01.png）完成流程定义的部署
        //1.创建ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

        //2.得到RepositoryService实例
        RepositoryService repositoryService = processEngine.getRepositoryService();


        DeploymentBuilder deployment =
                repositoryService.createDeployment()
                .addClasspathResource("bmp/test.png")
                .addClasspathResource("bmp/test.xml")
                .name("请假申请单流程2");




        //部署流程定义
        Deployment deploy = deployment.deploy();
        System.out.println(deploy.getId());
        System.out.println(deploy.getName());
    }

}
