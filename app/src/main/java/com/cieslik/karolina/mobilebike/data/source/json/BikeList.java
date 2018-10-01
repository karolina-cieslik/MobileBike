
package com.cieslik.karolina.mobilebike.data.source.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BikeList {

    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("bike_type")
    @Expose
    private Integer bikeType;
    @SerializedName("lock_types")
    @Expose
    private List<String> lockTypes = null;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("electric_lock")
    @Expose
    private Boolean electricLock;
    @SerializedName("boardcomputer")
    @Expose
    private Integer boardcomputer;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getBikeType() {
        return bikeType;
    }

    public void setBikeType(Integer bikeType) {
        this.bikeType = bikeType;
    }

    public List<String> getLockTypes() {
        return lockTypes;
    }

    public void setLockTypes(List<String> lockTypes) {
        this.lockTypes = lockTypes;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getElectricLock() {
        return electricLock;
    }

    public void setElectricLock(Boolean electricLock) {
        this.electricLock = electricLock;
    }

    public Integer getBoardcomputer() {
        return boardcomputer;
    }

    public void setBoardcomputer(Integer boardcomputer) {
        this.boardcomputer = boardcomputer;
    }

}
