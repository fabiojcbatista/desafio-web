package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import desafio-web.Waits;

public class PaginaAutomacaoWeb {
    private WebDriver driver;
    private Waits waits;

    public PaginaAutomacaoWeb(WebDriver driver){
        this.driver = driver;
        waits= new Waits(this.driver);
    }

    public WebElement getButtonAutomacaoWeb(){
        return driver.findElement(By.className("div.row>a.btn"));
    }
}
