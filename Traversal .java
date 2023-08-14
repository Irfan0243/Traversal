import java.util.Scanner;

//Array Traversal
public class Traversal{
  
    
    public static void main(String[] args){
        int i=0,size;
        Scanner t=new Scanner(System.in);
        System.out.print(" Enter the array size :");
        size=t.nextInt();
    int arr[]=new int[size+1];
      
      System.out.print("Enter your array element:"); 
      for( i=0;i<size;i++){
        arr[i]=t.nextInt();
      }
      
     // System.out.format( " the element of"+i+" index is :");
      for(i=0;i<size;i++){
        System.out.format( " the element of "+i+" index is :"+arr[i]+" \n");
      }
        
    }
  }



    
