package com.zhongyun.viewer.utils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import android.content.Context;

public class VolleyRequestUtils {
	
	private RequestQueue mRequestQueue;
    private static Context mCtx;
    private static VolleyRequestUtils mVolleyRequestUtils;
 
    private VolleyRequestUtils(Context context) {
        mCtx = context;
        mRequestQueue = getRequestQueue();
    }
 
    public static synchronized VolleyRequestUtils getInstance(Context context) {
        if (mVolleyRequestUtils == null) {
        	mVolleyRequestUtils = new VolleyRequestUtils(context);
        }
        return mVolleyRequestUtils;
    }
 
    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;
    }
 
    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }
}
