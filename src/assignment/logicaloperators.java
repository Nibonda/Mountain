package assignment;

public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=10,b=20;
 boolean c=a==b;
 System.out.println("the value of not"  +! c);
 System.out.println(c !=a<b);
 System.out.println("the value of 2nd not "+!c);
 System.out.println("confusion :"+!true);
 System.out.println("confusion 1:"+!false);
 System.out.println(!true==false);
 System.out.println(!true);
 System.out.println("---------------------");
 System.out.println("-----andlogical-------");
 System.out.println(c&&a<b);
 char x='@',y='_';
 System.out.println(x>y&&x<=y);
 System.out.println(x<y&&x==64);
 System.out.println("---------or logical--------");
 int var1=100,var2=200;
 boolean var3=var1==var2;
 System.out.println(var3||var1==var2);
 System.out.println(c||a<b);
 char x1='A',y1='B';
 System.out.println(x1>y1);
 System.out.println(x<y&&x==64);
 
	}

}
