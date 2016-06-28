package com.example.administrator.databindingsample.attributesetters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lz on 2016/6/28.
 */
public class CircleView extends View {

    private float radius;

    private Paint paint;

    public CircleView(Context context) {
        this(context, null);
    }

    public CircleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float cx = width / 2;
        float cy = height / 2;
        if (radius != 0) {
            canvas.drawCircle(cx, cy, radius, paint);
        }
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(int color) {
        paint.setColor(color);
    }
}
