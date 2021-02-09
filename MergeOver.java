import java.io.*;
import java.util.*;
class MergeOver
{
    public static void main(String args[]) throws Exception
    {
        MergeOver m=new MergeOver();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr= new int[n][2];
         System.out.println(Arrays.toString(arr));
        //m.printy(arr);
        for(int j=0;j<n;j++)
        {
            String line=br.readLine();
            arr[j][0]=Integer.parseInt(line.split(" ")[0]);
            arr[j][1]= Integer.parseInt(line.split(" ")[0]);
        }
        System.out.println(Arrays.toString(arr));
       // m.printy(arr);
       mergeOverlap(arr);
    }
public void printy(int[][] arr)
{
    for(int i=0;i<arr.length;i++)
    {
        for(int k=0;k<2;i++)
        {
        System.out.print(arr[i][k]);    
        }   
    }
}

mergeOverlap(int[][] arr )
{
Pair[] pairs = new Pair[arr.length];
for(i=0;i<arr.length;i++)
{
 pair[i]=new Pair[arr[i][0],arr[i][1]];   
}
Arrays.sort(pairs);
Stack<pair>=st=new Stack<>();
for(int i=0;i<pairs.length;i++)
{
    if(==0)
    {
        st.push(pairs[i]);
    }else{
        pair top=st.peek();
        
        if(pairs[i].st>tho.et)
        {
            st.push(pairs[i]);
        }else{
            top.et=Math.max(top.et,pair[i].et);
        }
    }
}
Stack<pair> rs=new Stack<>();
while(st.size>0)
{
    rs.push(st.pop());
}
while (rs.size()>0)
{
    Pair p=rs.pop();
    System.out.println(p.st+ " "+p.et);
}
}
//compare objects
public static class Pair implements comparable<Pair>
{
    int st;
    int et;
    
    pair(int st,int et)
    {
        this.st=st;
        this.et=et;
    }
    //this>other +ve
    //this <other -ve
    //this==other =0
 public int comapreTo(pair other)
 {
     if(this.st!==other.st)
     {
         return this.st- other.st;
     }else {
     return this.st - other.et;
         
     }
     }
 }
}
}