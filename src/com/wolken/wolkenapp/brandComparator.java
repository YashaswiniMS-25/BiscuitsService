package com.wolken.wolkenapp;

import java.util.Comparator;

import com.wolken.wolkenapp.DTO.BiscuitsDTO;

public class brandComparator implements Comparator<BiscuitsDTO>{

	@Override
	public int compare(BiscuitsDTO o1, BiscuitsDTO o2) {
		// TODO Auto-generated method stub
		return  (o1.getBrand().compareTo(o2.getBrand()));
	}

}
