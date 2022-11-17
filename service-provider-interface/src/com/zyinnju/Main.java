package com.zyinnju;

import com.zyinnju.service.provider.LoggerService;

/**
 * @author zhengyi
 * @date 2022/11/17
 * @description 程序主类
 * @see <a href="https://javaguide.cn/java/basis/spi.html#service-provider-interface">Java SPI 详解</a>
 */
public class Main {

	public static void main(String[] args) {
		LoggerService service = LoggerService.getService();

		service.info("Hello SPI");
		service.debug("Hello SPI");
	}
}
