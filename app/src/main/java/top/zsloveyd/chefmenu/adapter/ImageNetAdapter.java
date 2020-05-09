package top.zsloveyd.chefmenu.adapter;


import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.util.BannerUtils;

import java.util.List;

import top.zsloveyd.chefmenu.R;
import top.zsloveyd.chefmenu.model.homedata.HomeDataCarousel;
import top.zsloveyd.chefmenu.viewholder.ImageHolder;


/**
 * 自定义布局，网络图片
 */
public class ImageNetAdapter extends BannerAdapter<HomeDataCarousel, ImageHolder> {

    public ImageNetAdapter(List<HomeDataCarousel> mDatas) {
        super(mDatas);
    }

    @Override
    public ImageHolder onCreateHolder(ViewGroup parent, int viewType) {
        ImageView imageView = (ImageView) BannerUtils.getView(parent, R.layout.banner_image);
        //通过裁剪实现圆角
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            BannerUtils.setBannerRound(imageView,20);
        }
        return new ImageHolder(imageView);
    }

    @Override
    public void onBindView(ImageHolder holder, HomeDataCarousel data, int position, int size) {
        //通过图片加载器实现圆角，你也可以自己使用圆角的imageview，实现圆角的方法很多，自己尝试哈
        String image_path = "https://zsloveyd.top/chefmenu/"+data.getCook_image();
        Glide.with(holder.itemView)
                .load(image_path)
//                .apply(RequestOptions.bitmapTransform(new RoundedCorners(30)))
                .into(holder.imageView);
    }

}
