package com.nt.runner;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Booking;
import com.nt.repository.IBookingRepository;

@Component
public class BookingRunner implements CommandLineRunner {

	@Autowired
    private  IBookingRepository bookingRepository;

 
    @Override
    public void run(String... args) {

        while (true) {

            IO.println("""
                    
                    ===== HOTEL BOOKING MANAGEMENT =====
                    1. Chennai OR Suite
                    2. Booking Amount Between 5000 - 15000
                    3. Number Of Days Between 2 - 5
                    4. Confirmed OR Hyderabad
                    5. Booking Dates Between 2026-01-01 and 2026-03-31
                    6. Anita OR Cancelled
                    7. Deluxe OR Pending
                    8. Booking IDs Between 101 - 110
                    9. Exit
                    ====================================
                    Enter Choice :
                    """);

            int choice = Integer.parseInt(IO.readln());

            switch (choice) {

                case 1 -> {
                    List<Booking> bookings = bookingRepository.findByCityOrRoomType("Chennai", "Suite");

                    bookings.forEach(IO::println);
                }

                case 2 -> {
                    List<Booking> bookings =bookingRepository.findByBookingAmountBetween(5000.0, 15000.0);

                    bookings.forEach(IO::println);
                }

                case 3 -> {
                    List<Booking> bookings =bookingRepository.findByNumberOfDaysBetween(2, 5);

                    bookings.forEach(IO::println);
                }

                case 4 -> {
                    List<Booking> bookings =bookingRepository.findByBookingStatusOrCity("Confirmed", "Hyderabad");

                    bookings.forEach(IO::println);
                }

                case 5 -> {
                    List<Booking> bookings =
                            bookingRepository.findByBookingDateBetween(LocalDate.of(2026, 1, 1),LocalDate.of(2026, 3, 31));

                    bookings.forEach(IO::println);
                }

                case 6 -> {
                    List<Booking> bookings =bookingRepository.findByGuestNameOrBookingStatus("Anita", "Cancelled");

                    bookings.forEach(IO::println);
                }

                case 7 -> {
                    List<Booking> bookings =bookingRepository.findByRoomTypeOrBookingStatus("Deluxe", "Pending");

                    bookings.forEach(IO::println);
                }

                case 8 -> {
                    List<Booking> bookings =
                            bookingRepository.findByBookingIdBetween(101L, 110L);

                    bookings.forEach(IO::println);
                }

                case 9 -> {
                    IO.println("Application Closed...");
                    return;
                }

                default -> IO.println("Invalid Choice");
            }
        }
    }
}