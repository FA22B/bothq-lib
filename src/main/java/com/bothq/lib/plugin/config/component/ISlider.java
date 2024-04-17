package com.bothq.lib.plugin.config.component;

public interface ISlider extends IComponent<Float> {
    float getMinValue();
    void setMinValue(float value);
    float getMaxValue();
    void setMaxValue(float value);
}
