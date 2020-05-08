package top.zsloveyd.chefmenu;



import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

import top.zsloveyd.chefmenu.fragment.BaseFragment;
import top.zsloveyd.chefmenu.fragment.CategaryFragment;
import top.zsloveyd.chefmenu.fragment.HomeFragment;
import top.zsloveyd.chefmenu.fragment.MyFragment;

public class MainActivity extends AppCompatActivity{

    private TextView tabbar_home; //首页item
    private TextView tabbar_categary; //分类item
    private TextView tabbar_my; //我的item


    private ArrayList<BaseFragment> mPagers;// 三个标签页的集合

    private ViewPager mViewPager;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabbar_home = findViewById(R.id.tabbar_home);
        tabbar_home.setSelected(true);
        tabbar_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSelectedItem(v);
            }
        });

        tabbar_categary= findViewById(R.id.tabbar_categary);
        tabbar_categary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSelectedItem(v);
            }
        });
        tabbar_my = findViewById(R.id.tabbar_my);
        tabbar_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                didSelectedItem(v);
            }
        });

        //分页
        mViewPager = findViewById(R.id.vp_content);
        mPagers = new ArrayList<BaseFragment>();
        mPagers.add(new HomeFragment());
        mPagers.add(new CategaryFragment());
        mPagers.add(new MyFragment());


        mViewPager.setAdapter(new ContentPageAdapter(getSupportFragmentManager()));

    }

    /**
     * 适配器
     */
    class ContentPageAdapter extends FragmentStatePagerAdapter {

        public ContentPageAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mPagers.get(position);
        }

        @Override
        public int getCount() {
            return mPagers.size();
        }
    }

    /**
     * tabbar item 点击
     * @param v
     */
    public void didSelectedItem(View v) {
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



}
