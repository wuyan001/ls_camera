package com.lsg.uvccamera.callback;

/**
 * 描述：一般uvc相机用的拍照回调接口
 * 作者：lsg
 */
public interface PictureCallback {
    /**
     * 拍照成功图片回调
     *
     * @param path 图片保存路径
     */
    void onPictureTaken(String path);
}
