package raisetech.StudentManagement;

import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentsCourses;
import raisetech.StudentManagement.repository.StudentRepository;

@SpringBootApplication
//@RestController
// @MapperScan("raisetech.StudentManagement.repository")  // パッケージを指定
public class Application {

//	@Autowired
//	private StudentRepository repository;

//	private String name = "Enami Kouji";
//	private String age = "37";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//  @GetMapping("/student")
//	public List<Student> getStudentList() {
//		return repository.search();
//}
	}
