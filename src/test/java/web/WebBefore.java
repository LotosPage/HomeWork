package web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBefore {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.mail.ru");
        WebElement search = driver.findElement(By.id("q"));
        search.sendKeys("Sweet Dogs");
        search.submit();

        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();


    }
}

