package top.zsloveyd.chefmenu.base;

import android.app.Activity;
import android.view.View;

import com.google.gson.Gson;

import top.zsloveyd.chefmenu.model.GetAppHomeData;
import top.zsloveyd.chefmenu.utils.GloablUrlPath;
import top.zsloveyd.chefmenu.utils.HttpUtils;


/**
 * Created by zhangxiaoshuai on 2020/5/7
 */
public class HomePager extends BasePager {

    public HomePager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData(){
        navigationBar.setVisibility(View.GONE);
        tvTitle.setText("首页");

        HttpUtils.doGetAsyn(GloablUrlPath.GetAppHomeData, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {
                Gson gson = new Gson();
                GetAppHomeData lll = gson.fromJson(result, GetAppHomeData.class);
                System.out.println(result);
                System.out.println(lll.getSucceed());

                System.out.println(lll.getData().getCarousel());
            }

            @Override
            public void onRequestError(String result) {

            }
        });




    }

}
