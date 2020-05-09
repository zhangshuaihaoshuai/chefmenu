package top.zsloveyd.chefmenu.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;

/**
 * Created by zhangxiaoshuai on 2020/5/9
 */
public abstract class OKhandler extends Handler {

    protected OKhandler() {
    }
    protected OKhandler(@NonNull Looper looper) {
        super(looper);
    }

    @Override
    public void handleMessage(@NonNull Message msg) {
        super.handleMessage(msg);
        int w = msg.what;
        if (w == 0){
            //请求失败
            String error = (String) msg.obj;
            handlerError(msg.what,error);
        }
        if (w == 1){
            String json = (String) msg.obj;
            handlerData(String.valueOf(msg.what),json);

        }
    }
    public abstract void handlerError(int id,String data);

    public abstract void handlerData (String id,Object data);

}
