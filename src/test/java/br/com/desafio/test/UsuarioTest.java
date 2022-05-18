package br.com.desafio.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.desafio.builder.UsuarioBuilder;
import br.com.desafio.pageObject.UsuarioPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuarioTest extends BaseTest {

 public static UsuarioPO usuarioPage;
 public static UsuarioPO cadastroPage;

 @BeforeClass
 public static void prepararTestes() {
  driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");
  usuarioPage = new UsuarioPO(driver);

  driver.get("https://automacaocombatista.herokuapp.com/users/new");
  cadastroPage = new UsuarioPO(driver);
 }

 @Test
 public void TC002_deveAcessarCriarUsuarios() {
  usuarioPage.executarAcaoFormulario();
  String resultado = usuarioPage.ObterResultadoDoClickDoFormulario();
  assertTrue(resultado, resultado.contains("Criar Usuários"));

 }

 @Test
 public void TC003_deveAcessarFormularioUsuarios() {
  usuarioPage.executarAcaoCriarUsuario();
  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users/new");

 }

 @Test
 public void TC004_deveSerPossivelCadastrarUmUsuarioComNomeEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarNome("Aandersen")
    .builder();

  assertEquals(cadastroPage.obterMensagem(), "Usuário Criado com sucesso");
 }

 @Test
 public void TC005_deveSerPossivelCadastrarUmUsuarioComUltimoNomeEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUltimoNome("Santos")
    .builder();

  assertEquals(cadastroPage.obterMensagem(), "Usuário Criado com sucesso");
 }

 @Test
 public void TC006_deveSerPossivelCadastrarUmUsuarioComEmailEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarEmail("Luiz@gmail.com")
    .builder();

  assertEquals(cadastroPage.obterMensagem(), "Usuário Criado com sucesso");
 }

 @Test
 public void TC007_naoDeveSerPossivelCadastrarUmUsuarioComNomeVazioEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarNome("")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC008_naoDeveSerPossivelCadastrarUmUsuarioComNomeComNumerosEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarNome("999999999")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC009_naoDeveSerPossivelCadastrarUmUsuarioComNomeComCaracteresEspeciaisEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarNome("aa@._/~")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC010_naoDeveSerPossivelCadastrarUmUsuarioComNomeComEspacoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarNome(" ")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC011_naoDeveSerPossivelCadastrarUmUsuarioComUltimoNomeVazioEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUltimoNome("")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC012_naoDeveSerPossivelCadastrarUmUsuarioComUltimoNomeComNumerosEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUltimoNome("999999999")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC013_naoDeveSerPossivelCadastrarUmUsuarioComUltimoNomeComCaracteresEspeciaisEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUltimoNome("aa@._/~")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC014_naoDeveSerPossivelCadastrarUmUsuarioComUltimoNomeComEspacoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUltimoNome(" ")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC015_naoDeveSerPossivelCadastrarUmUsuarioComEmailSemArrobaEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarEmail("lucas.com.br")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC016_naoDeveSerPossivelCadastrarUmUsuarioComEmailSemPontoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarEmail("aa@gmail")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC017_naoDeveSerPossivelCadastrarUmUsuarioComEmailVazioEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarEmail("")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC018_naoDeveSerPossivelCadastrarUmUsuarioComUniversidadeComNumeroEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUniversidade("99999999")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC019_naoDeveSerPossivelCadastrarUmUsuarioComUniversidadeComCaracteresEspeciaisEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUniversidade("./]^")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC020_naoDeveSerPossivelCadastrarUmUsuarioComUniversidadeComEspacoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarUniversidade(" ")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC021_naoDeveSerPossivelCadastrarUmUsuarioComProfissaoComNumeroEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarProfissao("999999")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC022_naoDeveSerPossivelCadastrarUmUsuarioComProfissaoComCaracteresEspeciaisEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarProfissao("~/kkl")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC023_naoDeveSerPossivelCadastrarUmUsuarioComProfissaoComEspacoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarProfissao(" ")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }
 
 @Test
 public void TC024_naoDeveSerPossivelCadastrarUmUsuarioComGeneroComNumeroEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarGenero("999999")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }
 
 @Test
 public void TC025_naoDeveSerPossivelCadastrarUmUsuarioComGeneroComCaracteresEspeciaisEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarGenero("/~´m")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC026_naoDeveSerPossivelCadastrarUmUsuarioComGeneroComEspacoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarGenero(" ")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC027_naoDeveSerPossivelCadastrarUmUsuarioComIdadeComCaracteresEspeciaisEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarIdade("/~,.")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 @Test
 public void TC028_naoDeveSerPossivelCadastrarUmUsuarioComIdadeComEspacoEDemaisCamposValidos() {
  UsuarioBuilder usuario = new UsuarioBuilder(cadastroPage);
  usuario
    .adicionarIdade(" ")
    .builder();

  assertEquals(usuarioPage.obterUrl(), "https://automacaocombatista.herokuapp.com/users");
 }

 

}
