package com.zyinnju.service.impl;

import com.zyinnju.service.provider.Logger;

/**
 * @author zhengyi
 * @date 2022/11/17
 * @description Logback 日志实现类
 * @see <a href="https://javaguide.cn/java/basis/spi.html#service-provider-interface">Java SPI 详解</a>
 */
public class Logback implements Logger {

	@Override
	public void info(String s) {
		System.out.println("Logback info 打印日志：" + s);
	}

	@Override
	public void debug(String s) {
		System.out.println("Logback debug 打印日志：" + s);
	}
}
