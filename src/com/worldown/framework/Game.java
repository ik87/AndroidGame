package com.worldown.framework;

public interface Game {
	public Audio getAudio();
	public Input getInpute();
	public FileIO getFIleIO();
	public Graphics getGraphics();
	public void setScreen(Screen screen);
	public Screen getCurrentScreen();
	public Screen getInitScreen();
}
