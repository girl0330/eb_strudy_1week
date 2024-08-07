package com.study.servletBoardProject.board;

import com.study.servletBoardProject.dto.BoardDTO;

import java.util.List;

public interface BoardMapper {
    List<BoardDTO> selectList();
}
