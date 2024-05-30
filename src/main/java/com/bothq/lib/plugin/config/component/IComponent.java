package com.bothq.lib.plugin.config.component;

import com.bothq.lib.plugin.config.IConfigurable;
import com.bothq.lib.plugin.config.INameable;

public interface IComponent<T> extends IConfigurable, INameable {
    T getValue();

    void setValue(T value);

    boolean isAssignable(Object value);
}
