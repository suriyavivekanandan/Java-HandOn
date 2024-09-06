import java.io.DataInputStream;

public class Array26 {
    public static void main(String[] args) {
        try {
            DataInputStream t = new DataInputStream(System.in);
            int i, n;
            
            System.out.println("Enter the number of elements in the arrays:");
            n = Integer.parseInt(t.readLine());
            
            int[] a = new int[n];
            
            
            System.out.println("Enter the elements of the 1st array:");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.readLine());
            }
            
            
            int e= 0;
            int o=0;
            for (i = 0; i < n; i++) {
                if (a[i] %2==0) {
                    e++;
                }
            
            else{
                o++;
            }
        }
            
            System.out.println("The number of odd elements is:  =" + e);
            System.out.println("The number of even elements is:  =" + o);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
