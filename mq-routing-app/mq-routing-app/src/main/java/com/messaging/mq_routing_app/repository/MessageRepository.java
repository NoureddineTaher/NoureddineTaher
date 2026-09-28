package com.messaging.mq_routing_app;


import com.messaging.mq_routing_app.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}