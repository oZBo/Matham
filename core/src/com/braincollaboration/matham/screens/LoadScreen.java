package com.braincollaboration.matham.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.braincollaboration.matham.GameAssetManager;

/**
 * Created by Brain Collaboration Studio on 14.12.2015.
 */
public class LoadScreen implements Screen {

    private void loadAssets(){
        GameAssetManager.getInstance().load("hero.png", Texture.class);
    }

    @Override
    public void show() {
        GameAssetManager.getInstance().init();
        loadAssets();
    }

    @Override
    public void render(float delta) {
        if(GameAssetManager.getInstance().update()){
            ScreenManager.getInstance().show(CustomScreen.MAIN_MENU);
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {
        ScreenManager.getInstance().show(CustomScreen.MAIN_MENU);
    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
