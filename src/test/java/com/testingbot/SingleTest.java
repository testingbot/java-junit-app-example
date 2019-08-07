package com.testingbot;

import static org.junit.Assert.*;

import org.junit.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SingleTest extends TestingBotJUnitTest {

  @Test
  public void test() throws Exception {
    AndroidElement inputA = (AndroidElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("inputA")));
    inputA.sendKeys("10");
    AndroidElement inputB = (AndroidElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("inputB")));
    inputB.sendKeys("5");
    Thread.sleep(5000);

    AndroidElement sum = (AndroidElement) new WebDriverWait(driver, 30).until(
        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("sum")));
    assertEquals(sum.getText(), "15");
  }
}
