package com.amio.automation.jianshu.Firefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 简书文章演示代码：切换Selenium3.0后Firefox启动不了的问题解决方法
 * Created by Amio on 2016/12/8.
 */
public class TestFirefox {
    public static void main(String[] args) {
        String driverPath = System.getProperty("user.dir") + "/src/main/resources/driver/geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",driverPath);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/");
    }
}
