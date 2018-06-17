package com.tecidc.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.math.Vector2;


public class Player extends GameObject {

    private Integer player;
    private Float speed;
    public Long turnTimer = 0l;

    public Player(Integer player) {
        //Heredados
        this.screen = new Vector2();
        this.size = new Vector2();
        this.position = new Vector2();

        //Propios
        this.speed = 0.3f;
        this.player = player;

        this.resetSprite();
    }

    public void move(Integer dir){

        Float x = this.position.x;
        Float y = this.position.y;

        if(dir == 1){// Dobla hacia la derecha
            this.turn(dir);
            this.position.x = (x + this.speed);
        }
        else if(dir == 2){// Dobla hacia la izquierda
            this.turn(dir);
            this.position.x = (x - this.speed);
        }
        else if(dir == 3){// Accelera
            this.position.y = (y + this.speed);
        }
        else if(dir == 4){// Frena
            this.position.y = (y - this.speed);
        }
    }
    private void turn(Integer side){

        if(side == 1) {
            switch (this.player) {

                case 1:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/rr.png"));
                    break;

                case 2:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/br.png"));
                    break;

                case 3:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/pr.png"));
                    break;

                case 4:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/wr.png"));
                    break;
            }
        }

        if(side == 2) {
            switch (this.player) {

                case 1:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/rl.png"));
                    break;

                case 2:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/bl.png"));
                    break;

                case 3:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/pl.png"));
                    break;

                case 4:
                    this.pixmap = new Pixmap(Gdx.files.internal("cars/wl.png"));
                    break;
            }
        }
    }

    public void resetSprite(){
        switch(this.player){

            case 1: this.pixmap = new Pixmap(Gdx.files.internal("cars/r.png"));
                break;

            case 2: this.pixmap = new Pixmap(Gdx.files.internal("cars/b.png"));
                break;

            case 3: this.pixmap = new Pixmap(Gdx.files.internal("cars/p.png"));
                break;

            case 4: this.pixmap = new Pixmap(Gdx.files.internal("cars/w.png"));
                break;

        }
    }
}