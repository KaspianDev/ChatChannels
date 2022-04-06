package com.clonkc.chatchannels.api;

import com.clonkc.chatchannels.Channels;
import com.clonkc.chatchannels.ChatChannels;
import org.bukkit.entity.Player;

public class ChatChannelsAPI {

    private ChatChannels plugin;
    public ChatChannelsAPI(ChatChannels plugin) {
        this.plugin = plugin;
    }

    APIUtils apiUtils = new APIUtils(plugin);

    public void setPlayerChannel(Player player, Channels channel) {
        apiUtils.toggleChannel(player, channel);
    }

}
