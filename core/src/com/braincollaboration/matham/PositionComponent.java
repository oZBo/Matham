package com.braincollaboration.matham;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Brain Collaboration Studio on 15.12.2015.
 */
public class PositionComponent implements Component{

    private Vector2 position;

    public PositionComponent(){
        this.position = new Vector2();
    }

    public PositionComponent(Vector2 position){
        this.position = position;
    }

    public Vector2 getPosition(){
        return position;
    }
}
