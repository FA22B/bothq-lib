package com.bothq.lib.plugin;

import com.bothq.lib.plugin.config.IConfig;
import com.bothq.lib.plugin.config.enabled.IEnabled;
import lombok.Getter;
import net.dv8tion.jda.api.JDA;

/**
 * An abstract class implementing {@link IPlugin} and providing basic functionality.
 */
public abstract class PluginBase implements IPlugin {
    @Getter
    IEnabled enabled;


    /**
     * The JDA instance.
     */
    protected JDA jda;

    /**
     * {@inheritDoc}
     */
    public void initialize(JDA jda) {
        // Apply parameters
        this.jda = jda;
    }



    @Override
    public void createConfig(IConfig config) {
        this.enabled = config.getEnabled();
    }
}
