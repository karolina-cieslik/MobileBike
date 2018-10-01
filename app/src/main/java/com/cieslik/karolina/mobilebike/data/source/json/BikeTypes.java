
package com.cieslik.karolina.mobilebike.data.source.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BikeTypes {

    @SerializedName("undefined")
    @Expose
    private Integer undefined;
    @SerializedName("4")
    @Expose
    private Integer _4;
    @SerializedName("5")
    @Expose
    private Integer _5;
    @SerializedName("25")
    @Expose
    private Integer _25;
    @SerializedName("36")
    @Expose
    private Integer _36;
    @SerializedName("71")
    @Expose
    private Integer _71;

    public Integer getUndefined() {
        return undefined;
    }

    public void setUndefined(Integer undefined) {
        this.undefined = undefined;
    }

    public Integer get4() {
        return _4;
    }

    public void set4(Integer _4) {
        this._4 = _4;
    }

    public Integer get5() {
        return _5;
    }

    public void set5(Integer _5) {
        this._5 = _5;
    }

    public Integer get25() {
        return _25;
    }

    public void set25(Integer _25) {
        this._25 = _25;
    }

    public Integer get36() {
        return _36;
    }

    public void set36(Integer _36) {
        this._36 = _36;
    }

    public Integer get71() {
        return _71;
    }

    public void set71(Integer _71) {
        this._71 = _71;
    }

}
