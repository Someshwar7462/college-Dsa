package Recursion;
import java.util.Scanner;
public class phonekeypad {
    public static void main(String[] args) {
                // Define keypad mapping
                String[] keypad = {
                        "", "", "ABC", "DEF",
                        "GHI", "JKL", "MNO",
                        "PQRS", "TUV", "WXYZ"
                };

                // Take user input
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a digit (2-9): ");
                int digit = scanner.nextInt();

                // Validate input
                if (digit < 2 || digit > 9) {
                    System.out.println("Invalid input! Please enter a digit between 2 and 9.");
                } else {
                    System.out.println("Letters: " + keypad[digit]);
                }

                scanner.close();
            }
        }
