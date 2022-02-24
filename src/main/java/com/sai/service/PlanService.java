package com.sai.service;

import org.springframework.stereotype.Service;

import com.sai.requestbinding.PlanRequest;
import com.sai.requestbinding.PlanResponse;
@Service
public class PlanService {
	
	public String checkPlanEligibility(PlanRequest planRequest)
	{
		PlanResponse s=new PlanResponse();
		String planStatus="";
		
		if(planRequest.getPlanName().equals("SNAP"))
		{
             if(planRequest.getIncome().equals(0) || planRequest.getIncome()<=200 ) {
            	 
            	 planStatus= s.setPlanStatuss("approve");
            	 
            	 
             }
             else {
            	 planStatus= s.setPlanStatuss("denied");
             }

		}
		if(planRequest.getPlanName().equals("CCAP"))
		{
             if((planRequest.getIncome().equals(0) || planRequest.getIncome()<200) && planRequest.getAge()<16) {
            	 
            	 planStatus= s.setPlanStatuss("approve");
            	 
             }
             else {
            	 planStatus= s.setPlanStatuss("Denied");
             }

             
		}
		
		
		
		if(planRequest.getPlanName().equals("KW"))
		{
             if(planRequest.getUnEmployee().equalsIgnoreCase("unemployee")) {
            	 
 planStatus= s.setPlanStatuss("approve");
            	 
             }
             else {
            	 planStatus= s.setPlanStatuss("Denied");
             }
             
		}
		
		
		if(planRequest.getPlanName().equals("Medicare"))
		{
             if( planRequest.getAge()>=65) {
            	 
 planStatus= s.setPlanStatuss("approve");
            	 
             }
             else {
            	 planStatus= s.setPlanStatuss("Denied");
             }
             
		}
		
		
		if(planRequest.getPlanName().equals("Medicaid"))
		{
             if(( planRequest.getIncome()<=300)) {
            	 
 planStatus= s.setPlanStatuss("approve");
            	 
             }
             else {
            	 planStatus= s.setPlanStatuss("Denied");
             }
             
		}
		
		
	
		
		
		
		
		return planStatus;
		
	}
	

}
