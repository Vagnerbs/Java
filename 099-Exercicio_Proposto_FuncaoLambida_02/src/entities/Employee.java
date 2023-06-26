package entities;

public class Employee {

//----------- Atributos-------------------------------
	private Integer id;
	private String name;
	private Double salary;

//-----------Construtores-------------------------
	
	// Padrão sem argumentos
	public Employee() {
	}
	
	// Com argumentos
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

//-----------Metodos get e set para acesso aos atributos------------
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
//----------------Funçaõ para aumento de salarios--------------
	
	public void increaseSalary(double percentage) {
		this.salary += salary * percentage / 100.0;
	}

//-------------Método to Sting para resposta---------------
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
