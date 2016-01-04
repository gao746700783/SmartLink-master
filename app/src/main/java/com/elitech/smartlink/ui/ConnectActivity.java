package com.elitech.smartlink.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.elitech.smartlink.R;
import com.elitech.smartlink.adapter.base.BaseAdapterHelper;
import com.elitech.smartlink.adapter.base.BaseQuickAdapter;
import com.elitech.smartlink.adapter.base.QuickAdapter;
import com.elitech.smartlink.model.ConnecteInfo;
import com.elitech.smartlink.ui.base.BaseActivity;
import com.elitech.smartlink.widget.MyGridView;

import java.util.ArrayList;
import java.util.List;

public class ConnectActivity extends BaseActivity {

    private MyGridView gv_type;
    private BaseQuickAdapter<ConnecteInfo, BaseAdapterHelper> mAdapter;
    private List<ConnecteInfo> mDeviceList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        setToolBarAndTitle(toolbar,R.string.title_activity_connect,true);

        gv_type = (MyGridView) findViewById(R.id.gv_type);
        mAdapter = new QuickAdapter<ConnecteInfo>(this, R.layout.item_grid) {

            @Override
            protected void convert(BaseAdapterHelper helper, ConnecteInfo item) {
                helper.setText(R.id.tv_item, item.getName() == null || item.getName().equals("") ? "未知设备" : item.getName());
                helper.setImageUrl(R.id.iv_item, item.getImgUrl());
            }

        };

        gv_type.setAdapter(mAdapter);
        gv_type.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        mDeviceList.clear();
        mDeviceList.add(new ConnecteInfo("WIFI", R.drawable.wifi));
        mDeviceList.add(new ConnecteInfo("BlueTooth",R.drawable.wifi));
        mDeviceList.add(new ConnecteInfo("NFC",R.drawable.wifi));
        mDeviceList.add(new ConnecteInfo("GPRS",R.drawable.wifi));
        mDeviceList.add(new ConnecteInfo("GPRS",R.drawable.wifi));
        mDeviceList.add(new ConnecteInfo("WIFI",R.drawable.wifi));
        mDeviceList.add(new ConnecteInfo("WIFI",R.drawable.wifi));
        mAdapter.clear();
        mAdapter.addAll(mDeviceList);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_connect, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_next) {
            startActivity(new Intent(ConnectActivity.this,CommunicateActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
