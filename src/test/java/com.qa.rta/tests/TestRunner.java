package com.qa.rta.tests;

import org.testng.TestNG;

import com.qa.rta.listeners.ExtentReportListener;

public class TestRunner {

    static TestNG testNg;

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        ExtentReportListener ext = new ExtentReportListener();

        testNg = new TestNG();

        testNg.setTestClasses(new Class[]{HomePageTest.class});
        testNg.addListener(ext);
        testNg.run();


    }
}