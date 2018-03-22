package com.demo.test.testcases.testcookie;

import com.demo.test.base.BaseParpare;
import com.demo.test.pageshelper.LoginPageHelper;
import com.demo.test.utils.SeleniumUtil;
import com.sun.javafx.collections.MappingChange;
import org.testng.annotations.Test;

import java.util.Map;

import static java.lang.Thread.sleep;

/**
 * Created by niujinliang on 2018/3/21.
 */
public class LoginPage extends BaseParpare {
    @Test(dataProvider="testData")
    public void loginAdd(Map<String, String> data){
        LoginPageHelper.addCookie(seleniumUtil,timeOut);

    }

}
