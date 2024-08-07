package com.study.servletBoardProject.board;

import com.study.servletBoardProject.dto.BoardDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> getList();
}
