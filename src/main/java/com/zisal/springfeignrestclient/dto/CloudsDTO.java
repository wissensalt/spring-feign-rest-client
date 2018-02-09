package com.zisal.springfeignrestclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class CloudsDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 7505229794055300890L;

    @JsonProperty("all")
    private Double all;

    public Double getAll() {
        return all;
    }

    public void setAll(Double all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "CloudsDTO{" +
                "all=" + all +
                '}';
    }
}
