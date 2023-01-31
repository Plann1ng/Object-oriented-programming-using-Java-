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
