package com.thinkdifferent.demo.repository;

import com.thinkdifferent.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRespository extends JpaRepository <CloudVendor,String> {
}
