package com.elitech.smartlink.ui;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.elitech.smartlink.R;
import com.elitech.smartlink.ui.base.BaseActivity;

public class CommunicateActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setToolBarAndTitle(toolbar, R.string.title_activity_connect, true);

    }

}
