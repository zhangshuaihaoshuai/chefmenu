package top.zsloveyd.chefmenu.base;

import android.app.Activity;

/**
 * Created by zhangxiaoshuai on 2020/5/7
 */
public class HomePager extends BasePager {

    public HomePager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        tvTitle.setText("首页");

    }
}
