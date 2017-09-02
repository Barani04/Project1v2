package net.rbv.ecomback.model;

public class Category {
	/*
	 * Private Data Members
	 * */
		
	private int catId;
	private String catName;
	private String catDescription;
	private String catImgUrl;
	private boolean active = true;
	
	
	/*
	 * Getters and Setters
	 * */
	
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatDescription() {
		return catDescription;
	}
	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}
	public String getCatImgUrl() {
		return catImgUrl;
	}
	public void setCatImgUrl(String catImgUrl) {
		this.catImgUrl = catImgUrl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
