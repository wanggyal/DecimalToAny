import java.util.Scanner;
public class NumberConverter {
private int decimal_num;
private int radix;
private int count=0;
private int remender;
private String[] answer=new String[100];

public NumberConverter(){
	decimal_num=0;
	radix=0;
}
public void setValues(int a,int b){
	decimal_num=a;
	radix=b;
}
public void inputValues(){
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter a decimal number to Convert: ");
	decimal_num=input.nextInt();
	
	
	System.out.println("Enter radix(e.g. for binary 2,for hexadecimal 16 and so on): ");
	int y=input.nextInt();
	while(y>16||y<2){
		System.out.println("Enter radix from 2 to 16 only: ");
		y=input.nextInt();
	}
	radix=y;
}

public void convert_number(){
	int i=0;
	int temp=decimal_num;
	while(temp/radix>0){
		count++;
		remender=temp%radix;
		temp=temp/radix;
		if(remender==10){
			answer[i]="A";
		}
		else if(remender==11){
			answer[i]="B";
		}
		else if(remender==12){
			answer[i]="C";
		}
		else if(remender==13){
			answer[i]="D";
		}
		else if(remender==14){
			answer[i]="E";
		}
		else if(remender==15){
			answer[i]="F";
		}
		else{
		answer[i]=remender+"";
		}
		i++;
	}
	if(temp%radix==10){
		answer[i]="A";
	}
	else if(temp%radix==11){
		answer[i]="B";
	}
	else if(temp%radix==12){
		answer[i]="C";
	}
	else if(temp%radix==13){
		answer[i]="D";
	}
	else if(temp%radix==14){
		answer[i]="E";
	}
	else if(temp%radix==15){
		answer[i]="F";
	}
	else{
	answer[i]=temp%radix+"";
	}
}


public int getDecimal(){
	return decimal_num;
}
public int getradix(){
	return radix;
}
public String printAnswer(){
	System.out.print("decimal number "+decimal_num+" to base "+radix+" is: ");
	String ans="";
	for(int i=count;i>=0;i--){
		System.out.print(answer[i]);
		ans=ans+answer[i];
	}
	return ans;
}

//public static void main(String[] args){
//	
//	int temp;
//	do{
//		NumberConverter nc=new NumberConverter();
//		nc.inputValues();
//		nc.convert_number();
//		nc.printAnswer();
//		System.out.println("\n\nEnter '1' to convert again and '0' to exit.");
//		Scanner input=new Scanner(System.in);
//		temp=input.nextInt();
//	}while(temp!=0);
//	
//}
}
