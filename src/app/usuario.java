package app;

import funcoes.aparelho.iphone;
import funcoes.aparelhoTelefonico.AparelhoTelefonico;
import funcoes.navegadorInternet.NavegadorInternet;
import funcoes.reprodutorMusical.ReprodutorMusical;
public class usuario {
	public static void main(String[] args) {
		
		iphone iphone = new iphone ();
		AparelhoTelefonico aparelho = iphone;
		NavegadorInternet navegador = iphone;
		ReprodutorMusical reprodutor = iphone;
		
		aparelho.ligar("11953549745");
		aparelho.atender();
		aparelho.iniciarCorreioVoz();
		
		System.out.println("--------------------");
		
		navegador.exibirPagina("www.slave.com.br");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		
		System.out.println("--------------------");
		
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarMusica("5");
		
		
		
	}
}
