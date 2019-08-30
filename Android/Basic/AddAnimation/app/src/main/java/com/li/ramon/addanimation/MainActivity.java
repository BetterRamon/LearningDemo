package com.li.ramon.addanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import com.li.ramon.addanimation.view.ViewAnimActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button viewAnimation;       // 视图动画


    private Button crossFade;           // 渐变动画
    private Button viewPagerAnimaiton;  // viewpager 切换动画
    private Button cardAnimation;       // 卡片翻转动画
    private Button zoomAnimation;       // 图片放大缩放动画
    private Button layoutChange;        // 布局改变动画

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    protected void init() {
        viewAnimation = findViewById(R.id.view_animation);

        crossFade = findViewById(R.id.cross_fade);
        viewPagerAnimaiton = findViewById(R.id.viewpager_animation);
        cardAnimation = findViewById(R.id.card_animation);
        zoomAnimation = findViewById(R.id.zoom_btn);
        layoutChange = findViewById(R.id.layout_change);

        viewAnimation.setOnClickListener(this);
        crossFade.setOnClickListener(this);
        viewPagerAnimaiton.setOnClickListener(this);
        cardAnimation.setOnClickListener(this);
        zoomAnimation.setOnClickListener(this);
        layoutChange.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.view_animation:   // 视图动画
                intent = new Intent(MainActivity.this, ViewAnimActivity.class);
                startActivity(intent);
                break;
            case R.id.cross_fade:
                intent = new Intent(MainActivity.this, CrossfadeActivity.class);
                startActivity(intent);
                break;
            case R.id.viewpager_animation:
                intent = new Intent(MainActivity.this, ScreenSlidePagerActivity.class);
                startActivity(intent);
                break;
            case R.id.card_animation:
                intent = new Intent(MainActivity.this, CardFlipActivity.class);
                startActivity(intent);
                break;
            case R.id.zoom_btn:
                intent = new Intent(MainActivity.this, ZoomActivity.class);
                startActivity(intent);
                break;
            case R.id.layout_change:
                intent = new Intent(MainActivity.this, LayoutChangesActivity.class);
                startActivity(intent);
                break;
        }
    }
}
