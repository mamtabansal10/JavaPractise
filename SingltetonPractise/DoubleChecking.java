package com.pattern.design;

public class DoubleChecking {

	private static volatile DoubleChecking obj;

	private DoubleChecking() {

	}

	public static DoubleChecking getObj() {
		if (obj == null) {

			synchronized (DoubleChecking.class) {

				if (obj == null) {
					obj = new DoubleChecking();
				}
			}

		}
		return obj;

	}

}
