package dev.stringsearch.cleverti.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SearchStringService {

	public List<String> stringMatch(String[] stations, String pattern) {

		int stationsLength = 0;
		int patternLength = pattern.length();

		int indexStations = 0;
		int indexSearchPattern = 0;
		int indexPattern = 0;

		int countPatternFound = 0;

		List<String> stationsFound = new ArrayList<String>();

		for (indexStations = 0; indexStations < stations.length; indexStations++) {
			stationsLength = stations[indexStations].length();

			for (indexSearchPattern = 0; indexSearchPattern <= (stationsLength - patternLength); indexSearchPattern++) {

				for (indexPattern = 0; indexPattern < patternLength; indexPattern++) {
					if (stations[indexStations].charAt(indexSearchPattern + indexPattern) != pattern
							.charAt(indexPattern))
						break;
				}

				if (indexPattern == patternLength) {
					countPatternFound++;
					stationsFound.add(stations[indexStations]);
				}
			}

		}

		if (countPatternFound == 0) {
			stationsFound.add("No station found!");
		}

		return stationsFound;
	}
}
