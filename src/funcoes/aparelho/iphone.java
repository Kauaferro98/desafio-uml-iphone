package funcoes.aparelho;

import funcoes.aparelhoTelefonico.AparelhoTelefonico;
import funcoes.navegadorInternet.NavegadorInternet;
import funcoes.reprodutorMusical.ReprodutorMusical;

public class iphone implements AparelhoTelefonico, NavegadorInternet,ReprodutorMusical {


	public void tocar() {
		System.out.println("Musica Tocando!!!");
	}


	public void pausar() {
		System.out.println("Musica Pausada!!!");
	}


	public void selecionarMusica(String musica) {
		System.out.println(" Tocando musica: " + musica);
	}


	public void exibirPagina(String url) {
		System.out.println("entrando na url: " + url);
	}


	public void adicionarNovaAba() {
		System.out.println("NOva aba adicionada");
	}


	public void atualizarPagina() {
		System.out.println("Pagina autalizada com sucesso!!");
	}


	public void ligar(String numero) {
		System.out.println("Ligando para o numero: "+ numero );
	}


	public void atender() {
		System.out.println("Atendendo telefone!");
	}


	public void iniciarCorreioVoz() {
		System.out.println("Entrando no correio de voz!!");
	}

}
