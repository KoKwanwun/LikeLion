package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergencyRoom;
    private String name;
    private String subdivision;

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergencyRoom() {
        return emergencyRoom;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
