package com.ukrainets.spaceshooter;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

class PlayerShip extends Ship {


    public PlayerShip(float xCentre, float yCentre,
                      float width, float height,
                      float movementSpeed,int shield,
                      float laserWidth, float laserHeight,
                      float laserMovementSpeed, float timeBetweenShoots,
                      TextureRegion shipTextureRegion,
                      TextureRegion shieldTextureRegion,
                      TextureRegion laserTextureRegion) {
        super(xCentre,yCentre,
        width, height,
        movementSpeed,shield,
        laserWidth, laserHeight,
        laserMovementSpeed, timeBetweenShoots,
        shipTextureRegion,
        shieldTextureRegion,
        laserTextureRegion);
    }

    @Override
    public Laser[] fireLasers() {
        Laser[] laser = new Laser[2];
        return new Laser[0];
    }
}
