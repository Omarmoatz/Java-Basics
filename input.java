import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class Input {
    public static void main(String a[]){
        Scanner in = new Scanner(System.in);

        System.out.print("enter num :  ");
        int num = in.nextInt();

        Collection<Integer> nums2 = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(num);
        nums.add(num*2);
        nums.add(num/2);
        nums.add(num+25);

        System.out.println(nums.indexOf(num));
        System.out.println(nums.get(3));
        for(Object n : nums){
            int r = (int)n * 2;
            nums2.add(r);
        }
        System.out.println(nums);
        System.out.println(nums2);



    }
}
