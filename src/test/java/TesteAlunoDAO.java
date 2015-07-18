import br.com.schoolofnara.persistencia.entidade.Aluno;
import br.com.schoolofnara.persistencia.jdbc.AlunosDAO;

public class TesteAlunoDAO {

	public TesteAlunoDAO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//testeCadastrar();
		//testeAlterar(4);
		testeExcluir(4);
	}
	
	public static void testeCadastrar(){
		Aluno alu = new Aluno();
		alu.setNome("beatriz barbosa silva rosa");
		alu.setEndereco("irapuã");
		alu.setSerie(5);
		alu.setDataNascimento("15-05-2005");
		
		AlunosDAO aluDAO = new AlunosDAO();
		aluDAO.cadastrar(alu);
		System.out.println("Cadastrado com sucesso!!!");
	}
	
	public static void testeAlterar(int id){
		Aluno alu = new Aluno();
		alu.setId(id);
		alu.setNome("nova bia");
		alu.setEndereco("irapuã 823");
		alu.setSerie(5);
		alu.setDataNascimento("15-05-2015");
		
		AlunosDAO aluDAO = new AlunosDAO();
		aluDAO.alterar(alu);
		System.out.println("Alterado com sucesso!!!");
	}
	
	public static void testeExcluir(int id){
		Aluno alu = new Aluno();
		alu.setId(id);
		
		
		AlunosDAO aluDAO = new AlunosDAO();
		aluDAO.excluir(alu);
		System.out.println("Excluido com sucesso!!!");
	}
}
