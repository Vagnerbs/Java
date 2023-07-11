package entities;

public class Department {
	//-- atributos----
	private String name;
	
	// -- Construtores-----
	public Department() {		
	}

	public Department(String name) {
		this.name = name;
	}
	
	//--Metodos de acesso geters e seters, acessar atributos ----
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
