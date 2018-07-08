package com.thoughtmechanix.licenses.models;

public class License {
    private String id;
    private String productName;
    private String licenseType;
    private String organizationId;

    public License() {
    }

    public License(String id, String productName, String licenseType, String organizationId) {
        this.id = id;
        this.productName = productName;
        this.licenseType = licenseType;
        this.organizationId = organizationId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
