package com.qa.Gembook.Locators;

import org.openqa.selenium.By;

public class Locator {

    public static By signInbtn=By.xpath("//div[@class=' d-flex justify-content-center']/button");
    public static By loginMicrosoft=By.xpath("(//div[@class='table']/div[@class='table-row'])[1]");
    public static By username=By.xpath("//*[@id=\"i0116\"]");
    public static By password=By.xpath("//div[@class='placeholderContainer']//input");
    public static By clickNext=By.id("idSIButton9");
    public static By signInBtn= By.xpath("//*[@id=\"idSIButton9\"]");
    public static By clickNo=By.xpath("//*[@id=\"idBtn_Back\"]");
}
