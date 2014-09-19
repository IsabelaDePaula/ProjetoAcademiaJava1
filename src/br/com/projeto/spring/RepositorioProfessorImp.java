package br.com.projeto.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class RepositorioProfessorImp implements RepositorioProfessor{
	
	public  CadastrarPerguntas(Pergunta pergunta) {
		Connection con;
		PreparedStatement pstmt = null;
		int res;
				
			try{
				
				con.prepareStatement("INSERT INTO Pergunta values (?,?,?,?)");
				pstmt.setInt(1,pergunta.getId() );
				pstmt.setString(2,pergunta.getNome());
				pstmt.setString(3,pergunta.getEmail());
				pstmt.setString(4,pergunta.getSenha());
				
				
				res = pstmt.executeUpdate();
				con.commit();
			}catch (SQLException e){
				
			}
				
			return true;
		
	}
	

}
