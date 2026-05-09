package pt.isep.enorm.ref.amazon.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.amazon.service.CommentReviewService;
import pt.isep.enorm.ref.amazon.web.generated.GeneratedCommentReviewController;

@RestController
@RequestMapping("/api/comments")
public class CommentReviewController extends GeneratedCommentReviewController {

    public CommentReviewController(CommentReviewService commentReviewService) {
        super(commentReviewService);
    }
}
