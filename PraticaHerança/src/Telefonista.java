
public class Telefonista extends Funcionarios {

	private String codigo;

	public Telefonista(){
		this.codigo = "";
			
	}
	
	public Telefonista(String nome, double salario, String profissao, String codigo){
	super(nome, salario, profissao);
	this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return "Nome: " + this.getNome() + "\n" + "Salario: "+ this.getSalario() + "\n" + "Profissão: " + this.getProfissao() + "\n" + "Código: " + this.getCodigo();
	
	}










}
