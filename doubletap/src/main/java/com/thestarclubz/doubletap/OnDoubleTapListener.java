package com.thestarclubz.doubletap;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by w.issarapanit on 15/2/2559.
 */
public abstract class OnDoubleTapListener implements View.OnTouchListener{

    public abstract void onDoubleTap(MotionEvent e);
    public abstract void onSingleTapConfirmed(MotionEvent e);

    private GestureDetector gestureDetector;

    public OnDoubleTapListener(Context context){
        gestureDetector = new GestureDetector(context, new GestureListener());
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    public final class GestureListener extends GestureDetector.SimpleOnGestureListener{

        @Override
        public boolean onDown(MotionEvent e) {
            return true;
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            OnDoubleTapListener.this.onDoubleTap(e);
            return super.onDoubleTap(e);
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            OnDoubleTapListener.this.onSingleTapConfirmed(e);
            return super.onSingleTapConfirmed(e);
        }
    }
}
