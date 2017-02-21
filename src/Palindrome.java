import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hillmanrj on 2/21/2017.
 */
public class Palindrome {
    // Static variables can be used in ALL instances of a class
    public static String Palindromes;

    public static void main(String args[]) throws IOException {

        // Establishes a value to Palindromes
        Palindromes = new String();
        int i=0;
        // calls the readFile method to read the file
        readFile("palindrometest");
        palindrome(Palindromes);

    }


    public static void readFile(String fileName)
    {
        // sets the int variable to zero
        int i = 0;

        // establishes the java input for reading the file
        java.io.File inputFile = new java.io.File(fileName);

        // being try  catch block
        try{

            // establishes instance of the scanner to read the file
            Scanner fileReader = new Scanner(inputFile);


            while(fileReader.hasNextLine())
            {
                Palindromes = fileReader.nextLine();
                i++;

            }

            // closes the file reader
            fileReader.close();

            // print the index to see if it was read


        }catch (FileNotFoundException e){
            System.out.println("Sorry, cannot find the file");
            System.exit(0);
        }

    }

    private static boolean palindrome(String palindrome){
        if (palindromeIterative(palindrome)){
            return true;
        } else {
            return false;
        }
    }

    private static boolean palindromeIterative(String palindrome) {
        int i = 0;
        boolean isPalindrome = false;
        {
            if (Palindromes.length() == 0 || Palindromes.length() == 1) {
                isPalindrome = true;;
            }
            if (Palindromes.charAt(0) == Palindromes.charAt(Palindromes.length() - 1)) {

                palindrome(Palindromes.substring(1, Palindromes.length() - 1));

            } else {
                isPalindrome = false;
            }

        } return isPalindrome;
    }
}
