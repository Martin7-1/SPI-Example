package com.zyinnju;

import com.zyinnju.service.provider.LoggerService;

public class SPITest {

	public static void main(String[] args) {
		LoggerService loggerService = LoggerService.getService();
		loggerService.info("你好");
		loggerService.debug("测试Java SPI 机制");
	}
}
