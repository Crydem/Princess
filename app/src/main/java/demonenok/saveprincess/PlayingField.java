package demonenok.saveprincess;

import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class PlayingField extends AppCompatActivity implements KeyEvent.Callback{
    private int x, y;
    private int speed; // скорость движения персонажа

    public void initialize(){
        Character character = new Character(0, 0 );
    }

    Character character = new Character(0, 0 );

    public void onKeyUp(){
        Button upButton = findViewById(R.id.upButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                character.moveUp();
            }
        });
    }
    public void onKeyLeft(){
        Button upButton = findViewById(R.id.leftButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                character.moveUp();
            }
        });
    }public void onKeyRight(){
        Button upButton = findViewById(R.id.rightButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                character.moveUp();
            }
        });
    }



    public void draw(Canvas canvas) {
        // нарисовать персонажа на канве
        canvas.drawBitmap(bitmap, x, y, null);
    }

}