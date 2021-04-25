package com.zsp;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.task.Task;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RestTestApplicationTests {
//    使用activity工作流先生成数据库表：23张
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
                .addClasspathResource("bmp/rest.bpmn20.xml") //导入流程图  !!!!一定要加bpmn20
                .addClasspathResource("bmp/rest.bpmn20.png")   //导入流程文件!!!!一定要加bpmn20
                .deploy();   //开始部署
    }

//2、启用创建的流程图进行审批
@Test
    public void testStartProcessInstance(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //act_re_procdef表里的id，如果没生成，去看上一步，真是哔了狗
        processEngine.getRuntimeService()
                .startProcessInstanceById("myProcess_1:1:4");
    }

//3、请假人发出请假申请
@Test
    public void testAsk(){
//        获取activity7的引擎
    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
//    查看act_ru_task表，然后把id给上，发起请假申请
    processEngine.getTaskService().complete("2505");

    }
//    4、老师查看请假要求
@Test
public void queryTask(){
//        获得流引擎
    ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
//    创造搜索，下面的teacher是我们在创建bpmn的时候写的assignee值
    List<Task> student = engine.getTaskService().createTaskQuery()
            .taskAssignee("office")
            .list();
    for (Task task : student) {
        System.out.println(task);
    }
}

//5、班主任审批
@Test
public void testFinishTask_manager(){
//        获取流引擎
    ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
//    这里的id是上面查询生成的请假申请id
    engine.getTaskService()
            .complete("10002");  //查看act_ru_task表，或者通过上面查询获得
}


}
