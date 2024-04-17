package com.bothq.lib.plugin;

import com.bothq.lib.plugin.config.IConfig;
import net.dv8tion.jda.api.JDA;

/**
 * An abstract class implementing {@link IPlugin} and providing basic functionality.
 */
public abstract class PluginBase implements IPlugin {
    /**
     * The JDA instance.
     */
    protected JDA jda;

    /**
     * The config.
     */
    protected IConfig config;

    /**
     * {@inheritDoc}
     */
    public void initialize(JDA jda, IConfig config) {
        // Apply parameters
        this.jda = jda;
        this.config = config;
    }
}
