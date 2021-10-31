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
public class SeleniumBasic {
    public static void main(String[] args) {
        System.out.println(System.setProperty("webdriver.chrome.driver", "C" + ":\\chromedriver_win32\\chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.xpath("<input class=\"gNO89b\" value=\"Google zoeken\" aria-label=" + "\"Google zoeken\" name=\"btnK\" type=\"submit\" data-ved=\"0ahUKEwj2pryEivTzAhXIzqQKHQ9aAogQ4dUDCAw\">"));
        /**
         * xpath самый лёчший механизм.
         */
        WebElement inputs = driver.findElement(By.xpath("<input " + "class=\"gNO89b\" value=\"Google zoeken\" aria-label=\"Google zoeken\" name=\"btnK\" " + "type=\"submit\" data-ved=\"0ahUKEwj2pryEivTzAhXIzqQKHQ9aAogQ4dUDCAw\">"));
        /**
         * Console for css selector - $$("body") -> enter
         * id -> $$("#id")
         * class -> $$(".class")
         * if many classes -> $$(".class1.class2.class3")
         * if search without .class -> $$("div.not(".class")")
         * is search link without http -> $$(a:not(href^='http')")
         * attr -> $$("[role='main']")  or $$("[role]")  or $$("div[role]")
         * if $$("[role*='ai']")  all options with ai letters combination
         * if $$("[role^='ai']")   ai first letters combination
         * if $$("[role$='ai']")   ai first last letters combination
         * search inside $$("div[jscontroller='Txzt'] div.lYazd")
         * li -> $$("ul li:first-child") -> $$("ul li:last-child") -> $$("ul
         * li:nth-child(2)")
         */
        //WebElement inputCssSelector = driver.findElement(By.cssSelector());
        //WebElement inputClassSelector = driver.findElement(By.className());
        //WebElement inputIdSelector = driver.findElement(By.id());
        //WebElement inputLinkTextSelector = driver.findElement(By.linkText());
        // Высокая затратность ресурсов
        //WebElement inputTagNameSelector = driver.findElement(By.tagName());
        System.out.println(input);
    }

}
