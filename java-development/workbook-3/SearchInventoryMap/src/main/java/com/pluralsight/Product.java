package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static HashMap<Integer, Product>
}
    public static HashMap<Integer, Product> {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d\n %s\n - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader("inventory.csv"));
            String line;
            while ((line = buff.readLine())!=null) {
                String[] name = line.split("\\|");
                int id = Integer.parseInt(name[0]);
                String meas = name[1];
                double price = Double.parseDouble(name[2]);
                inventory.add(new Product(id, meas, price));
            }