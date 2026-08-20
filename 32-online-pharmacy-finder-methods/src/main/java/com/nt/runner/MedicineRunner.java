package com.nt.runner;


import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Medicine;
import com.nt.service.IMedicineService;

@Component
public class MedicineRunner implements CommandLineRunner {

    @Autowired
    private IMedicineService service;

    @Override
    public void run(String... args) throws Exception {


        while (true) {

          
            IO.println("1. Add Medicine");
            IO.println("2. View All Medicines");
            IO.println("3. Search By Category");
            IO.println("4. Search By Manufacturer");
            IO.println("5. Search By Stock Quantity Greater Than");
            IO.println("6. Delete Medicine");
            IO.println("7. Exit");

            IO.print("Enter Choice: ");
            int choice =Integer.parseInt(IO.readln("Enter choice: "));

            switch (choice) {

            case 1->{

              
                String name =IO.readln("Medicine Name: ");

                
                String category = IO.readln("Enter Category : ");

               
                String manufacturer = IO.readln("Manufacturer");
               
                Double price = Double.parseDouble(IO.readln("Price: "));

                
                Integer stock = Integer.parseInt(IO.readln("Stock"));

                Medicine medicine = new Medicine( name, category, manufacturer, price, stock);

                service.addMedicine(medicine);

                System.out.println("Medicine Added Successfully...");
            }
            case 2->service.viewAllMedicines().forEach(IO::println);

            case 3->{

               
                String cat = IO.readln("Enter Category : ");

                service.searchByCategory(cat).forEach(System.out::println);
            }
            case 4->{

                
                String manu =IO.readln("Manufacturer");

                service.searchByManufacturer(manu).forEach(System.out::println);
            }

            case 5->{

               
                Integer qty = Integer.parseInt(IO.readln("Stock"));

                service.searchByStockQuantityGreaterThan(qty).forEach(System.out::println);
            }
            case 6->{

               
                Integer id =Integer.parseInt(IO.readln("Medicine id"));
                service.deleteMedicine(id);

                IO.println("Medicine Deleted Successfully...");
            }

            case 7->System.exit(0);

                
            }
        }
    }
}