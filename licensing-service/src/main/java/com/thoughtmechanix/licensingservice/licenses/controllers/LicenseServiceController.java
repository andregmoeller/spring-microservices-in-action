package com.thoughtmechanix.licensingservice.licenses.controllers;

import com.thoughtmechanix.licensingservice.licenses.model.License;
import com.thoughtmechanix.licensingservice.licenses.repository.LicenseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses/")
public class LicenseServiceController {
    private LicenseRepository repository;

    public LicenseServiceController(LicenseRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Collection<License> getLicenses(@PathVariable String organizationId) {
        return repository.findByOrganizationId(organizationId);
    }
}
