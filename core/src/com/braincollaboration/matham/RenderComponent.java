package com.braincollaboration.matham;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class RenderComponent implements Component{

    private TextureRegion frame = GameAssetManager.getInstance().get("textures/textures.atlas", TextureAtlas.class).findRegion("null");
    private Vector2 frameOffset = new Vector2();

    public RenderComponent(){

    }

    public RenderComponent(Vector2 offset){
        this.frameOffset = offset;
    }

    public RenderComponent(TextureRegion texture, Vector2 offset){
        this.frame = texture;
        this.frameOffset = offset;
    }

    public TextureRegion getFrame(){
        return frame;
    }

}
