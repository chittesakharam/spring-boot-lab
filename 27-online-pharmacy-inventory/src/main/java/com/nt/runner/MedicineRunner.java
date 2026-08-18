package com.nt.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMedicineRepository;

@Component
public class MedicineRunner implements CommandLineRunner {

	@Autowired
	private IMedicineRepository repo;
	@Override
	public void run(String... args) throws Exception {
		 while(true){

	            IO.println("\n===== MENU =====");
	            IO.println("1. Antibiotic or ABC Pharma");
	            IO.println("2. Price 100-500");
	            IO.println("3. Stock 50-200");
	            IO.println("4. Paracetamol or Pain Relief");
	            IO.println("5. Expiry 2026-06-01 to 2026-12-31");
	            IO.println("6. Rating 4.0-5.0");
	            IO.println("7. HealthCare Ltd or Vitamin");
	            IO.println("8. IDs 201-210");
	            IO.println("9. Exit");

	            IO.println("Enter Choice:");
	            int choice=Integer.parseInt(IO.readln());

	            switch(choice){

	                case 1->repo.findByCategoryOrManufacturer("Antibiotic","ABC Pharma")
	                        .forEach(IO::println);

	                case 2->repo.findByPriceBeetween(100.0,500.0)
	                        .forEach(IO::println);

	                case 3->repo.findByStockQuantityBetween(50,200)
	                        .forEach(IO::println);

	                case 4->repo.findByMedicineNameOrCategory("Paracetamol","Pain Relief")
	                        .forEach(IO::println);

	                case 5->repo.findByExpiryDateBetween(LocalDate.of(2026,6,1),LocalDate.of(2026,12,31))
	                        .forEach(IO::println);

	                case 6->repo.findByRatingBetween(4.0,5.0)
	                        .forEach(IO::println);

	                case 7->repo.findByManufacturerOrCategory("HealthCare Ltd","Vitamin")
	                        .forEach(IO::println);

	                case 8->repo.findByMedicineIdBetween(201L,210L)
	                        .forEach(IO::println);

	                case 9->{
	                    IO.println("Application Closed");
	                    System.exit(0);
	                }

	                default->IO.println("Invalid Choice");
	            }
	        }

	}

}
