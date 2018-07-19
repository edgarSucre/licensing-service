package com.thoughtmechanix.licenses.services;

import com.thoughtmechanix.licenses.models.License;
import com.thoughtmechanix.licenses.repository.LicenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public License getLicense(String organizationId, String licenseId) {
        return licenseRepository.findByOrganizationIdAndId(organizationId, licenseId);
    }

    public List<License> getlicensesByOrganization(String organizationId) {
        return licenseRepository.findByOrganizationId(organizationId);
    }

    public void saveLicense(License license) {
        license.setId(UUID.randomUUID().toString());
        licenseRepository.save(license);
    }
}
