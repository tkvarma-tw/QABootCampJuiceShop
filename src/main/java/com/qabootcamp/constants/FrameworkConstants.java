package com.qabootcamp.constants;

public class FrameworkConstants {

    private static final String CHROMEDRIVERPATH =  System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver";

    public static String getChromeDriverPath()
    {
        return CHROMEDRIVERPATH;
    }
}
