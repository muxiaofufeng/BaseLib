package com.liang530.views.refresh.mvc;

/**
 * 用于外部取消请求的处理。
 */
public interface RequestHandle {

    void cancle();

    boolean isRunning();

}