package com.demo.test.testcases.login;

import com.demo.test.base.BaseParpare;
import com.demo.test.pages.HomePage;
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

     //   LoginPageHelper.addCookie(seleniumUtil,timeOut);

        //检查用户名是不是期望的"您好，testnjl001   [退出]"
       HomePageHelper.checkUserName(seleniumUtil, timeOut, data.get("title"));
        //点击采购单按钮
        HomePageHelper.clickPurchaseOrder(seleniumUtil,timeOut);
        //等待页面加载
        HomePageHelper.waitHomePageLoad(seleniumUtil,timeOut);
        //点击立即购买按钮
        HomePageHelper.clickBuy(seleniumUtil,timeOut);
        //等待页面加载
        HomePageHelper.waitHomePageLoad(seleniumUtil,timeOut);
        //点击结算按钮
        HomePageHelper.clickClickSettleAccounts(seleniumUtil,timeOut);
        //等待页面加载
        HomePageHelper.waitHomePageLoad(seleniumUtil,timeOut);
        //点击提交采购单按钮
        HomePageHelper.clickPresentPurchaseOrder(seleniumUtil,timeOut);
        //等待页面加载
        HomePageHelper.waitHomePageLoad(seleniumUtil,timeOut);
        //获取采购单成功弹窗
        HomePageHelper.alert(seleniumUtil,timeOut);
    }
}

