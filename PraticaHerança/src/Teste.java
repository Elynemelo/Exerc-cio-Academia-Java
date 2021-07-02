

public class Teste {

	public static void main(String[] args) {
		
	Gerente g1 = new Gerente();
	g1.setNome("Fabio Ramalho");
	g1.setSalario(4000);
	g1.setProfissao("Gerente");
	g1.setLogin("FabioR");
	g1.setSenha("Q12234");
	
	
	Telefonista t1 = new Telefonista();
	t1.setNome("Erica Dantas");
	t1.setSalario(2000);
	t1.setProfissao("Telefonista");
	t1.setCodigo("222");
	
	Secretaria s1 = new Secretaria();
	s1.setNome("Joana Lira");
	s1.setSalario(2500);
	s1.setProfissao("Secretaria");
	s1.setRamal(333);
		
	
	//toString
			System.out.println("------FUNCIONÁRIOS--------------");
			
			System.out.println(g1.toString() + "\n");
			
			System.out.println(t1.toString() + "\n");
			
			System.out.println(s1.toString() + "\n");
			
			System.out.println("--------------------------------");
	
	
	}

}
