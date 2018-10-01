
package com.cieslik.karolina.mobilebike.data.source.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Country
{

    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("zoom")
    @Expose
    private Integer zoom;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hotline")
    @Expose
    private String hotline;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("country_calling_code")
    @Expose
    private String countryCallingCode;
    @SerializedName("system_operator_address")
    @Expose
    private String systemOperatorAddress;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("terms")
    @Expose
    private String terms;
    @SerializedName("policy")
    @Expose
    private String policy;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("show_bike_types")
    @Expose
    private Boolean showBikeTypes;
    @SerializedName("show_bike_type_groups")
    @Expose
    private Boolean showBikeTypeGroups;
    @SerializedName("show_free_racks")
    @Expose
    private Boolean showFreeRacks;
    @SerializedName("booked_bikes")
    @Expose
    private Integer bookedBikes;
    @SerializedName("set_point_bikes")
    @Expose
    private Integer setPointBikes;
    @SerializedName("available_bikes")
    @Expose
    private Integer availableBikes;
    @SerializedName("capped_available_bikes")
    @Expose
    private Boolean cappedAvailableBikes;
    @SerializedName("pricing")
    @Expose
    private String pricing;
    @SerializedName("cities")
    @Expose
    private List<City> cities = null;

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

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getHotline()
    {
        return hotline;
    }

    public void setHotline(String hotline)
    {
        this.hotline = hotline;
    }

    public String getDomain()
    {
        return domain;
    }

    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getCountryCallingCode()
    {
        return countryCallingCode;
    }

    public void setCountryCallingCode(String countryCallingCode)
    {
        this.countryCallingCode = countryCallingCode;
    }

    public String getSystemOperatorAddress()
    {
        return systemOperatorAddress;
    }

    public void setSystemOperatorAddress(String systemOperatorAddress)
    {
        this.systemOperatorAddress = systemOperatorAddress;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public String getTerms()
    {
        return terms;
    }

    public void setTerms(String terms)
    {
        this.terms = terms;
    }

    public String getPolicy()
    {
        return policy;
    }

    public void setPolicy(String policy)
    {
        this.policy = policy;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Boolean getShowBikeTypes()
    {
        return showBikeTypes;
    }

    public void setShowBikeTypes(Boolean showBikeTypes)
    {
        this.showBikeTypes = showBikeTypes;
    }

    public Boolean getShowBikeTypeGroups()
    {
        return showBikeTypeGroups;
    }

    public void setShowBikeTypeGroups(Boolean showBikeTypeGroups)
    {
        this.showBikeTypeGroups = showBikeTypeGroups;
    }

    public Boolean getShowFreeRacks()
    {
        return showFreeRacks;
    }

    public void setShowFreeRacks(Boolean showFreeRacks)
    {
        this.showFreeRacks = showFreeRacks;
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

    public Boolean getCappedAvailableBikes()
    {
        return cappedAvailableBikes;
    }

    public void setCappedAvailableBikes(Boolean cappedAvailableBikes)
    {
        this.cappedAvailableBikes = cappedAvailableBikes;
    }

    public String getPricing()
    {
        return pricing;
    }

    public void setPricing(String pricing)
    {
        this.pricing = pricing;
    }

    public List<City> getCities()
    {
        return cities;
    }

    public void setCities(List<City> cities)
    {
        this.cities = cities;
    }

}
