package br.com.desafio.builder;

import br.com.desafio.pageObject.UsuarioPO;

public class UsuarioBuilder {
 private String nome = "Fabiano";
 private String ultimoNome = "Costa";
 private String email = "f.costa@gmail.com";
 private String endereco = "";
 private String universidade = "";
 private String profissao = "";
 private String genero = "";
 private String idade = "";

 private UsuarioPO usuarioPO;

 public UsuarioBuilder(UsuarioPO usuarioPO) {
  this.usuarioPO = usuarioPO;
 }

 public UsuarioBuilder adicionarNome(String nome) {
  this.nome = nome;
  return this;
 }

 public UsuarioBuilder adicionarUltimoNome(String ultimoNome) {
  this.ultimoNome = ultimoNome;
  return this;
 }

 public UsuarioBuilder adicionarEmail(String email) {
  this.email = email;
  return this;
 }

 public UsuarioBuilder adicionarEndereco(String endereco) {
  this.endereco = endereco;
  return this;
 }

 public UsuarioBuilder adicionarUniversidade(String universidade) {
  this.universidade = universidade;
  return this;
 }

 public UsuarioBuilder adicionarProfissao(String profissao) {
  this.profissao = profissao;
  return this;
 }

 public UsuarioBuilder adicionarGenero(String genero) {
  this.genero = genero;
  return this;
 }

 public UsuarioBuilder adicionarIdade(String idade) {
  this.idade = idade;
  return this;
 }

 public void builder() {
  usuarioPO.escrever(usuarioPO.inputNome, nome);
  usuarioPO.escrever(usuarioPO.inputUltimoNome, ultimoNome);
  usuarioPO.escrever(usuarioPO.inputEmail, email);
  usuarioPO.escrever(usuarioPO.inputEndereco, endereco);
  usuarioPO.escrever(usuarioPO.inputUniversidade, universidade);
  usuarioPO.escrever(usuarioPO.inputProfissao, profissao);
  usuarioPO.escrever(usuarioPO.inputGenero, genero);
  usuarioPO.escrever(usuarioPO.inputIdade, idade);

  usuarioPO.ButtonCriar.click();
 }
}
