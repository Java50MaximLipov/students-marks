package telran.students.model;

import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import telran.students.dto.*;

@Document(collection = "students")
@Getter
@NoArgsConstructor
public class StudentDoc {

	@Id
	long id;

	@Setter
	String phone;

	List<Mark> marks = new ArrayList<>();

	/**
	 * Constructor
	 * 
	 * @param student
	 */
	public StudentDoc(Student student) {
		id = student.id();
		phone = student.phone();
	}

	/**
	 * Builder
	 * 
	 * @return new Student
	 */
	public Student build() {
		return new Student(id, phone);
	}

}