package com.fpliu.newton.ui.photo;

import android.widget.ImageView;

/**
 * 图片异步加载显示
 *
 * @author 792793182@qq.com 2017-06-14.
 */
public interface ImageDisplay {

    /**
     * 显示图片
     *
     * @param imageView    要展示对视图
     * @param uri          图片资源
     * @param defaultImage 默认对图片
     */
    void display(ImageView imageView, String uri, int defaultImage);
}
