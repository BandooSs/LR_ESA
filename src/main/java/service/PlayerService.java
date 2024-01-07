package service;

import DAO.PlayerDAO;
import java.sql.Connection; // Используйте java.sql.Connection вместо com.sun.jdi.connect.spi.Connection
import models.DbUtils;
import models.Player;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerService extends DbUtils implements PlayerDAO {
    Connection connection = getConnection();

    @Override
    public List<Player> getAll() throws SQLException {
        List <Player> playerList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM public.player");
        while (resultSet.next()) {
            Player player = new Player();
            player.setLast_name(String.valueOf(resultSet.getInt("id_player")));
            player.setFirst_name(resultSet.getString("first_name"));
            player.setLast_name(resultSet.getString("last_name"));
            player.setFk_id_team(Integer.parseInt(String.valueOf(resultSet.getInt("fk_id_team"))));
            playerList.add(player);
        }
        return playerList; // Замените эту строку на реальный код
    }
}