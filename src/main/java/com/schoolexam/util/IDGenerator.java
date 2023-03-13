package com.schoolexam.util;

import java.util.UUID;

public class IDGenerator {
	public synchronized String getUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
}
