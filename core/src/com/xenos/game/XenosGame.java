package com.xenos.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class XenosGame extends ApplicationAdapter {
	public SpriteBatch batch;
	public Texture img;
	private Sprite sprite;
	private int rotation = 1;
	private int colour = 0;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture(Gdx.files.internal("logo.png"));
		sprite = new Sprite(img);
		sprite.setPosition(100, 100);
		sprite.setRotation(45);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin(); 
		sprite.setColor(colour, colour, colour, 0);
		sprite.setRotation(rotation);
		sprite.draw(batch);
		rotation+=1;
		if (colour==222) {
			colour-=1;
		}else{
			colour+=1;
		}
		batch.end();
	}
}
