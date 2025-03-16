package com.devsuperior.dependency;

import com.devsuperior.dependency.entities.Order;
import com.devsuperior.dependency.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DependencyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Integer orderId = scanner.nextInt();
		scanner.nextLine();

		Double orderValue = scanner.nextDouble();
		scanner.nextLine();

		Double orderDiscountPercentage = scanner.nextDouble();
		scanner.nextLine();

		Order order = new Order(orderId, orderValue, orderDiscountPercentage);

		System.out.println("Pedido codigo " + order.getId());
		System.out.printf("Valor total: R$ %.2f%n", this.orderService.calculateOrderValue(order));

		scanner.close();
	}
}
