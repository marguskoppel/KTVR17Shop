/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author pupil
 */
public class KTVR17Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*List<Product> products = new ArrayList<>();
        Product product1 = new Product("001", "Milk", "200", "1");
        products.add(product1);
        Product product2 = new Product("002", "Bread", "250", "1");
        products.add(product2);
        Product product3 = new Product("003", "Apples", "300", "10");
        products.add(product3);
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println("Список продуктов " + product.toString());

        }
        Customer John = new Customer("38901111111", "John", "Johnson", "750");
        Customer peter = new Reader();// создаем Peter*a на основе Reader
        peter.setName("Peter");
        peter.setEmail("Peter@Limpopo.ee");
        peter.setCode("123456789");
        peter.setTelefon("112");

        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("38901111111", "John", "Johnson", "750");
        customers.add(customer1);
        Customer customer2 = new Customer("48901111111", "Mary", "Johnson", "750");
        customers.add(customer2);
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Список покупателей" + customer.toString());

        }*/
        Product p1 = new Product(1L, "Milk", 50, 10);
        Product p2 = new Product(2L, "Bread", 30, 15);
        Product p3 = new Product(3L, "Sausage", 130, 20);

        Customer c1 = new Customer(1L, "Ivan", "Ivanov", 1000);
        Customer c2 = new Customer(2L, "Sidor", "Sidorov", 1000);
        Customer c3 = new Customer(3L, "Petr", "Petrov", 1000);

        System.out.println("Status p1 - " + p1.toString());
        System.out.println("Status c1 - " + c1.toString());

        Calendar calendar = new GregorianCalendar();

        Purchase purchase1 = new Purchase(1L, p1, c1, calendar.getTime(), 2);
        p1.setCount(p1.getCount() - purchase1.getQuantity());
        c1.setMoney(c1.getMoney() - purchase1.getQuantity() * p1.getPrice());

        System.out.println(purchase1.getCustomer().getName() + " " + purchase1.getCustomer().getSurname() + " купил: " + purchase1.getProduct().getName() + " в количестве " + purchase1.getQuantity() + " штук");
        System.out.println("Status p1 - " + p1.toString());
        System.out.println("Status c1 - " + c1.toString());

    }
}
