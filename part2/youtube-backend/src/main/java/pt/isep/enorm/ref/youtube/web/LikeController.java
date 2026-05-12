package pt.isep.enorm.ref.youtube.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.isep.enorm.ref.youtube.service.LikeService;
import pt.isep.enorm.ref.youtube.web.generated.GeneratedLikeController;

@RestController
@RequestMapping("/api")
public class LikeController extends GeneratedLikeController {

    public LikeController(LikeService likeService) {
        super(likeService);
    }
}

