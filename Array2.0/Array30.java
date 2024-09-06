import java.io.*;

public class Array30 {
    public static void main(String[] args) {
        try {
            DataInputStream t = new DataInputStream(System.in);
            int n = 0;
            System.out.println("Enter the size of the array: ");
            n = Integer.parseInt(t.readLine());
            int[] a = new int[n];

        
            for (int i = 0; i < n; ++i) {
                System.out.print("Enter element at index " + i + ": ");
                a[i] = Integer.parseInt(t.readLine());
            }

            
            int left = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    int temp = a[left];
                    a[left] = a[i];
                    a[i] = temp;
                    left++;
                }
            }

            
            int right = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] == 1) {
                    int temp = a[right];
                    a[right] = a[i];
                    a[i] = temp;
                    right--;
                }
            }

    
            System.out.print("Modified array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
