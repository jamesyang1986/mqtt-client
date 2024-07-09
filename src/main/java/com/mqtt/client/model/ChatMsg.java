package com.mqtt.client.model;

import java.util.Map;

public class ChatMsg {
    private int v = ChatConstants.CHAT_MSG_VER_1;
    /**
     * 消息序列号
     */
    private String sid;
    /**
     * 业务类型: 1:普通聊天; 2:通知;
     */
    private int bizType = ChatConstants.BIZ_TYPE_COMM;
    /**
     * 消息格式: 0:纯文本; 1:图片; 2:语音; 3:视频; 4:文件; 5:图文混排(H5); 6:骰子 7:消息提示 8:名片 9:游戏邀请 10+:widget
     */
    private int format = ChatConstants.MSG_FORMAT_TXT;
    /**
     * 聊天类型: 1:私聊; 2:群聊;
     */
    private int chatType = ChatConstants.CHAT_TYPE_PC;
    /**
     * 消息类型: 0:聊天; 1:命令; 2:回执; 3:通知;
     */
    private int msgType = ChatConstants.MSG_TYPE_CHAT;
    /**
     * 是否需要做离线处理: 0:不用离线; 1:如果不在线,做离线消息处理; 2:必须做离线消息处理
     */
    private int offlineFlg = ChatConstants.OFFLINE_FLG_NONE;
    /**
     * 是否需要push: 0:不需要; 1:离线的话需要; 2:强行push
     */
    private int pushFlg = ChatConstants.PUSH_FLG_NONE;
    /**
     * 是否需要回执: 0:不需要; 1:需要收到消息应答; 2:需要送达应答
     */
    private int ackFlg = ChatConstants.ACK_FLG_NONE;
    /**
     * uid
     */
    private String from;
    /**
     * 可能是uid,可能是chId
     */
    private String to;
    /**
     * 服务端时间（可能为空）
     */
    private Long serverTime;
    /**
     * 消息发送时间戳
     */
    private long time;
    /**
     * 该字段在客户段没有用到
     */
    private int appId;
    /**
     * 该字段在客户段没有用到
     */
    private int appVer;
    /**
     * 气泡ID
     */
    private int bubble;
    /**
     * 会话Id
     */
    private long sessionId;
    /**
     * 消息是否是离线消息
     */
    private int offline = 1;
    /**
     *  正文
     */
    private Map<String, Object> body;
    /**
     * 消息来源
     */
    private String appKey;

    private String pushData;

    /**
     * 数据迁移标识  使用int型是可以复用 默认为0表示不迁移，1表示为重构迁移
     */
    private int migrationFlag = -1;

    private long serverMsgId;

    /**
     * 客户端信息 channelId
     */
    private int channelId;

    /**
     * 客户端信息 clientId
     */
    private String clientId;

    /**
     * 实名认证信息
     */
    private String rnState;

    /**
     * 漫游标记
     * 0 不需要漫游
     * 1 需要漫游
     */
    private Integer roamFlg;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getBizType() {
        return bizType;
    }

    public void setBizType(int bizType) {
        this.bizType = bizType;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getChatType() {
        return chatType;
    }

    public void setChatType(int chatType) {
        this.chatType = chatType;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public int getOfflineFlg() {
        return offlineFlg;
    }

    public void setOfflineFlg(int offlineFlg) {
        this.offlineFlg = offlineFlg;
    }

    public int getPushFlg() {
        return pushFlg;
    }

    public void setPushFlg(int pushFlg) {
        this.pushFlg = pushFlg;
    }

    public int getAckFlg() {
        return ackFlg;
    }

    public void setAckFlg(int ackFlg) {
        this.ackFlg = ackFlg;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Long getServerTime() {
        return serverTime;
    }

    public void setServerTime(Long serverTime) {
        this.serverTime = serverTime;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getAppVer() {
        return appVer;
    }

    public void setAppVer(int appVer) {
        this.appVer = appVer;
    }

    public int getBubble() {
        return bubble;
    }

    public void setBubble(int bubble) {
        this.bubble = bubble;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public int getOffline() {
        return offline;
    }

    public void setOffline(int offline) {
        this.offline = offline;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
        this.body = body;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getPushData() {
        return pushData;
    }

    public void setPushData(String pushData) {
        this.pushData = pushData;
    }

    public int getMigrationFlag() {
        return migrationFlag;
    }

    public void setMigrationFlag(int migrationFlag) {
        this.migrationFlag = migrationFlag;
    }

    public long getServerMsgId() {
        return serverMsgId;
    }

    public void setServerMsgId(long serverMsgId) {
        this.serverMsgId = serverMsgId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRnState() {
        return rnState;
    }

    public void setRnState(String rnState) {
        this.rnState = rnState;
    }

    public Integer getRoamFlg() {
        return roamFlg;
    }

    public void setRoamFlg(Integer roamFlg) {
        this.roamFlg = roamFlg;
    }
}
