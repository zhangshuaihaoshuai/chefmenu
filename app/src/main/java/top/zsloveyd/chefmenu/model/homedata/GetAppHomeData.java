package top.zsloveyd.chefmenu.model.homedata;

import java.util.List;

/**
 * Created by zhangxiaoshuai on 2020/5/7
 */
public class GetAppHomeData {

    /**
     * 返回状态
     */
    private Boolean succeed;

    private HomeData data;


    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    public HomeData getData() {
        return data;
    }

    public void setData(HomeData data) {
        this.data = data;
    }
}
