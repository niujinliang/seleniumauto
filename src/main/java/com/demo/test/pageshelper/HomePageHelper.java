package com.demo.test.pageshelper;

import com.demo.test.pages.FramePage;
import com.demo.test.pages.HomePage;
import com.demo.test.pages.LoginPage;
import com.demo.test.utils.SeleniumUtil;
import org.apache.log4j.Logger;

import javax.xml.crypto.Data;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class HomePageHelper {
    //提供本类中日志输出对象
    public static Logger logger = Logger.getLogger(HomePageHelper.class);

    /**
     * @author Young
     * @description 等待首页元素加载
     * @param seleniumUtil selenium api封装引用对象
     * @param timeOut 等待元素超时的时间
     * */
    public static void waitHomePageLoad(SeleniumUtil seleniumUtil,int timeOut){
//        FramePageHelper.jumpOut(seleniumUtil);
        //等待body frame显示出来
//        seleniumUtil.waitForElementToLoad(timeOut, FramePage.FP_FRAME_BODY);
//        FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_BODY);//先进入到body frame中
        //等待navbar frame显示出来
//        seleniumUtil.waitForElementToLoad(timeOut, FramePage.FP_FRAME_NAVBAR);
//        FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_NAVBAR);//再进入body frame的子frame:navbar frame中
        logger.info("开始等待首页元素加载");
        seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_TEXT_USERNAME);
//        seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_BUTTON_ITINERARY);
//        seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_BUTTON_HOME);
//        seleniumUtil.waitForElementToLoad(timeOut, HomePage.HP_BUTTON_SIGNOFF);
        logger.info("首页元素加载完毕");
//        FramePageHelper.jumpOut(seleniumUtil);

    }

    /**
     * @author Young
     * @Description 登录成功之后验证用户名是不是正确的
     *
     *
     * */
    public static void checkUserName(SeleniumUtil seleniumUtil,int timeOut,String username){
//        FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_BODY);//先进入到body frame中
//        FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_INFO);//先进入到body frame中的子frame:info frame中
        logger.info("开始检查用户名是不是："+username);
        seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_USERNAME),username);
        logger.info("用户名检查完毕,用户名是："+username);

    }

    /**
     * @author Young
     * @description 登录成功之后验证首页的文本内容
     * */
    public static void checkHomeText(SeleniumUtil seleniumUtil,String username){
//        FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_BODY);//先进入到body frame中
//        FramePageHelper.jumpInToFrame(seleniumUtil, FramePage.FP_FRAME_INFO);//先进入到body frame中的子frame:info frame中
        seleniumUtil.isTextCorrect(seleniumUtil.getText(HomePage.HP_TEXT_USERNAME),username);

    }
    //点击采购单按钮
    public static void  clickPurchaseOrder(SeleniumUtil seleniumUtil,int timeout) {
        seleniumUtil.click(HomePage.ClickPurchaseOrder);
    }


    //点击立即购买按钮
    public static void clickBuy(SeleniumUtil seleniumUtil,int timeout){
        seleniumUtil.click(HomePage.ClickBuy);
    }
    //点击立即结算按钮
    public static void clickClickSettleAccounts(SeleniumUtil seleniumUtil,int timeout){
        seleniumUtil.click(HomePage.ClickSettleAccounts);
    }
    //点击提交采购单按钮
    public static void clickPresentPurchaseOrder(SeleniumUtil seleniumUtil,int timeout){
        seleniumUtil.click(HomePage.ClickPresentPurchaseOrder);
    }
    //获取采购单成功弹窗
    public static void alert(SeleniumUtil seleniumUtil ,int timeout){
        seleniumUtil.switchToPromptedAlertAfterWait(5);
    }
}

