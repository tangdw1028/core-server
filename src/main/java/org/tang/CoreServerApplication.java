package org.tang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.tang.mapper")
public class CoreServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreServerApplication.class, args);
	}
}
