import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                s.add(x);
            }
            int sz=s.size();
            System.out.println(m-sz);
        }
	}
}
