package hotelreservation;

import java.util.*;

public class hotelreserv {

	public static void main(String[] args) {
		int hotel[][] = new int[7][5];

		Scanner input = new Scanner(System.in);

		System.out.println("HOTEL RESERVATION SYSTEM");

		while (true) {
			System.out.println("\n1. View Room");
			System.out.println("2. Check in");
			System.out.println("3. Check out");
			System.out.println("4. Exit ");

			System.out.print("Enter your choice: ");
			int choice = input.nextInt();

			if (choice == 1) {

				System.out.println("\nSHOWING ALL ROOMS\n");

				for (int i = 0; i < hotel.length; i++) {
					System.out.print("Floor " + (i + 1) + ": ");
					for (int j = 0; j < hotel[i].length; j++) {
						System.out.print(" [ " + hotel[i][j] + " ]");
					}
					System.out.println();
				}
			}
			if (choice == 2) {

				System.out.print("Enter Floor (1-7): ");
				int floor = input.nextInt() - 1;

				System.out.print("Enter Room (1-5); ");
				int room = input.nextInt() - 1;

				if (hotel[floor][room] == 1) {
					System.out.println("\n" + "Room already occupied!" + "\n");
				} else {
					hotel[floor][room] = 1;
					System.out.println("\n" + "Check-in successful!" + "\n");
				}

			}
			if (choice == 3) {

				System.out.print("Enter Floor (1-7): ");
				int floor = input.nextInt() - 1;

				System.out.print("Enter Room (1-5); ");
				int room = input.nextInt() - 1;

				if (hotel[floor][room] == 1) {
					hotel[floor][room] = 0;
					System.out.println("Room is available again");
				} else {
					System.out.println("Room is empty!");
				}

			}

			if (choice == 4) {
				System.out.println("\nThank you come again!");
				break;
			}
		}
		input.close();
	}
}
