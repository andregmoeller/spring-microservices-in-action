package com.thoughtmechanix.licensingservice.licenses.controllers;

import com.thoughtmechanix.licensingservice.licenses.model.License;
import com.thoughtmechanix.licensingservice.licenses.services.LicenseService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses/")
public class LicenseServiceController {
    private LicenseService service;

    public LicenseServiceController(LicenseService service){
        this.service = service;
    }

    @GetMapping
    public Collection<License> getLicenses(@PathVariable String organizationId) {
        Collection<License> licenses = service.findByOrganizationId(organizationId);
        return licenses;
    }
}
