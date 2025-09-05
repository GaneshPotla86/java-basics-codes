// This code is for understanding for loop execution and its process

// This is the code for sum of first N natural numbers by using for loop.



import java.util.*; // This package is used for taking input from the user.
 class Main {
    public static void main(String[] args) {  //Code execution starts here
        Scanner sc=new Scanner(System.in);   //Taking input from the user
        int a=sc.nextInt();                 //Initialising the variable
        int sum=0;                          //Initialising the variable
        for (int i=0;i <= a;i++){       // Syntax of For loop 
            sum = sum +i; 
        }
        System.out.println(sum);      // printing the result sum.
    }
}

//INPUT:4       //{0+1+2+3+4=10}
//OUTPUT: 10
