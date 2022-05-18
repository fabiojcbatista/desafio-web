package br.com.desafio.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.desafio.pageObject.UsuarioPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuarioTest extends BaseTest {

 public static UsuarioPO usuarioPage;

 @BeforeClass
 public static void prepararTestes() {
  driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");
  usuarioPage = new UsuarioPO(driver);
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
}
