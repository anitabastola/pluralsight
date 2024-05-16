package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {

    public static void HashMap<Integer, Product>inventory =
            new HashMap<>();

    public static void main(String)

    ArrayList<Product> inventory = getInventory();
    Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
    int id = scanner.nextInt();
    Product matchedProduct = inventory.get(id);
        if(matchedProduct ==null)

    {
        System.out.println("We don't carry that product");
        return;
    }

        System.out.println("We carry %s and the price is $%.2f",
                matchedProduct.getName(),matchedProduct.getPrice());
}

public static void loadInventory() {
    String fileName = "Inventory.csv";

    try {
        BufferedReader buff = new BufferedReader((new FileReader(fileName));
        String line;
        while ((line = buff.readLine())!= null) {
            String[] name = line.split(regex: "\\|");
            double price = Double.parseDouble(proc[2]);
            Product product = new Product(id, meas, price);

            )
        }


        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        try {
            BufferedReader buff = new BufferedReader(new FileReader("inventory.csv"));
            String line;
            while ((line = buff.readLine()) != null) {
                String[] name = line.split("\\|");
                int id = Integer.parseInt(name[0]);
                String meas = name[1];
                inventory.put(id, new Product(id, name, price));
                double price = Double.parseDouble(name[2]);
                inventory.add(new Product(id, meas, price));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }