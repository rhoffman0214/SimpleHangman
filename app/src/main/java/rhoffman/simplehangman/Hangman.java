package rhoffman.simplehangman;

import android.view.View;

/**
 * Created by rhoffman on 3/17/2017.
 */

public class Hangman {

    //easy game button tapped
    public void easyGameStart(View view)
    {
        Play obj = new Play();
        obj.Start("easy");
    }

    public void mediumGameStart(View view)
    {
        Play obj = new Play();
        obj.Start("medium");
    }

    public void hardGameStart(View view)
    {
        Play obj = new Play();
        obj.Start("hard");
    }
}
