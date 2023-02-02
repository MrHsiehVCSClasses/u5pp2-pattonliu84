package u5pp;

import java.util.Scanner;


public class InputHelper {
    Scanner sc;
    
    InputHelper(Scanner scanner) {
        sc = scanner;
    }
//Converts user input into actual position. 
    public int[] getChessLocation(String prompt) {
        System.out.println(prompt);
        String input = sc.nextLine();
        input = input.toLowerCase();
// Per ASCII, a is 97 and 1 is 49. so I can technically minus a 'a'.
        int col = input.charAt(0) - 'a';
        int row = input.charAt(1) - '1';

        while (input.length() != 2 || (col < 0 || col > 7) || (row < 0 || row > 7)) {
            System.out.println("You are bad, thats invalid. ");
            System.out.println(prompt);
            input = sc.nextLine();
            input = input.toLowerCase();
            col = input.charAt(0) - 'a';
            row = input.charAt(1) - '1';
        }
        
        int[] coordinates = new int[2];
        coordinates[1] = col;
        coordinates[0] = row;
        System.out.println(col + " " + row);
        return coordinates;
    }
}
