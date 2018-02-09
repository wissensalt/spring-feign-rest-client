package com.zisal.springfeignrestclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class SysDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -5894988873506066460L;

    @JsonProperty("type")
    private Integer type;

    @JsonProperty("id")
    private Double id;

    @JsonProperty("message")
    private Double message;

    @JsonProperty("country")
    private String country;

    @JsonProperty("sunrise")
    private Double sunrise;

    @JsonProperty("sunset")
    private Double sunset;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getSunrise() {
        return sunrise;
    }

    public void setSunrise(Double sunrise) {
        this.sunrise = sunrise;
    }

    public Double getSunset() {
        return sunset;
    }

    public void setSunset(Double sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "SysDTO{" +
                "type=" + type +
                ", id=" + id +
                ", message=" + message +
                ", country='" + country + '\'' +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
}
