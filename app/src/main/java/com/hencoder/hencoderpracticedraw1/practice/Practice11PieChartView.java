package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        //200 200 700 700
        //canvas.drawArc(200, 200, 400, 400, )
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF = new RectF();
        rectF.top = 100;
        rectF.left = 100;
        rectF.bottom = 600;
        rectF.right = 600;
        canvas.drawRect(rectF, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        //Path path = new Path();
        //path.addArc(90, 90, 590, 590, -170, 80, paint);
        //左上
        canvas.drawArc(90, 90, 590, 590, -170, 100, true, paint);
        paint.setColor(Color.YELLOW);
        //右上
        canvas.drawArc(110, 90, 610, 590, -70, 30, true, paint);
        paint.setColor(Color.BLUE);
        //左下
        canvas.drawArc(90, 110, 590, 610, 130, 60, true, paint);
        paint.setColor(Color.GREEN);
        //右下
        canvas.drawArc(110, 110, 610, 610, -40, 170, true, paint);

    }
}
