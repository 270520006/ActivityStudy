import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActivitTest {

    @Test
    public void testActiviti(){
//        使用xml生成activity工作流
        Logger logger = LoggerFactory.getLogger(ActivitTest.class);
//        获取activity提供的工具类
//        获取这个默认engine时就会自动创建数据库表
        ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(engine.getName());
        System.out.println(engine.getTaskService());
        System.out.println(engine);
    }
    @Test
    public void testAutoActiviti(){
        //        不使用xml生成activity工作流
//        创建工具类
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
//        driver
        configuration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
//        放入url链接
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/test1?serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("123456");
//        是否更新数据库，一定要填上是，不然白写
        configuration.setDatabaseSchemaUpdate("true");
        configuration.setDatabaseSchema(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
//        完成数据库创建
        configuration.buildProcessEngine();


    }

}
