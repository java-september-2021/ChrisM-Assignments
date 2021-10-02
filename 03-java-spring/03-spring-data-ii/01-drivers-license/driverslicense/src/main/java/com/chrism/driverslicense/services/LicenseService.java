package com.chrism.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.driverslicense.models.License;
import com.chrism.driverslicense.repositories.LicenseRepository;
import com.chrism.driverslicense.repositories.PersonRepository;

@Service
public class LicenseService {
	private LicenseRepository lRepo;
	private PersonRepository pRepo;
	public LicenseService(LicenseRepository lRepo, PersonRepository pRepo) {
		this.lRepo = lRepo;
		this.pRepo = pRepo;
	}
	
	
	public List<License> allLicenses() {
		return this.lRepo.findAll();
	}
	
	public License createLicense(License createLicense) {
		createLicense.setNumber(this.makeLicenseNumber());
		return this.lRepo.save(createLicense);
	}
	
	public License updateLicense(License updateLicense) {
		return this.lRepo.save(updateLicense);
	}
	
	public License getOneLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public void deleteLicense(Long id) {
		this.lRepo.deleteById(id);
	}
	
	public int makeLicenseNumber() {
		License thisLicense = this.lRepo.findFirstByOrderByNumberDesc();
		if(thisLicense == null) {
			return 1;
		} else {
			int previousLicenseNumber = thisLicense.getNumber();
			previousLicenseNumber++;
			return (previousLicenseNumber);
		}
	}
	
}
