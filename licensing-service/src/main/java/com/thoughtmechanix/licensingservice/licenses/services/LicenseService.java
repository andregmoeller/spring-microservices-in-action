package com.thoughtmechanix.licensingservice.licenses.services;

import com.thoughtmechanix.licensingservice.licenses.model.License;

import java.util.Collection;

public interface LicenseService {
    Collection<License> findByOrganizationId(String organizationId);
}
