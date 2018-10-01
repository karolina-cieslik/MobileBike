
package com.cieslik.karolina.mobilebike.data.source.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bounds {

    @SerializedName("south_west")
    @Expose
    private SouthWest southWest;
    @SerializedName("north_east")
    @Expose
    private NorthEast northEast;

    public SouthWest getSouthWest() {
        return southWest;
    }

    public void setSouthWest(SouthWest southWest) {
        this.southWest = southWest;
    }

    public NorthEast getNorthEast() {
        return northEast;
    }

    public void setNorthEast(NorthEast northEast) {
        this.northEast = northEast;
    }

}
