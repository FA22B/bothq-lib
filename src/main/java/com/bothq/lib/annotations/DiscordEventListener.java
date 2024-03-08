package com.bothq.lib.annotations;

import com.bothq.lib.interfaces.IPlugin;
import net.dv8tion.jda.api.events.GenericEvent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotation used to listen to JDAs Events which implement the {@link GenericEvent} interface.
 * This can only be used on methods within the {@link IPlugin} instance and static methods. Others can't be processed.
 *
 * @see <a href="https://jda.wiki/introduction/events-list/">List of Events</a>
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DiscordEventListener {
    Class<? extends GenericEvent>[] value() default {};
}
