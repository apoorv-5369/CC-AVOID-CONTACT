import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while(t-->0){
		    int n =  sc.nextInt();
		    int y = sc.nextInt();
		    int er=0;
		    if(y==n){
		     er=y-1;   
		    }else if(y==0){
		       er=0; 
		    }else{
		        er=y;
		    }
		   System.out.println(n+er);
		}
	}
}
