import java.util.*;
public class BinarySearch
{
    public static int binarySearch(int a[],int key)
    {
       int start=0;
       int end=a.length-1;
        
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==key)
            {
                return mid;
            }
            if(a[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return -1;

    }
    public static void main(String args[])
    {
        int a[]={2,3,4,5,6,7,8,9};
        int key=6;
        System.out.println("Index for key is: "+binarySearch(a,key));
    }
}