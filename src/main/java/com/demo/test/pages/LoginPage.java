package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class LoginPage {
    /**用户名输入框*/
   public static final By LP_INPUT_USERNAME = By.xpath("//*[@id=\"loginname\"]");

    /**密码输入框*/
    public static final By LP_INPUT_PASSWORD = By.xpath("//*[@id=\"nloginpwd\"]");

    /**登录按钮*/
    public static final By LP_BUTTON_LOGIN = By.xpath("//*[@id=\"loginsubmit\"]");

    /**登录错误信息*/
//    public static final By LP_TEXT_ERROR= By.xpath("//*[@color='red']");
    /**点击登录按钮*/
    public static final By ClickDengLu = By.xpath("/html/body/div[1]/div[1]/div/span[2]/a[2]");

}

