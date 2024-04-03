package Entorns;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class course {
	private Date year;
	private ArrayList<Student> Student;

	public course(Date year) {
		this.year = year;
		this.Student = new ArrayList<>();
	}
	public int calculateAge(){
		return LocalDate.now().getYear()-year.getYear();
	    
	}
	public int contarEstudiantes() {
		return Student.size();
	}

}
