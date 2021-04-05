package com.wolken.wolkenapp.DAO;

import java.util.LinkedList;
import java.util.List;

import com.wolken.wolkenapp.DTO.BiscuitsDTO;

public class BiscuitsDAOImpl implements BiscuitsDAO {
	List<BiscuitsDTO> biscuitsDTO;

	public BiscuitsDAOImpl(List<BiscuitsDTO> biscuitsDTO) {
		super();
		this.biscuitsDTO = biscuitsDTO;
	}

	public BiscuitsDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(BiscuitsDTO biscuitsDTO) {
		// TODO Auto-generated method stub

		boolean check = this.biscuitsDTO.contains(biscuitsDTO);
		if (!check) {
			System.out.println("added");
		} else {
			System.out.println("not");
		}
	}
	@Override
	public void updatePriceByBrandandName(String brandName, String Name, int price) {
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO :biscuitsDTO) {
			if (biscuitsDTO.getBrand().equalsIgnoreCase(brandName)) {
				if (biscuitsDTO.getName().equalsIgnoreCase(Name)) {
					biscuitsDTO.setPrice(price);
					System.out.println(biscuitsDTO);
					//System.out.println("updated price by brandname & name");
					break;
				}

			} else {
				//System.out.println("value of brand name and name is not proper");
			}
		}

	}
	@Override
	public void updateBrandandQuantityByPrice(String brandName, int quantity, int price) {
		System.out.println("update brand &quantity by price");
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : biscuitsDTO) {
			if (biscuitsDTO.getPrice() == price) {
				biscuitsDTO.setBrand(brandName);
				biscuitsDTO.setQuantity(quantity);
				System.out.println(biscuitsDTO);
				
				break;
			}

			else {
				//System.out.println("value of price is not proper");
			}
		}
	}
	@Override
	public void updateNameByBrand(String brandName, String name) {
		System.out.println("update Name by brand");
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : biscuitsDTO) {
			if (biscuitsDTO.getBrand().equals(brandName)) {
				biscuitsDTO.setName(name);
				System.out.println(biscuitsDTO);
				
				break;
			}

			
		}
	}
	@Override
	public void deleteAll() {
		System.out.println("all are deleted");
		// TODO Auto-generated method stub
		for (BiscuitsDTO biscuitsDTO : biscuitsDTO) {
			biscuitsDTO=null;
			System.out.println(biscuitsDTO);

		}
	}

	@Override
	public void deleteByPrice(double price) {
		// TODO Auto-generated method stub
		System.out.println("deletebyprice");
		for (BiscuitsDTO biscuitsdto : biscuitsDTO) {
			if(Double.compare(biscuitsdto.getPrice(),price)==0) {
				biscuitsdto=null;
				System.out.println(biscuitsdto);
				
				
				
			}
			else {
				System.out.println(biscuitsdto);
			}
		}
		
		
		
	}
	
	

	
	

}
