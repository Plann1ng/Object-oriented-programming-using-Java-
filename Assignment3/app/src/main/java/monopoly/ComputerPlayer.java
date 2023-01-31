package monopoly;
/**
 * Computer player if user decides to add bots as well.
 */

public class ComputerPlayer extends Player {
  /**
   * Computer Player, iterating over the board by itself and buys if funds available.
   * @param startTile Does configures the bot to the start tile taken from the Abstract class player
   * @param name Bot name, basically it is "Bot" + number if bot players given by the user
   * @param ui Interface to print movement within the game (nothing changed), facing difficulties
   *     only while printing the movement of Bots since there is no user choice for buy or
   *     roll so it does iterates over all of them and prints all in one go, but if you check a little up
   *     on the terminal, it is visible that the rest of the bots' movements are also checked,
   *     just printing does not happen by the best way possible. It prints all blocks at once, however
   *     all movement of the bots are tracked and encapsulated.
   */
  public ComputerPlayer(Tile startTile, String name, ConsoleUi ui) {
    super(startTile, name, ui);
  }

  @Override
    public boolean yourTurn(Dice d1, Dice d2) {
    if (getFunds() >= 300) {
      buyCurrentTile();
    }
    d1.roll();
    d2.roll();
    final int steps1 = d1.getValue();
    final int steps2 = d2.getValue();
    ui.playerMoves(getName(), steps1, steps2);
    move(steps1 + steps2);
    return true;
  }
}