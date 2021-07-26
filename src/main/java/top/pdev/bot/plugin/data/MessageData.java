package top.pdev.bot.plugin.data;

import top.pdev.bot.plugin.data.group.MemberPermission;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 消息对象
 *
 * @author Peter1303
 */
public class MessageData {
    private MessageType messageType;
    private long group;
    private long qq;
    private String message;
    private String personReply;
    private String reply;
    private String friendMessage;
    private File image;
    private List<String> imageUrl;
    private String error;
    private boolean recall;
    private boolean botAdmin;
    private boolean admin;
    private int mute;
    private long muteTarget;
    private long personTarget;
    private MemberPermission permission;
    private List<Long> ats = new ArrayList<>();

    /**
     * 获取消息类型
     *
     * @return MessageType
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * @return 消息群
     */
    public long getGroup() {
        return group;
    }

    /**
     * 一般用于定时执行群消息推送
     *
     * @param group 指定的群
     */
    public void setGroup(long group) {
        this.group = group;
    }

    /**
     * @return 发送者 QQ
     */
    public long getQQ() {
        return qq;
    }

    /**
     * 一般用于定时执行群消息推送
     *
     * @param qq 指定的成员
     */
    public void setQQ(long qq) {
        this.qq = qq;
    }

    /**
     * @return 消息内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param personReply 私信
     */
    public void setPersonReply(String personReply) {
        this.personReply = personReply;
    }

    /**
     * 私信特定成员
     *
     * @param personTarget 特定 QQ
     * @param personReply  私信
     */
    public void setPersonReply(long personTarget, String personReply) {
        this.personTarget = personTarget;
        this.personReply = personReply;
    }

    /**
     * 收到消息后回复内容
     * 当为空的时候则 GeekBot 不会回复处理后的消息
     *
     * @param reply 内容
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * 设置好友消息
     * @param friendMessage 消息
     */
    public void setFriendMessage(String friendMessage) {
        this.friendMessage = friendMessage;
    }

    /**
     * 设置回复图片
     *
     * @param image 图片
     */
    public void setImage(File image) {
        this.image = image;
    }

    /**
     * 获取图片地址
     *
     * @return （多个图片地址）
     */
    public List<String> getImageUrl() {
        return imageUrl;
    }

    /**
     * 撤回该消息
     *
     * @param recall 是否
     */
    public void setRecall(boolean recall) {
        this.recall = recall;
    }

    /**
     * 是否拥有 GeekBot 操作权限
     *
     * @return 是否
     */
    public boolean isBotAdmin() {
        return botAdmin;
    }

    /**
     * 发送方是否为设置的 admin
     * @return 是否
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * 设置禁言
     *
     * @param mute 秒数
     */
    public void setMute(int mute) {
        this.mute = mute;
    }

    /**
     * 禁言特定成员
     *
     * @param muteTarget 成员
     * @param mute       秒数
     */
    public void setMuteTarget(long muteTarget, int mute) {
        this.mute = mute;
        this.muteTarget = muteTarget;
    }

    /**
     * 获取成员的群权限
     * 如果是私信则为 null
     *
     * @return 权限
     */
    public MemberPermission getPermission() {
        return permission;
    }

    /**
     * 设置错误信息
     *
     * @param error 可为空
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * 获取艾特列表
     * @return QQ
     */
    public List<Long> getAts() {
        return ats;
    }
}
