import java.util.Scanner;
class PalindromeNo{
    public static void main(String args[]){
        System.out.println("Enter no. ");
        Scanner s=new Scanner(System.in);
        int no;
        no=s.nextInt();
        int temp=no;
        int rev=0,rem;
       
        while(temp !=0)
        {
             rem=temp%10;
             rev=rev*10+rem;
             temp=temp/10;
        }
        if(no==rev){
            System.out.println(no + " is palindrome");
        }
        else{
            System.out.println(no + " is not palindrome");
        }
    }
}