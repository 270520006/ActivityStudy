package com.zsp;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestTestApplicationTests {
//    使用activity工作流先生成数据库
    @Test
    void testCreateTable(){
//        使用xml生成activity工作流
        Logger logger = LoggerFactory.getLogger(RestTestApplicationTests.class);
//        获取activity提供的工具类
//        获取这个默认engine时就会自动创建数据库表
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();

        System.out.println(engine);

    }
    /**
     * 1、部署流程
     * 2、启动流程实例
     * 3、请假人发出请假申请
     * 4、班主任查看任务
     * 5、班主任审批
     * 6、最终的教务处Boss审批
     */
// 1、部署流程
    @Test
    public void createActivityTask(){
        //获取默认的流程引擎
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

        processEngine.getRepositoryService()//得到库服务
                .createDeployment()//创建部署
                .name("askRest")
                .addClasspathResource("bmp/test.bpmn20.xml") //导入流程图  !!!!一定要加bpmn20
                .addClasspathResource("bmp/test.bpmn20.png")   //导入流程文件!!!!一定要加bpmn20
                .deploy();   //开始部署
    }

//2、启动流程实例
@Test
    public void testStartProcessInstance(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        processEngine.getRuntimeService()
                .startProcessInstanceById("askRest");
    }
}
