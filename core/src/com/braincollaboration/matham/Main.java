package com.braincollaboration.matham;

import com.badlogic.gdx.Game;
import com.braincollaboration.matham.screens.CustomScreen;
import com.braincollaboration.matham.screens.ScreenManager;

public class Main extends Game {

    @Override
    public void create() {
        ScreenManager.getInstance().init(this);
        ScreenManager.getInstance().show(CustomScreen.LOAD_SCREEN);
    }
}
