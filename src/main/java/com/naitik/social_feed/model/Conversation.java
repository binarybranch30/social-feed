package com.naitik.social_feed.model;

import jakarta.persistence.*;

@Entity
@Table(name = "conversations")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ConversationType type;

    public enum ConversationType {
        ONE_ON_ONE,
        GROUP
    }

    // getters and setters — generate via IntelliJ (right-click → Generate → Getter and Setter)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public ConversationType getType() { return type; }
    public void setType(ConversationType type) { this.type = type; }
}