package com.braincollaboration.matham.screens;

import com.badlogic.ashley.core.Engine;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.braincollaboration.matham.MovementComponent;
import com.braincollaboration.matham.MovementSystem;
import com.braincollaboration.matham.PositionComponent;
import com.braincollaboration.matham.RenderComponent;
import com.braincollaboration.matham.RenderSystem;

/**
 * Created by eandreychenko on 14.12.2015.
 */
public class MainMenuScreen implements Screen {

    Engine engine;
    OrthographicCamera camera;

    @Override
    public void show() {
        camera = new OrthographicCamera(640, 480);

        engine = new Engine();

        engine.addSystem(new MovementSystem());
        engine.addSystem(new RenderSystem(camera));

        Entity entity = new Entity();
        entity.add(new PositionComponent());
        entity.add(new MovementComponent(8f, 32f));
        entity.add(new RenderComponent(new Vector2()));

        engine.addEntity(entity);
    }

    @Override
    public void render(float delta) {
        engine.update(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
