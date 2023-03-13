//Write a java programme to check perfect number or not.

import java.util.*;
class perfectNumQue{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
int sum=0;
for(int i=1;i<=num/2;i++){
	if(num%i==0){
		sum=sum+i;
		}
	}
	if(sum==num){
		System.out.println("Perfect number");
		}
		else{
			System.out.println("Not perfect number");

			}
}
}