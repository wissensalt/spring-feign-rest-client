package com.zisal.springfeignrestclient.dto;

import java.io.Serializable;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class CoordinateDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 8337463828452098380L;

    private Double lon;
    private Double lat;

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "CoordinateDTO{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }
}
