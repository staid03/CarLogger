package com.staid.applications.carlogger;

public class Vehicle {
    String vehicleName;
    String vehicleOwner;
    String licencePlate;
    String vehicleMake;
    String vehicleModel;
    String vehicleColour;
    int vehicleYearMade;
    String registrationExpiry;

//  TODO add checkbox for "active" or "inactive"

    public Vehicle(){}

    public Vehicle (String vehicleName, String vehicleOwner,
                    String licencePlate, String vehicleMake,
                    String vehicleModel, String vehicleColour,
                    int vehicleYearMade, String registrationExpiry
    ){
        this.vehicleName = vehicleName;
        this.vehicleOwner = vehicleOwner;
        this.licencePlate = licencePlate;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleColour = vehicleColour;
        this.vehicleYearMade = vehicleYearMade;
        this.registrationExpiry = registrationExpiry;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleColour() {
        return vehicleColour;
    }

    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }

    public int getVehicleYearMade() {
        return vehicleYearMade;
    }

    public void setVehicleYearMade(int vehicleYearMade) {
        this.vehicleYearMade = vehicleYearMade;
    }

    public String getRegistrationExpiry() {
        return registrationExpiry;
    }

    public void setRegistrationExpiry(String registrationExpiry) {
        this.registrationExpiry = registrationExpiry;
    }
}