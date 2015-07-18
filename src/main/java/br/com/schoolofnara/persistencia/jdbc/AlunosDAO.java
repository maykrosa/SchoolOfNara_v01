package br.com.schoolofnara.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.schoolofnara.persistencia.entidade.Aluno;

public class AlunosDAO {

	private Connection con ;
	public AlunosDAO(){
		con = ConnetionFactory.getConnection();
	}
	
	public void cadastrar(Aluno alu) {
		String sql="insert into alunos(nome,endereco,serie,datanascimento) values (?,?,?,?)";
		try (PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, alu.getNome());
			stm.setString(2, alu.getEndereco());
			stm.setInt(3, alu.getSerie());
			stm.setString(4, alu.getDataNascimento());
			
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alterar(Aluno alu) {
		String sql="update  alunos set nome =?,endereco=?,serie=?,datanascimento=? where id=?";
		try (PreparedStatement stm = con.prepareStatement(sql)){
			stm.setString(1, alu.getNome());
			stm.setString(2, alu.getEndereco());
			stm.setInt(3, alu.getSerie());
			stm.setString(4, alu.getDataNascimento());
			stm.setInt(5, alu.getId());
			
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void excluir(Aluno alu) {
		String sql="delete from alunos where id=?";
		try (PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, alu.getId());			
			stm.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
}
