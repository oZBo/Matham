package com.braincollaboration.matham;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Brain Collaboration Studio on 15.12.2015.
 */
public class MovementComponent implements Component {

    private Vector2 velocity = new Vector2();
    private Vector2 acceleration = new Vector2();
    private float accelerationValue;
    private float maxVelocity;

    public MovementComponent(float accelerationValue, float maxVelocity) {
        this.accelerationValue = accelerationValue;
        this.maxVelocity = maxVelocity;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public Vector2 getAcceleration() {
        return acceleration;
    }

    public float getAccelerationValue() {
        return accelerationValue;
    }

    public float getMaxVelocity() {
        return maxVelocity;
    }
}
