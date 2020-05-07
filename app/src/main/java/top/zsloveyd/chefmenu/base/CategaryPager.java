package top.zsloveyd.chefmenu.base;

import android.app.Activity;

/**
 * Created by zhangxiaoshuai on 2020/5/7
 */
public class CategaryPager extends BasePager {
    public CategaryPager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        tvTitle.setText("分类");

    }
}
