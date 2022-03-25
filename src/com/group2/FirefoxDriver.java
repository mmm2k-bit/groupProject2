package com.group2;

public class FirefoxDriver implements IRemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Firefox Driver is navigating");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Firefox Driver is taking a screenshot");
    }
    @Override
    public void open() {
        System.out.println("Firefox Driver is opening");
    }
    @Override
    public void close() {
        System.out.println("Firefox Driver is closing");
    }
    @Override
    public String getTitle() {
        return "Firefox Driver found title Google";
    }
}
