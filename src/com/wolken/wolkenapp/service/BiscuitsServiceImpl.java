package com.wolken.wolkenapp.service;

import java.util.Scanner;

import com.wolken.wolkenapp.DAO.BiscuitsDAO;
import com.wolken.wolkenapp.DAO.BiscuitsDAOImpl;
import com.wolken.wolkenapp.DTO.BiscuitsDTO;

public class BiscuitsServiceImpl implements BiscuitsService{
	Scanner scan=new Scanner(System.in);
	public BiscuitsDAO biscuitsDAO;
	

	public BiscuitsServiceImpl(BiscuitsDAO biscuitsDAO) {
		super();
		this.biscuitsDAO = biscuitsDAO;
	}


	@Override
	public boolean validateAndSave(BiscuitsDTO biscuitsDTO) {
		boolean check=false;
		if(biscuitsDTO!=null) {
			String brand=biscuitsDTO.getBrand();
			if(brand!=null && !brand.isEmpty() && !brand.contains(" ")) 
			{
				check=true;
				System.out.println("brand is valid");
			}
			if(check) {
				int quantity=biscuitsDTO.getQuantity();
				if(quantity>0) {
					System.out.println("quatity is valid");
					check=true;
				}
				else {
					System.out.println("Quality is not vallid");
				}
				
			}
			if(check) {
				double price=biscuitsDTO.getPrice();
				if(price>0 && price<=100) {
					check=true;
					System.out.println("price is valid");
					
				}
				else {
					System.out.println("price is not vallid");
					check=false;
				}
			}
			biscuitsDAO.save(biscuitsDTO);
			
			
		}
		
		return check;
		// TODO Auto-generated method stub
		
		
		
	}


	

}
