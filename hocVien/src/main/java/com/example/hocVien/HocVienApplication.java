package com.example.hocVien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import services.HocVienServices;

@SpringBootApplication
public class HocVienApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(HocVienApplication.class, args);
		HocVienServices hocVienServices = applicationContext.getBean(HocVienServices.class);
		Test t = new Test(hocVienServices);
		t.testAll();
	}

}
