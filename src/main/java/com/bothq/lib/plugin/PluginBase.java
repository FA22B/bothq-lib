package com.bothq.lib.plugin;

import com.bothq.lib.ICore;
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
    protected ICore core;

    /**
     * {@inheritDoc}
     */
    public void initialize(JDA jda, ICore core) {
        // Apply parameters
        this.jda = jda;
        this.core = core;
    }
}
