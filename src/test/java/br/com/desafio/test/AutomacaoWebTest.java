package br.com.desafio.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.desafio.builder.AutomacaoWebPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomacaoWebTest extends BaseTest {

 public static AutomacaoWebPO automacaoPage;

 @BeforeClass
 public static void prepararTestes() {
  automacaoPage = new AutomacaoWebPO(driver);
 }

 @Test
 public void TC001_deveAcessarNaPaginaAutomacaoWeb() {
  automacaoPage.executarAcaoAutomacaoWeb();
  assertEquals(automacaoPage.obterUrl(), "https://automacaocombatista.herokuapp.com/treinamento/home");

 }
}
