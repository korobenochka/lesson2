package org.example;

import static org.example.IsNumberEven.a;
import static org.junit.Assert.assertTrue;
import static org.example.IsNumberEven.checkTheNumber;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class IsNumberEvenTest {

    @Test
    public void shouldAnswerWithTrue() {
        System.setProperty("webdriver.chrome.driver","/Users/admin/stuff/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        //assertTrue(checkTheNumber(a));
    }
}
