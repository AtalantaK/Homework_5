package Task_1_2_4_5;

import java.util.Objects;

public class Player {
    private int idPlayer;
    private String nicknamePlayer;
    private boolean isOnlinePlayer;

    public Player(int id, boolean isOnline, String nickname) {
        this.idPlayer = id;
        this.isOnlinePlayer = isOnline;
        this.nicknamePlayer = nickname;
    }

    public int getIdPlayer() {
        return idPlayer;
    }

    public String getNicknamePlayer() {
        return nicknamePlayer;
    }

    public boolean isOnlinePlayer() {
        return isOnlinePlayer;
    }

    @Override
    public String toString() {
        String flag = "Нет";
        if (isOnlinePlayer) flag = "Да";
        return "ID игрока: " + idPlayer + ", " +
                "Nickname игрока: " + nicknamePlayer + ", " +
                "Игрок онлайн: " + flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player obj = (Player) o;
        return (idPlayer == obj.idPlayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlayer);
    }

}
