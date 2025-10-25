package com.thinkdifferent.demo.service.impl;

import com.thinkdifferent.demo.model.CloudVendor;
import com.thinkdifferent.demo.repository.CloudVendorRespository;
import com.thinkdifferent.demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceimpl implements CloudVendorService {

    CloudVendorRespository cloudVendorRespository;

    public CloudVendorServiceimpl(CloudVendorRespository cloudVendorRespository) {
        this.cloudVendorRespository = cloudVendorRespository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRespository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRespository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRespository.deleteById(cloudVendorId);
        return "";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRespository.findById(cloudVendorId).get();

    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRespository.findAll();
    }
}
