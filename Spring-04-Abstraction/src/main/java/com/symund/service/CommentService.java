package com.symund.service;

import com.symund.model.Comment;
import com.symund.proxy.CommentNotificationProxy;
import com.symund.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentNotificationProxy commentNotificationProxy;
    private final CommentRepository commentRepository;

    public CommentService(CommentNotificationProxy commentNotificationProxy, CommentRepository commentRepository) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
