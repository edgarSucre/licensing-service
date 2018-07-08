package com.thoughtmechanix.licenses.controllers;

import com.thoughtmechanix.licenses.models.License;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/V1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping(value = "/{licenseId}")
    public License getLicense(@PathVariable("organizationId") String organizationId,
                               @PathVariable("licenseId") String licenseId) {
        return new License(licenseId, "Teleco", "Seat", organizationId);

    }
}
