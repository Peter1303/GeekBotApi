package top.pdev.bot.util;

import top.pdev.bot.plugin.data.friend.FriendData;
import top.pdev.bot.plugin.data.group.GroupData;

import java.util.List;

/**
 * GeekBot 信息获取
 *
 * @author Peter1303
 * @date Created in 2021/7/19 21:29
 */
public class GeekBotInfoGetter {
    /**
     * GeekBot 加入的群组
     *
     * @return 所有群
     */
    public List<GroupData> getGroups() {
        return null;
    }

    /**
     * 获取好友列表
     * @return
     */
    public List<FriendData> getFriends() {
        return null;
    }

    /**
     * 获取群名称
     *
     * @param group 群
     * @return
     */
    public String getGroupName(long group) {
        return null;
    }

    /**
     * 获取好友的昵称
     * @param qq
     * @return
     */
    public String getFriendNick(long qq) {
        return null;
    }

    /**
     * 获取群图形
     *
     * @param group 群
     * @return
     */
    public String getGroupAvatarUrl(long group) {
        return null;
    }

    /**
     * 获取好友的头像
     * @param qq
     * @return
     */
    public String getFriendAvatarUrl(long qq) {
        return null;
    }

    /**
     * 获取群人数
     *
     * @param group 群
     * @return
     */
    public int getNumberOfMember(long group) {
        return 0;
    }

    /**
     * 获取好友个数
     * @param qq
     * @return
     */
    public int getNumberOfFriend(long qq) {
        return 0;
    }

    /**
     * GeekBot 是否为管理员
     *
     * @param group 群
     * @return
     */
    public boolean isBotAnOperator(long group) {
        return false;
    }

    /**
     * 是否加入了某个群
     * @param group 群
     * @return
     */
    public boolean groupExists(long group) {
        return false;
    }

    /**
     * 是否有某个好友
     * @param qq 好友
     * @return
     */
    public boolean friendExists(long qq) {
        return false;
    }
}
