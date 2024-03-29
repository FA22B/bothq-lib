package com.bothq.lib.abstractions;

import com.bothq.lib.interfaces.IPlugin;
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
     * {@inheritDoc}
     */
    public void initialize(JDA jda) {
        // Apply JDA instance
        this.jda = jda;
    }
}
