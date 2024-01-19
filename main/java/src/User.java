public class User {
    private String username;
    private String password;
    private boolean voted;

    public User(String username, String password, boolean voted) {
        this.username = username;
        this.password = password;
        this.voted = voted;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean hasVoted() {
        return voted;
    }

    public void setVoted(boolean voted) {
        this.voted = voted;
    }

    @Override
    public String toString() {
        return "Username: " + username +  "Password: " + password + "Voted: " + voted;
    }

}
