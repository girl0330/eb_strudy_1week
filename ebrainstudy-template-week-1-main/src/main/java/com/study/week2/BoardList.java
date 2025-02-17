package com.study.week2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class BoardList extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void a(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doGet 호출 완료");
        request.getRequestDispatcher("/board/list.jsp").forward(request, response);
    }

    protected void b(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
