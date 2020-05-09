package top.zsloveyd.chefmenu.fragment;


import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.util.BannerUtils;

import top.zsloveyd.chefmenu.R;
import top.zsloveyd.chefmenu.adapter.ImageNetAdapter;
import top.zsloveyd.chefmenu.model.DataBean;
import top.zsloveyd.chefmenu.model.homedata.GetAppHomeData;
import top.zsloveyd.chefmenu.utils.GloablUrlPath;
import top.zsloveyd.chefmenu.utils.HttpUtils;

/**
 * Created by zhangxiaoshuai on 2020/5/8
 */
public class HomeFragment extends BaseFragment {





    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View superView =  super.onCreateView(inflater, container, savedInstanceState);
        tvTitle.setText("首页");

        loadInternetData();

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
        //圆角
        banner.setBannerRound(BannerUtils.dp2px(5));

        return superView;
    }

    /**
     * 加载数据
     */
    public void loadInternetData(){

        HttpUtils.doGetAsyn(GloablUrlPath.GetAppHomeData, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                Thread thread = Looper.getMainLooper().getThread();

                Log.e("thread",thread.getName());

                Gson gson = new Gson();
                GetAppHomeData appHomeData = gson.fromJson(result, GetAppHomeData.class);
                System.out.println(result);
                if (appHomeData.getSucceed()){
                    Toast.makeText(mActivity,"获取数据成功",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(mActivity,"获取数据失败",Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onRequestError(String result) {

            }
        });



    }



}
