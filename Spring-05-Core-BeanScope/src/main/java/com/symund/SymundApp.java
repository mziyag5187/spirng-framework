package com.symund;

import com.symund.config.ProjectConfig;
import com.symund.model.Comment;
import com.symund.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SymundApp {
    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

/*      CommentService cs1 = context.getBean(CommentService.class);
        CommentService cs2 = context.getBean(CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);// they are the same objects*/



    }
}
