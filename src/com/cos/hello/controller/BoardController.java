package com.cos.hello.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet{

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
		System.out.println("comment process 요청");
		String gubun = request.getParameter("gubun"); // /hello/front
		System.out.println(gubun);
		if(gubun.equals("deleteOne")) {
			response.sendRedirect("board/deleteOne.jsp");
		} else if(gubun.equals("insertOne")) {
			response.sendRedirect("board/insertOne.jsp");
		} else if(gubun.equals("selectAll")) {
			response.sendRedirect("board/selectAll.jsp");
		} else if(gubun.equals("updateOne")) {
			response.sendRedirect("board/updateOne.jsp");
		}
	}
}
