package com.zhongyun.viewer.async;

public interface CallbackMessage<T> {
	public void onComplete(final int requestid, final T pCallbackValue);
}
