package com.observerpattern;

public class Customer {
        private String name;
        private Store storeName = new Store();
        public Customer(String name) {

            this.name = name;
            // TODO Auto-generated constructor stub
        }
        public void update() {
            // TODO Auto-generated method stub
            System.out.println( "Hi " + name + ", There is a flash sale in our store come visit us and get the exiting offers ");
        }
    }
