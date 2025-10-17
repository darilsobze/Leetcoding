package Add_Binary;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first Binary Number: ");
        String num1= scanner.nextLine();
        System.out.print("Enter your second Binary Number: ");
        String num2= scanner.nextLine();
        System.out.println(num1 +" + " + num2 + " = " + addBinary(num1,num2));

    }

    public static String addBinary(String a, String b) {
        int sumPerIndex = 0;
        int carry = 0;
        String sumInString = "";
        // make the same length to the both String
        while (a.length() != b.length()) {
            if (a.length() < b.length()) {
                a = "0" + a;
            }
            if (b.length() < a.length()) {
                b = "0" + b;
            }
        }
        for (int i = 0; i < a.length(); i++) {
            /*
            Full Adder
            It adds three 1-bit inputs (bitA, bitB and Carry)
            Sum = bitA xor bitB xor Carry
            New Carry = (bitA and bitB) + (last_Carry and ( bitA xor bitB))
            */
            sumPerIndex = carry ^ ((Character.getNumericValue(a.charAt(a.length() - 1 - i))) ^ (Character.getNumericValue(b.charAt(b.length() - 1 - i))));
            carry = ((Character.getNumericValue(a.charAt(a.length() - 1 - i))) & (Character.getNumericValue(b.charAt(b.length() - 1 - i)))) |
                    (
                            ((Character.getNumericValue(a.charAt(a.length() - 1 - i))) ^ (Character.getNumericValue(b.charAt(b.length() - 1 - i)))) &
                                    carry)
            ;
            String indexInString = String.valueOf(sumPerIndex);
            sumInString = indexInString + sumInString;
        }
        if (carry == 1)
            return "1" + sumInString;
        return sumInString;
    }
}
