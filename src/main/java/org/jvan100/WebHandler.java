package org.jvan100;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHandler {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "target/classes/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        final String baseUrl = "https://minesweeperonline.com/";
        webDriver.get(baseUrl);

        webDriver.quit();
    }

}
