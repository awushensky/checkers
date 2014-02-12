package edu.unlv.sudo.checkers.model;

/**
 * Represents a location on the board.
 */
public class Location {

    private int x;
    private int y;

    public Location(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isBetween(final Location location1, final Location location2) {
        final int greaterX = Math.max(location1.getX(), location2.getX());
        final int greaterY = Math.max(location1.getY(), location2.getY());
        final int lesserX = Math.min(location1.getX(), location2.getX());
        final int lesserY = Math.min(location1.getY(), location2.getY());

        return this.x == lesserX + 1
                && this.x == greaterX - 1
                && this.y == lesserY + 1
                && this.y == greaterY - 1;
    }
}