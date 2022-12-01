package StreamApiFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class listtwo {
    public static void main(String[] args) {

        //Predicate kullanımı
        Predicate<Integer> verilenAralik = x -> x > 3 && x < 20;


        List<Integer> numbers = Arrays.asList(4, 8, 5, 11, 23, 45, 21, 2, 7, 6, -1);

        //belli aralıkta sayıları alma
        List<Integer> expNum = numbers.stream()
                //burdaki x listemizdeki herbir eleman
                .filter(x -> x > 3 && x < 20) //paranteze artık verilenAralik predicate'yi yollayabilirm
                //.filter(verilenAralik)
                .collect(Collectors.toList()); //listeye çevrildi
        System.out.println(expNum);

        List<String> mathSubjects = Arrays.asList("limit", "Türev", "Integral", "Trigonometri", "Kümeler",
                   "Fonksiyonlar", "Permütasyon", "Olasılık", "Kombinasyon", "Sayilar", "Cebir", "Cebir");

        List<String> filterSubjects = mathSubjects.stream()
                .filter(Str -> Str.length() > 5)
                .filter(Str -> Str.contains("i"))
                .filter(Str -> Str.endsWith("r")).toList();//or .collect(Collectors.toList()); diyebilirim
        System.out.println(filterSubjects);//that's right


    }
}
