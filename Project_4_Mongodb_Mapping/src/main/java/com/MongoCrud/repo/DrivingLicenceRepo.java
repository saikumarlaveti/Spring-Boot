package com.MongoCrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoCrud.document.DrivingLicense;

public interface DrivingLicenceRepo extends MongoRepository<DrivingLicense, String> {

}
