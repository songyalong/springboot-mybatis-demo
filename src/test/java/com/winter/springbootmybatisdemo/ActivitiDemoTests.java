package com.winter.springbootmybatisdemo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Author: songyalong
 * @Description:
 * @Date: Created in ${time}${date}
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class ActivitiDemoTests {
//    private ProcessEngine processEngine;


    /**
     * @Author: songyalong
     * @Description: 获取流程引擎
     * @param
     * @Date: Created in 14:58 2018/3/1
     */
//    @Before
//    public void createTable(){
//        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
//        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
//        processEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/activiti?useUnicode=true&characterEndocing=utf8");
//        processEngineConfiguration.setJdbcUsername("root");
//        processEngineConfiguration.setJdbcPassword("123123");
//        processEngineConfiguration.setDatabaseSchema(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
//        processEngine = processEngineConfiguration.buildProcessEngine();
//    }

    /**
     * @Author: songyalong
     * @Description: 发布
     * @param
     * @Date: Created in 14:58 2018/3/1
     */
//    @Test
//    public void deployment(){
//        Deployment deployment = processEngine.getRepositoryService().createDeployment()
//                .name("demo1")
//                .addClasspathResource("diagrams/demo1.bpmn").deploy();
//        System.out.println("部署id号 = "+deployment.getId());
//        System.out.println("部署名称 = "+deployment.getName());
//    }

    /**
     * @Author: songyalong
     * @Description: 启动流程
     * @param
     * @Date: Created in 16:30 2018/3/1
     */
//    @Test
//    public  void startProcess(){
//
//        String key = "myProcess_1";
//        ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey(key);
//        System.out.println("部署实例id = "+processInstance.getProcessDefinitionId());
//    }

    /**
     * @Author: songyalong
     * @Description: 获取我的任务
     * @param
     * @Date: Created in 16:30 2018/3/1
     */
//    @Test
//    public void getMyTask(){
//        String username = "zhangsan";
//        List<Task> taskList = processEngine.getTaskService().createTaskQuery().taskAssignee(username).list();
//        for(Task task : taskList){
//
//        }
//    }

//    @Test
//    public  void completeMyTask(){
//        String taskId = "";
//        processEngine.getTaskService().complete(taskId);
//    }
}
