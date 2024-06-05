import java.util.*;
class LinearSearch{
    public static int linearsearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key)
            return i;
        }
        return -1;
    }
    public static void main(String args[]){
      int number[]={1,2,3,4,5,6,7,8};
       int  key=5;
       int index=linearsearch(number,key);

       if(index==-1){
        System.out.println("not found");
       }
       else{
        System.out.println("key at index:"+index);
       }
      
}
}