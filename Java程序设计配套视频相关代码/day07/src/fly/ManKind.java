package fly;

public class ManKind {
	
		private int sex;
		private int salary;
		
		public ManKind() {
			
		}
		
		public int getSex() {
			return sex;
		}

		public void setSex(int sex) {
			this.sex = sex;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public void manOrWomen(int sex) {
			if(sex == 0) {
				System.out.println("women");
			}else if(sex == 1) {
				System.out.println("men");
			}else {
				System.out.println("暂不确定性别");
			}
		}
		
		public void employeed(int salary) {
			if(salary == 0) {
				System.out.println("no job!");
			}else {
				System.out.println("job!");
			}
		}
	
}
