package com.naitik.social_feed.controller;

import com.naitik.social_feed.model.Message;
import com.naitik.social_feed.repository.MessageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MessageController {

    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @PostMapping("/messages")
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        message.setTimestamp(LocalDateTime.now());  // set it right here, at creation time
        Message saved = messageRepository.save(message);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/conversations/{id}/messages")
    public List<Message> getMessagesForConversation(@PathVariable Long id) {
        return messageRepository.findByConversationId(id);
    }
}