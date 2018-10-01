
package com.cieslik.karolina.mobilebike.data.source.json;

import com.example.Place;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City
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
    @SerializedName("zoom")
    @Expose
    private Integer zoom;
    @SerializedName("maps_icon")
    @Expose
    private String mapsIcon;
    @SerializedName("alias")
    @Expose
    private String alias;
    @SerializedName("break")
    @Expose
    private Boolean _break;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("num_places")
    @Expose
    private Integer numPlaces;
    @SerializedName("refresh_rate")
    @Expose
    private String refreshRate;
    @SerializedName("bounds")
    @Expose
    private Bounds bounds;
    @SerializedName("booked_bikes")
    @Expose
    private Integer bookedBikes;
    @SerializedName("set_point_bikes")
    @Expose
    private Integer setPointBikes;
    @SerializedName("available_bikes")
    @Expose
    private Integer availableBikes;
    @SerializedName("return_to_official_only")
    @Expose
    private Boolean returnToOfficialOnly;
    @SerializedName("bike_types")
    @Expose
    private BikeTypes bikeTypes;
    @SerializedName("places")
    @Expose
    private List<Place> places = null;

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

    public Integer getZoom()
    {
        return zoom;
    }

    public void setZoom(Integer zoom)
    {
        this.zoom = zoom;
    }

    public String getMapsIcon()
    {
        return mapsIcon;
    }

    public void setMapsIcon(String mapsIcon)
    {
        this.mapsIcon = mapsIcon;
    }

    public String getAlias()
    {
        return alias;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public Boolean getBreak()
    {
        return _break;
    }

    public void setBreak(Boolean _break)
    {
        this._break = _break;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getNumPlaces()
    {
        return numPlaces;
    }

    public void setNumPlaces(Integer numPlaces)
    {
        this.numPlaces = numPlaces;
    }

    public String getRefreshRate()
    {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate)
    {
        this.refreshRate = refreshRate;
    }

    public Bounds getBounds()
    {
        return bounds;
    }

    public void setBounds(Bounds bounds)
    {
        this.bounds = bounds;
    }

    public Integer getBookedBikes()
    {
        return bookedBikes;
    }

    public void setBookedBikes(Integer bookedBikes)
    {
        this.bookedBikes = bookedBikes;
    }

    public Integer getSetPointBikes()
    {
        return setPointBikes;
    }

    public void setSetPointBikes(Integer setPointBikes)
    {
        this.setPointBikes = setPointBikes;
    }

    public Integer getAvailableBikes()
    {
        return availableBikes;
    }

    public void setAvailableBikes(Integer availableBikes)
    {
        this.availableBikes = availableBikes;
    }

    public Boolean getReturnToOfficialOnly()
    {
        return returnToOfficialOnly;
    }

    public void setReturnToOfficialOnly(Boolean returnToOfficialOnly)
    {
        this.returnToOfficialOnly = returnToOfficialOnly;
    }

    public BikeTypes getBikeTypes()
    {
        return bikeTypes;
    }

    public void setBikeTypes(BikeTypes bikeTypes)
    {
        this.bikeTypes = bikeTypes;
    }

    public List<Place> getPlaces()
    {
        return places;
    }

    public void setPlaces(List<Place> places)
    {
        this.places = places;
    }

}
