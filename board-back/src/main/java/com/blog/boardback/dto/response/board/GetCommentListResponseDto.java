package com.blog.boardback.dto.response.board;

import com.blog.boardback.common.ResponseCode;
import com.blog.boardback.common.ResponseMessage;
import com.blog.boardback.dto.object.CommentListItem;
import com.blog.boardback.dto.response.ResponseDto;
import com.blog.boardback.repository.resultSet.GetCommentListResultSet;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Getter
public class GetCommentListResponseDto extends ResponseDto {

  private List<CommentListItem> commentList;

  private GetCommentListResponseDto(List<GetCommentListResultSet> resultSets) {
    super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    this.commentList = CommentListItem.copyList(resultSets);
  }
  public static ResponseEntity<GetCommentListResponseDto> success(List<GetCommentListResultSet> resultSets){
    GetCommentListResponseDto result = new GetCommentListResponseDto(resultSets);
    return ResponseEntity.status(HttpStatus.OK).body(result);
  }
  public static ResponseEntity<ResponseDto> noExistBoard() {
    ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_BOARD, ResponseMessage.NOT_EXISTED_BOARD);
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
  }
}
