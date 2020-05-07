package top.zsloveyd.chefmenu.base;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import top.zsloveyd.chefmenu.R;

/**
 * Created by zhangxiaoshuai on 2020/5/6
 */
public class BasePager {

    public Activity mActivity;

    public TextView tvTitle;
    public ImageButton backBtn;
    public FrameLayout flContent;// 空的帧布局对象, 要动态添加布局

    public View mRootView;// 当前页面的布局对象


    public BasePager(Activity activity){
        mActivity = activity;
        mRootView = initView();
    }

    private View initView() {
        View view = View.inflate(mActivity, R.layout.base_pager, null);
        tvTitle = (TextView) view.findViewById(R.id.tv_title);
        backBtn = (ImageButton) view.findViewById(R.id.back_img);
        flContent = (FrameLayout) view.findViewById(R.id.fl_content);
        return view;

    }

    // 初始化数据
    public void initData() {

    }


}
