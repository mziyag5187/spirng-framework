package com.symund.proxy;

import com.symund.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
