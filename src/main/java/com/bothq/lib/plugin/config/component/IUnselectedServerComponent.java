package com.bothq.lib.plugin.config.component;

import com.bothq.lib.plugin.config.INameable;

public interface IUnselectedServerComponent<T extends IComponent<?>> extends INameable {
    String getUniqueId();

    T get(long serverId);
}
