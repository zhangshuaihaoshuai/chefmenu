package top.zsloveyd.chefmenu.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import androidx.annotation.Nullable;

/**
 * Created by zhangxiaoshuai on 2020/5/2
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏导航栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);

    }
}
