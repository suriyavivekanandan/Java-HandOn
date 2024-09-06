import java.io.DataInput;
import java.io.DataInputStream;

public class Array22 {
    public static void main(String[] args) {
        try{
            DataInputStream t=new DataInputStream(System.in);
            int n=0,i=0,j=i;
            System.out.println("enter the value of n");
            n=Integer.parseInt(t.readLine());
            System.out.println("ENETER THE ELEMENTS OF A");
            String a []=new String[n];
            for(i=0;i<n;i++)
            {
                a[i]=(t.readLine());
            }
            System.out.println("ENETER THE ELEMENTS OF A");
            String b []=new String[n];
            for(j=0;j<n;j++)
            {
                b[j]=(t.readLine());
            }
            int c=-1;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(a[i].equals(b[j]));
                    c=j;
                    break;
                }
            }
                if(c!=-1)
                {
                    System.out.println(" The duplicate string element is "+a[c]);
                }
                else{
                    System.out.println(" The no duplicate string element is ");
                }
        }
        catch (Exception e)
                {
                    System.out.println(e);

                }


                    }
                }
            

