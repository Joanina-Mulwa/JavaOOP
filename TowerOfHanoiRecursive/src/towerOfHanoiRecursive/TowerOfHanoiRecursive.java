package towerOfHanoiRecursive;
import java.util.Scanner;
public class TowerOfHanoiRecursive {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int rings = sc.nextInt();
solve(rings, "A", "B", "C");
}

static void solve(int rings, String source, String target, String helper){
if(rings>0){
//Move n-1 top rings to helper peg
solve(rings-1, source, helper, target);
//Move nth ring to target peg
System.out.println("Moving ring "+rings+" from "+source+" to "+target);
//Move n-1 top rings from helper to target;
solve(rings-1, helper, target, source);
}
}
}