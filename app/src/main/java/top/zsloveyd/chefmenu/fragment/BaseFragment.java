package top.zsloveyd.chefmenu.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import top.zsloveyd.chefmenu.R;

/**
 * Created by zhangxiaoshuai on 2020/5/2
 */
public abstract class BaseFragment extends Fragment {

    public Activity mActivity;//这个activity就是MainActivity


    public TextView tvTitle;
    public ImageButton backBtn;

    public View navigationBar;

    public FrameLayout flContent;// 空的帧布局对象, 要动态添加布局

    public View mRootView;// 当前页面的布局对象


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate");
        mActivity = getActivity(); // 获取当前fragment所依赖的activity

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("onCreateView");
        View view = inflater.inflate(R.layout.base_pager,container,false);
        mRootView = view;
        navigationBar = view.findViewById(R.id.navigation_bar);
        tvTitle = (TextView) view.findViewById(R.id.tv_title);
        backBtn = (ImageButton) view.findViewById(R.id.back_img);
        flContent = (FrameLayout) view.findViewById(R.id.fl_content);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("onActivityCreatedinitData");
    }


}
