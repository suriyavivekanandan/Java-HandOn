import java.io.*;

class RemoveElementFromArray {
    public static void main(String[] args) {
        try {
            DataInputStream t = new DataInputStream(System.in);
            int i = 0, n = 0, b = 0;
            System.out.println("Enter the size of the array:");
            n = Integer.parseInt(t.readLine());
            int a[] = new int[n];
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(t.readLine());
            }
            System.out.println("Enter the element to remove:");
            b = Integer.parseInt(t.readLine());
            int c = -1;
            for (i = 0; i < n; i++) {
                if (a[i] == b) {
                    c = i;
                    break;
                }
            }
            if (c != -1) {
                a[c] = a[n - 1];
                n--;
            } else {
                System.out.println("Element not found.");
            }
            System.out.println("Updated array:");
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
