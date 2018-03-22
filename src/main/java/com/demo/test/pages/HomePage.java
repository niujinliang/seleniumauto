package com.demo.test.pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class HomePage {

    /**用户名显示区域*/
    public static final By HP_TEXT_USERNAME= By.xpath("/html/body/div[1]/div[1]/div/span[2]/div[1]");
    /**Flights按钮*/
    public static final By HP_BUTTON_FLIGHTS = By.xpath(".//*[@id='navbar-container']/div[1]/a/small");
    /**Itinerary按钮*/
    public static final By HP_BUTTON_ITINERARY = By.xpath("//*[@src='/WebTours/images/itinerary.gif']");
    /**Home按钮*/
    public static final By HP_BUTTON_HOME = By.xpath("//*[@src='/WebTours/images/in_home.gif']");
    /**Sign Off按钮*/
    public static final By HP_BUTTON_SIGNOFF = By.xpath("//*[@src='/WebTours/images/signoff.gif']");
    /**首页完整文本*/
    public static final By HP_TEXT_HOME= By.xpath("//blockquote");

    //点击我的采购单按钮
    public static final By ClickPurchaseOrder =By.xpath("/html/body/div[1]/div[1]/div/span[2]/a[2]");

    //点击立即购买按钮
    public static final By ClickBuy= By.xpath("//*[@id=\"out-8882375\"]/td[9]/div/a[3]");

    //点击立即结算按钮
    public static final By ClickSettleAccounts=By.xpath("//*[@id=\"jd-cart\"]/div/div[2]/div/div/div[3]/div[3]/a");

    //点击提交采购单按钮
    public static final By ClickPresentPurchaseOrder=By.xpath("//*[@id=\"submitOrderBtn\"]");
}

