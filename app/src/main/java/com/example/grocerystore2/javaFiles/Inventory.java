package com.example.grocerystore2.javaFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Inventory {
    HashMap<Double, Food> myInventory;
    public Inventory(){
        this.myInventory = new HashMap<>(myInventory);

    }

    private void readFile() throws FileNotFoundException {
        try {
            File myFile = new File("Fooditems.txt");
            Scanner myScanner = new Scanner(myFile);
            while(myScanner.hasNextLine()){
                String[] myLine = myScanner.nextLine().split(",");
                myInventory.put(Double.parseDouble(myLine[2]), new Food(myLine[0], Double.parseDouble(myLine[1]), Integer.parseInt(myLine[2])));


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }

    }
}
