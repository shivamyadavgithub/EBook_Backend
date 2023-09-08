package com.ebook;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ebook.entites.Role;
import com.ebook.repository.RoleRepository;
import com.ebook.utils.AppConstant;

@SpringBootApplication
public class EbookApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(EbookApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();

	}

	

}
