package DAO;

import DTO.AlunoDTO;

public interface SearchAluno {
	
	public AlunoDTO adicionarAluno(AlunoDTO aluno);
	
	public AlunoDTO excluirAluno(AlunoDTO aluno);
	
	public AlunoDTO alunoExiste(AlunoDTO aluno);
	
	public AlunoDTO editarAluno(AlunoDTO aluno);
	
	public AlunoDTO listarAlunos(AlunoDTO aluno);
	

}
