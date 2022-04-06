package com.clonkc.chatchannels.api;

import com.clonkc.chatchannels.Channels;
import com.clonkc.chatchannels.ChatChannels;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class APIUtils {

    private final ChatChannels plugin;
    public APIUtils(ChatChannels plugin) {
        this.plugin = plugin;
    }

    public final void toggleChannel(Player player, Channels channel) {
        PersistentDataContainer container = player.getPersistentDataContainer();
        NamespacedKey key = plugin.getKey();
        container.set(key, PersistentDataType.STRING, channel.getAbilityName());
    }
}

