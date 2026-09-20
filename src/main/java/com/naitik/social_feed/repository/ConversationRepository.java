package com.naitik.social_feed.repository;

import com.naitik.social_feed.model.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {

}
