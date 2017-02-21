import java.io.FileNotFoundException;
import java.util.Scanner;
public class PalindromeNew {


    public static void main(String[] args) {

        String Palindromes = "";
        readFile("palindrometest");
        System.out.println(isPal(Palindromes));


    }

    public static void readFile(String fileName) {
        // sets the int variable to zero
        int i = 0;

        // establishes the java input for reading the file
        java.io.File inputFile = new java.io.File(fileName);

        // being try  catch block
        try {

            // establishes instance of the scanner to read the file
            Scanner fileReader = new Scanner(inputFile);


            while (fileReader.hasNextLine()) {
                String Palindromes = fileReader.nextLine();
                i++;

            }

            // closes the file reader
            fileReader.close();

            // print the index to see if it was read


        } catch (FileNotFoundException e) {
            System.out.println("Sorry, cannot find the file");
            System.exit(0);
        }

    }
    public static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPal(s.substring(1, s.length() - 1));

        // if its not the case than string is not.
        return false;
    }
}