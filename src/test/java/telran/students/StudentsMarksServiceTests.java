package telran.students;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import telran.students.repo.StudentRepo;
import telran.students.service.StudentsService;

@SpringBootTest

class StudentsMarksServiceTests {

	@Autowired
	StudentsService studentsService;

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	TestDb testDb;

	@BeforeEach
	void setUp() {
		testDb.createDb();
	}

	@Test
	void addStudentTest() {
		// FIXME according to TestDb
//		assertEquals(student, studentsService.addStudent(student));
//		assertEquals(student, studentRepo.findById(ID1).orElseThrow().build());
//		assertThrowsExactly(StudentIllegalStateException.class, ()->studentsService.addStudent(student));
	}

	@Test
	void updatePhoneNumberTest() {
		// FIXME according to TestDb
//		assertEquals(studentUpdated, studentsService.updatePhoneNumber(ID1, PHONE2));
//		assertEquals(studentUpdated, studentRepo.findById(ID1).orElseThrow().build());
//		assertThrowsExactly(StudentNotFoundException.class,
//				()->studentsService.updatePhoneNumber(ID1 + 1000, PHONE2));
	}

	@Test
	void addMarkTest() {
		// FIXME according to TestDb
//		assertFalse(studentRepo.findById(ID1).orElseThrow().getMarks().contains(mark));
//		assertEquals(mark, studentsService.addMark(ID1, mark));
//		assertTrue(studentRepo.findById(ID1).orElseThrow().getMarks().contains(mark));
//		assertThrowsExactly(StudentNotFoundException.class,
//				()->studentsService.addMark(ID1 + 1000, mark));
	}

}