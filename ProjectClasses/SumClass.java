package JavaProjects.ProjectClasses;

public class SumClass {
//    Given an array of integers nums and an integer target,
//    return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution,
//    and you may not use the same element twice.
//    You can return the answer in any order.
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int i =0;i< nums.length;i++){
            for(int j= 0;j< nums.length;j++){
                if(target == nums[i]+nums[j] && i != j){//set input[3,3], 6 for that reason i != j condition added
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }
        return indices;
    }
}
