package com.tgt.rysetii.learningresourcesapi.entity;

import java.time.LocalDate;

public class LearningResource {

	private Integer learningResourceId;
    private String productName;
    private Double costPrice;
    private Double sellingPrice;
    private LearningResourcesStatus learningResourceStatus;
    private LocalDate createdDate;
    private LocalDate publishedDate;
    private LocalDate retiredDate;
    
    
	public LearningResource(Integer learningResourceId, String productName, Double costPrice, Double sellingPrice,
			LearningResourcesStatus learningResourceStatus, LocalDate createdDate, LocalDate publishedDate,
			LocalDate retiredDate) {
		super();
		this.learningResourceId = learningResourceId;
		this.productName = productName;
		this.costPrice = costPrice;
		this.sellingPrice = sellingPrice;
		this.learningResourceStatus = learningResourceStatus;
		this.createdDate = createdDate;
		this.publishedDate = publishedDate;
		this.retiredDate = retiredDate;
	}
	public Integer getLearningResourceId() {
		return learningResourceId;
	}
	public void setLearningResourceId(Integer learningResourceId) {
		this.learningResourceId = learningResourceId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public Double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public LearningResourcesStatus getLearningResourceStatus() {
		return learningResourceStatus;
	}
	public void setLearningResourceStatus(LearningResourcesStatus learningResourceStatus) {
		this.learningResourceStatus = learningResourceStatus;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public LocalDate getRetiredDate() {
		return retiredDate;
	}
	public void setRetiredDate(LocalDate retiredDate) {
		this.retiredDate = retiredDate;
	}
	@Override
	public String toString() {
		return "LearningResource [learningResourceId=" + learningResourceId + ", productName=" + productName
				+ ", costPrice=" + costPrice + ", sellingPrice=" + sellingPrice + ", learningResourceStatus="
				+ learningResourceStatus + ", createdDate=" + createdDate + ", publishedDate=" + publishedDate
				+ ", retiredDate=" + retiredDate + "]";
	}
    
    
}
