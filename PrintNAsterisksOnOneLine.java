import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNAsterisksOnOneLine {

    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(obj.readLine());
        for(int i = 0;i < n;i++)
            System.out.print("*");
	 System.out.println();
	
    }
}
