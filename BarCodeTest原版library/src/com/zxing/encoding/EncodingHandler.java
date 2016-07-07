package com.zxing.encoding;

import android.graphics.Bitmap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.util.Hashtable;

/**
 * @author Ryan Tang
 */
public final class EncodingHandler {
    private static final int BLACK = 0xff000000;

    public static Bitmap createQRCode(String str, int widthAndHeight) throws WriterException {
        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
        //设置稍后解码时对文字使用的字符编码类型
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");

        //根据字符串得到指定的二维码图形的矩阵（二维码图片每一个像素点上要显示的像素值）
        BitMatrix matrix = new MultiFormatWriter().encode(str,
                BarcodeFormat.QR_CODE, widthAndHeight, widthAndHeight);
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int[] pixels = new int[width * height];

        //遍历BitMatrix中的每一个点，然后给数组中的元素赋值
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                //判断当前的x，y点上的坐标是否需要显示有效数据
                if (matrix.get(x, y)) {
//					if (x < width/2) {
                    pixels[y * width + x] = 0xff0000ff;
					//一半红一般蓝
//					} else {
//						pixels[y * width + x] = 0xffff0000;
//					}

                }
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(width, height,
                Bitmap.Config.ARGB_8888);
        //让bitmap图片上显示数组中指定的像素内容
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }


    // 生成一张中心带头像的二维码图形
    public static Bitmap createQRCode(String str, int widthAndHeight, Bitmap icon) throws WriterException {

        //针对icon图像进行缩小，不要太大，否则影响扫描结果
        icon = Bitmap.createScaledBitmap(icon, 50, 50, true);

        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
        //设置稍后解码时对文字使用的字符编码类型
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");

        //根据字符串得到指定的二维码图形的矩阵（二维码图片每一个像素点上要显示的像素值）
        BitMatrix matrix = new MultiFormatWriter().encode(str,
                BarcodeFormat.QR_CODE, widthAndHeight, widthAndHeight);
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int[] pixels = new int[width * height];

        //遍历BitMatrix中的每一个点，然后给数组中的元素赋值
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                //判断当前的x，y点位置是否位于中心头像位置
                if (x > (width / 2 - icon.getWidth() / 2) && x < (width / 2 + icon.getWidth() / 2) && y > (height / 2 - icon.getHeight() / 2) && y < (height / 2 + icon.getHeight() / 2)) {
                    pixels[y * width + x] = icon.getPixel(x-(width / 2 - icon.getWidth() / 2),y-(height / 2 - icon.getHeight() / 2));
                } else {
                    //判断当前的x，y点上的坐标是否需要显示有效数据
                    if (matrix.get(x, y)) {
//					if (x < width/2) {
                        pixels[y * width + x] = 0xff0000ff;
//					} else {
//						pixels[y * width + x] = 0xffff0000;
//					}

                    }
                }

            }
        }
        Bitmap bitmap = Bitmap.createBitmap(width, height,
                Bitmap.Config.ARGB_8888);
        //让bitmap图片上显示数组中指定的像素内容
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }
}
