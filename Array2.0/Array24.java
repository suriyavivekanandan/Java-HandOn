import java.io.DataInputStream;

public class Array24 {
    public static void main(String[] args) {
        try {
            DataInputStream t = new DataInputStream(System.in);
            int i, n;
            
            System.out.println("Enter the number of elements in the arrays:");
            n = Integer.parseInt(t.readLine());
            
            int[] a = new int[n];
            int[] b = new int[n];
            
            System.out.println("Enter the elements of the 1st array:");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.readLine());
            }
            
            System.out.println("Enter the elements of the 2nd array:");
            for (i = 0; i < n; i++) {
                b[i] = Integer.parseInt(t.readLine());
            }
            
            int equalCount = 0;
            for (i = 0; i < n; i++) {
                if (a[i] == b[i]) {
                    equalCount++;
                }
            }
            
            System.out.println("The number of equal elements is: " + equalCount);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
