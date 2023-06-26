package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {//Atributos
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
//-------------------------------------------------------------------
	
	public Order() {//Construtor vazio
		
	}

	public Order(Integer id, Date moment, OrderStatus status) {//Construtor com argumentos
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

//--------------------------------------------------------------------------
	
	// Métodos geters e seters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

//----------------------------------------------------------------------
	
	// toString padrão para imprimir a resposta
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
