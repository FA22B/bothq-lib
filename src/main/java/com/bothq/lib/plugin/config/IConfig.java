package com.bothq.lib.plugin.config;

public interface IConfig extends IConfigGroup {
    IConfigGroup addConfigGroup(String uniqueId, String displayName);
}
