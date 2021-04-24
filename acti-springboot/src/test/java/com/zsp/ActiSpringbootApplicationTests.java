package com.zsp;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ActiSpringbootApplicationTests {

    @Test
    void testActivity() {
        //        不使用xml生成activity工作流
//        创建工具类
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
//        driver
        configuration.setJdbcDriver("com.mysql.cj.jdbc.Driver");
//        放入url链接
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("123456");
//        是否更新数据库，一定要填上是，不然白写
        configuration.setDatabaseSchemaUpdate("true");
        configuration.setDatabaseSchema(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
//        完成数据库创建
        configuration.buildProcessEngine();
        System.out.println("工作流程表创建完成");

    }
    @Test
    void testMP(){

        //        代码自动生成器对象
        AutoGenerator autoGenerator = new AutoGenerator();
//        配置策略

//        1.全局配置  GlobalConfig
        GlobalConfig gc = new GlobalConfig();
//        获取当前项目目录
        String projectPath = System.getProperty("user.dir");
//        设置代码生成器自动生成路径
        gc.setOutputDir(projectPath+"/src/main/java");
//        设置作者名字
        gc.setAuthor("zsp");
//        自动生成后是否打开文件夹
        gc.setOpen(false);
//        是否覆盖原本的文件
        gc.setFileOverride(false);
//        去掉service的前缀
        gc.setServiceName("%sService");
//        设置日期类型
        gc.setDateType(DateType.ONLY_DATE);
//          设置生成swagger
//        gc.setSwagger2(true);
//        把全局配置丢进代码生成器中
        autoGenerator.setGlobalConfig(gc);

//        2.设置数据源 就是数据库配置
        DataSourceConfig dataSourceConfig =new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/activit?serverTimezone=Asia/Shanghai");
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        autoGenerator.setDataSource(dataSourceConfig);
//        3.包的配置
        PackageConfig pc = new PackageConfig();
//        生成的模块名字
//        pc.setModuleName("user");
//        生成在什么文件夹内
        pc.setParent("com.zsp");
//        各层的名字
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        autoGenerator.setPackageInfo(pc);
//        4.策略：映射对应的表
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("act_evt_log","act_ge_bytearray","act_ge_property","act_hi_actinst","act_hi_attachment","act_hi_comment","act_hi_detail","act_hi_identitylink",
                "act_hi_identitylink","act_hi_taskinst","act_hi_varinst","act_procdef_info","act_re_model","act_re_deployment","act_re_procdef","act_ru_deadletter_job","act_ru_event_subscr","act_ru_execution","act_ru_identitylink","act_ru_integration","act_ru_job","act_ru_suspended_job","act_ru_task","act_ru_timer_job","act_ru_variable"); //要映射的表名
        strategy.setNaming(NamingStrategy.underline_to_camel); //开启包的命名规则,下划线转驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//列也支持下划线转驼峰
        strategy.setEntityLombokModel(true);//开启lombok
        strategy.setLogicDeleteFieldName("status");
//        自动填充策略:设置自动更新操作时间
        TableFill userCreate = new TableFill("user_create", FieldFill.INSERT);
        TableFill userModified = new TableFill("user_modified", FieldFill.INSERT_UPDATE);
//        把自动填充策略放进去
        ArrayList<TableFill>tableFill = new ArrayList<>();
        tableFill.add(userCreate);
        tableFill.add(userModified);
        strategy.setTableFillList(tableFill);
//        乐观锁
        strategy.setVersionFieldName("version");
//        开启restful风格
        strategy.setRestControllerStyle(true);
//        开启url下划线命名类似于 localhost:8080/user_1234_2312
        strategy.setControllerMappingHyphenStyle(true);
//        放入策略
        autoGenerator.setStrategy(strategy);
        //        执行代码生成器
        autoGenerator.execute();
        System.out.println("使用代码生成器生成：\"act_evt_log\",\"act_ge_bytearray\",\"act_ge_property\",\"act_hi_actinst\",\"act_hi_attachment\",\"act_hi_comment\",\"act_hi_detail\",\"act_hi_identitylink\",\n" +
                "                \"act_hi_identitylink\",\"act_hi_taskinst\",\"act_hi_varinst\",\"act_procdef_info\",\"act_re_model\",\"act_re_deployment\",\"act_re_procdef\",\"act_ru_deadletter_job\",\"act_ru_event_subscr\",\"act_ru_execution\",\"act_ru_identitylink\",\"act_ru_integration\",\"act_ru_job\",\"act_ru_suspended_job\",\"act_ru_task\",\"act_ru_timer_job\",\"act_ru_variable\" 成功");
    }

}



