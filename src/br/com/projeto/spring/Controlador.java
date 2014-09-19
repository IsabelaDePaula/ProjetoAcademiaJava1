package br.com.projeto.spring;

public class Controlador {
	
	
	
	public void CarregaPerguntas(Assunto assunto) {

		PerguntaDAO perguntaDAO = new PerguntaDAO();
		perguntaDAO.CarregaPerguntas(assunto.getAssunto());
		
		
	}
	
	
	
	
	

}
