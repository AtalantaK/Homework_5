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

    public String toString() {
        String flag;
        if (isOnlinePlayer) flag = "Да";
        else flag = "Нет";
        return "ID игрока: " + idPlayer + "\n" +
                "Nickname игрока: " + nicknamePlayer + "\n" +
                "Игрок онлайн: " + flag;
    }

    // Два игрока равны если у них одинаковые nickName
    public boolean equals(Player player) {
        return this.nicknamePlayer.equals(player.nicknamePlayer);
    }

    public int hashCode() {
        //todo: написать код
        return 0;
    }

}
