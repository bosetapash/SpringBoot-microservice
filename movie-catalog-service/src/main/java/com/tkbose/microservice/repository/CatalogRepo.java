package com.tkbose.microservice.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CatalogRepo {
	Map<Integer,List<String>> map = new HashMap(); 

	public List<String> getCatalogByUserId(String userId) {
		return map.get(Integer.parseInt(userId))!=null?map.get(Integer.parseInt(userId)):Arrays.asList();
		
	}
	
	public CatalogRepo() {
		map.put(1, Arrays.asList("Speed","Hard Target","Avatar"));
		map.put(2, Arrays.asList("Speed","Terminator2","Avatar"));
		map.put(3, Arrays.asList("The Spy Who loved me","Terminator2","Avatar"));
		map.put(4, Arrays.asList("The Spy Who loved me","Terminator2","Speed"));
	}
	
	public static void main (String[] args){
		System.out.println((new CatalogRepo().getCatalogByUserId("3")));
		System.out.println((new CatalogRepo().getCatalogByUserId("4")));
		System.out.println((new CatalogRepo().getCatalogByUserId("5")));
	}
}
