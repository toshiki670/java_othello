package model.dto;

import model.player.Player;

public final class History implements Cloneable, Comparable<History> {

  private Player player;

  private Board board;

  public History(Player player, Board board) {
    this.player = player;

  }


  public Player getPlayer() {
    return player;
  }


  public void setPlayer(Player player) {
    this.player = player;
  }


  public Board getBoard() {
    return board;
  }


  public void setBoard(Board board) {
    this.board = board;
  }


  @Override
  protected History clone() throws CloneNotSupportedException {
    return new History(player, board.clone());
  }


  @Override
  public int compareTo(History arg0) {
    // TODO Auto-generated method stub
    return 0;
  }
}
