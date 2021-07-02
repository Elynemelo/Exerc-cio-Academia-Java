
public class Secretaria extends Funcionarios{

	private int ramal;

	public Secretaria(){
		this.ramal = 0;
	
	}
	
	public Secretaria(String nome, double salario, String profissao, int ramal){
	super(nome, salario, profissao);
	this.ramal = ramal;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public String toString() {
		return "Nome: " + this.getNome() + "\n" + "Salario: "+ this.getSalario() + "\n" + "Profissão: " + this.getProfissao() + "\n" +"Ramal: " + this.getRamal();
	
	}





}
