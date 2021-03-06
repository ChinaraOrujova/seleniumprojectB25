package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        // 1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2 - create instance of the Selenium Webdriver;
        //this is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();

        //driver.manage().window().fullscreen();

        //3- go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of webpage
        String currentTitle =driver.getTitle();
        System.out.println("currentTitle = "+currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = "+currentURL);


        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to() is similar get() method
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        //System.out.println("driver.getTitle() = "+ driver.getTitle());
        currentTitle=driver.getTitle();
        System.out.println("currentTitle = "+currentTitle);

        //get the current URL using Selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = "+currentURL);


        //this will close the currently opened window
        driver.close();

        //this will close all of the opened window
        driver.quit();








    }
}
