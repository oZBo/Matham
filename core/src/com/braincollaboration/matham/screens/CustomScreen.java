package com.braincollaboration.matham.screens;

/**
 * Created by eandreychenko on 14.12.2015.
 */
public enum CustomScreen {

    MAIN_MENU {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance() {
            return new MainMenuScreen();
        }
    },

    LOAD_SCREEN {
        @Override
        protected com.badlogic.gdx.Screen getScreenInstance() {
            return new LoadScreen();
        }
    };

    protected abstract com.badlogic.gdx.Screen getScreenInstance();

}
