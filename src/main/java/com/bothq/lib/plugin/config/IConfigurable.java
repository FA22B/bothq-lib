package com.bothq.lib.plugin.config;

public interface IConfigurable {
    String getUniqueId();

    boolean isEnabled();

    void enable();

    void disable();
}
