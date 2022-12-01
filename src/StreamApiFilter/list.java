package StreamApiFilter;

import java.util.List;

public class list {
    public static void main(String[] args) {
        //i wrote random
        List<Integer> numbers=List.of(3,5,7,9,23,45,11,8,4,2,3);//listeye direkt ekledim.
    /**
        //6dan büyük olan sayıları alalım
        int toplam=0;
        for (int n:numbers){
            if (n>8){
            toplam+=n;
            }
        }
        System.out.println("foreach kullanıldı: "+toplam); */


      int sum=numbers.stream()
              .filter(a->a>6&&a<25) //binevi if koşulu gibi düşünebilirsin tek bir şart da verebilirim
              .reduce(0,Integer::sum);//Integer::sum yerine=(x+y)->x+y diyebilirim
          System.out.println("stream kullanarak if koşuluna bağlama :"+sum);

    }
}
