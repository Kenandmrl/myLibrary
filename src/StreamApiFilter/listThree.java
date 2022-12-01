package StreamApiFilter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class listThree {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 9, 12);

        /**
         List<Integer> ExpNumbers=new ArrayList<>();
         numbers.forEach(x->ExpNumbers.add((int) Math.pow(x,4)));//her sayının 4.ncü kuvvetini aldım
         System.out.println(ExpNumbers);

         //map nedir: listenin tüm elemanlarıyla herhangi bir işlem yapılaxcaksa kullanabiliriz
         List<Integer> ExpNumbers1=numbers.stream()
         .map(x->x*5) //birden fazla işlem yaptırabilirim
         .map(x->x+10)
         .collect(Collectors.toList());
         System.out.println(ExpNumbers);  */

        //Reduce
        Optional<Integer> sum=numbers.stream().reduce((a, b)->a+b);//kendi aralarında çarpıyor veya toplamada verebilirim
        System.err.println(sum);

    }
}
