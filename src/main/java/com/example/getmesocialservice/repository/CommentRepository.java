package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {

    List<Comment> commentList = new ArrayList();

    public Comment getComment(){
        Comment comment = new Comment(0,0,"Sample Message","Sample Creator","2021");
        return comment;
    }

    public Comment saveComment(Comment comment) {
        comment.setId(commentList.size() +1);
        commentList.add(comment);
        return comment;
    }

    public List<Comment> getAllComments() {
        return commentList;
    }

    public Comment getCommentById(int id) {
        for( Comment comment: commentList){
            if(comment.getId() == id){
                return comment;
            }
        }
        return null;
    }

    public Comment deleteComment(int id) {
        Comment deletedComment = null;

        for(Comment c:commentList){
            if(c.getId() == id){
                deletedComment = c;
                commentList.remove(c);
                return deletedComment;
            }
        }
        return deletedComment;
    }
}
