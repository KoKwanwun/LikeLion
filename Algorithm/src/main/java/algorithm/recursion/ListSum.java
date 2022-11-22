package algorithm.recursion;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static void listSum(List<Integer> nums, int sum) {
        if(nums.isEmpty()){
            System.out.println(sum);
            return;
        }
        sum += nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        listSum(nums, sum);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        listSum(nums, 0);
    }
}
