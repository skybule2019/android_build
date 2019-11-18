package com.example.sly_mobileshop.activity;

import android.view.View;
import android.widget.TextView;


import com.example.sly_mobileshop.R;
import com.example.sly_mobileshop.common.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MyCollectActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    public int getContentViewId() {
        return R.layout.activity_my_collect;
    }

    @Override
    protected void initView() {
        super.initView();
        tvTitle=findViewById(R.id.tv_title);
        tvTitle.setText("我的收藏");
        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                close();
            }
        });
    }

    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}
