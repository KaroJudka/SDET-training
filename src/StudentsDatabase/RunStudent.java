package StudentsDatabase;

public class RunStudent {

	public static void main(String[] args) {
		Student student1 = new Student("Joe", "12345");
		Student student2 = new Student("Dorota", "344092");
		student2.enroll("Geography");
		student2.enroll("Math");
		student2.pay(200);
		student2.checkBalance();
		student2.showCourses();
		System.out.println(student2.toString());
	}

}
