package com.whc1998.businessexercise.business;

import com.whc1998.businessexercise.business.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepo extends JpaRepository<Business, Integer> {
}
