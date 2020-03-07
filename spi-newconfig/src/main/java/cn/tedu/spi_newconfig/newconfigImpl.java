package cn.tedu.spi_newconfig;

import cn.tedu.spi_config.spiconfig;

public class newconfigImpl implements spiconfig{

	@Override
	public void start() {
		System.out.println("我是新的配置模块");
		
	}

}
