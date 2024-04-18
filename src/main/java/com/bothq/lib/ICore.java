package com.bothq.lib;

import com.bothq.lib.plugin.config.IConfig;

import java.util.Map;

public interface ICore {
    IConfig getConfig(long serverId);

    Map<Long, IConfig> getConfigs();
}
