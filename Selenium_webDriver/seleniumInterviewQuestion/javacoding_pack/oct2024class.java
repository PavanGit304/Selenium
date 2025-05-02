package javacoding_pack;

import java.util.ArrayList;
import java.util.Scanner;

// collection and collections 

public class oct2024class {


//	public class TicketBookingSystem {

	    // A list to store booked tickets
	    static ArrayList<String> reservations = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean exit = false;

	        while (!exit) {
	            System.out.println("\nWelcome to the Ticket Booking System");
	            System.out.println("1. Book Tickets");
	            System.out.println("2. View My Reservations");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    bookTickets(scanner);
	                    break;
	                case 2:
	                    manageReservations(scanner);
	                    break;
	                case 3:
	                    System.out.println("Exiting the system. Thank you!");
	                    exit = true;
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        }

	        scanner.close();
	    }

	    // Method to book tickets
	    public static void bookTickets(Scanner scanner) {
	        System.out.print("Enter the number of tickets to book: ");
	        int count = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        for (int i = 1; i <= count; i++) {
	            System.out.print("Enter passenger name for ticket " + i + ": ");
	            String name = scanner.nextLine();
	            reservations.add(name);
	        }

	        System.out.println("Tickets booked successfully!");
	    }

	    // Method to view and manage reservations
	    public static void manageReservations(Scanner scanner) {
	        if (reservations.isEmpty()) {
	            System.out.println("No reservations found.");
	            return;
	        }

	        System.out.println("\nYour Reservations:");
	        for (int i = 0; i < reservations.size(); i++) {
	            System.out.println((i + 1) + ". " + reservations.get(i));
	        }

	        System.out.println("\nOptions:");
	        System.out.println("1. Delete All Tickets");
	        System.out.println("2. Return to Main Menu");
	        System.out.print("Choose an option: ");

	        int option = scanner.nextInt();
	        switch (option) {
	            case 1:
	                reservations.clear();
	                System.out.println("All tickets have been deleted.");
	                break;
	            case 2:
	                System.out.println("Returning to the main menu...");
	                break;
	            default:
	                System.out.println("Invalid option. Returning to the main menu.");
	        }
	    }
	}



