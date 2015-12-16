package com.braincollaboration.matham;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class RenderComponent implements Component{

    private Texture frame = GameAssetManager.getInstance().get("hero.png", Texture.class);
    private Vector2 frameOffset = new Vector2();

    public RenderComponent(){

    }

    public RenderComponent(Vector2 offset){
        this.frameOffset = offset;
    }

    public RenderComponent(Texture texture, Vector2 offset){
        this.frame = texture;
        this.frameOffset = offset;
    }

    public Texture getFrame(){
        return frame;
    }

}
