import java.util.*;
public class Day1Question1
{
    public static void main(String[] args)
{
    System.out.println("Enter the no. of elements in the aaray:");
    Scanner scr=new Scanner(System.in);
    int n=scr.nextInt();
    int [] arr=new int[n];
    int i;
    System.out.println("Enter the elements into the array:");
    for(i=0;i<n;i++)
    {
        arr[i]=scr.nextInt();
    }
	for(i=0;i<n;i++)
    {
        if(arr[i]<0)
		arr[i]=0;
    }
    System.out.println("The new array is ");
	 for(i=0;i<n;i++)
    {
        System.out.print(arr[i] + ",");
    }
}
}
}
