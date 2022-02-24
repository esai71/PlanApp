package com.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.requestbinding.PlanRequest;
import com.sai.service.PlanService;

@RestController
public class PlanController {
	@Autowired
	PlanService PlanService;
	@PostMapping("/insertPlan")
	public ResponseEntity<String> getPLanStatus(PlanRequest planRequest)
	{
		String planName = planRequest.getPlanName();
		ResponseEntity<String> res=null;
		try {
			String checkPlanEligibility = PlanService.checkPlanEligibility(planRequest);
			res=new  ResponseEntity<>(checkPlanEligibility+""+   planName,HttpStatus.OK);
		}
		catch(Exception e)
		{
			String checkPlanEligibility = "Unable to process plan status";
			res=new  ResponseEntity<>(checkPlanEligibility,HttpStatus.OK);
			
		}
		return res;
		
	}

}
