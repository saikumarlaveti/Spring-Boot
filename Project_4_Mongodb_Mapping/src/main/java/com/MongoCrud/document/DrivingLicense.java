package com.MongoCrud.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class DrivingLicense {

	@NonNull
	@Id
	private String licenseNo;
	@NonNull
	private String type;
	@NonNull
	private LocalDate expiryTime;
	
	private Person personDetails;

	@Override
	public String toString() {
		return "DrivingLicense [licenseNo=" + licenseNo + ", type=" + type + ", expiryTime=" + expiryTime + "]";
	}
	
	
	
}
