package com.thoughtmechanix.organizationservice.controllers;

import com.thoughtmechanix.organizationservice.model.Organization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganizationServiceController {
    @GetMapping("v1/organizations/{organizationId}")
    public Organization getOrganization(@PathVariable String organizationId) {
        Organization organization = new Organization();
        organization.setId(organizationId);
        organization.setName("Acme Corporation");
        return organization;
    }
}
