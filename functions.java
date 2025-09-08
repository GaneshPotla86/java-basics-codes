// This code is for syntax of function creation


import java.util.*;
class Main {
    public static void printMyName(String name){  //function declared
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name); //function call to print
    }
}


//OUTPUT:
  GANESH
  GANESH