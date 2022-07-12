package day07;

	public class Teacher {
		private int no;
		private String name;
		private String subject;
		
		public void setNo(int no) {
				this.no=no;
		}
		public void setName(String name) {
				this.name=name;
		}
		public void setSubject(String subject) {
				this.subject=subject;
		}
		
		public int getNo() {
			return no;
		}
		public String getName() {
			return name;
		}
		public String getSubject() {
			return subject;
		}
		public void showInfo() {
			System.out.println("교번: "+no);
			System.out.println("이름: "+name);
			System.out.println("전공: "+subject); //ctrl+alt 방향키 아래 
		}
}
