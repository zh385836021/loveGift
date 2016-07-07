package com.lovegift.lv.url;

public class Urls {

    /**
     * 首页的banner广告条标题json
     */
    public final static String URL_HOME_TAB = "http://api.liwushuo.com/v2/channels/preset?gender=1&generation=1";

    public final static String URL_HOME_BANNER = "http://api.liwushuo.com/v2/banners";

    /**
     * 首页的F4json
     */
    public final static String URL_HOME_F4_ICON = "http://api.liwushuo.com/v2/promotions?gender=1&generation=1";

    /**
     * 首页RecyclerView数据
     */
    public final static String URL_HOME_RECYCLERVIEW = "http://api.liwushuo.com/v2/channels/100/items?limit=20&ad=2&gender=1&offset=0&generation=1";

    /**
     * 点击首页广告的事件
     */
    public static String URL_AD_COLLECTION(int target_id) {
        return "http://api.liwushuo.com/v2/collections/"+target_id+"/posts?limit=20&offset=0";
    }

    /**
     * 搜索框1
     */
    public static final String SEARCH = "http://api.liwushuo.com/v2/search/item?limit=20&offset=0&sort=&keyword=";

    /**
     * 搜索框2
     */
    public static final String SEARCH2 = "http://api.liwushuo.com/v2/search/post?limit=20&offset=0&sort=&keyword=";

    /**
     * 美好小物点击事件
     */

    public static final String URL_GLORIOUS="http://api.liwushuo.com/v2/collections/22/posts?limit=20&offset=0";

    /**
     * 搜索礼物界面
     */
    public static final String SEARCH_GIFT = "http://api.liwushuo.com/v2/search/item?limit=20&offset=0&sort=&keyword=";

    /**
     * 搜索攻略界面
     */
    public static final String SEARCH_STRATEGY = "http://api.liwushuo.com/v2/search/post?limit=20&offset=0&sort=&keyword=";

    /**
     * 攻略专题点击事件
     */

    public static final String URL_STRATEGY_TOPICS="http://api.liwushuo.com/v2/collections?limit=20&offset=0";


    /**
     * 分类页面攻略专题横向广告条每项点击URL接口
     */
    public static String strategySubUrl(int commodityId){
        return "http://api.liwushuo.com/v2/collections/"+commodityId+"/posts?limit=20&offset=0";

    }

    /**
     * 分类页面攻略ChannelGroups每项点击URL接口
     */
    public static String strategyChannelGroupsUrl(int commodityId){
        return "http://api.liwushuo.com/v2/channels/"+commodityId+"/items?limit=20&gender=1&offset=0&generation=1&order_by=now";

    }
    /**
     * 热门页面接口,需要串接性别:gender与身份:generation
     */
    public final static String URL_HOT = "http://api.liwushuo.com/v2/items?limit=20&offset=0&gender=1&generation=1";

    public final static String URL_COLLECTION = "http://api.liwushuo.com/v2/collections?limit=10&offset=0";

    /**
     * 商品详情URL接口,需要串接商品id
     */
    public final static String URL_COMMODITY = "http://api.liwushuo.com/v2/items";


    public static String homeTabUrl(int channelId){
        return "http://api.liwushuo.com/v2/channels/"+(channelId++)+"/items?limit=20&ad=2&gender=1&offset=0&generation=1";
    }

    /**
     * 评论URL接口
     */
    public static String commentUrl(int commodityId){
        return "http://api.liwushuo.com/v2/items/"+commodityId+"/comments?limit=20&offset=0";
    }


    /**
     * 分类页面攻略专题横向广告条URL接口
     */
    public final static String CLASSIFY_SUB= "http://api.liwushuo.com/v2/collections?limit=10&offset=0";

    /**
     * 分类页面ChannelsGroups的URL接口
     */
    public final static String CLASSIFY_CHANNELS= "http://api.liwushuo.com/v2/channel_groups/all";

    /**
     *  分类页面礼物页列表接口
     */

    public final static String CLASSIFY_GIFT="http://api.liwushuo.com/v2/item_categories/tree";

    /**
    *分类页面礼物页各种分类Url接口
    */
    public static String giftRecycUrl(int commodityId){
        return "http://api.liwushuo.com/v2/item_subcategories/"+commodityId+"/items?limit=20&offset=0";
    }

    /**
     * 搜索热词
     *
     */
    public final static String HOT_WORD = "http://api.liwushuo.com/v2/search/hot_words";

    /**
     * 搜索
     */
    public static String SEARCH(String str){
        return "http://api.liwushuo.com/v2/search/item?limit=20&offset=0&sort=&keyword="+str;

    }

    /**
     * Post接口
     * @param id
     * @return
     */
    public static String PostsID(int id){
        return "http://api.liwushuo.com/v2/collections/"+id+"/posts?limit=20&offset=0";
    }

    /**
     * 搜索的关键Collection
     * @param key
     * @return
     */

    public static String searchCollection(String key){
        return "http://api.liwushuo.com/v2/search/post?limit=20&offset=0&sort=&keyword="+key;
    }

    /**
     * 搜索关键词Posts
     * @param key
     * @return
     */
    public static String searchShopItem(int key){
        return "http://api.liwushuo.com/v2/search/item?limit=20&offset=0&sort=&keyword="+key;
    }

    /**
     * searchCollectionItemContentUrl
     * @param id
     * @return
     */

    public static String searchCollectionItemContentUrl(int id){
        return "http://api.liwushuo.com/v1/posts/"+id;
    }

    /**
     * 你可能也喜欢接口URL
     */

    public static String guess(int id){
        return "http://api.liwushuo.com/v2%2Fitems%2F"+id+"%2Frecommend";
    }

    /**
     * 搜索礼物界面
     */
    public static String SEARCH_GIFT(String str) {
        return "http://api.liwushuo.com/v2/search/item?limit=20&offset=0&sort=&keyword="+str;
    }

    /**
     * 搜索攻略界面
     */
    public static String SEARCH_STRATEGY(String str) {
        return "http://api.liwushuo.com/v2/search/post?limit=20&offset=0&sort=&keyword=" + str;
    }

}
