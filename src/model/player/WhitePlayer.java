package model.player;

public final class WhitePlayer implements Player {
  private static WhitePlayer instance;
  private String userName;

  private WhitePlayer() {
    this.userName = "Player2";
  }

  public static Player getInstance() {
    if (instance == null) {
      instance = new WhitePlayer();
    }
    return instance;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
