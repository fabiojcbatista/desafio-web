package br.com.desafio.builder;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {
 protected WebDriver driver;

 public BasePO(WebDriver driver) {
  this.driver = driver;
  PageFactory.initElements(driver, this);
 }

 public String obterUrl() {
  return driver.getCurrentUrl();
 }

 public void escrever(WebElement input, String texto) {
  input.clear();
  input.sendKeys(texto + Keys.TAB);
 }

}
