package top.zsloveyd.chefmenu.fragment;

import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

import top.zsloveyd.chefmenu.R;
import top.zsloveyd.chefmenu.base.BasePager;
import top.zsloveyd.chefmenu.base.CategaryPager;
import top.zsloveyd.chefmenu.base.HomePager;
import top.zsloveyd.chefmenu.base.MyPager;

/**
 * Created by zhangxiaoshuai on 2020/5/2
 */
public class MainFragment extends BaseFragment{

    private TextView tabbar_home; //首页item
    private TextView tabbar_categary; //分类item
    private TextView tabbar_my; //我的item


    private ArrayList<BasePager> mPagers;// 三个标签页的集合

    private ViewPager mViewPager;


    @Override
    public View initView() {
        View tabbar_parent_view = View.inflate(mActivity,R.layout.activity_main,null);
        tabbar_home = tabbar_parent_view.findViewById(R.id.tabbar_home);
        tabbar_home.setSelected(true);
        tabbar_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSelectedItem(v);
            }
        });
        tabbar_categary= tabbar_parent_view.findViewById(R.id.tabbar_categary);
        tabbar_categary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSelectedItem(v);
            }
        });
        tabbar_my = tabbar_parent_view.findViewById(R.id.tabbar_my);
        tabbar_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSelectedItem(v);
            }
        });
        //分页
        mViewPager = tabbar_parent_view.findViewById(R.id.vp_content);




        return tabbar_parent_view;
    }

    /**
     * tabbar item 点击
     * @param v
     */
    public void didSelectedItem(View v) {
        int selectedId = v.getId();
        if (selectedId == tabbar_home.getId()){
            BasePager pager = mPagers.get(0);
            pager.initData();
            System.out.println("11111111111111111");
        }else if (selectedId == tabbar_categary.getId()){
            BasePager pager = mPagers.get(1);
            pager.initData();
            System.out.println("22222222222222222");
        }else if (selectedId == tabbar_my.getId()){
            BasePager pager = mPagers.get(2);
            pager.initData();
            System.out.println("33333333333333333");
        }

        changeTabbarState(v);

    }

    /**
     * 更新tabbar颜色
     * @param v
     */
    public void changeTabbarState(View v) {
        int selectedId = v.getId();
        if (selectedId == tabbar_home.getId()){
            mViewPager.setCurrentItem(0,false);
            tabbar_home.setSelected(true);
            tabbar_categary.setSelected(false);
            tabbar_my.setSelected(false);
        }else if (selectedId == tabbar_categary.getId()){
            mViewPager.setCurrentItem(1,false);
            tabbar_home.setSelected(false);
            tabbar_categary.setSelected(true);
            tabbar_my.setSelected(false);
        }else if (selectedId == tabbar_my.getId()){
            mViewPager.setCurrentItem(2,false);
            tabbar_home.setSelected(false);
            tabbar_categary.setSelected(false);
            tabbar_my.setSelected(true);
        }


    }

    @Override
    public void initData() {

        mPagers = new ArrayList<BasePager>();
        mPagers.add(new HomePager(mActivity));
        mPagers.add(new CategaryPager(mActivity));
        mPagers.add(new MyPager(mActivity));

        //默认加载第一个
        BasePager pager = mPagers.get(0);
        pager.initData();

        mViewPager.setAdapter(new ContentPageAdapter());



        Log.e("mPagersmPagersmPagers",mPagers.size()+"");


    }
    class ContentPageAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return mPagers.size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view==object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            BasePager basePager = mPagers.get(position);
            View  mRootView = basePager.mRootView;
            container.addView(mRootView);
            return mRootView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

}
