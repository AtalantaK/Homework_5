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
        return "ID игрока: " + idPlayer + "\n" +
                "Nickname игрока: " + nicknamePlayer + "\n" +
                "Игрок онлайн: " + flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player obj = (Player) o;
        return (idPlayer == obj.idPlayer && nicknamePlayer.equals(obj.nicknamePlayer) && isOnlinePlayer == obj.isOnlinePlayer);
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(idPlayer);
    }

}
