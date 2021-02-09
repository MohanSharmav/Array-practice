import java.io.*;
import java.util.*;
class Buffery
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("enter name ");
        // String x=br.readLine();
         String name=br.readLine();
        System.out.println(" raj "+name);
    }
}