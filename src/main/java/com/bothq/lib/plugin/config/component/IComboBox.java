package com.bothq.lib.plugin.config.component;

public interface IComboBox<T> extends IComponent<T> {
    int getSelectedIndex();
    void setSelectedIndex(int selectedIndex);
}
