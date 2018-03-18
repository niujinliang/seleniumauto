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



}

