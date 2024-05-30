package com.bothq.lib.plugin.config;

import com.bothq.lib.plugin.config.enabled.IEnabled;

public interface IConfig extends IConfigGroup {
    IEnabled getEnabled();

    default boolean isEnabled(long serverId){
        return getEnabled()
                .get(serverId)
                .isEnabled();
    }


    String getDescription();


    IConfigGroup addConfigGroup(String uniqueId, String displayName);

    

}
