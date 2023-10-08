import java.util.Scanner;

public class StringEncodeDecode {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Encode a string");
            System.out.println("2. Decode a string");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int option = SC.nextInt();
            SC.nextLine(); // Consume the newline

            if (option == 1) {
                System.out.print("Enter a string: ");
                String inputString = SC.nextLine();

                // Convert the input string to an array of characters
                char[] charArray = inputString.toCharArray();

                // Encode the characters using a simple scheme (adding 1 to ASCII value)
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = (char) (charArray[i] + 1);
                }

                // Print the encoded array of characters
                System.out.println("Encoded array of characters:");
                for (char c : charArray) {
                    System.out.print(c);
                }
                System.out.println(); // Print a newline for separation

            } else if (option == 2) {
                System.out.print("Enter the encoded string: ");
                String encodedString = SC.nextLine();

                System.out.print("Enter the encoding value: ");
                int encodingValue = SC.nextInt();
                SC.nextLine(); // Consume the newline

                // Convert the encoded string to an array of characters
                char[] charArray = encodedString.toCharArray();

                // Decode the characters using the given encoding value
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = (char) (charArray[i] - encodingValue);
                }

                // Print the decoded result
                System.out.println("Decoded result:");
                for (char c : charArray) {
                    System.out.print(c);
                }
                System.out.println(); // Print a newline for separation

            } else if (option == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please choose a valid option.");
            }
        }

        SC.close();
    }
}
