package models;

import jakarta.persistence.*;


@Entity
public class Player {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_player;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @ManyToOne(targetEntity = Team.class, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_team")
    private int fk_id_team;

    public long getId_player() {
        return id_player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id_player=" + id_player +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", fk_id_team=" + fk_id_team +
                '}';
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getFk_id_team() {
        return fk_id_team;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFk_id_team(int fk_id_team) {
        this.fk_id_team = fk_id_team;
    }
}
