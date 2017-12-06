package com.example.administrator.javagroupmanngersystem.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by zhangzga on 2017/12/5.
 */

public class AdaptiveImageView extends ImageView {

    public AdaptiveImageView(Context context) {//java代码new对象使用
        super(context);
    }

    public AdaptiveImageView(Context context, @Nullable AttributeSet attrs) {
        //xml布局中使用
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();

        int width = MeasureSpec.getSize(widthMeasureSpec);
        float drawHeight = drawable.getIntrinsicHeight();
        float drawWidth = drawable.getIntrinsicWidth();
        //控件的宽度width = 屏幕的宽度 MeasureSpec.getSize(widthMeasureSpec);
        //控件的高度height= 控件的宽度width*图片的宽高比 drawHeight / drawWidth;

        int height = (int) Math.ceil((width*(drawHeight/drawWidth)));

        setMeasuredDimension(width,height);

    }
}
