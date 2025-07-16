

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
		//int arr[]=new int[t];
		
		for(int i=0;i<t;i++){
		    int av=0; 
		    //arr[i]=sc.nextInt();
		    boolean f=true;
		    int s=sc.nextInt();
		    for(int j=0;j<s;j++){
		        int x=sc.nextInt();
		        av=av+x;
		        if((av/(j+1))<40){
		            f=false;
		        }
		    }
		    if(f){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
		

	}
}
