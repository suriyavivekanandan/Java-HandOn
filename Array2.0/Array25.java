import java.io.DataInputStream;

public class Array25 {
    public static void main(String[] args) {
        try {
            DataInputStream t = new DataInputStream(System.in);
            int i, n, j, f = 0;

            System.out.println("Enter the number of elements in the array:");
            n = Integer.parseInt(t.readLine());
            int[] a = new int[n];
            int[] b = new int[n];

            System.out.println("Enter the array elements:");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.readLine());
            }

            j = 0;
            f = 0;
            for (i = 0; i < n; i++) {
                if (a[i] != 0) {
                    b[j] = a[i];
                    j++;
                } else {
                    f++;
                }
            }

           
            while (f > 0) {
                b[j] = 0;
                f--;
                j++;
            }

            
            System.out.println("Modified array:");
            for (i = 0; i < n; i++) {
                System.out.print(b[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
