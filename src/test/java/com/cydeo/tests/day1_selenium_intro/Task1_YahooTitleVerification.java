package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {


        //setup for browser driver
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver driver =new ChromeDriver();

        //make our page full screen
        driver.manage().window().maximize();

        //go to yahoo.com
        driver.get("https://www.yahoo.com");

        //get the currently open webpage's title

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle=driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is as expected. Verification Passed");
        }else{
            System.out.println("Title is NOT as expected. Verification Failed ");
        }

    }
}
