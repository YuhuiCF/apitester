package com.mcg.apitester.impl;

public class ParameterInfo {
	
	private boolean collection; 
	private boolean required = false; 
	private String name; 
	private String type; 
	private String typeShort; 
	private String defaultValue = "[none]"; 
	private PARAM_TYPE paramType;
	
	public enum PARAM_TYPE { RETURN, PATH, REQUEST, BODY };
	
	public ParameterInfo() {
	}

	public ParameterInfo(boolean collection, String type, String typeShort) {
		super();
		this.collection = collection;
		this.type = type;
		this.typeShort = typeShort;
	}

	public boolean isCollection() {
		return collection;
	}

	public void setCollection(boolean collection) {
		this.collection = collection;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeShort() {
		return typeShort;
	}

	public void setTypeShort(String typeShort) {
		this.typeShort = typeShort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PARAM_TYPE getParamType() {
		return paramType;
	}

	public void setParamType(PARAM_TYPE paramType) {
		this.paramType = paramType;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	
}