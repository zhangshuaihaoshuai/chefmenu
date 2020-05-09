package top.zsloveyd.chefmenu.model.homedata;

import java.util.List;

/**
 * Created by zhangxiaoshuai on 2020/5/9
 */
public class HomeData {

    private List<HomeDataCategary> categary;

    private List<HomeDataGreens> greens;

    private List<HomeDataCarousel> carousel;

    private String imageHead;

    public List<HomeDataCategary> getCategary() {
        return categary;
    }

    public void setCategary(List<HomeDataCategary> categary) {
        this.categary = categary;
    }

    public List<HomeDataGreens> getGreens() {
        return greens;
    }

    public void setGreens(List<HomeDataGreens> greens) {
        this.greens = greens;
    }

    public List<HomeDataCarousel> getCarousel() {
        return carousel;
    }

    public void setCarousel(List<HomeDataCarousel> carousel) {
        this.carousel = carousel;
    }

    public String getImageHead() {
        return imageHead;
    }

    public void setImageHead(String imageHead) {
        this.imageHead = imageHead;
    }
}
