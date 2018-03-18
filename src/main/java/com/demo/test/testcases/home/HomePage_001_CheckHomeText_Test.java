package com.demo.test.testcases.home;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.HomePageHelper;
import com.demo.test.pageshelper.LoginPageHelper;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class HomePage_001_CheckHomeText_Test extends BaseParpare {
    @Test(dataProvider="testData")
    public void checkHomeText(Map<String, String> data) {
        //等待登录页面加载
        LoginPageHelper.waitLoginPageLoad(seleniumUtil, timeOut);
        // 输入登录信息
        LoginPageHelper.typeLoginInfo(seleniumUtil,data.get("USERNAME"), data.get("PASSWORD"));
        //等待首页元素加载完毕
        HomePageHelper.waitHomePageLoad(seleniumUtil, timeOut);
        //检查首页文本是不是显示正确
        HomePageHelper.checkHomeText(seleniumUtil,data.get("title"));
    }
}

