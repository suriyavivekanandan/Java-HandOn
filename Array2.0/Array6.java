import java.io.DataInputStream;

public class Array6 {
    
      public static void main(String[] args) {
        try
        {
        DataInputStream t=new DataInputStream(System.in);
        int n=0 ,c=-1;
        System.out.println("enter the value of index");
        n=Integer.parseInt(t.readLine());
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(t.readLine());

        }
            System.out.println("enter Element to find  check");
            int b=Integer.parseInt(t.readLine());
            for(int i=0;i<n;i++)
            if(a[i]==b)
            {
                c=i;
                break;
            }
           if(c!=-1)
            {
                System.out.println("eLEMENT FOUND  at the Index of "+c);
            }
            
            else
            {
                System.out.println("eLEMENT not FOUND ");
            }

               
                
          }
          catch(Exception e)
				{
					System.out.println(e);
				}

    }
}


