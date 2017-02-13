import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsoscelesTriangle {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(obj.readLine());
        for(int i=1;i<=n;i++) {
            for (int j = i; j < n ; j++)
                System.out.print(" ");
            for (int k=1; k<=(2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
