package com.example.lr_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Player;
import service.PlayerService;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "playersServlet", value = "/players-servlet")
public class PlayersServlet extends HttpServlet {

    PlayerService ps = new PlayerService();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List <Player> playerList = null;
        try {
            playerList = ps.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("playersList", playerList);
        request.getRequestDispatcher("/playersJSP.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
