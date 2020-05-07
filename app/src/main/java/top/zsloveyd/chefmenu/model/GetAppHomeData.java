package top.zsloveyd.chefmenu.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangxiaoshuai on 2020/5/7
 */
public class GetAppHomeData {


    private Boolean succeed;

    private GetAppHomeData data;


    private List<GetAppHomeData> categary;
    private String id;
    private String greens_type_name;
    private String greens_type_normal_img;
    private String greens_type_click_img;



    private List<GetAppHomeData> greens;


    private String greens_img;
    private String greens_name;
    private String see_count;
    private String collection;
    private String cfm_detail_id;


    private List<GetAppHomeData> carousel;

    private String cook_name;
    private String cook_image;
    private String cook_detail_id;


    private String imageHead;

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    public GetAppHomeData getData() {
        return data;
    }

    public void setData(GetAppHomeData data) {
        this.data = data;
    }

    public List<GetAppHomeData> getCategary() {
        return categary;
    }

    public void setCategary(List<GetAppHomeData> categary) {
        this.categary = categary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGreens_type_name() {
        return greens_type_name;
    }

    public void setGreens_type_name(String greens_type_name) {
        this.greens_type_name = greens_type_name;
    }

    public String getGreens_type_normal_img() {
        return greens_type_normal_img;
    }

    public void setGreens_type_normal_img(String greens_type_normal_img) {
        this.greens_type_normal_img = greens_type_normal_img;
    }

    public String getGreens_type_click_img() {
        return greens_type_click_img;
    }

    public void setGreens_type_click_img(String greens_type_click_img) {
        this.greens_type_click_img = greens_type_click_img;
    }

    public List<GetAppHomeData> getGreens() {
        return greens;
    }

    public void setGreens(List<GetAppHomeData> greens) {
        this.greens = greens;
    }

    public String getGreens_img() {
        return greens_img;
    }

    public void setGreens_img(String greens_img) {
        this.greens_img = greens_img;
    }

    public String getGreens_name() {
        return greens_name;
    }

    public void setGreens_name(String greens_name) {
        this.greens_name = greens_name;
    }

    public String getSee_count() {
        return see_count;
    }

    public void setSee_count(String see_count) {
        this.see_count = see_count;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getCfm_detail_id() {
        return cfm_detail_id;
    }

    public void setCfm_detail_id(String cfm_detail_id) {
        this.cfm_detail_id = cfm_detail_id;
    }

    public List<GetAppHomeData> getCarousel() {
        return carousel;
    }

    public void setCarousel(List<GetAppHomeData> carousel) {
        this.carousel = carousel;
    }

    public String getCook_name() {
        return cook_name;
    }

    public void setCook_name(String cook_name) {
        this.cook_name = cook_name;
    }

    public String getCook_image() {
        return cook_image;
    }

    public void setCook_image(String cook_image) {
        this.cook_image = cook_image;
    }

    public String getCook_detail_id() {
        return cook_detail_id;
    }

    public void setCook_detail_id(String cook_detail_id) {
        this.cook_detail_id = cook_detail_id;
    }

    public String getImageHead() {
        return imageHead;
    }

    public void setImageHead(String imageHead) {
        this.imageHead = imageHead;
    }


}
