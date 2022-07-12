package day05;

public class Myoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("b[0]="+b[0]);
		System.out.println("a[0]="+a[0]);
		
		System.out.println("2.------------");
		int []x= {1,2,3,4,};
		int y[]= {10,20};
		
		tmp = x;
		x = y;
		y = tmp;
		
		for(int i=0;i<x.length;i++) {
			System.out.println("x["+i+"]="+x[i]);
		
	
		}
		{
		System.out.println("3.-----------------");
		//참조형의 배얼 - string, date, scanner, object...
		String[] arr=null;//[1] 선언
		System.out.println(arr);
		
		arr=new String[4];
		System.out.println('arr[0]='+arr[0]);
		
		arr[0]="Hello";
		arr[1]=new String("Hi");
		arr[2]=3+"5";//35
		arr[3]="";
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	

}
