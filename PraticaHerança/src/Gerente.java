
public class Gerente extends Funcionarios{

	private String login;
	private String senha;

	public Gerente(){
	this.login = "";
	this.senha = "";
	}
	
	public Gerente(String nome, double salario, String profissao, String login, String senha){
	super(nome, salario, profissao);
	this.login = login;
	this.senha = senha;	
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\n" + "Salario: "+ this.getSalario() + "\n"+ "Profissão: " + this.getProfissao()+ "\n" + "Login: " + this.getLogin()
				+ "\n" + "Senha: " + this.getSenha();
	
	}

	
}
