import java .io.*;
class Theduplicateelement
{
    public static void main(String arg[])
    {
        try
        {
            DataInputStream t=new DataInputStream(System.in);
            int n,i=0,j=0,c=0;
            System.out.println("Enter the index value");
            n=Integer.parseInt(t.readLine());
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(t.readLine());
            }
            for(i=0;i<n;i++)
            {
                for(j=i;j<n;j++)
                {
                    if(a[i]==a[j])
                    {
                        System.out.println("The duplicate element in the array is"+"  "+a[i]);

                    }
                }
            }
                    
                }
                catch (Exception e)
                {
                    System.out.println(e);

                }


                    }
                }
            

            

        