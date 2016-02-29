package com.zhongyun.viewer.cameralist;

import java.io.Serializable;

public class Binds implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7674942598042413264L;
	private int bind_flag;
	private boolean bind_by_self;
	public Binds(){
		
	}
	public Binds(int bind_flag,boolean bind_by_self){
		this.bind_flag = bind_flag;
		this.bind_by_self = bind_by_self;
	}
	public int getBind_flag() {
		return bind_flag;
	}
	public void setBind_flag(int bind_flag) {
		this.bind_flag = bind_flag;
	}
	public boolean isBind_by_self() {
		return bind_by_self;
	}
	public void setBind_by_self(boolean bind_by_self) {
		this.bind_by_self = bind_by_self;
	}
}