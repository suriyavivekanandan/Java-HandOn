import java.io.DataInput;
import java.io.DataInputStream;

public class Duplicatestring {
    public static void main(String[] args) {
        try{
            DataInputStream t=new DataInputStream(System.in);
            int n=0,i=0,j=i;
            System.out.println("enter the value of n");
            n=Integer.parseInt(t.readLine());
            String a []=new String[n];
            for(i=0;i<n;i++)
            {
                a[i]=(t.readLine());
            }
            int c=-1;
            for(i=0;i<n;i++)
            {
                for(j=i;j<n;j++)
                {
                    if(a[i].equals(a[j]));
                    c=i;
                    break;
                }
            }
                if(c!=-1)
                {
                    System.out.println(" The duplicate string element is "+a[c]);
                }
                else{
                    System.out.println(" The no duplicate string element is "+c);
                }
        }
        catch (Exception e)
                {
                    System.out.println(e);

                }


                    }
                }
            

