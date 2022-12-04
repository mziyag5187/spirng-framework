package com.symund;

import com.symund.model.Comment;
import com.symund.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SymundApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(SymundApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);
        cs.publishComment(comment);
    }

}
