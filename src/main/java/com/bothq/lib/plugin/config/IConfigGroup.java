package com.bothq.lib.plugin.config;

import com.bothq.lib.plugin.config.component.*;

import java.util.List;

public interface IConfigGroup extends IConfigurable, INameable {
    List<IConfigurable> getChildren();

    ICheckBox addCheckBox(String uniqueId, String displayName, boolean defaultValue);

    IComboBox addComboBox(String uniqueId, String displayName, List<String> elements, String defaultValue);

    IRadioBox addRadioBox(String uniqueId, String displayName, String defaultValue, List<String> options);

    ISlider addSlider(String uniqueId, String displayName, float minValue, float maxValue, float step, float defaultValue);

    ITextBox addTextBox(String uniqueId, String displayName, String defaultValue);
}
