package com.cos.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
// javax로 시작하는 패키지는 톰켓이 들고 있는 라이브러리
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {

	// req와 res는 톰켓이 만들어줍니다. (클라이언트의 요청이 있을 때 마다)
	// req는 BufferedReader 할 수 있는 ByteStream
	// res는 BufferedWriter 할 수 있는 ByteStream

	// http://localhost:8000/hello/front

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);

	}

	// post요청은 FORM태그 만들고 요청 = INSERT, DELETE, UPDATE
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		System.out.println("comment post 요청");
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserController 실행됨");

		String gubun = request.getParameter("gubun"); // /hello/front
		System.out.println(gubun);

		if (gubun.equals("login")) {
			response.sendRedirect("auth/login.jsp");
		} else if (gubun.equals("join")) {
			response.sendRedirect("auth/join.jsp");
		} else if (gubun.equals("selectOne")) {
			response.sendRedirect("user/selectOne.jsp");
		} else if (gubun.equals("updateOne")) {
			response.sendRedirect("user/updateOne.jsp");
		}
	}
}
