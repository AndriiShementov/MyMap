package com.example.andreyshem.mymap.Modules;

import java.util.List;

/**
 * Created by andreyshem on 17.09.2016.
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
