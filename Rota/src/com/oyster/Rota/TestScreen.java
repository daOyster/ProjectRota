package com.oyster.Rota;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector3;

public class TestScreen implements Screen {
	ShapeRenderer shapes;
	Vector3 touchPos;
	
	public void render(float delta) {
		// TODO Auto-generated method stub
		touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
		RotaGame.camera.unproject(touchPos);
		System.out.printf("Touch Pos: "+touchPos+"\n");
		
		shapes.setProjectionMatrix(RotaGame.camera.combined);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		shapes.setColor(0.5f,.1f,.1f,1f);
		shapes.identity();
		shapes.begin(ShapeType.Filled);
		shapes.setColor(.1f,.5f,.1f,1f);
		//shapes.line(-.99f, 1.5f, -.99f, -1.5f);
		shapes.setColor(0.5f,.1f,.1f,1f);
		for(float i = -.98f+.02f;i<.99f-.09f;i+=.19f)
			for(float u = -.98f+.04f;u<.98f-.09f;u+=.19f)
			{

				if(touchPos.x>=i & touchPos.x<=i+.15f & touchPos.y>=u & touchPos.y<=u+.15f){

					shapes.setColor(.1f,.5f,.1f,1f);
				//	shapes.circle(i, u, .02f,10);
				}
				else
					shapes.setColor(0.5f,.1f,.1f,1f);
				shapes.rect(i, u, .18f, .18f);
			}
		shapes.end();

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		shapes = new ShapeRenderer();
		touchPos = new Vector3(0,0,0);

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
