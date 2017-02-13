import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FizzBuzz {
    static void FizzBuzz(int i){
        if(i%3 == 0 && i%5 == 0){
            System.out.println("FIZZBUZZ");
        }
        else if(i%5 == 0){
            System.out.println("BUZZ");
        }
        else if(i%3 == 0){
            System.out.println("FIZZ");
        }
        else
            System.out.println(i);

    }
    public static void main(String args[]) throws IOException {
        for(int i=1;i<=100;i++) {
            FizzBuzz(i);
        }
    }
}
