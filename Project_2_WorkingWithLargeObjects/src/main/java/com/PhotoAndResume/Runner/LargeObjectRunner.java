package com.PhotoAndResume.Runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.PhotoAndResume.Entity.PersonInfo;
import com.PhotoAndResume.Service.PersonService;
import com.PhotoAndResume.Service.PersonServiceImpl;

@Component
public class LargeObjectRunner implements CommandLineRunner {

    @Autowired
    private PersonService service;
    /*
    @Override
    public void run(String... args) throws Exception {
        int id = 40;
        String name = "Saikumar";
        boolean isMarried = false;
        
        String photoPath = "C:\\Users\\Saikumar\\OneDrive\\Pictures\\photo.jpg"; // Ensure correct file path
        String resumePath = "C:\\Users\\Saikumar\\Downloads\\G Venkatesh 06.docx";

        byte[] photoBytes = readFileToBytes(photoPath);
        char[] resumeChars = readFileToChars(resumePath);
        
        PersonInfo person = new PersonInfo(id, name, isMarried, photoBytes, resumeChars);
        service.registePerson(person);
        System.out.println("Person information saved successfully!");
    }

    private byte[] readFileToBytes(String filePath) throws IOException {
        return Files.readAllBytes(Paths.get(filePath));
    }

    private char[] readFileToChars(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath))).toCharArray();
    }  
    */

	@Override
	public void run(String... args) throws Exception {
		 int id = 40;  // Assume an existing ID

	        Optional<PersonInfo> optionalPerson = service.getPersonById(id);
	        
	        if (optionalPerson.isPresent()) {
	            PersonInfo person = optionalPerson.get();
	            System.out.println("Person Name: " + person.getPname());
	            System.out.println("Married: " + person.isIsmarried());

	            // Store retrieved photo
	            String photoPath = "C:\\Users\\Saikumar\\OneDrive\\Pictures\\retrieved_photo.jpg";
	            writeBytesToFile(photoPath, person.getPhoto());
	            System.out.println("Photo saved at: " + photoPath);

	            // Store retrieved resume
	            String resumePath = "C:\\Users\\Saikumar\\Downloads\\retrieved_resume.docx";
	            writeCharsToFile(resumePath, person.getResume());
	            System.out.println("Resume saved at: " + resumePath);
	        } else {
	            System.out.println("Person not found!");
	        }
	    }

	    private void writeBytesToFile(String filePath, byte[] data) throws IOException {
	        try (FileOutputStream fos = new FileOutputStream(new File(filePath))) {
	            fos.write(data);
	        }
	    }

	    private void writeCharsToFile(String filePath, char[] data) throws IOException {
	        Files.write(Paths.get(filePath), new String(data).getBytes());
		
	}
    
}
