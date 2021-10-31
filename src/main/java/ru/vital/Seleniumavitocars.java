package ru.vital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * https://www.selenium.dev/
 * https://www.youtube.com/watch?v=L2jMIJy0u90&list=WL&index=279&t=897s
 */
public class Seleniumavitocars {
    public static void main(String[] args) {
        System.out.println(System.setProperty("webdriver.chrome.driver", "C" + ":\\chromedriver_win32\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.avito.ru/rossiya/avtomobili");

        WebElement element = driver.findElement(By.xpath("//a[text()='Личные вещи'])[1]"));
        String param = element.getAttribute("href");
        System.out.println(param);
    }
}
