package zkinc.abilitymatch;

import android.content.Intent;
import android.graphics.Color;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class TitleScreen extends ActionBarActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#003366"));
        setContentView(R.layout.activity_title_screen);
        final Vibrator vibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        final Button title = (Button)findViewById(R.id.title);
        final Button passives = (Button)findViewById(R.id.passives);
        final Button q = (Button)findViewById(R.id.q);
        final Button w = (Button)findViewById(R.id.W);
        final Button e = (Button)findViewById(R.id.E);
        final Button ult = (Button)findViewById(R.id.ult);
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TitleScreen.this, gamemode.class);
                i.putExtra("gamemode", 0);
                startActivity(i);

            }
        });
        passives.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(TitleScreen.this, gamemode.class);
                vibrator.vibrate(100);
                i.putExtra("gamemode", 1);
                startActivity(i);

            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TitleScreen.this, gamemode.class);
                vibrator.vibrate(100);
                i.putExtra("gamemode", 2);
                startActivity(i);

            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TitleScreen.this, gamemode.class);
                vibrator.vibrate(100);
                i.putExtra("gamemode", 3);
                startActivity(i);

            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TitleScreen.this, gamemode.class);
                i.putExtra("gamemode", 4);
                vibrator.vibrate(100);
                startActivity(i);

            }
        });
        ult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TitleScreen.this, gamemode.class);
                i.putExtra("gamemode", 5);
                vibrator.vibrate(100);
                startActivity(i);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_title_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
