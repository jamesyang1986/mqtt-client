package com.mqtt.client.model;

/**
 * Created by sunji on 16/8/30.
 */
public class ChatConstants {

    public final static int CHAT_MSG_VER_1 = 1;

    public final static int APP_ID_IOS     = 10001;
    public final static int APP_ID_ANDROID = 10002;

    public static final String TOPIC_S2C = "/s2c";

    public final static String CHAT_CLUSTER_NAME = "wChat";

    public final static String CHAT_CLUSTER_NEW_NAME = "pf-wchat";

    /**
     * 聊天用到的cmd
     **/
    public final static String CMD_CHAT   = "chat";

    /**
     * 聊天类型
     **/
    public final static int CHAT_TYPE_CMD  = 0;   // 命令
    public final static int CHAT_TYPE_PC  = 1;   // 私聊
    public final static int CHAT_TYPE_MUC = 2;   // 群聊

    /**
     * 大聊天室（聊天室中人与和会话的的关系在网关）
     */
    public final static int CHAT_TYPE_ROOM = 3;

    /**
     * 小聊天室（持久化 人和 会话的关系）
     */
    public final static int CHAT_TYPE_ROOM_TMP = 4;


    /**
     * 消息类型
     **/
    public final static int MSG_TYPE_CHAT   = 0;   // 聊天
    public final static int MSG_TYPE_CMD    = 1;   // 命令
    public final static int MSG_TYPE_ACK    = 2;   // 回执
    public final static int MSG_TYPE_NOTIFY = 3;  // 通知

    /**
     * 消息格式
     **/
    public final static int MSG_FORMAT_TXT                      = 0; //纯文本
    public final static int MSG_FORMAT_IMG                      = 1; //图片
    public final static int MSG_FORMAT_AUDIO                    = 2; //语音
    public final static int MSG_FORMAT_VIDEO                    = 3; //视频
    public final static int MSG_FORMAT_FILE                     = 4; //文件
    public final static int MSG_FORMAT_H5                       = 5; //图文混排(H5)
    public final static int MSG_FORMAT_DICE                     = 6; //骰子
    public final static int MSG_FORMAT_WEAKHINT                 = 7; //消息提示
    public final static int MSG_FORMAT_NAMECARD                 = 8; //名片
    public final static int MSG_FORMAT_GAMEINVITE               = 9; //游戏邀请
    public final static int MSG_FORMAT_GIFT                     = 10;//礼物
    public final static int MSG_FORMAT_FEED_COMMENT             = 11;
    public final static int MSG_FORMAT_GROUP_INVITE             = 12;
    public final static int MSG_FORMAT_FEED_LIKE                = 13;
    public final static int MSG_FORMAT_POSITION                 = 14;
    public final static int MSG_FORMAT_LUCKY_PACKET             = 15;
    public final static int MSG_FORMAT_VIDEO_CHAT               = 16;
    public final static int MSG_FORMAT_SNAPCHAT                 = 17;
    public final static int MSG_FORMAT_PAINT                    = 18;
    public final static int MSG_FORMAT_STICK                    = 19;
    public final static int MSG_FORMAT_MATCH_GAME               = 20;
    public final static int MSG_FORMAT_MATCH_GAME_NEW           = 26;
    public final static int MSG_FORMAT_NEW_GIFT                 = 27;
    public final static int MSG_FORMAT_GAME_INVITE_2V2          = 28;
    public final static int MSG_FORMAT_INTIMACY                 = 29;
    public final static int MSG_FORMAT_MATCH_GAME_FOR_ROOM_GAME = 30; //房间游戏邀请卡,如狼人杀
    public final static int MSG_FORMAT_FEED                     = 31;
    public final static int MSG_FORMAT_LINK                     = 32;
    public final static int MSG_FORMAT_TEAM_BY_GROUP            = 33; //群聊组队
    public final static int MSG_FORMAT_COMMON_MSG_CARD          = 34; //通用消息卡片
    public final static int MSG_FORMAT_FEED_MSG_CARD            = 35; //通用消息卡片
    public final static int MSG_FORMAT_COMMON_NOTICE_CARD       = 36; //通用通知卡片
    public final static int MSG_FORMAT_JUDGE_MULTI_URL          = 37; //多条法官url信息
    public final static int MSG_FORMAT_COMMON_MSG_CARD_V2       = 38; //通用消息卡片二期
    public final static int MSG_FORMAT_SHOW_AVATAR              = 39; //avatar动画

    public final static int MSG_FORMAT_CMD_DATA                 = 10000;
    public final static int MSG_FORMAT_NOTIFY_DATA              = 10001;
    public final static int MSG_FORMAT_ACK_DATA                 = 10002;
    public final static int MSG_FORMAT_COMMON_SHARE_CARD        = 40; //通用分享消息类型，如语音房声音分享
    public final static int MSG_FORMAT_COMMON_RED_PACK_CARD     = 41; //群红包

    /**
     *  猜拳
     */
    public final static int MSG_FORMAT_FINGER_GUESS = 42;
    /**
     *  猜卡牌花色
     */
    public final static int MSG_FORMAT_CARD_COLOR_GUESS = 43;


    /**
     * 私聊消息扩充
     */
    public final static int MSG_FORMAT_PRIVATE_EXT = 44;

    /**
     * 邀请卡片 45 模板
     */
    public final static int MSG_FORMAT_INVITE_CARD = 45;

    /**
     * ackFlg定义
     **/
    public final static int ACK_FLG_NONE           = 0; //不需要应答
    public final static int ACK_FLG_MUST_RECEIVED  = 1; //需要收到消息应答
    public final static int ACK_FLG_MUST_DELIVERED = 2; //需要送达应答

    /**
     * ack类型
     **/
    public final static int ACK_TYPE_RECEIVED  = 1; //收到消息
    public final static int ACK_TYPE_DELIVERED = 2; //消息送达

    /** 业务类型 **/
    /**
     * 游戏类型按 gamType 走,避免客户端维护枚举
     **/


    /**
     *  普通聊天
     */
    public final static int BIZ_TYPE_COMM         = 1;
    /**
     *  通知
     */
    public final static int BIZ_TYPE_NOTIFY       = 2;
    /**
     * //乱斗
     */
    public final static int BIZ_TYPE_MELEE        = 3;

    /**
     * 德州，已下架
     */
    public final static int BIZ_TYPE_TEXAS        = 6;

    /**
     * 匹配
     */
    public final static int BIZ_TYPE_MATCH        = 11;

    /**
     * 画猜
     */
    public final static int BIZ_TYPE_DRAW_V2      = 16;

    /**
     * 语音房
     */
    public final static int BIZ_TYPE_VOICE_ROOM   = 17;

    /**
     * 扫雷
     */
    public final static int BIZ_TYPE_MATCH_MINE   = 20;

    /**
     * 麻将
     */
    public final static int BIZ_TYPE_MAHJONG_V2   = 21;

    /**
     * 卧底
     */
    public final static int BIZ_TYPE_SPY_V2       = 22;

    /**
     * 说猜
     */
    public final static int BIZ_TYPE_GUESS_V2     = 24;

    /**
     * 养成宠物
     */
    public final static int BIZ_TYPE_PET_V2       = 25;

    /**
     * 狼人杀
     */
    public final static int BIZ_TYPE_WOLF_V3      = 26;

    /**
     * 捕鱼
     */
    public final static int BIZ_TYPE_FISH         = 28;

    /**
     * 吹牛
     */
    public final static int BIZ_TYPE_BRAG         = 29;

    /**
     * 批量消息-用于离线消息批量发送
     */
    public final static int BIZ_TYPE_BATCH_MSG    = 31;

    /**
     * 怼球新房间协议
     */
    public final static int BIZ_TYPE_BALLV2       = 32;

    /**
     * 故事接龙 新房间 新架构，已下架
     */
    public final static int BIZ_TYPE_STORYCHAINV2 = 33;

    /**
     * 剧本杀新
     */
    public final static int BIZ_TYPE_WIMX         = 34;

    /**
     * 阿瓦隆
     */
    public final static int BIZ_TYPE_AVALONV2     = 35;

    /**
     * 传情画意
     */
    public final static int BIZ_TYPE_LINKDRAW     = 36;

    /**
     * 撞击王者
     */
    public final static int BIZ_TYPE_DASH         = 37;

    /**
     * 乌诺
     */
    public final static int BIZ_TYPE_UNO          = 38;

    /**
     * 一斗到底
     */
    public final static int BIZ_TYPE_FIGHT        = 39;

    /**
     * 声音秘境
     */
    public final static int BIZ_TYPE_VOICE_FAIRYLAND = 40;

    /**
     * ludo
     */
    public final static int BIZ_TYPE_LUDO = 43;

    /**
     * 你藏我找
     */
    public final static int BIZ_TYPE_LOBBY = 45;

    /**
     * 森林探险
     */
    public final static int BIZ_TYPE_BINGO = 50;
    /**
     * 钓鱼
     */
    public final static int BIZ_TYPE_ANGLE = 51;

    /**
     *  离线消息计数器
     */
    public final static int BIZ_TYPE_OFFLINEMSG_CNT = 66;

    /**
     * 离线消息下发 V2
     */
    public final static int BIZ_TYPE_OFFLINE_MSG_V2 = 67;

    public final static int BIZ_TYPE_MINADRAW     = 1000;
    public final static int BIZ_TYPE_MINIGAME     = 2000;

    /**
     * 画猜小程序v2
     */
    public final static int BIZ_TYPE_MINADRAW_V2    = 1002;

    /**
     * 脑力王者
     */
    public final static int BIZ_TYPE_MINABRAIN    = 1001;

    /**
     * 实时游戏通用的，目前只有太空杀
     */
    public final static int BIZ_REALTIME_COMMON   = 3000;

    /**
     * 斗兽棋小程序
     */
    public final static int BIZ_TYPE_MINAANIMALCHESS    = 1003;

    /**
     * offlineFlg定义
     **/
    public final static int OFFLINE_FLG_NONE = 0; //不需要离线消息处理
    public final static int OFFLINE_FLG_MAY  = 1;  //如果不在线,做离线消息处理
    public final static int OFFLINE_FLG_MUST = 2; //必须做离线消息处理

    /**
     * pushFlg定义
     **/
    public final static int PUSH_FLG_NONE = 0; //不需要发push
    public final static int PUSH_FLG_MAY  = 1;  //如果不在线,需要发push
    public final static int PUSH_FLG_MUST = 2; //必须发push

    /**
     * channel类型定义
     **/
    public final static int CH_TYPE_TMP  = 0;  //临时channel
    public final static int CH_TYPE_TERM = 1; //长期channel

    /**
     * channel绑定类型定义
     **/
    public final static int CH_BOUND_TYPE_NONE  = 0; //无绑定
    public final static int CH_BOUND_TYPE_ROOM  = 1; //房间类型
    public final static int CH_BOUND_TYPE_GROUP = 2; //群类型

    /**
     * ack在消息body中的key
     **/
    public final static String KEY_ACK_TYPE_IN_BODY = "ackType";
    /**
     * cmd在消息body中的key
     **/
    public final static String KEY_CMD_TYPE_IN_BODY = "cmd";
    /**
     * 这个业务中在app中的用户的rediskey
     **/
    public static final String KEY_IN_APP_UIDS_FOR_CLUSTER = CHAT_CLUSTER_NAME + ":inAppUids";
    /**
     * 这个业务中在app中的用户的rediskey-用于存放chatVersion
     */
    public static final String KEY_IN_APP_UIDS_VERSION_FOR_CLUSTER = CHAT_CLUSTER_NAME + ":inAppUids:ver";

    /**
     * 聊天异步任务类型
     **/
    public final static int CHAT_OPT_TASK_TYPE_DEL_CH  = 1; //删除channel
    public final static int CHAT_OPT_TASK_TYPE_EXIT_CH = 2; //从channel删除用户

    /**
     * 0 - 1000 系统命令
     **/
    public final static int CMD_USER_IN_OUT_APP = 101; //是否在app内
    public static final int CMD_CHANGE_VIP_ROOM = 102;

    /**
     * 1001 - 2000 群聊命令
     **/
    public final static int CMD_CREATE_GROUP             = 1001; //创建群组
    public final static int CMD_INVITE_JOIN              = 1002; //邀请进群
    public final static int CMD_APPLY_JOIN               = 1003; //申请进群
    public final static int CMD_QUIT_GROUP               = 1004; //主动退群
    public final static int CMD_DEL_USER                 = 1005; //群主踢出
    public final static int CMD_REMOVE_GROUP             = 1006; //群主解散群
    public final static int CMD_GRANT_AUTH               = 1007; //授权消息

    /**
     * 群申请命令，有用户发起群申请时，给群主 & 管理员发送命令
     */
    public final static int CMD_GROUP_APPLY              = 1008;

    public final static int CMD_CHAT_CONFIG              = 1100; //聊天配置变更
    public final static int CMD_ADD_FRIEND               = 1101; //添加好友
    public final static int CMD_REMOVE_FRIEND            = 1102; //删除好友
    public final static int CMD_SET_BACKGROUD            = 1103; //设置聊天背景
    public final static int CMD_USER_TYPING_PC           = 1104;
    public final static int CMD_ADD_INTIMACY_RELATION    = 1105;
    public final static int CMD_REFRESH_INTIMACY_SCORE   = 1106;
    public final static int CMD_USER_SEND_ROSE           = 1107; //用户撒花
    public final static int CMD_ADD_FRIEND_RELATION      = 1108; //添加好友回执
    public final static int CMD_BROADCAST_MUSIC          = 1109; //给用户播放音乐
    public final static int CMD_PUSH_VOICE_ROOM_INFO     = 1110;
    public final static int CMD_STOP_VOICE_PLAYING       = 1111;
    public final static int CMD_REMOVE_INTIMACY_RELATION = 1112; //移除亲密关系
    public final static int CMD_TEAM_BY_GROUP            = 1113; //群聊组队
    public final static int CMD_USER_TYPING_PC_CANCEL    = 1114; //取消正在输入 私聊 对应 CMD_USER_TYPING_PC/1104

    public final static int CMD_ACCEPT_GAME_INVITE       = 2001;
    public final static int CMD_DENY_GAME_INVITE         = 2002;
    public final static int CMD_DESTROY_GAME_INVITE      = 2003;
    public final static int CMD_MATCH_GAME_RESULT        = 2004;
    public final static int CMD_DESTROY_ONE_GAME_INVITE  = 2005;
    public final static int CMD_START_GAME_FAILED        = 2006;
    public final static int CMD_INVITE_FAILED            = 2007;//邀请失败
    public final static int CMD_USER_TYPING_MUC          = 1020;
    public final static int CMD_USER_TYPING_MUC_CANCEL   = 1021;//取消正在输入 群聊 对应 CMD_USER_TYPING_MUC/1020

    public final static int CMD_INVITE_RELATION_VOICE    = 2010;//邀请连麦
    public final static int CMD_ACCEPT_RELATION_VOICE    = 2011;//接受连麦
    public final static int CMD_DENY_RELATION_VOICE      = 2012;//拒绝连麦
    public final static int CMD_HANGUP_RELATION_VOICE    = 2013;//挂断连麦
    public final static int CMD_CANCEL_RELATION_VOICE    = 2014;//取消连麦
    //发送邀请后经过版本号和亲密度校验确认可以给对方发出此邀请时，给发起用户返回此cmd，告诉发起方可以弹连麦窗口
    public final static int CMD_RESURE_RELATION_VOICE    = 2015;
    public final static int CMD_AUTO_RECV_ROSE           = 2016;//自动领取花重置状态 cmd
    public final static int CMD_LUCKY_BAG                = 2100; //福袋
    public final static int CMD_VEHICLE                  = 2101; //座驾

    public final static int CMD_SYSTEM_UPLOAD_LOG        = 3001;

    public final static int CMD_IOS_RECOVERY_SWITCH      = 3006; //iOS 是否开启热修复通知

    public final static int CMD_MESSAGE_WITHDRAW         = 3008;//消息撤回

    public final static int CMD_COCOS_UPLOAD_LOG      = 3007; //打开上传cocos debug日志开关

    public final static int CMD_ROB_RED_PACK            = 2200; // 抢到红包
    public final static int CMD_LOOT_RED_PACK           = 2201; // 红包已抢光
    public final static int CMD_PAST_RED_PACK           = 2202; // 红包已过期

    /**
     * 45 号模板更新命令
     */
    public final static int CMD_UPDATE_FORMAT_45        = 2102;

    public static final int CMD_SCENE_TEAM_INFO = 2203;

    /**
     * 加入平台聊天室
     */
    public static final int CMD_JOIN_CHAT_ROOM = 4000;

    /**
     *  退出平台聊天室
     */
    public static final int CMD_QUIT_CHAT_ROOM = 4001;

    /**
     *  重连加入平台聊天室
     */
    public static final int CMD_RECONNECT_JOIN_CHAT_ROOM = 4002;


    /**
     * 销毁平台聊天室
     */
    public static final int CMD_DEL_CHAT_ROOM = 4003;

    /**
     * 用户是否在app内的状态,给101命令用的
     **/
    public final static int STATUS_USER_IN_APP_OUT = 0; //不在app内
    public final static int STATUS_USER_IN_APP_IN  = 1; //在app内


    /**
     * 群聊中用来单发消息的白名单或黑名单的key
     **/
    public final static String MUC_SEND_SINGLE_WHITE_UIDS_KEY = "mucWhiteUids"; // 白名单
    public final static String MUC_SEND_SINGLE_BLACK_UIDS_KEY = "mucBlackUids"; // 黑名单

    public static final int NOTIFY_TYPE_SHOW_SLAVE_REDDOT = 1001;   //展示后院入口红泡
    public static final int NOTIFY_TYPE_REQUEST_PUSH_AUTH = 1002;   //请求APNS push权限。更新token
    public static final int NOTIFY_TYPE_ACCOUNT_FROZEN    = 1003;   //账号冻结
    public static final int NOTIFY_TYPE_SIGN_REDDOT       = 1004;   //展示打卡入口红泡
    public static final int NOTIFY_TYPE_MISSION_REDDOT    = 1005;   //任务入口的红泡
    public static final int NOTIFY_TYPE_HONOR_REDDOT      = 1006;   //徽章入口的红泡
    public static final int NOTIFY_TYPE_OFFICIAL_ALERT    = 1007;   //系统消息提示，横幅
    public static final int NOTIFY_TYPE_HONOR_OBTAIN      = 1008;   //获得了徽章，跳转到徽章页面
    public static final int NOTIFY_TYPE_MISSION_OBTAIN    = 1009;   //完成了任务，跳转到任务列表
    public static final int NOTIFY_TYPE_OFFICIAL_REDDOT   = 1010;   //系统消息入口的红泡
    public static final int NOTIFY_TYPE_WEB               = 1011;   //Jump to web view from push--跳到WebView
    public static final int NOTIFY_TYPE_ROOM_INVITE       = 1012;
    public static final int NOTIFY_TYPE_BIND_WX2          = 1013;   //bind wx2--绑定微信2
    public static final int NOTIFY_TYPE_WOLF_TASK         = 1014;   //狼人杀任务push
    public static final int NOTIFY_TYPE_NEW_FEED          = 1015;   //新feed
    public static final int NOTIFY_TYPE_NEW_CHAMPION      = 1016;   //新的花魁
    public static final int NOTIFY_TYPE_VOICE             = 1017;   //语音房开播通知
    public static final int NOTIFY_TYPE_NEW_FEED_ICON     = 1020;   //新feed 推送发布者的头像
    public static final int NOTIFY_TYPE_PROP_GIFT_REDDOT  = 1021;   //礼物红点
    public static final int NOTIFY_TYPE_FOLLOW_FEED       = 1022;   //“关注”页红点

    public static final int NOTIFY_TYPE_ADV_POPUP         = 2001;   //弹窗
    public static final int NOTIFY_TYPE_CaptChat          = 2002;   //图片验证码
    public static final int NOTIFY_TYPE_GEETEST           = 2003;   //极验
    public static final int NOTIFY_TYPE_SCENE_INVITE      = 2005;   //场景群邀请通知
    public static final int NOTIFY_TYPE_RED_PACKET        = 2006;   //红包通知
    public final static int NOTIFY_SHARE_POP_UP_WINDOW    = 2011; // 分享弹出窗口


    public final static int NOTIFY_TYPE_HOME_ICON    = 2012; // 首页icon红点展示

    /**
     * 千
     */
    public static final int THOUSAND = 1000;
    /**
     * 万
     */
    public static final int TEN_THOUSAND = THOUSAND * 10;
    /**
     * 十万
     */
    public static final int HUNDRED_THOUSAND = TEN_THOUSAND * 10;
    /**
     * 百万
     */
    public static final int MILLION = HUNDRED_THOUSAND * 10;
    /**
     * 千万
     */
    public static final int TEN_MILLION = MILLION * 10;
    /**
     * 秒
     */
    public static final int SECOND = 1000;
    /**
     * 分
     */
    public static final int MINUTE = 60 * SECOND;
    /**
     * 小时
     */
    public static final int HOUR = 60 * MINUTE;
    /**
     * 天
     */
    public static final int DAY = 24 * HOUR;
    /**
     * 管理界面
     */
    public static final byte PAGE_ADMIN = 0;
    /**
     * 最后发言界面
     */
    public static final byte PAGE_LAST_TALK = 1;

    /**
     * 命令消息的sessionId
     */
    public static final String CMD_MSG_SESSION = "-1";

    /**
     * 敏感信息标识
     */
    public static final String AUDIT_SENSTIVE_FLAG = "msgSensitiveFlag";

    /**
     * 漫游标记
     */
    public static final int ROAM_FLG_YES = 1;
}

