package com.bothq.lib.plugin.config;

public interface IConfig extends IConfigGroup {
    String getDescription();
    IConfigGroup addConfigGroup(String uniqueId, String displayName);
}
