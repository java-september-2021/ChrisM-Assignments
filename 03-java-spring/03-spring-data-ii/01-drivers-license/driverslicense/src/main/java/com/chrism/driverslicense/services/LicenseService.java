package com.chrism.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.driverslicense.models.License;
import com.chrism.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository lRepo;
	public LicenseService(LicenseRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	public List<License> allLicenses() {
		return this.lRepo.findAll();
	}
	
	public License createLicense(License createLicense) {
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
}
