package interviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Interviews1 {
    public static void main(String[] args) {
        int[] sums = {1,2,3,4,5,6,7,8,9};
        int target = 10;
//        System.out.println(Arrays.toString(twoSums(sums, target)));
        //pallindrom
        String palindrom = "MALtYALAM";
        boolean op = getpallindrome(palindrom,0,palindrom.length() -1);
        System.out.println(op);
    }

    public static int[] twoSums(int[] sums , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < sums.length; i++){
            int complement = target - sums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(sums[i],i);
        }
        return new int[] {};
    }
    //pallindrome using recursion
    public static boolean getpallindrome(String pallindrome,int i,int j){
        if(i >= j){
            return true;
        }
        if (pallindrome.charAt(i) != pallindrome.charAt(j)){
            return false;
        }
        i=i+1;
        j=j-1;
        return getpallindrome(pallindrome, i, j);

    }
}
