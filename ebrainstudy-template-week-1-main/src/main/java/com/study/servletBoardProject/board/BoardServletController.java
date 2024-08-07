package com.study.servletBoardProject.board;

import com.study.servletBoardProject.dto.BoardDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

@WebServlet("/board/list")
public class BoardServletController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private BoardService boardService;

    @Override
    public void init() throws ServletException {
        try {
            // MyBatis 설정 파일을 읽어들여 SqlSessionFactory 생성
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            // ServiceImpl 인스턴스 생성
            boardService = new BoardServiceImpl(sqlSessionFactory);
        } catch (IOException e) {
            throw new ServletException("MyBatis configuration failed", e);
        }
    }

    @Override //TODO : 같은 패키지의 클래스와 상속받은 서브클래스에서 접근가능 다른 페키지에서 접근 불가
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet 호출 완료");

        //최종적으로 DB에 있던 list값이 boardList에 전달됨.
        List<BoardDTO> boardList = boardService.getList();

        System.out.println("리스트 :: "+boardList);

        //HttpSErvletRequest request에 속성값을 지정해준다.
        request.setAttribute("boardList", boardList);

        //JSP로 forward해주면 끝
        request.getRequestDispatcher("/WEB-INF/jsp/board/list.jsp").forward(request, response);
    }

}
