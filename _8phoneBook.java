import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prob8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of entry count: ");
		int numEntries = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		// Create a HashMap to store the phone book entries
		Map<String, String> phoneBook = new HashMap<>();

		// Read the phone book entries
		for (int i = 0; i < numEntries; i++) {
			System.out.print("Enter name: ");
			String name = scanner.nextLine();
			System.out.print("Enter phone number: ");
			String phoneNumber = scanner.nextLine();
			phoneBook.put(name, phoneNumber);
		}

		// Process the queries
		System.out.print("Enter name for finding its number: ");

		while (scanner.hasNextLine()) {
			String query = scanner.nextLine();
			if (phoneBook.containsKey(query)) {
				String phoneNumber = phoneBook.get(query);
				System.out.println(query + " " + phoneNumber);
			} else {
				System.out.println("Not found");
			}
		}

		scanner.close();
	}
}
