package com.sagar.rest.response;

import java.util.Collections;
import java.util.List;

public class PlaceDetailsResponseData {

    public String icon;
    public String name;
    public String place_id;
    public float rating;
    public String vicinity;
    public GeometryResponseData geometry;
    public List<PhotoResponseData> photos;
    public String formatted_address;
    public String formatted_phone_number;

    PlaceDetailsResponseData() {
        icon = "";
        name = "";
        place_id = "";
        rating = 0;
        vicinity = "";
        photos = Collections.emptyList();
        formatted_address = "";
        formatted_phone_number = "";
        geometry = new GeometryResponseData();
    }

}
