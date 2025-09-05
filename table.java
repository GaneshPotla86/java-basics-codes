// This code is used for printing a table by user input value

import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=1;i < 11;i++){
            int m= a*i;
            System.out.println(a+"X"+i+'='+m);
        }
    }
}

//INPUT:3
//OUTPUT:3X1=3
//3X2=6
//3X3=9
//3X4=12
//3X5=15
//3X6=18
//3X7=21
//3X8=24
//3X9=27
//3X10=30