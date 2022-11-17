package com.zyinnju;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author zhengyi
 * @date 2022/11/17
 * @description 日志服务
 * @see <a href="https://javaguide.cn/java/basis/spi.html#service-provider-interface">Java SPI 详解</a>
 */
public class LoggerService {

	private static final LoggerService SERVICE = new LoggerService();
	/**
	 * 真正的 logger
	 */
	private final Logger logger;
	/**
	 * 备选的所有 logger 实现
	 */
	private final List<Logger> loggerList;

	private LoggerService() {
		// 加载所有的 logger 实现
		ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
		List<Logger> list = new ArrayList<>();
		for (Logger log : loader) {
			list.add(log);
		}
		// LoggerList 是所有 ServiceProvider
		loggerList = list;
		if (!list.isEmpty()) {
			// Logger 只取一个，这里我们默认取加载的第一个
			logger = list.get(0);
		} else {
			logger = null;
		}
	}

	public static LoggerService getService() {
		return SERVICE;
	}

	public void info(String msg) {
		if (logger == null) {
			System.out.println("info 中没有发现 Logger 服务提供者");
		} else {
			logger.info(msg);
		}
	}

	public void debug(String msg) {
		if (loggerList.isEmpty()) {
			System.out.println("debug 中没有发现 Logger 服务提供者");
		}
		loggerList.forEach(log -> log.debug(msg));
	}
}
