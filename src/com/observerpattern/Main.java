package com.observerpattern;

public class Main {
    public static void main(String[] args) {
        Store StoreName = new Store();

        Customer c1 = new Customer("Khaja");
        Customer c2 = new Customer("Ahmed");
        Customer c3 = new Customer("Hussain");
        StoreName.Customer(c1);
        StoreName.Customer(c2);
        StoreName.Customer(c3);
        StoreName.Sale();
    }
}