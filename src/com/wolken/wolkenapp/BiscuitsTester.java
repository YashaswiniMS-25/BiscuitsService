package com.wolken.wolkenapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wolken.wolkenapp.DAO.BiscuitsDAO;
import com.wolken.wolkenapp.DAO.BiscuitsDAOImpl;
import com.wolken.wolkenapp.DTO.BiscuitsDTO;
import com.wolken.wolkenapp.service.BiscuitsService;
import com.wolken.wolkenapp.service.BiscuitsServiceImpl;

public class BiscuitsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BiscuitsDTO> biscuitsDTOs = new ArrayList<>();

		// BiscuitsDTO biscuitsDTO=new BiscuitsDTO();
		BiscuitsDTO biscuitsDTO = new BiscuitsDTO();
		biscuitsDTO.setId(1);
		biscuitsDTO.setPrice(230);
		biscuitsDTO.setName("Maari");
		biscuitsDTO.setBrand("parle");
		biscuitsDTO.setQuantity(500);

		
		  BiscuitsDTO biscuitsDTO1=new BiscuitsDTO();
		  biscuitsDTO1.setId(2);
		  biscuitsDTO1.setPrice(1000);
		  biscuitsDTO1.setName("hide and seek");
		  biscuitsDTO1.setBrand("britania"); 
		  biscuitsDTO1.setQuantity(50);
		  
		  BiscuitsDTO biscuitsDTO2=new BiscuitsDTO(); 
		  biscuitsDTO2.setId(3);
		  biscuitsDTO2.setPrice(678.9);
		  biscuitsDTO2.setName("tiger");
		  biscuitsDTO2.setBrand("parle");
		  biscuitsDTO2.setQuantity(10);
		  System.out.println(biscuitsDTOs);
		  biscuitsDTOs.add(biscuitsDTO);
			biscuitsDTOs.add(biscuitsDTO1);
			biscuitsDTOs.add(biscuitsDTO2);
			//System.out.println(biscuitsDTOs);
		  
		 
		/*
		 * Map<Integer,BiscuitsDTO> BiscuitsDTOs=new HashMap<Integer,BiscuitsDTO>();
		 * 
		 * BiscuitsDTOs.put(1,biscuitsDTO); BiscuitsDTOs.put(2,biscuitsDTO);
		 * BiscuitsDTOs.put(4,biscuitsDTO); System.out.println(BiscuitsDTOs.get(2));
		 * System.out.println("---------"); for(Map.Entry<Integer,BiscuitsDTO>
		 * Intege:BiscuitsDTOs.entrySet() ) {
		 * //System.out.println(Intege.getKey()+"="+Intege.getValue());
		 * //System.out.println("=---"); System.out.println(Intege); }
		 * System.out.println("key set"); System.out.println(BiscuitsDTOs.keySet());
		 */

		/*
		 * List<BiscuitsDTO> biscuitsDTOs=new ArrayList<>();
		 * biscuitsDTOs.add(biscuitsDTO); biscuitsDTOs.add(biscuitsDTO1);
		 * biscuitsDTOs.add(biscuitsDTO2);
		 * 
		 * biscuitsDTOs.forEach(System.out::println);
		 * System.out.println("---------------------"); Collections.sort(biscuitsDTOs);
		 * biscuitsDTOs.forEach(System.out::println);
		 * System.out.println("---------------------");
		 * Collections.sort(biscuitsDTOs,new brandComparator());
		 * biscuitsDTOs.forEach(System.out::println);
		 */

		
		BiscuitsDAO biscuitsdao = new BiscuitsDAOImpl(biscuitsDTOs);
		BiscuitsService biscuitsService = new BiscuitsServiceImpl(biscuitsdao);
		System.out.println("VALIDATION AND SAVE\n");
		biscuitsService.validateAndSave(biscuitsDTO);
		System.out.println("------------------------");
		System.out.println("UDATE PRICE BY BRAND NAME");
		biscuitsdao.updatePriceByBrandandName("britania","hide and seek",700);
		System.out.println("------------------------");

		System.out.println("UPDATE BRAND AND QUANTITY BY PRICE");

		biscuitsdao.updateBrandandQuantityByPrice("britania",900,230);
		System.out.println("------------------------");

		
		System.out.println("UPDATE NAME BY BRAND");
		biscuitsdao.updateNameByBrand("parle","sunfeast");
		System.out.println("------------------------");

		System.out.println("DELLETE BY PRICE");
		biscuitsdao.deleteByPrice(678.9);
		
		
		
		System.out.println("----------");
		System.out.println("DELETE ALL");
		System.out.println("now array contains");
		biscuitsdao.deleteAll();
		
	}
}
