package com.lovegift.lv.bean;

/**
 * Created by Xu on 2016/6/22 0022.
 */

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * 攻略横向滚动条 图片 点击之后的信息集合【点击图片不同 网址不同 通过id 动态组合网址】
 * 以第一个 包您满意 为基准做gson bean
 */

@HttpResponse(parser = MyParser.class)
public class StrategyPostBean {


    /**
     * code : 200
     * data : {"banner_image_url":"http://img03.liwushuo.com/image/160612/v5f6m0rfm.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160612/v5f6m0rfm.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465736270,"id":312,"paging":{"next_url":"http://api.liwushuo.com/v2/collections/312/posts?limit=20&offset=20"},"posts":[{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img02.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043417/content","cover_image_url":"http://img01.liwushuo.com/image/160518/3o80zioqp.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160518/3o80zioqp.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463648400,"editor_id":1045,"feature_list":[],"id":1043417,"label_ids":[],"liked":false,"likes_count":29617,"published_at":1463648400,"share_msg":"什么大包小包迷你包，明明夏天出门只需要一个手机包就足够了啊～钱包可以不带、化妆品可以不带，但是如果忘带了手机的话，那么这一天，基本就是如同末世一般，这么恐怖的画面，吓的我赶紧摸了下包里的手机。既然不需要那么多必需品，那么出门就不要承载着大包的重量了，可以刚刚好放入手机的包包，才是夏日首选嘛～","short_title":"手机包","status":0,"template":"","title":"第15期 ｜ 安心感满分的手机包，随时把手机挂身上","type":"post","updated_at":1463478561,"url":"http://www.liwushuo.com/posts/1043417"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img02.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043563/content","cover_image_url":"http://img03.liwushuo.com/image/160524/akm5sey5b.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160524/akm5sey5b.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464339600,"editor_id":1045,"feature_list":[],"id":1043563,"label_ids":[],"liked":false,"likes_count":32312,"published_at":1464339600,"share_msg":"翻开各种社交软件，发现美少女的夏天好像除了长得好看外，还有一个共同点，那就是大家都格外偏爱棉布单肩包。连衣裙加棉布包的森女标配，很容易就让人感到扑面而来的清新感。容量满分的棉布包，可以尽情在里面装下雨伞、杂志、水杯、化妆包，夏日出门也不会因为包包太小而必须做出取舍了。","short_title":"","status":0,"template":"","title":"第23期 ｜ 夏日美少女都在背的棉布单肩包","type":"post","updated_at":1463991618,"url":"http://www.liwushuo.com/posts/1043563"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043065/content","cover_image_url":"http://img01.liwushuo.com/image/160505/xb8xyys8j.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160505/xb8xyys8j.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462492800,"editor_id":1045,"feature_list":[],"id":1043065,"label_ids":[],"liked":false,"likes_count":32146,"published_at":1462492800,"share_msg":"如果给文艺加上个季节限定的话，那么大概就是夏天了。原因嘛，很简单，因为更适合背帆布包啊～作为很多文艺青年的心头爱，没有那么一个两个三四个帆布包的话，怎么能直视自己这个文艺青年的称号。况且除了好看这个特点外，帆布包还很实用耐造，去超市采购都没问题～","short_title":"环保袋","status":0,"template":"","title":"第2期 | 背上帆布包，文艺之夏走起！","type":"post","updated_at":1462352030,"url":"http://www.liwushuo.com/posts/1043065"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043124/content","cover_image_url":"http://img02.liwushuo.com/image/160506/lerg9o8mm.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160506/lerg9o8mm.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462579200,"editor_id":1045,"feature_list":[],"id":1043124,"label_ids":[],"liked":false,"likes_count":31804,"published_at":1462579200,"share_msg":"背包包也是要分季节的，不过有个例外，那就是通杀四季的双肩包。从小时候就在生活中充当着万能的角色，跟着各种书本考卷陪我们走过学生时代，又承载着长大后每一场远行的痕迹。以至于现在，还是对双肩包有着格外的偏爱的小伙伴，福音来啦～～","short_title":"双肩包","status":0,"template":"","title":"第3期 | 入手实用双肩包，背上它去远行","type":"post","updated_at":1462440029,"url":"http://www.liwushuo.com/posts/1043124"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043133/content","cover_image_url":"http://img03.liwushuo.com/image/160506/mh1nlwuzb.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160506/mh1nlwuzb.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462752000,"editor_id":1045,"feature_list":[],"id":1043133,"label_ids":[],"liked":false,"likes_count":33975,"published_at":1462752000,"share_msg":"如果问小礼君今年夏天背什么包，小礼君绝对会毫不犹豫的推荐骨灰级链条包。原因嘛，比起皮质的肩带，金属材质的看起来时髦度更高，而且各路时尚达人的街拍中都能看到它的身影。很有复古小特色的造型，精致的包包真的是什么衣服都好搭。","short_title":"单肩包","status":0,"template":"","title":"第5期 | 今年夏天就是要背骨灰级链条包","type":"post","updated_at":1462500779,"url":"http://www.liwushuo.com/posts/1043133"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043242/content","cover_image_url":"http://img03.liwushuo.com/image/160511/zs2xd5116.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160511/zs2xd5116.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463043600,"editor_id":1045,"feature_list":[],"id":1043242,"label_ids":[],"liked":false,"likes_count":34604,"published_at":1463043589,"share_msg":"出门除了手机钱包，第三位让姑娘们无法割舍的就是各种维持面子的化妆品。口红要带、粉饼要带、小镜子要带、遮瑕要带、喷雾要带，这么一算，就已经整整一包东西了，要是把它们散养在包包中，那场面想想也觉得有点恐怖。还是有个化妆包比较靠谱，把它们都整整齐齐的收纳其中，找起来的时候也不会太狼狈。","short_title":"化妆包","status":0,"template":"","title":"第8期 | Level up！那些让你一眼就倾心的化妆包","type":"post","updated_at":1462863991,"url":"http://www.liwushuo.com/posts/1043242"}],"posts_count":6,"status":0,"subtitle":"颜值当然高","title":"装下整个明媚夏日的包包","updated_at":1465782458,"url":"http://www.liwushuo.com/collections/312"}
     * message : OK
     */

    private int code;
    /**
     * banner_image_url : http://img03.liwushuo.com/image/160612/v5f6m0rfm.jpg-w300
     * banner_webp_url : http://img03.liwushuo.com/image/160612/v5f6m0rfm.jpg?imageView2/2/w/300/q/85/format/webp
     * cover_image_url : http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg-w720
     * cover_webp_url : http://img03.liwushuo.com/image/160612/a8ay4ow56.jpg?imageView2/2/w/720/q/85/format/webp
     * created_at : 1465736270
     * id : 312
     * paging : {"next_url":"http://api.liwushuo.com/v2/collections/312/posts?limit=20&offset=20"}
     * posts : [{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img02.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043417/content","cover_image_url":"http://img01.liwushuo.com/image/160518/3o80zioqp.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160518/3o80zioqp.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463648400,"editor_id":1045,"feature_list":[],"id":1043417,"label_ids":[],"liked":false,"likes_count":29617,"published_at":1463648400,"share_msg":"什么大包小包迷你包，明明夏天出门只需要一个手机包就足够了啊～钱包可以不带、化妆品可以不带，但是如果忘带了手机的话，那么这一天，基本就是如同末世一般，这么恐怖的画面，吓的我赶紧摸了下包里的手机。既然不需要那么多必需品，那么出门就不要承载着大包的重量了，可以刚刚好放入手机的包包，才是夏日首选嘛～","short_title":"手机包","status":0,"template":"","title":"第15期 ｜ 安心感满分的手机包，随时把手机挂身上","type":"post","updated_at":1463478561,"url":"http://www.liwushuo.com/posts/1043417"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img02.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043563/content","cover_image_url":"http://img03.liwushuo.com/image/160524/akm5sey5b.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160524/akm5sey5b.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1464339600,"editor_id":1045,"feature_list":[],"id":1043563,"label_ids":[],"liked":false,"likes_count":32312,"published_at":1464339600,"share_msg":"翻开各种社交软件，发现美少女的夏天好像除了长得好看外，还有一个共同点，那就是大家都格外偏爱棉布单肩包。连衣裙加棉布包的森女标配，很容易就让人感到扑面而来的清新感。容量满分的棉布包，可以尽情在里面装下雨伞、杂志、水杯、化妆包，夏日出门也不会因为包包太小而必须做出取舍了。","short_title":"","status":0,"template":"","title":"第23期 ｜ 夏日美少女都在背的棉布单肩包","type":"post","updated_at":1463991618,"url":"http://www.liwushuo.com/posts/1043563"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043065/content","cover_image_url":"http://img01.liwushuo.com/image/160505/xb8xyys8j.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160505/xb8xyys8j.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462492800,"editor_id":1045,"feature_list":[],"id":1043065,"label_ids":[],"liked":false,"likes_count":32146,"published_at":1462492800,"share_msg":"如果给文艺加上个季节限定的话，那么大概就是夏天了。原因嘛，很简单，因为更适合背帆布包啊～作为很多文艺青年的心头爱，没有那么一个两个三四个帆布包的话，怎么能直视自己这个文艺青年的称号。况且除了好看这个特点外，帆布包还很实用耐造，去超市采购都没问题～","short_title":"环保袋","status":0,"template":"","title":"第2期 | 背上帆布包，文艺之夏走起！","type":"post","updated_at":1462352030,"url":"http://www.liwushuo.com/posts/1043065"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043124/content","cover_image_url":"http://img02.liwushuo.com/image/160506/lerg9o8mm.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160506/lerg9o8mm.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462579200,"editor_id":1045,"feature_list":[],"id":1043124,"label_ids":[],"liked":false,"likes_count":31804,"published_at":1462579200,"share_msg":"背包包也是要分季节的，不过有个例外，那就是通杀四季的双肩包。从小时候就在生活中充当着万能的角色，跟着各种书本考卷陪我们走过学生时代，又承载着长大后每一场远行的痕迹。以至于现在，还是对双肩包有着格外的偏爱的小伙伴，福音来啦～～","short_title":"双肩包","status":0,"template":"","title":"第3期 | 入手实用双肩包，背上它去远行","type":"post","updated_at":1462440029,"url":"http://www.liwushuo.com/posts/1043124"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043133/content","cover_image_url":"http://img03.liwushuo.com/image/160506/mh1nlwuzb.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160506/mh1nlwuzb.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462752000,"editor_id":1045,"feature_list":[],"id":1043133,"label_ids":[],"liked":false,"likes_count":33975,"published_at":1462752000,"share_msg":"如果问小礼君今年夏天背什么包，小礼君绝对会毫不犹豫的推荐骨灰级链条包。原因嘛，比起皮质的肩带，金属材质的看起来时髦度更高，而且各路时尚达人的街拍中都能看到它的身影。很有复古小特色的造型，精致的包包真的是什么衣服都好搭。","short_title":"单肩包","status":0,"template":"","title":"第5期 | 今年夏天就是要背骨灰级链条包","type":"post","updated_at":1462500779,"url":"http://www.liwushuo.com/posts/1043133"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img01.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988},"content_type":1,"content_url":"http://www.liwushuo.com/posts/1043242/content","cover_image_url":"http://img03.liwushuo.com/image/160511/zs2xd5116.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160511/zs2xd5116.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1463043600,"editor_id":1045,"feature_list":[],"id":1043242,"label_ids":[],"liked":false,"likes_count":34604,"published_at":1463043589,"share_msg":"出门除了手机钱包，第三位让姑娘们无法割舍的就是各种维持面子的化妆品。口红要带、粉饼要带、小镜子要带、遮瑕要带、喷雾要带，这么一算，就已经整整一包东西了，要是把它们散养在包包中，那场面想想也觉得有点恐怖。还是有个化妆包比较靠谱，把它们都整整齐齐的收纳其中，找起来的时候也不会太狼狈。","short_title":"化妆包","status":0,"template":"","title":"第8期 | Level up！那些让你一眼就倾心的化妆包","type":"post","updated_at":1462863991,"url":"http://www.liwushuo.com/posts/1043242"}]
     * posts_count : 6
     * status : 0
     * subtitle : 颜值当然高
     * title : 装下整个明媚夏日的包包
     * updated_at : 1465782458
     * url : http://www.liwushuo.com/collections/312
     */

    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        private String banner_image_url;
        private String banner_webp_url;
        private String cover_image_url;
        private String cover_webp_url;
        private int created_at;
        private int id;
        /**
         * next_url : http://api.liwushuo.com/v2/collections/312/posts?limit=20&offset=20
         */

        private PagingBean paging;
        private int posts_count;
        private int status;
        private String subtitle;
        private String title;
        private int updated_at;
        private String url;
        /**
         * ad_monitors : []
         * author : {"avatar_url":"http://img03.liwushuo.com/image/160615/eppcp2751.jpg","avatar_webp_url":null,"created_at":1465976001,"id":17,"nickname":"Dr.Bag"}
         * column : {"banner_image_url":"http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300","category":"鞋包","cover_image_url":"http://img02.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720","created_at":1462501739,"description":"没有什么是一个包包解决不了的，如果有，那就两个。","id":16,"order":0,"status":0,"subtitle":"","title":"包治百病","updated_at":1466492988}
         * content_type : 1
         * content_url : http://www.liwushuo.com/posts/1043417/content
         * cover_image_url : http://img01.liwushuo.com/image/160518/3o80zioqp.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/160518/3o80zioqp.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1463648400
         * editor_id : 1045
         * feature_list : []
         * id : 1043417
         * label_ids : []
         * liked : false
         * likes_count : 29617
         * published_at : 1463648400
         * share_msg : 什么大包小包迷你包，明明夏天出门只需要一个手机包就足够了啊～钱包可以不带、化妆品可以不带，但是如果忘带了手机的话，那么这一天，基本就是如同末世一般，这么恐怖的画面，吓的我赶紧摸了下包里的手机。既然不需要那么多必需品，那么出门就不要承载着大包的重量了，可以刚刚好放入手机的包包，才是夏日首选嘛～
         * short_title : 手机包
         * status : 0
         * template :
         * title : 第15期 ｜ 安心感满分的手机包，随时把手机挂身上
         * type : post
         * updated_at : 1463478561
         * url : http://www.liwushuo.com/posts/1043417
         */

        private List<PostsBean> posts;

        public String getBanner_image_url() {
            return banner_image_url;
        }

        public void setBanner_image_url(String banner_image_url) {
            this.banner_image_url = banner_image_url;
        }

        public String getBanner_webp_url() {
            return banner_webp_url;
        }

        public void setBanner_webp_url(String banner_webp_url) {
            this.banner_webp_url = banner_webp_url;
        }

        public String getCover_image_url() {
            return cover_image_url;
        }

        public void setCover_image_url(String cover_image_url) {
            this.cover_image_url = cover_image_url;
        }

        public String getCover_webp_url() {
            return cover_webp_url;
        }

        public void setCover_webp_url(String cover_webp_url) {
            this.cover_webp_url = cover_webp_url;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public int getPosts_count() {
            return posts_count;
        }

        public void setPosts_count(int posts_count) {
            this.posts_count = posts_count;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(int updated_at) {
            this.updated_at = updated_at;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<PostsBean> getPosts() {
            return posts;
        }

        public void setPosts(List<PostsBean> posts) {
            this.posts = posts;
        }

        public static class PagingBean {
            private String next_url;

            public String getNext_url() {
                return next_url;
            }

            public void setNext_url(String next_url) {
                this.next_url = next_url;
            }
        }

        public static class PostsBean {
            /**
             * avatar_url : http://img03.liwushuo.com/image/160615/eppcp2751.jpg
             * avatar_webp_url : null
             * created_at : 1465976001
             * id : 17
             * nickname : Dr.Bag
             */

            private AuthorBean author;
            /**
             * banner_image_url : http://img02.liwushuo.com/image/160608/0gc251s33.jpg-w300
             * category : 鞋包
             * cover_image_url : http://img02.liwushuo.com/image/160617/1z2w7g2aa.jpg-w720
             * created_at : 1462501739
             * description : 没有什么是一个包包解决不了的，如果有，那就两个。
             * id : 16
             * order : 0
             * status : 0
             * subtitle :
             * title : 包治百病
             * updated_at : 1466492988
             */

            private ColumnBean column;
            private int content_type;
            private String content_url;
            private String cover_image_url;
            private String cover_webp_url;
            private int created_at;
            private int editor_id;
            private int id;
            private boolean liked;
            private int likes_count;
            private int published_at;
            private String share_msg;
            private String short_title;
            private int status;
            private String template;
            private String title;
            private String type;
            private int updated_at;
            private String url;
            private List<?> ad_monitors;
            private List<?> feature_list;
            private List<?> label_ids;

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public ColumnBean getColumn() {
                return column;
            }

            public void setColumn(ColumnBean column) {
                this.column = column;
            }

            public int getContent_type() {
                return content_type;
            }

            public void setContent_type(int content_type) {
                this.content_type = content_type;
            }

            public String getContent_url() {
                return content_url;
            }

            public void setContent_url(String content_url) {
                this.content_url = content_url;
            }

            public String getCover_image_url() {
                return cover_image_url;
            }

            public void setCover_image_url(String cover_image_url) {
                this.cover_image_url = cover_image_url;
            }

            public String getCover_webp_url() {
                return cover_webp_url;
            }

            public void setCover_webp_url(String cover_webp_url) {
                this.cover_webp_url = cover_webp_url;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public int getEditor_id() {
                return editor_id;
            }

            public void setEditor_id(int editor_id) {
                this.editor_id = editor_id;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public int getPublished_at() {
                return published_at;
            }

            public void setPublished_at(int published_at) {
                this.published_at = published_at;
            }

            public String getShare_msg() {
                return share_msg;
            }

            public void setShare_msg(String share_msg) {
                this.share_msg = share_msg;
            }

            public String getShort_title() {
                return short_title;
            }

            public void setShort_title(String short_title) {
                this.short_title = short_title;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getTemplate() {
                return template;
            }

            public void setTemplate(String template) {
                this.template = template;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public List<?> getFeature_list() {
                return feature_list;
            }

            public void setFeature_list(List<?> feature_list) {
                this.feature_list = feature_list;
            }

            public List<?> getLabel_ids() {
                return label_ids;
            }

            public void setLabel_ids(List<?> label_ids) {
                this.label_ids = label_ids;
            }

            public static class AuthorBean {
                private String avatar_url;
                private Object avatar_webp_url;
                private int created_at;
                private int id;
                private String nickname;

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public Object getAvatar_webp_url() {
                    return avatar_webp_url;
                }

                public void setAvatar_webp_url(Object avatar_webp_url) {
                    this.avatar_webp_url = avatar_webp_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }
            }

            public static class ColumnBean {
                private String banner_image_url;
                private String category;
                private String cover_image_url;
                private int created_at;
                private String description;
                private int id;
                private int order;
                private int status;
                private String subtitle;
                private String title;
                private int updated_at;

                public String getBanner_image_url() {
                    return banner_image_url;
                }

                public void setBanner_image_url(String banner_image_url) {
                    this.banner_image_url = banner_image_url;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getOrder() {
                    return order;
                }

                public void setOrder(int order) {
                    this.order = order;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}
