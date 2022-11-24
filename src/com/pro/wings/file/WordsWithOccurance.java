package com.pro.wings.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordsWithOccurance {

	public static void main(String[] args) {

		BufferedReader reader = null;

		try {

			reader = new BufferedReader(
					new FileReader(new File("C:/Users/Shree/eclipse-workspace/file handling demo/abc.txt")));

			String line = reader.readLine();
			List<String> words = new ArrayList<>();
			while (line != null) {
				line = line.trim();
				words.addAll(Arrays.asList(line.split(" ")));
				line = reader.readLine();
			}

			Map<String, Integer> wordCountMap = new HashMap<>();

			for (String word : words) {
				if (!wordCountMap.containsKey(word)) {
					wordCountMap.put(word, 1);
				} else {
					wordCountMap.put(word, wordCountMap.get(word) + 1);
				}
			}

			Map<String, Integer> sortByValMap = sortMapByVal(wordCountMap);
			
			Iterator<Map.Entry<String, Integer>> itr = sortByValMap.entrySet().iterator();

			while (itr.hasNext()) {
				Entry<String, Integer> entry = itr.next();
				System.out.println(entry.getKey() + "  :  " + entry.getValue());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Map<String, Integer> sortMapByVal(Map<String, Integer> unsortedMap) {

		Set<Entry<String, Integer>> setOfEntries = unsortedMap.entrySet();

		ArrayList<Entry<String, Integer>> listOfEntries = new ArrayList<>(setOfEntries);

		Collections.sort(listOfEntries, new EntryComparator());

		System.out.println(listOfEntries);

		Map<String, Integer> sortedMap = new LinkedHashMap<>();

		for (Entry<String, Integer> e : listOfEntries) {
			sortedMap.put(e.getKey(), e.getValue());
		}

		return sortedMap;
	}

}
