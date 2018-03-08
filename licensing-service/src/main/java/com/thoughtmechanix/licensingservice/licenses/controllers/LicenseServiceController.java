package com.thoughtmechanix.licensingservice.licenses.controllers;

import com.thoughtmechanix.licensingservice.licenses.model.License;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses/{licenseId}")
public class LicenseServiceController {

    @GetMapping
    public License getLicenses(@PathVariable String organizationId, @PathVariable String licenseId) {
        return new License()
                .withId(licenseId)
                .withOrganizationId(organizationId)
                .withProductName("Teleco")
                .withLicenseType("Seat")
                .withOrganizationId("TestOrg");
    }

    @PutMapping
    public String updateLicenses( @PathVariable String licenseId) {
        return String.format("This is the put");
    }

    @PostMapping
    public String saveLicenses( @PathVariable String licenseId) {
        return String.format("This is the post");
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteLicenses( @PathVariable String licenseId) {
        return String.format("This is the Delete");
    }
}
