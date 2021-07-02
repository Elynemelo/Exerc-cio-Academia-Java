
public class Funcionarios {

	private String nome;
	private double salario;
	private String profissao;
	
	public Funcionarios(){
	this.nome = "";
	this.salario = 00;
	this.profissao = "";
	}
	
	public Funcionarios(String nome, double salario, String profissao){
	this.nome = nome;
	this.salario = salario;	
	this.profissao = profissao;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\n" + "Salario: "+ this.getSalario() + "\n" + "Profissão: " + this.getProfissao();
					
		}

}
