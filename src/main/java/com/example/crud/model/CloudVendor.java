package com.example.crud.model;

public class CloudVendor {
    private String VendorId  ;
    private String VendorName ;
    private String VendorAddress ;
    private String VendorPhoneNumber ;
    public CloudVendor() {
    }
    public CloudVendor(String VendorId, String VendorName, String VendorAddress, String VendorPhoneNumber) {
        this.VendorId = VendorId;
        this.VendorName = VendorName;
        this.VendorAddress = VendorAddress;
        this.VendorPhoneNumber = VendorPhoneNumber;
    }

    public String getVendorId() {
        return VendorId;
    }

    public void setVendorId(String vendorId) {
        VendorId = vendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        VendorPhoneNumber = vendorPhoneNumber;
    }
}
