/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/




import java.util.*;
class j1 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter value of a:");
int a = sc.nextInt();  //taking input from user
System.out.println("enter value of b:");
int b = sc.nextInt();


int sum = a+b;
System.out.println("sum of a and b is:" + sum);

if(b!=0){
int div = a/b;
System.out.println("Division of a and b is:" +div);
}
int mult = a*b;
System.out.println("multiplication of a and b is:" + mult);

int sub = a-b;
System.out.println("subtraction of a and b is:" +sub);

int mod = a%b;
System.out.println("modulus of a and b:" + mod);

}
}

