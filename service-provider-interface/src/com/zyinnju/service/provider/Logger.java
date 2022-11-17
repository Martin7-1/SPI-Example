package com.zyinnju.service.provider;

/**
 * @author zhengyi
 * @date 2022/11/17
 * @description 日志接口
 * @see <a href="https://javaguide.cn/java/basis/spi.html#service-provider-interface">Java SPI 详解</a>
 */
public interface Logger {

	/**
	 * 打印 info 级别的日志
	 *
	 * @param msg 日志信息
	 */
	void info(String msg);

	/**
	 * 打印 debug 级别的日志
	 *
	 * @param msg 日志信息
	 */
	void debug(String msg);
}
