package top.zsloveyd.chefmenu.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnPageChangeListener;
import com.youth.banner.util.BannerUtils;

import top.zsloveyd.chefmenu.R;
import top.zsloveyd.chefmenu.adapter.ImageNetAdapter;
import top.zsloveyd.chefmenu.model.DataBean;

/**
 * Created by zhangxiaoshuai on 2020/5/8
 */
public class HomeFragment extends BaseFragment {





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View superView =  super.onCreateView(inflater, container, savedInstanceState);
        tvTitle.setText("首页");

        View TextParentView = inflater.inflate(R.layout.fragment_home,container,false);
        flContent.addView(TextParentView);




        Banner banner = TextParentView.findViewById(R.id.banner);


        //设置适配器
        ImageNetAdapter adapter = new ImageNetAdapter(DataBean.getTestData3());
        banner.setAdapter(adapter);
        //设置指示器
        banner.setIndicator(new CircleIndicator(mActivity));
        //设置点击事件
        banner.setOnBannerListener((data, position) -> {
//            Snackbar.make(banner, ((DataBean) data).title, Snackbar.LENGTH_SHORT).show();
        });
        //添加切换监听
        banner.addOnPageChangeListener(new OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        //圆角
        banner.setBannerRound(BannerUtils.dp2px(5));









        return superView;
    }
}
