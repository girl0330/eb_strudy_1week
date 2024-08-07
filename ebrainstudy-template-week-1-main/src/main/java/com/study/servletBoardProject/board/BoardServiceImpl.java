package com.study.servletBoardProject.board;

import com.study.servletBoardProject.dto.BoardDTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BoardServiceImpl implements BoardService{

    private final SqlSessionFactory sqlSessionFactory;

    // 생성자를 통해 SqlSessionFactory 주입
    public BoardServiceImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<BoardDTO> getList() {
        System.out.println("보드서비스 임플 확인 ");
        SqlSession session = sqlSessionFactory.openSession();
        BoardMapper boardMapper = session.getMapper(BoardMapper.class);
        return boardMapper.selectList();
    }

}
