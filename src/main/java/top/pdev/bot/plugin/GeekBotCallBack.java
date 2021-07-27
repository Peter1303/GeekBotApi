package top.pdev.bot.plugin;

import top.pdev.bot.plugin.data.MessageData;
import top.pdev.bot.plugin.data.PluginData;
import top.pdev.bot.plugin.data.PluginInfo;

/**
 * GeekBot 加载插件后初始化插件
 *
 * @author Peter1303
 */
public abstract class GeekBotCallBack {
    public static final String LINE = "————————————";
    public static final String NEXT = "\n";
    public static final String NICK = "%nick";
    public static final String TIME = "%time";

    /**
     * 插件初始化
     *
     * @param item GeekBot 返回的机器人信息
     * @return 声明插件信息给 GeekBot
     */
    public abstract PluginInfo init(PluginData item);

    /**
     * GeekBot 调用插件处理消息
     *
     * @param message 消息
     * @return 处理后的消息
     */
    public abstract MessageData execute(MessageData message);

    /**
     * 定时执行
     * 每隔一秒执行
     *
     * @param message 传入消息
     * @return 消息对象，null 则不做处理
     */
    public abstract MessageData action(MessageData message);

    /**
     * 当 GeekBot 发生变更
     * <p>加入新的群，退群等</p>
     */
    public abstract void onChanged();
}
