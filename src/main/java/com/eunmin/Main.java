package com.eunmin;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> items = new ArrayList<MenuItem>();
        items.add(new MenuItem("아메리카노", 2000));
        items.add(new MenuItem("라때", 3000));

        Menu menu = new Menu(items);

        Customer customer = new Customer();
        Barista barista = new Barista();

        customer.order("아메리카노", menu, barista);

    }
}
