package com.caitlynwiley.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        ImageView puppy = (ImageView) findViewById(R.id.puppy);
        ImageView puppies = (ImageView) findViewById(R.id.puppies);

        /*if (puppy.getAlpha() == 1) {
            puppy.animate().alpha(0).setDuration(2000);
            puppies.animate().alpha(1).setDuration(2000);
        } else {
            puppy.animate().alpha(1).setDuration(2000);
            puppies.animate().alpha(0).setDuration(2000);
        }*/

        puppy.animate().translationXBy(-1000).setDuration(2000);
    }
}
