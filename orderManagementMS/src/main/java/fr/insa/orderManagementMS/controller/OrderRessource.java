package fr.insa.orderManagementMS.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRessource {

	@GetMapping("/orders")
	public int ordersNumber() {
		return 1500; 
	}
	
	@GetMapping("/orders/{id}")
	public Order infosOrder(@PathVariable int id) {
		Order order=new Order(id, 2,LocalDate.now() ,14.0)
	}
}
