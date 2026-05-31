package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.youtube.service.CommentService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedCommentController;

@RestController
@RequestMapping("/api")
public class CommentController extends GeneratedCommentController {

    public CommentController(CommentService commentService) {
        super(commentService);
    }
}

