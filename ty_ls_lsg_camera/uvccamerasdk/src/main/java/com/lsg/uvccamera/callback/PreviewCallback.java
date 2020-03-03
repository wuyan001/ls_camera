package com.lsg.uvccamera.callback;

/**
 * 描述：预览回调接口
 * 作者：lsg
 */
public interface PreviewCallback {
    /**
     * 预览流回调
     *
     * @param yuv yuv格式的数据流
     */
    void onPreviewFrame(byte[] yuv);
}
