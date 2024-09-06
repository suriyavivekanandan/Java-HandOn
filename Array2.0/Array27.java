import java.io.DataInputStream;
import java.util.Scanner;

public class Array27 {
public static void main(String[] args) {
    

       try {
            DataInputStream t = new DataInputStream(System.in);
            int i, n;
            
            System.out.println("Enter the number of elements in the arrays:");
            n = Integer.parseInt(t.readLine());
            
            int[] a = new int[n];
        
            System.out.println("Enter the elements of the array:");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.readLine());
            }
            int smallest=Integer.MAX_VALUE;
            int largest=Integer.MIN_VALUE;
          int  sum=0;
            for(i=0;i<n;i++)
            {
                if(a[i]<smallest){
                    smallest=a[i];
                }
                if(a[i]>largest)
                {
                    largest=a[i];
                }
                sum=sum+a[i];
            }
            sum=sum-largest;
            sum=sum-smallest;
            int count=n-2;
            double average=(double)sum/count;
            System.out.println("Average "+ average);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
        

                  