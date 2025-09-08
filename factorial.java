//This code is ofr finding factorial of a number

import java.util.*;
class Main {
    public static void calculateProduct(int a){  //function declared
        int fact=1;
        if(a<0){
            System.out.println("INvalid input");
            return;
        }
        for (int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        calculateProduct(a);
        //function call to print
    }
}

//OUTPUT:

5
120