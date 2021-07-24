package top.pdev.bot.data;

import java.util.List;

public class ArgData {
    private List<String> params;

    /**
     * 获取指令后的第一个
     * @return
     */
    public String getFirst() {
        return "";
    }

    /**
     * 获取指令后的第二个
     * @return
     */
    public String getSecond() {
        return "";
    }

    /**
     * 获取指令后的第三个
     * @return
     */
    public String getThird() {
        return "";
    }

    /**
     * 获取从指令后的 startIndex 的参数
     * @param startIndex
     * @return
     */
    public List<String> getParams(int startIndex) {
        return null;
    }

    /**
     * 获取动作参数后的
     * @return
     */
    public List<String> getAfterActionParams() {
        return null;
    }

    /**
     * 设置解析列表
     * @param params
     */
    public void setParams(List<String> params) {
    }

    /**
     * 是否没有动作
     * @return
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * 参数个数
     * @return
     */
    public int getSize() {
        return 0;
    }

    /**
     * 两个参数
     * @return
     */
    public boolean hasTwoArg() {
        return false;
    }

    /**
     * 三个参数
     * @return
     */
    public boolean hasThreeArg() {
        return false;
    }
}
