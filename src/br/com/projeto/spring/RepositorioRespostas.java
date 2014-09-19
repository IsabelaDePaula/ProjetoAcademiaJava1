package br.com.projeto.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RepositorioRespostas extends ConexaoJDBC {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public Assunto CarregarRespostas(int id_assunto){
		
		
		try {
			con = obterConexao();
			
			String sql = "select id_pergunta,descricao,resposta,id_tipo_fk from Perguntas p inner join Resposta r on p.id_pergunta=r.id_pergunta_fk where p.id_pergunta=3";
			ps.setInt(1,id_assunto);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				
			Respostas resposta = new Respostas();
				
			resposta.setId_pergunta(rs.getInt("id_resposta"));
			resposta.setDescricao(rs.getString("descricao"));
				
				
				
			Assunto assunto = new assunto();
			assunto.setId_assunto(id_assunto);
			assunto.setNome_assunto(rs.getString("nome_assunto"));
				
				return resposta;
				
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	
		public boolean CadastrarRespostas(Respostas respostas){
			int rs = 0;
			
			try {
				con = ObterConexao();
				String sql = "insert to Respostas values(?,?,?,?)";
				ps = con.prepareStatement(sql);
				ps.setInt(1, respostas.getIdUsuario());
				ps.setString(2, respostas.getDescricao());
				ps.setInt(3, respostas.getAssunto().getId_Assunto());
				rs = ps.executeUpdate();
				con.commit();
				
			} catch (Exception e) {
				
			}
			if(rs==1){
				System.out.println("inserido com sucesso");
				
			}
			return true;
			
		
	}
	
}

