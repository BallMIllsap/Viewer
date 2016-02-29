package com.zhongyun.viewer.async;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

public class AsyncUtil {
	
	 public static <T> void doAsync(final int requestid, final Context pContext, final Callable<T> pCallable, final CallbackMessage<T> pCallback) {  
		 new AsyncTask<Void, Void, T>() {
			 private Exception mException;  
			protected void onPreExecute() {
				super.onPreExecute();  
			}
			 
			@Override
			protected T doInBackground(Void... params) {
				try {  
					T result = pCallable.call(); 
					return result;
				} catch (final Exception e) {
					this.mException = e;
				}  
				return null;
			}
			
			protected void onPostExecute(T result) {
				pCallback.onComplete(requestid, result);
				if(this.mException != null) {
					Log.e("Error", this.mException.toString());
				}
				super.onPostExecute(result);  
			}
		 }.execute((Void[]) null);  
	 }
	 
}

