package LambdaExpression;

public class expression {
    interface lambda{
        int fonksiyon(int x,int y);
    }

    public static void main(String[] args) {

        lambda lambda=(x,y)->x*x+2*y;//lambda komutu
        System.out.println(lambda.fonksiyon(5,7));  //result :39
    }
}
