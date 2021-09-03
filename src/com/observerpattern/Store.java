package com.observerpattern;
import java.util.*;
public class Store {

        private List<Customer> customers = new ArrayList<>();
        private String title;

        public void Customer(Customer customer) {
            customers.add(customer);
        }
        public void notifyCustomer(){
            for(Customer customer : customers)
            {
                customer.update();
            }
        }

        public void Sale() {
            notifyCustomer();
        }

    }
