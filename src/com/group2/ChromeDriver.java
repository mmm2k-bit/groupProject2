package com.group2;

public class ChromeDriver implements IRemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Chrome Driver is navigating");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Chrome Driver is taking screenshot");
    }
    @Override
    public void open() {
        System.out.println("Chrome Driver is opening");
    }
    @Override
    public void close() {
        System.out.println("Chrome Driver is closing");
    }
    @Override
    public String getTitle() {
        return "Chrome Driver found title Google";
    }
}
