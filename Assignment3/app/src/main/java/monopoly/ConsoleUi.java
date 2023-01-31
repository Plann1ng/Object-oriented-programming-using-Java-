package monopoly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Functionality to print the game state and player messages to the console,
 * also some console input helpers.
 */
public class ConsoleUi {
  StringBuffer messages = new StringBuffer();
  StringBuffer gameState = new StringBuffer();

  /**
   * Represents the actions a player can perform.
   */
  public enum Action {
    ROLL,
    BUY,
    None
  }

    /**
   * Adds a player movement message.
   */
  public void playerMoves(String name, int d1, int d2) {
    addMessage(name, " moves " + d1 + " + " + d2 + " steps");
  }

  /**
   * Adds a property bought message.
   */
  public void playerBuysProperty(String name, String propertyName) {
    addMessage(name, "bought " + propertyName);
  }

    /**
   * Adds a rent payment message.
   */
  public void playerPaysRentFor(String name, String propertyDesc, int rent) {
    addMessage(name, "Pays rent for: " + propertyDesc + "($" + rent + ")");
  }

  /**
   * Adds a funds deduced message.
   */
  public void playerFundsDeduced(String name, int cost) {
    addMessage(name, "funds deduced with " + cost);
  }

    /**
   * Adds an insufficient funds message for a player.
   */
  public void playerUnableToPay(String name, int cost) {
    addMessage(name, "not enough funds to pay " + cost);
  }

  /**
   * Adds a received funds message.
   */
  public void playerReceivedFunds(String name, int sum) {
    addMessage(name, "received $" + sum);
  }

    /**
   * Adds a joined message.
   */
  public void playerJoined(String name) {
    addMessage(name, "joined the game");
  }

  /**
   * Adds the whole game state to be drawn.
   */
  public void addGameState(Tile start, Iterable<Player> players) {
    Tile t = start;

    do {
      addTile(t, players);

      t = t.getNext();
    } while (t != start);
  }

    /**
   * Adds a game tile to the current game state.
   */
  private void addTile(Tile t, Iterable<Player> players) {
    StringBuffer tileStr = new StringBuffer();

    tileStr.append(addSpaces(30, t.toString()));

    for (Player p : players) {
      if (t.isOnTile(p)) {
        tileStr.append("\t");
        tileStr.append(getPlayerString(p));
      }
    }
    tileStr.append(System.lineSeparator());

    gameState.append(tileStr);
  }

  protected String getGameState() {
    return gameState.toString();
  }

  protected void clearGameState() {
    gameState = new StringBuffer();
  }

  private String addSpaces(int max, String str) {
    String ret = str;

    while (ret.length() < max) {
      ret = " " + ret;
    }

    return ret;
  }

  
  private void clearConsole() {
    for (int i = 0; i < 30; i++) {
      System.out.println();
    }
  }

  /**
   * Clears the console and prints the current game state and messages.
   * Finally clears the messages and game state.
   */
  public void printState() {
    clearConsole();

    System.out.println(getGameState());
    System.out.println(getMessages());
    clearMessages();
    clearGameState();
  }

