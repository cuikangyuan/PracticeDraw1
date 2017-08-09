package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        //y坐标轴
        canvas.drawLine(200, 100, 200, 600, paint);
        //x坐标轴
        canvas.drawLine(200, 600, 900, 600, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawRect(300, 60, 350, 600, paint);
        canvas.drawRect(400, 70, 450, 600, paint);
        canvas.drawRect(500, 90, 550, 600, paint);
        canvas.drawRect(600, 100, 650, 600, paint);
        canvas.drawRect(700, 40, 750, 600, paint);




    }
}
