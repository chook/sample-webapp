package com.takipi.samplewebapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="DefaultServlet", urlPatterns = {"/default"})
public class DefaultServlet extends HttpServlet
{
	private static final long serialVersionUID = 1783180595547024108L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.getWriter().write("Good job");
	}
}
