package com.bothq.lib.plugin.config.component;

import java.util.List;

public interface IComboBoxServer<T> extends IComponent<T> {
    List<T> getElements();
}
