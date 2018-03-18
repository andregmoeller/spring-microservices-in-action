package com.thoughtmechanix.licensingservice.licenses.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.thoughtmechanix.licensingservice.licenses.clients.OrganizationFeignClient;
import com.thoughtmechanix.licensingservice.licenses.model.License;
import com.thoughtmechanix.licensingservice.licenses.repository.LicenseRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LicenseServiceImpl implements LicenseService {
    private final LicenseRepository repository;
    private final OrganizationFeignClient organizationClient;

    public LicenseServiceImpl(LicenseRepository repository, OrganizationFeignClient organizationClient){
        this.repository = repository;
        this.organizationClient = organizationClient;
    }

    @Override
    @HystrixCommand
    public Collection<License> findByOrganizationId(String organizationId) {
        Collection<License> licenses = repository.findByOrganizationId(organizationId);
        licenses.forEach(l -> l.setOrganizationName(organizationClient.getOrganization(l.getOrganizationId()).getName()));
        return licenses;
    }
}
