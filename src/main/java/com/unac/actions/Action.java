package com.unac.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Action {
    public static void navegateUrl(WebDriver myBrowser, String url) {
        myBrowser.navigate().to(url);
    }

    public static void sendData(WebDriver myBrowser, By target, String strData) {
        myBrowser.findElement(target).sendKeys(strData);
    }

    public static void clickElement(WebDriver myBrowser, By target) {
        myBrowser.findElement(target).click();
    }

    public static String getElementText(WebDriver mybrowser, By target){
        return mybrowser.findElement(target).getText();
    }
    public static List<WebElement> getListElementText(WebDriver mybrowser, By target){
        List<WebElement> newList = mybrowser.findElements(target);
        return newList;
    }
}
