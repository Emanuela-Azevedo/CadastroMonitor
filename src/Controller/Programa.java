package Controller;

import DTO.CoordenadorDTO;
import View.TelaCadastrarCoordenador;
import View.TelaLogin;
import View.TelaMenuCoordenador;

public class Programa {
	public static void main(String[] args) {
		CoordenadorDTO coordenadorDto = new CoordenadorDTO();
		CoordenadorController coordenadorControler = new CoordenadorController();

		// Verifica se já existe um coordenador
		if (!coordenadorControler.coordenaodorExiste(coordenadorDto)) {
			new TelaCadastrarCoordenador(); // Exibe a tela de cadastro para criar o coordenador
		} else {
			// Se já existir, redireciona para a tela de login
			new TelaLogin();
		}
	}
}
