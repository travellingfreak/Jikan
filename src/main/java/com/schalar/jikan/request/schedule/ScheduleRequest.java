package com.schalar.jikan.request.schedule;

import com.schalar.jikan.request.Request;

public class ScheduleRequest implements Request {

    @Override
    public String getPath() {
        return "/schedule";
    }

}
