package com.zisal.springfeignrestclient.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class CheckWeatherResponseDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 3100960978631837349L;

    @JsonProperty("coord")
    private CoordinateDTO coordinate;

    @JsonProperty("weather")
    private List<WeatherContentDTO> weatherContent;

    @JsonProperty("base")
    private String base;

    @JsonProperty("main")
    private MainDTO main;

    @JsonProperty("visibility")
    private Double visibility;

    @JsonProperty("wind")
    private WindDTO wind;

    @JsonProperty("clouds")
    private CloudsDTO clouds;

    @JsonProperty("dt")
    private Double dt;

    @JsonProperty("sys")
    private SysDTO sys;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty(value = "name", defaultValue = "as")
    private String name;

    @JsonProperty("cod")
    private String cod;

    public CoordinateDTO getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(CoordinateDTO coordinate) {
        this.coordinate = coordinate;
    }

    public List<WeatherContentDTO> getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(List<WeatherContentDTO> weatherContent) {
        this.weatherContent = weatherContent;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainDTO getMain() {
        return main;
    }

    public void setMain(MainDTO main) {
        this.main = main;
    }

    public Double getVisibility() {
        return visibility;
    }

    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    public WindDTO getWind() {
        return wind;
    }

    public void setWind(WindDTO wind) {
        this.wind = wind;
    }

    public CloudsDTO getClouds() {
        return clouds;
    }

    public void setClouds(CloudsDTO clouds) {
        this.clouds = clouds;
    }

    public Double getDt() {
        return dt;
    }

    public void setDt(Double dt) {
        this.dt = dt;
    }

    public SysDTO getSys() {
        return sys;
    }

    public void setSys(SysDTO sys) {
        this.sys = sys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        String weatherContentData = "";

        for (WeatherContentDTO weatherContentDTO : weatherContent) {
            weatherContentData += weatherContentDTO.toString();
        }

        return "CheckWeatherResponseDTO{" +
                "coordinate=" + coordinate.toString() +
                ", weatherContent=" + weatherContentData +
                ", base='" + base + '\'' +
                ", main=" + main.toString() +
                ", visibility=" + visibility +
                ", wind=" + wind.toString() +
                ", clouds=" + clouds.toString() +
                ", dt=" + dt +
                ", sys=" + sys.toString() +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod='" + cod + '\'' +
                '}';
    }
}