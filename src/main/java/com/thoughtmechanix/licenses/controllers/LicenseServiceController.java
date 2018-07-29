package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.models.License;
import com.thoughtmechanix.licenses.services.LicenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/V1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    private LicenseService service;
    public LicenseServiceController(LicenseService service) {
        this.service = service;
    }

    @GetMapping(value = "/{licenseId}")
    public License getLicense(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId) {
        return service.getLicense(organizationId, licenseId);
    }

    @GetMapping()
    public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {
        return service.getlicensesByOrganization(organizationId);
    }

    @PostMapping()
    public void saveLicense(@PathVariable("organizationId") String organizationId, @RequestBody License license) {
        license.setOrganizationId(organizationId);
        service.saveLicense(license);
    }
}
