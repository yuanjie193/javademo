package com.textdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BServlet",value = "/b")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = this.getServletConfig().getServletContext();
        String realPath = sc.getRealPath("com/textdemo/a.txt");
        System.out.println(realPath);
        Object key = sc.getAttribute("key");
        System.out.println(key);
        Object money = sc.getAttribute("money");
        System.out.println(money);

    }
}
