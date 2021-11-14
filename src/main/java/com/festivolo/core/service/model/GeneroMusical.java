package com.festivolo.core.service.model;

public enum GeneroMusical {
	ROCK(1), POP(2); // , METAL, HARDCORE, METALCORE, ELECTRONICA, FOLK, CANTAUTOR, ROCKANDROLL;

	private int key;

	GeneroMusical(int key) {
		this.setKey(key);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
