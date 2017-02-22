
package com.example.hoang.dribber.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("hidpi")
    @Expose
    private String hidpi;
    @SerializedName("normal")
    @Expose
    private String normal;
    @SerializedName("teaser")
    @Expose
    private String teaser;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Images() {
    }

    /**
     * 
     * @param teaser
     * @param normal
     * @param hidpi
     */
    public Images(String hidpi, String normal, String teaser) {
        super();
        this.hidpi = hidpi;
        this.normal = normal;
        this.teaser = teaser;
    }

    public String getHidpi() {
        return hidpi;
    }

    public void setHidpi(String hidpi) {
        this.hidpi = hidpi;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }



}
