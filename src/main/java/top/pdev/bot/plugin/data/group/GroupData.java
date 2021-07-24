package top.pdev.bot.plugin.data.group;

/**
 * GeekBot 所加入的群信息
 *
 * @author Peter1303
 */
public class GroupData {
    private long group;
    private String name;
    private int numberOfMember;
    private String avatarUrl;

    /**
     * @return GeekBot 加入的群
     */
    public long getGroup() {
        return group;
    }

    /**
     * 获取群的名字
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 获取群人数
     *
     * @return
     */
    public int getNumberOfMember() {
        return numberOfMember;
    }

    /**
     * 获取群图形
     *
     * @return
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }
}
