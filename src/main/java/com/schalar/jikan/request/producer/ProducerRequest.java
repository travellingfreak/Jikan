package com.schalar.jikan.request.producer;

import com.schalar.jikan.request.Request;

public class ProducerRequest implements Request {

    private final Integer id;

    private final Integer page;

    public ProducerRequest(Integer id) {
        this(id, 1);
    }

    public ProducerRequest(Integer id, Integer page) {
        this.id = id;
        this.page = page;
    }

    @Override
    public String getPath() {
        return String.format("/producer/%s/%s", this.id, this.page);
    }

}
