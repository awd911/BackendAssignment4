package com.example.getmesocialservice.resource;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @GetMapping("/comment")
    public Comment getComment(){
        return commentService.getComment();
    }

    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/comments/{id}")
    public Comment getCommentById(@PathVariable("id") int id){
        return commentService.getCommentById(id);
    }

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody @Valid Comment comment){
        return commentService.saveComment(comment);
    }

    @DeleteMapping("/comment")
    public Comment deleteComment(@RequestParam(name ="id") int id){
        return commentService.deleteComment(id);
    }
}
