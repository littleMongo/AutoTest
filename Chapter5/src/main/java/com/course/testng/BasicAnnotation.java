package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");

    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试前运行的内容");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是测试hou 运行的内容");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是测试类前运行的内容");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是测试类后运行的内容");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite这是测试套件前运行的内容");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite这是测试套件后运行的内容");
    }
}
