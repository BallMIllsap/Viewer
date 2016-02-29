package com.zhongyun.viewer.utils;

public class StringUtils {

	// Just in case TextUtils.isEmpty() not found on certain system
	public static boolean isEmpty(String str){
		if(null == str){
			return true;
		}else if("".equals(str)){
			return true;
		}
		return false;
	}
	
	public static boolean notEmpty(String str) {
        return (str != null && !str.equals("") && !str.equals("null") && !str.equals("　") && !str.equals(" "));
    }
}
