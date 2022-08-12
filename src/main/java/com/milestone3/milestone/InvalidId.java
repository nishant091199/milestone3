package com.milestone3.milestone;

public class InvalidId extends Exception {
@Override
public String getMessage() {
	return "invalid id";
}
}
