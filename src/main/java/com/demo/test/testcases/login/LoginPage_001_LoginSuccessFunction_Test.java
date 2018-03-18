package com.demo.test.testcases.login;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.LoginPage;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class LoginPage_001_LoginSuccessFunction_Test extends BaseParpare {
    @Test(dataProvider="testData")
    public void loginSuccessFunction(Map<String, String> data) {
       //点击登录按钮
        LoginPageHelper.clickDengLu(seleniumUtil,timeOut);
        //等待登录页面加载
        LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);

        // 输入登录信息
        LoginPageHelper.typeLoginInfo(seleniumUtil, data.get("USERNAME"), data.get("PASSWORD"));

        //等待首页元素显示出来
        HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
        //检查用户名是不是期望的"jojo"
       HomePageHelper.checkUserName(seleniumUtil, timeOut, data.get("title"));
//

    }
}

