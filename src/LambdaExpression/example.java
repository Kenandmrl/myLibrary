package LambdaExpression;

import java.util.List;

public class example {
    //int k=20;
    public static void main(String[] args) {
        List<Integer> myList=List.of(1,3,5,7,9);
        //map'i kullanabiliyorum çünkü listenin elemanları içerisindeyim
        myList.stream().map(x->x+3).forEach(System.out::println); //or (x->System.out.println(x));

        //global variable olabilmesi için ya static olması lazım ya da bulunduğu clsstamn obje newlemem lazım
        int m=4;
        //başka bir kullanım
        myList.forEach(x-> { //dışardan veri alabilir örnek 'm'
        x+=2+m;
        int y=x+2;
           System.err.println(y);
        }
       );

    }
}
