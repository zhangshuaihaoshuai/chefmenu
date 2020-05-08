package top.zsloveyd.chefmenu.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import top.zsloveyd.chefmenu.R;

/**
 * Created by zhangxiaoshuai on 2020/5/8
 */
public class HomeFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        return inflate;
    }


}
