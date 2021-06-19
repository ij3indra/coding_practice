package com.jatin.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HackerRankActiveTrader {

	public static void main(String aa[]) {

		List<String> customers = Arrays.asList("Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"tst",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Alpha",
				"Omega",
				"Beta");
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < customers.size(); i++) {
			if(map.containsKey(customers.get(i))) {
				map.compute(customers.get(i), (k,v) -> v +1);
			} else {
				map.put(customers.get(i), 1);
			}
		}
		
		System.out.println(map);
		
		List<String> cust = map
                .entrySet()
                .stream()
                .filter(m -> (m.getValue()*100)/customers.size() >= 5)
                .sorted(Map.Entry.comparingByKey())
                .map(m -> m.getKey())
                .collect(Collectors.toList());
		
		cust.forEach(action -> System.out.println(action));
		
	}

}
