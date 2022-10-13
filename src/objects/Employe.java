package objects;

public class Employe {

	String empName;
	int empid;
	String dept;
	
		void setName() {
			System.out.println("emp name " + empName);
		}
		void getEmpid() {
			System.out.println("emp id " + empid);
		}
		void setdept() {
			System.out.println("department " + dept);
		}
		 public static void main(String[] args) {
				Employe obj1 = new Employe();
				obj1.empName="saifoddin";
				obj1.empid = 123;
				obj1.dept = "Finance";
				
				obj1.setName();
				obj1.getEmpid();
				obj1.setdept();		
			}

		
		
}
// class emp{
//	 public static void main(String[] args) {
//		Employe obj1 = new Employe();
//		obj1.empName="saifoddin";
//		obj1.empid = 123;
//		obj1.setName();
//		obj1.getEmpid();
//				
//	}
// }
 