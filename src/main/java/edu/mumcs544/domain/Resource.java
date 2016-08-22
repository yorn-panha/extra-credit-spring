package edu.mumcs544.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Resource {
	private String resourceName;
	public Resource() {}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public Resource(String resourceName) {
		this.resourceName = resourceName;
	}
}
