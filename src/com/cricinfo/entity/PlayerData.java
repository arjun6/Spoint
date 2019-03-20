package com.cricinfo.entity;

import java.util.Map;

public class PlayerData {
	
	private Map<String, String> listA;
	private Map<String, String> firstClass;
	private Map<String, String> t20s;
	private Map<String, String> ODIs;
	private Map<String, String> test;
	public Map<String, String> getListA() {
		return listA;
	}
	public void setListA(Map<String, String> listA) {
		this.listA = listA;
	}
	public Map<String, String> getFirstClass() {
		return firstClass;
	}
	public void setFirstClass(Map<String, String> firstClass) {
		this.firstClass = firstClass;
	}
	public Map<String, String> getT20s() {
		return t20s;
	}
	public void setT20s(Map<String, String> t20s) {
		this.t20s = t20s;
	}
	public Map<String, String> getODIs() {
		return ODIs;
	}
	public void setODIs(Map<String, String> oDIs) {
		ODIs = oDIs;
	}
	public Map<String, String> getTest() {
		return test;
	}
	public void setTest(Map<String, String> test) {
		this.test = test;
	}

	
}
