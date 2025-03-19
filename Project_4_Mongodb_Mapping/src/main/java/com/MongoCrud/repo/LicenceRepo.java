package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.DrivingLicence;

public interface LicenceRepo extends MongoRepository<DrivingLicence, String> {

}
