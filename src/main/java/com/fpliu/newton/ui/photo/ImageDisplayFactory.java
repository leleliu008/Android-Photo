package com.fpliu.newton.ui.photo;

/**
 *
 * @author 792793182@qq.com 2016-08-17.
 */
public final class ImageDisplayFactory {

    static ImageDisplay imageDisplay;

    public static void setImageDisplay(ImageDisplay imageDisplay) {
        ImageDisplayFactory.imageDisplay = imageDisplay;
    }

    private ImageDisplayFactory() {

    }
}
