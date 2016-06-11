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
import android.widget.TextView;

import org.w3c.dom.Text;


public class end extends ActionBarActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        final Vibrator vibrator=(Vibrator)getSystemService(this.VIBRATOR_SERVICE);
        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#003366"));
        final TextView score = (TextView)findViewById(R.id.score);
        final Button playagain = (Button)findViewById(R.id.playagain);
        final Button home = (Button)findViewById(R.id.home);
        final Intent getScore = getIntent();
        int finalnum = getScore.getIntExtra("score",0);
        String str="You got "+finalnum+ " points";
        score.setText(str);
        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                int gamemode = getScore.getIntExtra("gamemode",0);
                Intent i = new Intent(end.this,gamemode.class);
                i.putExtra("gamemode",gamemode);
                startActivity(i);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(100);
                Intent i = new Intent(end.this,TitleScreen.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_end, menu);
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
