import java.io.*;
public class Array29 {
    public static void main(String[] args) {

        try {
             DataInputStream t = new DataInputStream(System.in);
             int i, n,j=0;
             System.out.println("Enter the number of elements in the arrays:");
             n = Integer.parseInt(t.readLine());
             
             int[] a = new int[n];
         
             System.out.println("Enter the elements of the array:");
             for (i = 0; i < n; i++) {
                 a[i] = Integer.parseInt(t.readLine());
             }
             for (i = 0; i < n-1; i++) {
              
                if(a[i]>=a[i+1])
                {
                    System.out.println(a[i] +" Is the leader of  "+ a[i+1]);
                }
                else{
                    System.out.println(a[i]+"Is not the leader of "+a[i+1]);
                }
               }
            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        }
        }
             

