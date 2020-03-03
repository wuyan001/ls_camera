package com.lsg.uvccamera.usb;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;

/**
 * 描述：usb插拔监听实现接口
 * 作者：lsg
 */
public interface IMonitor {
    void registerReceiver();

    void unregisterReceiver();

    void checkDevice();

    void requestPermission(UsbDevice usbDevice);

    void connectDevice(UsbDevice usbDevice);

    void closeDevice();

    UsbController getUsbController();

    UsbDeviceConnection getConnection();
}
