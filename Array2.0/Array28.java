import java.io.DataInputStream;
import java.util.Scanner;

public class Array28 {
public static void main(String[] args) {

       try {
            DataInputStream t = new DataInputStream(System.in);
            int i, n;
            int []b=new int[0];
            int []c=new int[0];
            System.out.println("Enter the number of elements in the arrays:");
            n = Integer.parseInt(t.readLine());
            
            int[] a = new int[n];
        
            System.out.println("Enter the elements of the array:");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.readLine());
            }
            int j=0;
            for(i=0;i<n;i++)
            {
                if(a[i]==0)
                {
                   j++;
                }
                if(a[i]==-1)
                {
                    j++;
                }
            }
           if(j>=1){
            System.out.print("it consits of 0 and -1");
           }
           else{
            System.out.print("it  not consits of 0 and -1");
           }
}
catch (Exception e) {
    System.out.println(e);
}
}
}
