	package Project;
	
	public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
	    s1.setSname("Sam");
	    s1.setBranch("EEE");
	    s1.setFee(50000);
	    
	    Student s2 = new Student();
	    s2.setSname("Teju");
	    s2.setBranch("MECH");
	    s2.setFee(60000);
	    
	    Student s3 = new Student();
	    s3.setSname("Shiva");
	    s3.setBranch("ECE");
	    s3.setFee(40000);
	    
	    StudentRepo StudentRepo = new StudentRepoMpl();
	    
	    StudentRepo.insertStudent(s1);
	    StudentRepo.insertStudent(s2);	    
	    StudentRepo.insertStudent(s3);
	
	   
	
	    
	    s3.setFee(55000);
	    StudentRepo.updateStudent(s3);
	    
	    StudentRepo.deleteStudent(s3);
	    
	    StudentRepo.selectStudent();
	
	}
	}
