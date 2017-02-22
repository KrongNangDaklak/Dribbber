
package com.example.hoang.dribber.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("web")
    @Expose
    private String web;
    @SerializedName("twitter")
    @Expose
    private String twitter;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    /**
     * 
     * @param twitter
     * @param web
     */
    public Links(String web, String twitter) {
        super();
        this.web = web;
        this.twitter = twitter;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }


}
