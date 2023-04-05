package com.shilpa.assignment2;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class Files {

	public void walk(String fdname) {
		File fd = new File(fdname);
		if (fd.isDirectory()) {
			File files[] = fd.listFiles();
			Map<String, Integer> mapOfExtentionsAndCounts = new TreeMap<>();
			for (int i = 0; i < files.length; i++) {

				if (!files[i].isDirectory()) {
					String key = files[i].getName().substring(files[i].getName().lastIndexOf(".") + 1);
					int count = 0;
					if (mapOfExtentionsAndCounts.containsKey(key)) {
						count = mapOfExtentionsAndCounts.get(key);
					}
					count = count + 1;
					mapOfExtentionsAndCounts.put(key, count);
				}
				walk(fdname + "/" + files[i].getName());
			}
			System.out.printf("%s is %s%n", fd.getName(), fd.isDirectory() ? "directory" : "file");
			System.out.println(mapOfExtentionsAndCounts);
		}
	}
	public void walkUsingStream(String fdname) {
		
	}
}
