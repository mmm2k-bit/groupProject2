package com.group2;

public class SafariDriver implements IRemoteWebDriver{
    @Override
    public void navigate() {
        System.out.println("Safari Driver is navigating");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Safari Driver is taking a screenshot");
    }
    @Override
    public void open() {
        System.out.println("Safari Driver is opening");
    }
    @Override
    public void close() {
        System.out.println("Safari Driver is closing");
    }
    @Override
    public String getTitle() {
         return "Safari Driver found title Google";
    }
}
