package br.com.desafio.builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomacaoWebPO extends BasePO {

 @FindBy(css = "div.row>a.btn")
 public WebElement buttonAutomacaoWeb;

 public AutomacaoWebPO(WebDriver driver) {
  super(driver);
 }

 public void executarAcaoAutomacaoWeb() {
  buttonAutomacaoWeb.click();
 }

}
