package day07_exercise;

public class Jobseeker {
	
		private	String name;
		private int age;
		private String major;
		private String education;
			
			
		public void setName(String nm) {
			this.name=nm;
		}
		public void setAge(int a) {
			this.age=a;
		}
		public void setMajor(String mj) {
			this.major=mj;
		}
		public void setEducation(String ed) {
			this.education=ed;
		}

		public String getName() {
		return name;
		}
		public int getAge() {
		return age;
		}
		public String getMajor() {
			return major;
		}
		public String getEducation() {
			return education;
		}
		
}