// This is the code for inverted pyramid with numbers

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =4;
        for(int i=1 ; i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


/// OUTPUT:
//  1 2 3 4
//  1 2 3
//  1 2 
//  1 