package demonenok.saveprincess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameLevels extends AppCompatActivity {
    private void goToLevel(int id, Class clazz){
        TextView textView = (TextView) findViewById(id);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, clazz);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_levels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {
                }
            }
        });
        for (int i=1; i<=30; i++){
           String strId ="textView" + i;
           String strLvl= "Level" + i;
            int resourceId = getResources().getIdentifier(strId, "id", getPackageName());
            Class<?> cls = null;
            try {
                cls = Class.forName(getPackageName() + "." + strLvl);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            goToLevel(resourceId, cls);
        }
    }

        /*    @Override
    public void onBackPressed () {
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);finish();
        } catch (Exception e) {}
    }*/
}
