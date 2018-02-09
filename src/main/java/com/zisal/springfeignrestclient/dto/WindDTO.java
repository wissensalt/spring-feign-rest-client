package com.zisal.springfeignrestclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class WindDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 4172363392522298292L;

    @JsonProperty("speed")
    private Double speed;

    @JsonProperty("deg")
    private Double degree;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDegree() {
        return degree;
    }

    public void setDegree(Double degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "WindDTO{" +
                "speed=" + speed +
                ", degree=" + degree +
                '}';
    }
}
