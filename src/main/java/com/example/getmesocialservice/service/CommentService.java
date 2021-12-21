package com.example.getmesocialservice.service;

import com.example.getmesocialservice.model.Comment;
import com.example.getmesocialservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.saveComment(comment);

    }

    public Comment getComment() {
        return commentRepository.getComment();
    }

    public List<Comment> getAllComments() {
        return commentRepository.getAllComments();

    }

    public Comment getCommentById(int id) {
        return commentRepository.getCommentById(id);
    }

    public Comment deleteComment(int id) {
        return commentRepository.deleteComment(id);
    }
}
