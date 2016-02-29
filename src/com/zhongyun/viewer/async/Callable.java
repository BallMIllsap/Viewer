package com.zhongyun.viewer.async;

public interface Callable<T> {

	public T call() throws Exception;
}
