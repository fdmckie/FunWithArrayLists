import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//01. Write a Java program to create a new array list to hold colors.
//02. Add at least 3 colors (string) to the array list and print out all its values.




        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("Red");
        colorList.add("White");
        colorList.add("Blue");


        System.out.println();
        System.out.println();
        System.out.println(colorList);


//03. Using the array list created above, print out the value at index 1.
        System.out.println();
        System.out.println();
        System.out.println(colorList.get(1));



//04. Using the array list above, prompt the user for one new color, and add that color to the array list.

        String colorInput = "";
        System.out.println();
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a color:  ");
        colorInput = input.nextLine();
        colorList.add(colorInput);
        System.out.println();
        System.out.println();
        System.out.println(colorList);
        System.out.println();
        System.out.println();


//05. Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
// Each time the user enters a color, add that to the array list. Print out the list at the end.

        String continueProgram = "";

        while (!continueProgram.equalsIgnoreCase("q")) {

            System.out.println("Enter a color:  ");
            colorInput = input.nextLine();
            colorList.add(colorInput);
            System.out.println();
            System.out.println();

            System.out.println("Do you want to continue? : Enter 'Q' or 'q' to quit program ");
            continueProgram = input.next();
            input.nextLine();
            System.out.println();
            System.out.println();
        }

        System.out.println(colorList);

    }
}
