import java.io.DataInputStream;

public class Array2 {
     public static void main(String[] args) {
        try
        {
        DataInputStream t=new DataInputStream(System.in);
        int n=0;
        System.out.println("enter the value of index");
        n=Integer.parseInt(t.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(t.readLine());

        }
    
                    System.out.println("The 1 st value of Index"+a[0]);
                    System.out.println("Thw last value of index"+a[n-1]);
                
          }
          catch(Exception e)
				{
					System.out.println(e);
				}

    }
}

