package com.kodekonveyor.fifth;

import java.util.ArrayList;
import java.util.List;

import com.kodekonveyor.third.Circle;

public class AntipatternUtils {
	
	public static Double calculateCircleArea(final Circle circle) {
		if (circle == null)
			return null;
		final double radius = circle.getRadius();
		return radius * radius * 3.14;
	}
	
	public static <T extends Comparable<T>> List<T> sortList(List<T> list) {
		if (list.isEmpty())
			return new ArrayList<>();

		List<T> less = new ArrayList<>();
		List<T> greater = new ArrayList<>();
		T pivot = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			T compared = list.get(i);
			if (pivot.compareTo(compared) < 0) {
				less.add(compared);
			} else {
				greater.add(compared);
			}
		}
		List<T> sorted = sortList(less);
		sorted.add(pivot);
		sorted.addAll(sortList(greater));
		return sorted; 
	}

}
