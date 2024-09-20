package com.spartacoding.msa.order;

public enum OrderTopic {
    // TODO topic이 많아지면 enum으로 관리하기도 합니다
    SAMPLE("sample-event");

    private final String topic;

    OrderTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }
}
