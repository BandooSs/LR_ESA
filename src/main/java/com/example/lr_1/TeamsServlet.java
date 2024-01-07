package com.example.lr_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

@WebServlet(name = "teamsServlet", value = "/teams-servlet")
public class TeamsServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "All players:";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/teamsJSP.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
