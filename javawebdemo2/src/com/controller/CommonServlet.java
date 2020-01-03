package com.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "CommonServlet",value = "/hh")
public class CommonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         ServletConfig config = getServletConfig();
         String servletName =config.getServletName();
         System.out.println("ServletName:"+servletName);
         String address = config.getInitParameter("address");
         System.out.println("assress:"+address);

        Enumeration<String> names = config.getInitParameterNames();
    }
}
