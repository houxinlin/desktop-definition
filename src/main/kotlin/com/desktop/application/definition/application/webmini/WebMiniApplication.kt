package com.desktop.application.definition.application.webmini

import com.desktop.application.definition.application.Application


/**
 * 这个文件前n个字节是程序信息，后面字节是静态资源文件
 */
class WebMiniApplication : Application() {

    /**
     * 路径
     */
    var applicationPath: String = "";

    /**
     * 静态资源偏移
     */
    var staticResOffset: Long = 0;

}