class staticdemo{
	public static void main(String[]args){
	student student1,student2,student3;
	
	//student1 setters and getters
	student1 = new student();
	student1.setname("John");
	student1.setstudyClass("B.tech 3rd year");
	student1.setrollNo(63);
	student1.marks=90;
	System.out.println(student1.getname());
	System.out.println(student1.getstudyClass());
	System.out.println(student1.getrollNo());
	//System.out.println(student1.getcollegeName());
	System.out.println(student.collegeName);
	
	//student2 setters and getters
	student2 = new student();
	student2.setname("Marry");
	student2.setstudyClass("B.tech 4th year");
	student2.setrollNo(21);
	student2.marks=87;
	System.out.println(student2.getname());
	System.out.println(student2.getstudyClass());
	System.out.println(student2.getrollNo());
	//System.out.println(student2.getcollegeName());
	System.out.println(student.collegeName);
	
	//student3 setters and getters
	student3 = new student();
	student3.setname("Phiso");
	student3.setstudyClass("B.tech 1st year");
	student3.setrollNo(39);
	student3.marks=76;
	System.out.println(student3.getname());
	System.out.println(student3.getstudyClass());
	System.out.println(student3.getrollNo());
	//System.out.println(student3.getcollegeName());
    System.out.println(student.collegeName);
	
    System.out.println("student1 marks : "+student1.marks);
	System.out.println("student2 marks : "+student2.marks);
	System.out.println("student3 marks : "+student3.marks);

    System.out.println("totalStudents : "+student.totalStudents);
	System.out.println("totalStudents : "+student.gettotalStudents());
	}
}