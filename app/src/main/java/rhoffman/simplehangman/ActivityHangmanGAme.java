package rhoffman.simplehangman;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableRow;

public class ActivityHangmanGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hangman_game);

        Intent intent = getIntent();
        String difficulty = intent.getStringExtra("difficulty");

        onCreateButtons();

        //will create new instance of play class which will start the hangman game
        Play obj = new Play();
        obj.Start(difficulty);
    }

    public void onCreateButtons()
    {
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_hangman_game);
        layout.setOrientation(LinearLayout.VERTICAL);

        for(int i = 0; i < 3; i++)
        {
            LinearLayout row = new LinearLayout(this);
            LinearLayout.LayoutParams test = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            test.width = LinearLayout.LayoutParams.MATCH_PARENT;
            row.setLayoutParams(test);

            for(int j = 0; j < 9; j++)
            {
                Button btnTag = new Button(this);

                btnTag.setText("A");
                btnTag.setId(j + 1 + i);

                row.addView(btnTag);
            }

            layout.addView(row);
        }
    }

}
