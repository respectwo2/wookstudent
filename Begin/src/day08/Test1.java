package day08;

class Test1 {
	public int getNumber(int a) {
		return a+1;
		
	}
}

class Test2 extends Test1 {
	public int getNumber(int a) {
		return a+2;
	}


		public static void main(String args[]) {
		 Test1 a = new Test2();
			System.out.println(a.getNumber(0));
}

}