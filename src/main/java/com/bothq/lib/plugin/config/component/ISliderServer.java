package com.bothq.lib.plugin.config.component;

public interface ISliderServer extends IComponent<Float> {
    float getMinValue();

    void setMinValue(float value);

    float getMaxValue();

    void setMaxValue(float value);

    float getStep();

    void setStep(float value);
}
