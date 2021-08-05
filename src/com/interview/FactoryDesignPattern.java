package com.interview;

import java.util.Scanner;

abstract class Plan{
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units) {
	   System.out.println(units*rate);
	}
}

class DomesticPlan extends Plan{
	@Override
	void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends Plan{
	@Override
	void getRate() {
		rate = 4.50;
	}
}

class InstitutionalPlan extends Plan{
	@Override
	void getRate() {
		rate = 6.50;
	}
}

class GetPlanFactory{
	
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		if(planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}
		if(planType.equalsIgnoreCase("INSTITUATIOPLAN")) {
			return new InstitutionalPlan();
		}
		return null;	
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		GetPlanFactory getFactory = new GetPlanFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plan name :");
		String planName = sc.nextLine();
		System.out.println("Enter units :");
		int units = sc.nextInt();
		
		Plan p =getFactory.getPlan(planName);
		System.out.println("Bill Amount for :"+planName+"of :"+units);
        p.getRate();
        p.calculateBill(units);
	}
	
}
