import java.io.*;
import java.lang.String;
class COST
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a,Price,au,m;
        System.out.println("Enter the Material Standard '1' for Standard '2' for Above Standard '3' for High Standard");
        m=Double.parseDouble(br.readLine());
        System.out.println("Enter the house area");
        a=Double.parseDouble(br.readLine());
        System.out.println("Press '1' for fully automated house and '2' for not");
        au=Double.parseDouble(br.readLine());
        
        if(au==1)
        {
           Price=a*2500;
        }
           else
           {
               if(m==1)
               Price=a*1200;
               else if(m==2)
               Price=a*1500;
               else
               Price=a*1800;
            }
        System.out.println("The price is "+Price);
    }
}