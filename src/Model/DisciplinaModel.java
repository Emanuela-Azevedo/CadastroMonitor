package Model;

import java.util.ArrayList;

public class DisciplinaModel {
	
	private String nomeDaDisciplina;
	private String qtdVagasVoluntario;
	private String qtdVagasRemunerada;
	private ArrayList<InscricaoModel> inscricoes;
	
	public DisciplinaModel(String nomeDaDisciplina, String qtdVagasVoluntario, String qtdVagasRemunerada) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.qtdVagasVoluntario = qtdVagasVoluntario;
		this.qtdVagasRemunerada = qtdVagasRemunerada;
		this.inscricoes = new ArrayList<>();
	}

	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}

	public void setNomeDaDisciplina(String nomeDaDisciplina) {
		this.nomeDaDisciplina = nomeDaDisciplina;
	}

	public String getQtdVagasVoluntario() {
		return qtdVagasVoluntario;
	}

	public void setQtdVagasVoluntario(String qtdVagasVoluntario) {
		this.qtdVagasVoluntario = qtdVagasVoluntario;
	}

	public String getQtdVagasRemunerada() {
		return qtdVagasRemunerada;
	}

	public void setQtdVagasRemunerada(String qtdVagasRemunerada) {
		this.qtdVagasRemunerada = qtdVagasRemunerada;
	}

	public ArrayList<InscricaoModel> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(ArrayList<InscricaoModel> inscricoes) {
		this.inscricoes = inscricoes;
	}

}
