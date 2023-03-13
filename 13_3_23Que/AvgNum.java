//Write a java programe to calculate average of number taken from user.

import java.util.*;

class AvgNum{

public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
int sum=0,avg=0;
for(int i=0;i<=num;i++){
	sum=sum+i;
	avg=sum/num;
	}
System.out.println(avg);
}
}