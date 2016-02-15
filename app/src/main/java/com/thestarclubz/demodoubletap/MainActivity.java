package com.thestarclubz.demodoubletap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.Toast;

import com.thestarclubz.doubletap.OnDoubleTapListener;

public class MainActivity extends AppCompatActivity {

    private Button btnTestTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTestTouch = (Button) findViewById(R.id.btnTestTouch);

        btnTestTouch.setOnTouchListener(new OnDoubleTapListener(MainActivity.this) {

            @Override
            public void onDoubleTap(MotionEvent e) {
                Toast.makeText(MainActivity.this, "Double", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSingleTapConfirmed(MotionEvent e) {
                Toast.makeText(MainActivity.this, "Single", Toast.LENGTH_LONG).show();
            }
        });
    }
}
