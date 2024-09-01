package com.sparta.board7.controoler;

import com.sparta.board7.dto.CommentResponseDto;
import com.sparta.board7.dto.CommentSaveRequestDto;
import com.sparta.board7.dto.CommentSaveResponseDto;
import com.sparta.board7.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/boards/{boardId}/comments")
    public CommentSaveResponseDto saveComment(@PathVariable Long boardId, @RequestBody CommentSaveRequestDto commentSaveRequestDto) {
        return commentService.saveComment(boardId, commentSaveRequestDto);
    }

    @GetMapping("/boards/comments")
    public List<CommentResponseDto> getComments() {
        return commentService.getComments();
    }
}
