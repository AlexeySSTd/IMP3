import java.math.BigInteger;


public class IMP3 {
    public static void main(String[] args) {
        //variables initialization
        BigInteger factorial = BigInteger.valueOf(1);
        int suma = 0;
        // search factorial 100
         for (int i=2;i<=100;i++){
             factorial = factorial.multiply(BigInteger.valueOf(i));
         }
         // search suma digits
         for (char s : factorial.toString().toCharArray()){
             suma+= Integer.parseInt(String.valueOf(s));
         }
         System.out.println(suma);
    }
}
