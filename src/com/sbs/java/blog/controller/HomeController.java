package com.sbs.java.blog.controller;
import java.sql.Connection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends Controller {
	public HomeController(Connection dbConn, String actionMethodName, HttpServletRequest req,HttpServletResponse resp) {
		super(dbConn, actionMethodName, req, resp);
	}

	public String doAction() {
		switch (actionMethodName) {
		case "main":
			return doActionMain();
		case "aboutMe":
			return doActionAboutMe();
		}

		return "";
	}

	private String doActionAboutMe() {
		return "home/aboutMe.jsp";
	}

	private String doActionMain() {
		return "home/main.jsp";
	}
}