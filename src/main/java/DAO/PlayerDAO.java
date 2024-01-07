package DAO;

import models.Player;

import java.sql.SQLException;
import java.util.List;

public interface PlayerDAO {
    List<Player> getAll() throws SQLException;
}
