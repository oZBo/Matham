package com.braincollaboration.matham;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;

import java.util.Random;

public class MovementSystem extends IteratingSystem {

    private Random random = new Random();

    public MovementSystem(Family family) {
        super(family);
    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {
        PositionComponent position = entity.getComponent(PositionComponent.class);
        MovementComponent movement = entity.getComponent(MovementComponent.class);

        if (random.nextInt(10) < 1){
            movement.getAcceleration().set(movement.getAccelerationValue(), 0).rotate(random.nextInt(360));
        }

        movement.getVelocity().add(movement.getAcceleration().cpy().scl(deltaTime));
        if(movement.getVelocity().len() > movement.getMaxVelocity()){
            movement.getVelocity().limit(movement.getMaxVelocity());
        }
        position.getPosition().add(movement.getVelocity().cpy().scl(deltaTime));
    }
}
