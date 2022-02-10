package com.example.business;

import com.example.business.model.Product;
import com.example.business.model.Service;
import com.example.business.model.Student;
import com.example.business.repository.ProductRepository;
import com.example.business.repository.ServiceRepository;
import com.example.business.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BusinessApplication implements CommandLineRunner {

	@Autowired
	ProductRepository ob;

	@Autowired
	StudentRepository ob1;

	@Autowired
	ServiceRepository ob2;

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);

//		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(BusinessApplication.class, args);
//		StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);
//		Student student = new Student(1, "dipc", "qws");
//		Product p1 = new Product(1, "biz");
//		Product p2 = new Product(1, "biz2");
//		List<Product> product = Arrays.asList(p1, p2);
//		student.setProduct(product);
//		studentRepository.save(student);
	}

	@Override
	public void run(String... args) throws Exception {


		Student student = new Student(1,"DIPC","dipc");
		ob1.save(student);
		Product product= new Product(1,"SPRING");
		ob.save(product);
		Service service=new Service(1,"springboot");
		ob2.save(service);
	}

}

