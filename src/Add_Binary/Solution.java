package Add_Binary;

public class Solution {
    public static void main(String[] args) {

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
