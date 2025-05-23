public class Player {
    private int id;
    private String nickname;
    private boolean isOnline;

    public Player(int id, boolean isOnline, String nickname) {
        this.id = id;
        this.isOnline = isOnline;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }

    
}
