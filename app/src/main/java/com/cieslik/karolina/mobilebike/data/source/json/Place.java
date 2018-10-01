
package com.cieslik.karolina.mobilebike.data.source.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Place
{

    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("bike")
    @Expose
    private Boolean bike;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("spot")
    @Expose
    private Boolean spot;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("bikes")
    @Expose
    private Integer bikes;
    @SerializedName("bike_racks")
    @Expose
    private Integer bikeRacks;
    @SerializedName("free_racks")
    @Expose
    private Integer freeRacks;
    @SerializedName("maintenance")
    @Expose
    private Boolean maintenance;
    @SerializedName("terminal_type")
    @Expose
    private String terminalType;
    @SerializedName("bike_list")
    @Expose
    private List<BikeList> bikeList = null;
    @SerializedName("bike_numbers")
    @Expose
    private List<String> bikeNumbers = null;
    @SerializedName("bike_types")
    @Expose
    private BikeTypes_ bikeTypes;
    @SerializedName("place_type")
    @Expose
    private String placeType;
    @SerializedName("rack_locks")
    @Expose
    private Boolean rackLocks;

    public Integer getUid()
    {
        return uid;
    }

    public void setUid(Integer uid)
    {
        this.uid = uid;
    }

    public Double getLat()
    {
        return lat;
    }

    public void setLat(Double lat)
    {
        this.lat = lat;
    }

    public Double getLng()
    {
        return lng;
    }

    public void setLng(Double lng)
    {
        this.lng = lng;
    }

    public Boolean getBike()
    {
        return bike;
    }

    public void setBike(Boolean bike)
    {
        this.bike = bike;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Object getAddress()
    {
        return address;
    }

    public void setAddress(Object address)
    {
        this.address = address;
    }

    public Boolean getSpot()
    {
        return spot;
    }

    public void setSpot(Boolean spot)
    {
        this.spot = spot;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    public Integer getBikes()
    {
        return bikes;
    }

    public void setBikes(Integer bikes)
    {
        this.bikes = bikes;
    }

    public Integer getBikeRacks()
    {
        return bikeRacks;
    }

    public void setBikeRacks(Integer bikeRacks)
    {
        this.bikeRacks = bikeRacks;
    }

    public Integer getFreeRacks()
    {
        return freeRacks;
    }

    public void setFreeRacks(Integer freeRacks)
    {
        this.freeRacks = freeRacks;
    }

    public Boolean getMaintenance()
    {
        return maintenance;
    }

    public void setMaintenance(Boolean maintenance)
    {
        this.maintenance = maintenance;
    }

    public String getTerminalType()
    {
        return terminalType;
    }

    public void setTerminalType(String terminalType)
    {
        this.terminalType = terminalType;
    }

    public List<BikeList> getBikeList()
    {
        return bikeList;
    }

    public void setBikeList(List<BikeList> bikeList)
    {
        this.bikeList = bikeList;
    }

    public List<String> getBikeNumbers()
    {
        return bikeNumbers;
    }

    public void setBikeNumbers(List<String> bikeNumbers)
    {
        this.bikeNumbers = bikeNumbers;
    }

    public BikeTypes_ getBikeTypes()
    {
        return bikeTypes;
    }

    public void setBikeTypes(BikeTypes_ bikeTypes)
    {
        this.bikeTypes = bikeTypes;
    }

    public String getPlaceType()
    {
        return placeType;
    }

    public void setPlaceType(String placeType)
    {
        this.placeType = placeType;
    }

    public Boolean getRackLocks()
    {
        return rackLocks;
    }

    public void setRackLocks(Boolean rackLocks)
    {
        this.rackLocks = rackLocks;
    }

}
