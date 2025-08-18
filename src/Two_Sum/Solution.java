package Two_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Array's numbers separated by space: ");
        String line = scanner.nextLine();
        //split the line into parts
        String[] parts = line.split(" ");
        int[] numbers = new int[parts.length];
        for(int i=0; i<parts.length; i++){
            numbers[i]= Integer.parseInt(parts[i]);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.print("Enter your target number : ");

        int target = scanner.nextInt();
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for(int i=0; i<nums.length-1 ; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j] == target){
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
            return result;
        }

}
