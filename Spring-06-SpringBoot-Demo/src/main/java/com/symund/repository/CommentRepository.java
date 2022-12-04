package com.symund.repository;

import com.symund.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
