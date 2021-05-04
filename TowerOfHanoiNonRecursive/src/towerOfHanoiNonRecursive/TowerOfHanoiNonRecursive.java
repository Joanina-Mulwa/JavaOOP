package towerOfHanoiNonRecursive;
import java.io.*;
import java.util.Stack;
import java.util.EmptyStackException;
public class TowerOfHanoiNonRecursive {
public static int legalMove(Stack A, Stack B)
{
int a,b;
try {
a = Integer.parseInt(A.peek().toString());
}
catch(EmptyStackException e){
a = 0;
}
try {
b = Integer.parseInt(B.peek().toString());
}
catch(EmptyStackException e){
b = 0;
}
if(a==b) return 0;
if(a == 0)
{
A.push(B.pop());
return 2;
}
else if(b == 0)
{
B.push(A.pop());
return 1;
}
if(a == b)
{
A.push(B.pop());
return 2;
}
return -1;
}
public static void main(String[] args) {
int stepNumber = 0;
int status = 0;
try {
Stack A = new Stack();
Stack B = new Stack();
Stack C = new Stack();
System.out.println("Enter the number of disks : ");
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(input.readLine());
if(n == 1)
A.push(1);
int m = n%2;
do {
if(m==1)
{
if((status = legalMove(A,C)) == 1)
System.out.println((++stepNumber) + ". A –> C");
else if (status == 2)
System.out.println((++stepNumber) + ". C –> A");
if((status = legalMove(A,B)) == 1)
System.out.println((++stepNumber) + ". A –> B");
else if(status == 2)
System.out.println((++stepNumber) + ". B –> A");
else
break;
}
else
{
if((status = legalMove(A,B)) == 1)
System.out.println((++stepNumber) + ". A –> B");
else if (status == 2)
System.out.println((++stepNumber) + ". B –> A");
if((status = legalMove(A,C)) == 1)
System.out.println((++stepNumber) + ". A –> C");
else if(status == 2)
System.out.println((++stepNumber) + ". C –> A");
}
if((status = legalMove(B,C)) == 1)
System.out.println((++stepNumber) + ". B –> C");
else if(status == 2)
System.out.println((++stepNumber) + ". C –> B");
}while(C.size()!=n);
System.out.println("X———————–X");
}
catch (Exception e){
}
}
}
