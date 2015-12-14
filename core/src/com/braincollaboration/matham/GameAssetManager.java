package com.braincollaboration.matham;

import com.badlogic.gdx.assets.AssetManager;

/**
 * Created by eandreychenko on 14.12.2015.
 */
public class GameAssetManager extends AssetManager {

    private static GameAssetManager instance;

    public static GameAssetManager getInstance() {
        if (instance == null) {
            instance = new GameAssetManager();
        }
        return instance;
    }

    public void init(){

    }

}
