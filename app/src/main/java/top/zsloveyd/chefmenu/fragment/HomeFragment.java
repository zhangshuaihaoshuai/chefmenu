package top.zsloveyd.chefmenu.fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.util.BannerUtils;

import java.util.List;


import top.zsloveyd.chefmenu.R;
import top.zsloveyd.chefmenu.adapter.ImageNetAdapter;
import top.zsloveyd.chefmenu.handler.OKhandler;
import top.zsloveyd.chefmenu.model.homedata.GetAppHomeData;
import top.zsloveyd.chefmenu.model.homedata.HomeData;
import top.zsloveyd.chefmenu.model.homedata.HomeDataCarousel;
import top.zsloveyd.chefmenu.utils.GloablUrlPath;
import top.zsloveyd.chefmenu.utils.OkHttpUtil;

/**
 * Created by zhangxiaoshuai on 2020/5/8
 */
public class HomeFragment extends BaseFragment {


    private View TextParentView;

    private Banner banner;

    private  ImageNetAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View superView =  super.onCreateView(inflater, container, savedInstanceState);
        tvTitle.setText("首页");

        TextParentView = inflater.inflate(R.layout.fragment_home,container,false);
        flContent.addView(TextParentView);

        banner = TextParentView.findViewById(R.id.banner);
        //设置适配器
        banner.setAdapter(new ImageNetAdapter(null));

        //设置指示器
        banner.setIndicator(new CircleIndicator(mActivity));
        //设置点击事件
        banner.setOnBannerListener((data, position) -> {
//            Snackbar.make(banner, ((DataBean) data).title, Snackbar.LENGTH_SHORT).show();
        });
        //圆角
        banner.setBannerRound(BannerUtils.dp2px(5));

        loadInternetData();

        return superView;
    }

    /**
     * 加载数据
     */
    public void loadInternetData(){

        OkHttpUtil.getInstance().getDataAsyn(GloablUrlPath.GetAppHomeData, new OKhandler() {
            @Override
            public void handlerError(int id, String data) {

            }

            @Override
            public void handlerData(String id, Object data) {
                String result = (String)data;
                Log.e("content=",result);
                Gson gson = new Gson();
                GetAppHomeData appHomeData = gson.fromJson(result, GetAppHomeData.class);
                System.out.println(result);
                if (appHomeData.getSucceed()){

                  HomeData homeData = appHomeData.getData();

                  createUI(homeData);

                }else {

                }
            }
        });
    }


    public void createUI(HomeData homeData){
        List<HomeDataCarousel> carousel = homeData.getCarousel();

        banner.setAdapter(new ImageNetAdapter(carousel));
        adapter.notifyDataSetChanged();

    }

}
