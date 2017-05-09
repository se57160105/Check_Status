package com.example.teerawat.check_status3.StatusService.StatusDAO;

import android.telecom.Call;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by User on 22/4/2560.
 */

public class StatusDAO {
    @SerializedName("details")
    public Call.Details details;

    @SerializedName("graphData")
    public ArrayList<GraphData> graphData;
}

