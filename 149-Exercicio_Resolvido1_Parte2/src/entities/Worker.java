package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

//Classe que vai me retornar a renda do trabalhador, recebendo seus contratos e sua base salarial

public class Worker {
	
//-----------Atributos--------------------------------------
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

//-----------Construtores-------------------------------
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

//------------Métodos para gets e seters para acessar os atributos-------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*public void setContracts(List<HourContract> contracts) {
		this.contracts = contracts;
		(Não podemos deixar esse método para não permitir que minha lista seja trocada, pois esta 
		recebendo outra lista como paramêtro e isso fará a troca da mesma) 
	}*/

//----------Métodos para adicionar e remover contratos------------------
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

//-----Método para fazer os calculos dos ganhos durante o mês------
	//Somamos o salario base mais os ganhos dos contratos daquele mês.
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();//Importei o calendario para poder comparar e pegar ano e mês 
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());//Peguei a data do contrato e defini como sendo a data do calendario
			int c_year = cal.get(Calendar.YEAR);// Aqui peguei o ano da data
			int c_month = 1 + cal.get(Calendar.MONTH);// Aqui peguei o mês(acrescenta 1 pq começa com zero)
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
