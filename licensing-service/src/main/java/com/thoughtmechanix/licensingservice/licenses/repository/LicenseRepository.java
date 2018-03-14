package com.thoughtmechanix.licensingservice.licenses.repository;

import com.thoughtmechanix.licensingservice.licenses.model.License;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface LicenseRepository extends CrudRepository<License, Long> {
    public Collection<License> findByOrganizationId(String organizationId);
}
