package com.rewards.point.calculation.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.rewards.point.calculation.demo.model.CustomerTransaction;

public class RewardsService {

	public ResponseEntity<Map> calculateRewardPoints(List<CustomerTransaction> customerTransactions) {
		Integer rewardsPoints = 0;
		Map<String, Integer> calcRewardPoints = new HashMap<String, Integer>();
		for (CustomerTransaction custTrans : customerTransactions) {
			Integer dollarSpent = custTrans.getDollarSpent();

			if (dollarSpent > 50) {
				rewardsPoints = (dollarSpent - 50);
			}
			if (dollarSpent > 100) {
				rewardsPoints = (dollarSpent - 50) * 1 + (dollarSpent - 100) * 2;
			}

			String indivCustEntry = custTrans.getCustomerID() + custTrans.getMonth();

			if (calcRewardPoints.get(indivCustEntry) != null) {
				calcRewardPoints.put(indivCustEntry, calcRewardPoints.get(indivCustEntry) + rewardsPoints);
			} else {
				calcRewardPoints.put(indivCustEntry, rewardsPoints);
			}
		}
		return new ResponseEntity<Map>(calcRewardPoints, HttpStatus.OK);
	}
}
