//This code is to find the index of an element in an array
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();//Taking input from the user
        int[] numbers =new int[size];//Declaration of array in java
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("X found at index : "+ i);
                return;
            }
        }
    }
}