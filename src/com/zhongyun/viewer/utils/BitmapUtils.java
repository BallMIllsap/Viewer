package com.zhongyun.viewer.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.provider.MediaStore;

public class BitmapUtils {

	/**
	 * 获取图片缩略图
	 */
	public static Bitmap getPictureImage(String urlPath) {
		Bitmap bitmap = null;
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		bitmap = BitmapFactory.decodeFile(urlPath, options);
		options.inJustDecodeBounds = false;
		int h = options.outHeight;
		int w = options.outWidth;
		int beWidth = w / 100;
		int beHeight = h / 80;
		int be = 1;
		if (beWidth < beHeight) {
			be = beWidth;
		} else {
			be = beHeight;
		}
		if (be <= 0) {
			be = 1;
		}
		options.inSampleSize = be;
		bitmap = BitmapFactory.decodeFile(urlPath, options);
		bitmap = ThumbnailUtils.extractThumbnail(bitmap, 100, 80,ThumbnailUtils.OPTIONS_RECYCLE_INPUT);
		return bitmap;
	}
	
	/**
	 * 获取视频缩略图
	 */
	public static Bitmap getVideoImage(String urlPath){
		Bitmap bitmap = null;
		bitmap = ThumbnailUtils.createVideoThumbnail(urlPath, MediaStore.Images.Thumbnails.MICRO_KIND);
		bitmap = ThumbnailUtils.extractThumbnail(bitmap, 100, 80,ThumbnailUtils.OPTIONS_RECYCLE_INPUT);
		return bitmap;
	}
	
	/**
	    * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	    */
	    public static int dip2px(Context context, float dpValue) {
	      final float scale = context.getResources().getDisplayMetrics().density;
	      return (int) (dpValue * scale + 0.5f);
	    }

	    /**
	    * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	    */
	    public static int px2dip(Context context, float pxValue) {
	      final float scale = context.getResources().getDisplayMetrics().density;
	      return (int) (pxValue / scale + 0.5f);
	    }
}
