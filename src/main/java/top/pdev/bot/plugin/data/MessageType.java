package top.pdev.bot.plugin.data;

/**
 * 来源消息类型
 *
 * @author Peter1303
 */
public enum MessageType {
    /**
     * 群消息
     */
    GROUP,
    /**
     * 私信
     */
    FRIEND,
    /**
     * 加入群
     */
    JOINED_GROUP,
    /**
     * API 接口调用
     * <p>调用 GeekBot 的 http(s) 功能时触发的</p>
     */
    SERVER,
    /**
     * 陌上人消息
     */
    STRANGER
}