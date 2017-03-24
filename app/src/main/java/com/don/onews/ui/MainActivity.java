package com.don.onews.ui;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.utils.LogUtils;
import com.don.onews.R;
import com.don.onews.base.BaseActivity;
import com.don.onews.ui.FragmentController;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationItem;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.luseen.luseenbottomnavigation.BottomNavigation.OnBottomNavigationItemClickListener;

public class MainActivity extends BaseActivity {

    private TextView hometabToolbarTextviewTitle;
    private FragmentController controller;
    private BottomNavigationView navigation;

    private OnBottomNavigationItemClickListener mOnNavigationItemSelectedListener
            = new OnBottomNavigationItemClickListener() {

        @Override
        public void onNavigationItemClick(int index) {
            switch (index) {
                case 0:
                    hometabToolbarTextviewTitle.setText("新闻");
                    setDefaultFragment(index);
                    break;

                case 1:
                    hometabToolbarTextviewTitle.setText("视频");
                    setDefaultFragment(index);
                    break;
                case 2:
                    hometabToolbarTextviewTitle.setText("搜索");
                    setDefaultFragment(index);
                    break;
                case 3:
                    hometabToolbarTextviewTitle.setText("设置");
                    setDefaultFragment(index);
                    break;
            }
        }



    };

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void initView() {
         navigation = (BottomNavigationView) findViewById(R.id.navigation);
        hometabToolbarTextviewTitle = (TextView) findViewById(R.id.hometab_toolbar_textview_title);

        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem
                ("新闻", ContextCompat.getColor(this, R.color.colorPrimary), R.drawable.ic_home_black_24dp);
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem
                ("视频", ContextCompat.getColor(this, R.color.colorPrimary), R.drawable.ic_dashboard_black_24dp);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem
                ("搜索", ContextCompat.getColor(this, R.color.colorPrimary), R.drawable.ic_notifications_black_24dp);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem
                ("设置", ContextCompat.getColor(this, R.color.colorPrimary), R.drawable.ic_notifications_black_24dp);
        navigation.addTab(bottomNavigationItem);
        navigation.addTab(bottomNavigationItem1);
        navigation.addTab(bottomNavigationItem2);
        navigation.addTab(bottomNavigationItem3);
        navigation.isWithText(true);//是否带文字
//        navigation.isColoredBackground(false);//是否要背景颜色
        navigation.setItemActiveColorWithoutColoredBackground(R.color.colorPrimary);
        navigation.setOnBottomNavigationItemClickListener(mOnNavigationItemSelectedListener);

        controller = FragmentController.getInstance(this, R.id.content);
        controller.showFragment(0);

    }

    /**
     * @param position
     * 切换fragment
     */
    public void setDefaultFragment(int position){
        LogUtils.d("主页菜单position" + position);
        switch (position){
            case 0:
                //推荐
                controller.showFragment(0);
                break;
            case 1:
                //书库视频
                controller.showFragment(1);
                break;
            case 2:
                //搜索
                controller.showFragment(2);
                break;
            case 3:
                //设置
                controller.showFragment(3);
                break;
            default:
                break;

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        FragmentController.onDestroy();
    }

}
