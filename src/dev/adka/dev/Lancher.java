package dev.adka.dev;
import dev.adka.dev.Game;


public class Lancher {
	public static void main (String[] args){
		Game game = new Game("Title",450,450);
		game.start();
	}
}