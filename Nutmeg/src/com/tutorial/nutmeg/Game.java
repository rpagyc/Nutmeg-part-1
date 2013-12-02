package com.tutorial.nutmeg;

import org.flixel.FlxGame;

public class Game extends FlxGame
{
	public Game()
	{
		super(320, 240, PlayState.class, 2, 50, 50, false);
	}
}
