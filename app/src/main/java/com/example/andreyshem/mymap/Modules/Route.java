package com.example.andreyshem.mymap.Modules;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.nearby.messages.Distance;

import java.util.List;

import javax.xml.datatype.Duration;

/**
 * Created by andreyshem on 17.09.2016.
 */
public class Route {
    public com.example.andreyshem.mymap.Modules.Distance distance;
    public com.example.andreyshem.mymap.Modules.Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;

    public List<LatLng> points;

}
