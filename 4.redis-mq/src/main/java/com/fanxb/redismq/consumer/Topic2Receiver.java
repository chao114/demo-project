package com.fanxb.redismq.consumer;

import com.fanxb.redismq.annotation.MqConsumer;
import com.fanxb.redismq.entity.RedisConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA
 * Created By Fxb
 * Date: 4/15/20
 * Time: 4:10 AM
 */
@MqConsumer(topic = "topic2")
class Topic2Receiver implements RedisConsumer {
    private static final Logger log = LoggerFactory.getLogger(Topic2Receiver.class);

    @Override
    public void deal(String message) {
        log.info("topic2收到信息:" + message);
    }
}
