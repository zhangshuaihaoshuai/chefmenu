package top.zsloveyd.chefmenu.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import top.zsloveyd.chefmenu.R;

/**
 * Created by zhangxiaoshuai on 2020/5/2
 */
public abstract class BaseFragment extends Fragment {

    public Activity mActivity;//这个activity就是MainActivity


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
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println("onActivityCreatedinitData");
    }

    // 初始化布局, 必须由子类实现
//    public abstract View initView(@Nullable ViewGroup container);

    // 初始化数据, 必须由子类实现
//    public abstract void initData();


}
