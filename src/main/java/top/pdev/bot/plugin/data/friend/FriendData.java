package top.pdev.bot.plugin.data.friend;

/**
 * 好友信息
 *
 * @author Peter1303
 */
public class FriendData {
    private long qq;
    private String nick;
    private String avatarUrl;

    public long getQQ() {
        return qq;
    }

    public void setQQ(long qq) {
        this.qq = qq;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
