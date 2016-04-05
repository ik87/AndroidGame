package com.worldown.framework;

import com.worldown.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();
	public int getHeight();
	public ImageFormat getFormat();
	public void dispose();
}
