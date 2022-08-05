package br.com.desafio.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsuarioPO extends BasePO {

 @FindBy(css = "ul>li>a.collapsible-header")
 public WebElement buttonFormulario;

 @FindBy(css = "div.collapsible-body>ul>li>a")
 public WebElement buttonCriarUsuario;

 @FindBy(id = "user_name")
 public WebElement inputNome;

 @FindBy(id = "user_lastname")
 public WebElement inputUltimoNome;

 @FindBy(id = "user_email")
 public WebElement inputEmail;

 @FindBy(id = "user_address")
 public WebElement inputEndereco;

 @FindBy(id = "user_university")
 public WebElement inputUniversidade;

 @FindBy(id = "user_profile")
 public WebElement inputProfissao;

 @FindBy(id = "user_gender")
 public WebElement inputGenero;

 @FindBy(id = "user_age")
 public WebElement inputIdade;

 @FindBy(id = "notice")
 public WebElement mensagemSucesso;

 @FindBy(name = "commit")
 public WebElement ButtonCriar;

 @FindBy(css = "a.btn.waves-light.red")
 public WebElement buttonVoltar;

 public UsuarioPO(WebDriver driver) {
  super(driver);
 }

 public void executarAcaoFormulario() {
  buttonFormulario.click();
 }

 public void executarAcaoCriarUsuario() {
  buttonCriarUsuario.click();
 }

 public String ObterResultadoDoClickDoFormulario() {
  return buttonCriarUsuario.getText();
 }

 public void cadastrarUsuario(
   String nome,
   String ultimoNome,
   String email,
   String endereco,
   String universidade,
   String profissao,
   String genero,
   String idade) {

  escrever(inputNome, nome);
  escrever(inputUltimoNome, ultimoNome);
  escrever(inputEmail, email);
  escrever(inputEndereco, endereco);
  escrever(inputUniversidade, universidade);
  escrever(inputProfissao, profissao);
  escrever(inputGenero, genero);
  escrever(inputIdade, idade);

  ButtonCriar.click();

 }

 public String obterMensagem() {
  return mensagemSucesso.getText();
 }
}
