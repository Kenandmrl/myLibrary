package StreamApiFilter;

import java.util.Arrays;
import java.util.List;

public class listFour {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(2,3,1,4);

        int sum=intList.stream().map(x->x*x)
                     .reduce((x,y)->x+y).get();
                            //Integer::sum
        System.out.println("toplam :"+sum);
    }
}
