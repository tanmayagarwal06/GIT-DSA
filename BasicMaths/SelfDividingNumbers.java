package BasicMaths;

import java.util.ArrayList;
import java.util.List;



public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> ans = new ArrayList<>();

        for(int i = left;i <= right;i++){
            if (isDividing(i)) {
                ans.add(i);
            }
        }
        return ans;

    }

    private boolean isDividing(int num) {
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0 || digit % num != 0) {
                return false;
            }

            temp = temp / 10;
        }
        return true;
            
    }
}


