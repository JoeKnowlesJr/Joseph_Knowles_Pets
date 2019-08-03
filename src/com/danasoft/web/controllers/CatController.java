package com.danasoft.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.danasoft.web.models.Cat;

/**
 * Servlet implementation class CatController
 */
@WebServlet("/CatController")
public class CatController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String name = request.getParameter("name");
        String breed = request.getParameter("breed");
        int weight = Integer.parseInt(request.getParameter("weight"));
        Cat cat = new Cat(name, breed, weight);
        request.setAttribute("cat", cat);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/ShowCat.jsp");
        view.forward(request, response);
	}

}
