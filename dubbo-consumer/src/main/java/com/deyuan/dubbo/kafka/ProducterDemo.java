package com.deyuan.dubbo.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class ProducterDemo {

    public static void main(String[] args) {
        Properties props=new Properties();
        props.put("bootstrap.servers", "http://172.16.152.202:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        for (int j = 0; j < 200; j++)
            producer.send(new ProducerRecord<String, String>("testyang2", "key:"+String.valueOf(j), "value:"+String.valueOf(j)));

        producer.close();

    }
}

