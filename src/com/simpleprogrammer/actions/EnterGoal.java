package com.simpleprogrammer.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;



public class EnterGoal extends ActionSupport implements SessionAware {
	
	private int goal;
	private Map<String, Object> session;
	
	@Override
	public String execute() throws Exception {
		ProteinData proteinData;
		
		if(session.containsKey("proteinData"))
			proteinData = (ProteinData) session.get("proteindData");
		else
			proteinData = new ProteinData();
		
		goal = proteinData.getGoal();
		
		return SUCCESS;
	}

	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

}
