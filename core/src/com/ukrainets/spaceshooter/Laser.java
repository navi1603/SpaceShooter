package com.ukrainets.spaceshooter;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Laser {

    float movementSpeed;
    float xPosition, yPosition;
    float width, height;


    TextureRegion textureRegion;

    public Laser(float movementSpeed, float xPosition, float yPosition, float width, float height, TextureRegion textureRegion) {
        this.movementSpeed = movementSpeed;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.textureRegion = textureRegion;
    }

    public void draw (Batch batch){
        batch.draw(textureRegion, xPosition - width/2, yPosition,width, height);
    }
}
