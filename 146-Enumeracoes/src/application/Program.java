package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);//Crição do objeto do tipo Order, passando parametros.
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSING; //Instância o objeto DELIVERED
		OrderStatus os2 = OrderStatus.SHIPPED; //Instância o objeto DELIVERED
		OrderStatus os3 = OrderStatus.valueOf("DELIVERED"); //Conversão de String para enum, usar esse formato.
		
		System.out.println(os1);
		System.out.println(os2);
		System.out.println(os3);
	}
}
