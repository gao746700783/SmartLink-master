/**
 *
 */
package com.elitech.smartlink.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.elitech.smartlink.R;
import com.elitech.smartlink.util.ResourceUtil;

/**
 * @author King
 */
public class BaseActivity extends AppCompatActivity {

    protected final String LOG_TAG = this.getClass().getSimpleName();

    protected Context mInstance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInstance = this;
    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * set toolbar and title,if the title exist ,then set the custom title
     *
     * @param toolbar    tool bar
     * @param title_id   title resource id
     * @param isShowHome is shown home
     * @param tv_title   title component
     */
    protected void setToolBarAndTitle(Toolbar toolbar, int title_id, boolean isShowHome, TextView... tv_title) {

        toolbar.setTitle("");
        toolbar.setTitleTextColor(ResourceUtil.getColorId(this, R.color.white));
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        if (ab == null) {
            return;
        }

        if (isShowHome) {
            ab.setDisplayHomeAsUpEnabled(true);
            ab.setHomeAsUpIndicator(R.drawable.ic_back);
        }

        if (tv_title != null && tv_title.length > 0) {
            tv_title[0].setText(title_id);
        } else {
            ab.setTitle(title_id);
        }

        if (Build.VERSION.SDK_INT >= 21) {
            ab.setElevation(0);
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // make the menu not disable or invisible
        if (keyCode == KeyEvent.KEYCODE_MENU) {
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();
            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    @TargetApi(19)
    public void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

}
