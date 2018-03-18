package com.demo.test.pageshelper;

import com.demo.test.utils.SeleniumUtil;
import org.openqa.selenium.By;

/**
 * Created by Administrator on 2017/9/11 0011.
 */
public class FramePageHelper {

    /**进入frame-根据frame的元素定位进入*/
    public static void jumpInToFrame(SeleniumUtil seleniumUtil,By by){

        seleniumUtil.switchFrame(seleniumUtil.findElementBy(by));

    }
    /**回到默认的frame*/
    public static void jumpOut(SeleniumUtil seleniumUtil){

        seleniumUtil.outFrame();

    }



}


