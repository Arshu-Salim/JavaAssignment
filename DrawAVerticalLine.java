import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DrawAVerticalLine {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
            System.out.println("*");
    }
}
