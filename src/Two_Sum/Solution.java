package Two_Sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main( String[] args) {
        int[] numbers = new int[]{1,3,4,8,9,5};
        System.out.println(Arrays.toString(numbers));
        System.out.print("Enter your target number : ");
        Scanner scanner = new Scanner(System.in);
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
