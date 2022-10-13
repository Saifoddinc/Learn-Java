package objects;

public class Student {
	// Characteristics 
	String name;
    int age;
    String classSection;
    
    
    // Behaviour 
    
    void tellmeYourStudySubject() {
    System.out.println("Hello I am Study in" + classSection);
    
}
    void tellmeyourName() {
    	System.out.println("My name is " + name);
    		
    }
}

class TestStudent{
	public static void main(String[] args) {
		Student s1 = new Student ();
		s1.name = "Student1";
		s1.tellmeyourName();
		
		
	}
}