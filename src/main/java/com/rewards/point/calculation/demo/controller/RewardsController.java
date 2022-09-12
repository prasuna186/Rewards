/**
 * 
 */
package com.rewards.point.calculation.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.point.calculation.demo.model.CustomerTransaction;
import com.rewards.point.calculation.demo.service.RewardsService;

public class RewardsController {

	@Autowired
	RewardsService rewardsService;

	@RestController
	public class ProductServiceController {
		@RequestMapping(value = "/calculaterewards")
		public ResponseEntity<Map> CalculateRewards(@RequestBody List<CustomerTransaction> customerTransactions) {
			return rewardsService.calculateRewardPoints(customerTransactions);
		}
	}

}