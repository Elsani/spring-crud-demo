package com.thinkdifferent.demo.Controller;

import com.thinkdifferent.demo.model.CloudVendor;
import com.thinkdifferent.demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    //Read Specific Cloud Vendor  Details from DB
    @GetMapping("{vendorId}")
    public  CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId )
    {
        return cloudVendorService.getCloudVendor(vendorId);
//
//        new CloudVendor("C1","Vendor 1","Address One", "xxxxx");
    }

    // Read All Cloud Vendor Details from DB
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(String vendorId )
    {
        return cloudVendorService.getAllCloudVendors();
//
//        new CloudVendor("C1","Vendor 1","Address One", "xxxxx");
    }


    // Create POST
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor created successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated successfully";
    }
    @DeleteMapping ("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted successfully";
    }
}
