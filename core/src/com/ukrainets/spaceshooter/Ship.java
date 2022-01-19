package com.ukrainets.spaceshooter;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

class Ship {

    //ship characteristics
    float movementSpeed;  //world units per second
    int shield;

    //position & dimension
    float xPosition, yPosition; //lower-left corner
    float width, height;

    //laser information
    float laserWidth, laserHeight;
    float laserMovementSpeed;
    float timeBetweenShoots;
    float timeSinceLaserShot = 0;

    //graphics
    TextureRegion shipTextureRegion, shieldTextureRegion, laserTextureRegion;

    public Ship(float movementSpeed, int shield,
                float width, float height,
                float xCentre, float yCentre,
                float laserWidth, float laserHeight, float laserMovementSpeed,
                float timeBetweenShoots,
                TextureRegion shipTextureRegion,
                TextureRegion shieldTextureRegion,
                TextureRegion laserTextureRegion) {
        this.movementSpeed = movementSpeed;
        this.shield = shield;
        this.xPosition = xCentre - width / 2;
        this.yPosition = yCentre - height / 2;
        this.width = width;
        this.height = height;
        this.laserWidth = laserWidth;
        this.laserHeight = laserHeight;
        this.laserMovementSpeed = laserMovementSpeed;
        this.timeBetweenShoots = timeBetweenShoots;
        this.shipTextureRegion = shipTextureRegion;
        this.shieldTextureRegion = shieldTextureRegion;
        this.laserTextureRegion = laserTextureRegion;
    }

    public void update (float deltaTime) {
        timeSinceLaserShot += deltaTime;
    }

    public boolean canFireLaser() {
        return (timeSinceLaserShot - timeBetweenShoots >= 0);
    }

    public void draw(Batch batch) {
        batch.draw(shipTextureRegion, xPosition, yPosition, width, height);
        if (shield > 0) {
            batch.draw(shieldTextureRegion, xPosition, yPosition, width, height);
        }
    }
}
