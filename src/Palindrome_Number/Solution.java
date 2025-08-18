package Palindrome_Number;

import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(int x) {
        int sum=0;
        String numberInString= Integer.toString(x);
        for(int i=0; i<numberInString.length() ; i++){
            if(numberInString.charAt(i) == numberInString.charAt(numberInString.length()-1-i)){
                sum++;
            }
        }
        return sum == numberInString.length();
    }

    public static void main (String[] args){
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print(isPalindrome(input));

    }
}
