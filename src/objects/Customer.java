package objects;

public class Customer {

	String cstmName;
int cstmid;
String cstmacctype;


	void setname(){
	System.out.println("customer Name " + cstmName);	
	}
void getcustomerid() {
	System.out.println("customer Id " + cstmid);
}
	void setacctype() {
	System.out.println("customer account type " + cstmacctype);
	}
 public static void main(String[] args) {
	Customer obj2 = new Customer ();
	obj2.cstmName= "Saif" ;
	obj2.cstmid= 123456 ;
	obj2.cstmacctype= "Savings";
	
	obj2.setname();
	obj2.getcustomerid();
	obj2.setacctype();
}
}
  
