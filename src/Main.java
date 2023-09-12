import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
 int [] arr = new int[20];
 int n =20;
 Random rand = new Random(0);
 for ( int i = 0; i < n; i++){
     arr[i] = rand.nextInt(n/2);
 }
        System.out.println(Arrays.toString(arr));

 for (int i = 0; i < n; i++){
     int count = 0;
     for (int j = i+1; j < n; j++){

         if (arr[i] == arr[j]) count++;
     }
     if (count > 0) System.out.println("Значение %d повторяется %d раз ". formatted(arr[i], count));
 }


    }
}
 /*System.out.println("Ввелите десятичное число: ");
         int decimal = kb.nextInt();
         int [] bin = new int [32];
         int i = 0;
         while (decimal > 0){
         bin[i] = decimal % 2;
         decimal /= 2;
         i++;
         }
         //System.out.println(Arrays.toString(bin));
         for(--i; i >= 0; i--){
         System.out.print(bin[i]);
         /////////////////////////////////////
         char[ ]hex = new char [8];
         System.out.println("Введите десятичное число");
         decimal = kb.nextInt();
         i = 0;
         for (; decimal > 0; decimal /= 16, i++)
         hex [i] = (char)(decimal % 16);
         if (hex[i] < 10) hex [i] += 48;
        else hex[i] += 55;
        i++;
        for (--i; i>=0; i--)
        System.out.println(hex[i]);
        }*/