package Length_Of_Last_Word;

import java.util.Scanner;

public class Solution {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String mySentence = scanner.nextLine();
        System.out.println("The last word has "+ lengthOfLastWord(mySentence) );
    }
    public static int lengthOfLastWord(String s) {
        String[] inputAsArray = s.split(" ");
        return  inputAsArray[ inputAsArray.length -1].length();
    }
}
