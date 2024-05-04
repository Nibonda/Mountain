package assignment;

public class ternaryoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=50,b=20,result;
	result =a>b ? a:b;
	System.out.println(result);
    int n1=5,n2=10,max;
    max= n1<n2 ? n1:a;
    System.out.println("the max value:"+max);
  char ch1='A',ch2='B',king1;
  int ch3=ch1+ch2, king2;
  king1=ch2>ch1 ?ch1:ch2;
  king2=ch1<ch3 ?ch1:ch2;
  System.out.println("The value of king : "+ king1);
  System.out.println("The Value of king1 :"+king2);
	} 
}
