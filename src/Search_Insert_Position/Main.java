package Search_Insert_Position;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static  void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Array's numbers (separated with a comma): ");
        String inputNumbersInString = scanner.nextLine();
        String[] stringsNumbers = inputNumbersInString.split(",");
        int[] numbers = new int[stringsNumbers.length];
        for (int i=0; i< stringsNumbers.length; i++){
            numbers[i]= Integer.parseInt(stringsNumbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.print("Enter your target: ");
        int target = scanner.nextInt();
        System.out.println("His Index is : " + searchInsert(numbers,target) );
    }
    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for(int i = 0; i< nums.length ;i++){
            if(nums[i] == target){
                result = i;
            }
            else if(nums[i]< nums[nums.length-1] && nums[i]< target && nums[i+1] > target){
                result = i+1;
            }
            else if(target > nums[nums.length -1]){
                result = nums.length;
            }
            else if(target < nums[0]) {
                result =0;
            }
        }
        return result;
    }
}
