package com.lovegift.lv.bean;

import com.lovegift.lv.BaseApp.MyParser;

import org.xutils.http.annotation.HttpResponse;

import java.util.List;

/**
 * Created by Zane on 2016/6/24.
 */
@HttpResponse(parser= MyParser.class)
public class GloriousThingBean {

    /**
     * code : 200
     * data : {"banner_image_url":"http://img01.liwushuo.com/image/141210/7mj3aabzc.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/141210/7mj3aabzc.jpg?imageView2/2/w/300/q/85/format/webp","cover_image_url":"http://img03.liwushuo.com/image/141210/24ty0usmf.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/141210/24ty0usmf.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1418184803,"id":22,"paging":{"next_url":"http://api.liwushuo.com/v2/collections/22/posts?limit=20&offset=20"},"posts":[{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042456/content","cover_image_url":"http://img02.liwushuo.com/image/160418/r1zmmcdk8.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160418/r1zmmcdk8.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1461031200,"editor_id":1018,"feature_list":[9],"id":1042456,"label_ids":[],"liked":false,"likes_count":11839,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第484期","type":"post","updated_at":1460959497,"url":"http://www.liwushuo.com/posts/1042456"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042297/content","cover_image_url":"http://img01.liwushuo.com/image/160415/vsu8rzbfm.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160415/vsu8rzbfm.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460682260,"editor_id":1020,"feature_list":[9],"id":1042297,"label_ids":[],"liked":false,"likes_count":9308,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第483期","type":"post","updated_at":1460682260,"url":"http://www.liwushuo.com/posts/1042297"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042214/content","cover_image_url":"http://img01.liwushuo.com/image/160414/aq3m2lgfw.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160414/aq3m2lgfw.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460612687,"editor_id":1020,"feature_list":[9],"id":1042214,"label_ids":[],"liked":false,"likes_count":8738,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第482期","type":"post","updated_at":1460612687,"url":"http://www.liwushuo.com/posts/1042214"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042191/content","cover_image_url":"http://img03.liwushuo.com/image/160414/c9yia2jrk.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160414/c9yia2jrk.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460604553,"editor_id":1020,"feature_list":[9],"id":1042191,"label_ids":[],"liked":false,"likes_count":11743,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第481期","type":"post","updated_at":1460604553,"url":"http://www.liwushuo.com/posts/1042191"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042146/content","cover_image_url":"http://img01.liwushuo.com/image/160413/ee7825m3k.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160413/ee7825m3k.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460537918,"editor_id":1018,"feature_list":[9],"id":1042146,"label_ids":[],"liked":false,"likes_count":8344,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第480期","type":"post","updated_at":1460537918,"url":"http://www.liwushuo.com/posts/1042146"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042076/content","cover_image_url":"http://img02.liwushuo.com/image/160413/nw7dxejqz.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160413/nw7dxejqz.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460533183,"editor_id":1020,"feature_list":[9],"id":1042076,"label_ids":[],"liked":false,"likes_count":8815,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第479期","type":"post","updated_at":1460533183,"url":"http://www.liwushuo.com/posts/1042076"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041993/content","cover_image_url":"http://img02.liwushuo.com/image/160413/3dougq87r.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160413/3dougq87r.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460514996,"editor_id":1020,"feature_list":[9],"id":1041993,"label_ids":[],"liked":false,"likes_count":8117,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第478期","type":"post","updated_at":1460514996,"url":"http://www.liwushuo.com/posts/1041993"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041760/content","cover_image_url":"http://img03.liwushuo.com/image/160411/o3tbchnif.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160411/o3tbchnif.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460354132,"editor_id":1020,"feature_list":[9],"id":1041760,"label_ids":[],"liked":false,"likes_count":9325,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第477期","type":"post","updated_at":1460354132,"url":"http://www.liwushuo.com/posts/1041760"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041754/content","cover_image_url":"http://img02.liwushuo.com/image/160411/u5yvaf0vx.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160411/u5yvaf0vx.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460340713,"editor_id":1020,"feature_list":[9],"id":1041754,"label_ids":[],"liked":false,"likes_count":8528,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第476期","type":"post","updated_at":1460340713,"url":"http://www.liwushuo.com/posts/1041754"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041736/content","cover_image_url":"http://img01.liwushuo.com/image/160413/orn6mrfas.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160413/orn6mrfas.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460253600,"editor_id":1019,"feature_list":[9],"id":1041736,"label_ids":[],"liked":false,"likes_count":8386,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第475期","type":"post","updated_at":1460217326,"url":"http://www.liwushuo.com/posts/1041736"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041654/content","cover_image_url":"http://img01.liwushuo.com/image/160408/izapbswxe.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160408/izapbswxe.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460101519,"editor_id":1020,"feature_list":[9],"id":1041654,"label_ids":[],"liked":false,"likes_count":8275,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第474期","type":"post","updated_at":1460101519,"url":"http://www.liwushuo.com/posts/1041654"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041573/content","cover_image_url":"http://img02.liwushuo.com/image/160408/exb97pxya.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160408/exb97pxya.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460082557,"editor_id":1020,"feature_list":[9],"id":1041573,"label_ids":[],"liked":false,"likes_count":8672,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第473期","type":"post","updated_at":1460082557,"url":"http://www.liwushuo.com/posts/1041573"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041331/content","cover_image_url":"http://img01.liwushuo.com/image/160406/du5a1jx8h.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160406/du5a1jx8h.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459922891,"editor_id":1020,"feature_list":[9],"id":1041331,"label_ids":[],"liked":false,"likes_count":8260,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第472期","type":"post","updated_at":1459922891,"url":"http://www.liwushuo.com/posts/1041331"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041293/content","cover_image_url":"http://img01.liwushuo.com/image/160406/i3ut77up5.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160406/i3ut77up5.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459910518,"editor_id":1020,"feature_list":[9],"id":1041293,"label_ids":[],"liked":false,"likes_count":8325,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第471期","type":"post","updated_at":1459910518,"url":"http://www.liwushuo.com/posts/1041293"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041009/content","cover_image_url":"http://img03.liwushuo.com/image/160401/9qf476wtu.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160401/9qf476wtu.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459499534,"editor_id":1020,"feature_list":[9],"id":1041009,"label_ids":[],"liked":false,"likes_count":7577,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第470期","type":"post","updated_at":1459499534,"url":"http://www.liwushuo.com/posts/1041009"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040980/content","cover_image_url":"http://img01.liwushuo.com/image/160401/aos2mzarp.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160401/aos2mzarp.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459498206,"editor_id":1020,"feature_list":[9],"id":1040980,"label_ids":[],"liked":false,"likes_count":7513,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第469期","type":"post","updated_at":1459498206,"url":"http://www.liwushuo.com/posts/1040980"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040965/content","cover_image_url":"http://img03.liwushuo.com/image/160401/y8r7oyd74.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160401/y8r7oyd74.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459497026,"editor_id":1020,"feature_list":[9],"id":1040965,"label_ids":[],"liked":false,"likes_count":8601,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第468期","type":"post","updated_at":1459497026,"url":"http://www.liwushuo.com/posts/1040965"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040627/content","cover_image_url":"http://img03.liwushuo.com/image/160331/lihbt9nn1.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160331/lihbt9nn1.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459405368,"editor_id":1020,"feature_list":[9],"id":1040627,"label_ids":[],"liked":false,"likes_count":9175,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第467期","type":"post","updated_at":1459405368,"url":"http://www.liwushuo.com/posts/1040627"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040639/content","cover_image_url":"http://img02.liwushuo.com/image/160331/dtikl8hjb.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160331/dtikl8hjb.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459408190,"editor_id":1020,"feature_list":[9],"id":1040639,"label_ids":[],"liked":false,"likes_count":8091,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第466期","type":"post","updated_at":1459408190,"url":"http://www.liwushuo.com/posts/1040639"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040148/content","cover_image_url":"http://img03.liwushuo.com/image/160328/hy6k3gfyr.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160328/hy6k3gfyr.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459389622,"editor_id":1020,"feature_list":[9],"id":1040148,"label_ids":[],"liked":false,"likes_count":9343,"published_at":1459389622,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第465期","type":"post","updated_at":1459145934,"url":"http://www.liwushuo.com/posts/1040148"}],"posts_count":484,"status":0,"subtitle":"送给自己","title":"每日十件美好小物","updated_at":1418184803,"url":"http://www.liwushuo.com/collections/22"}
     * message : OK
     */

    private int code;
    /**
     * banner_image_url : http://img01.liwushuo.com/image/141210/7mj3aabzc.jpg-w300
     * banner_webp_url : http://img01.liwushuo.com/image/141210/7mj3aabzc.jpg?imageView2/2/w/300/q/85/format/webp
     * cover_image_url : http://img03.liwushuo.com/image/141210/24ty0usmf.jpg-w720
     * cover_webp_url : http://img03.liwushuo.com/image/141210/24ty0usmf.jpg?imageView2/2/w/720/q/85/format/webp
     * created_at : 1418184803
     * id : 22
     * paging : {"next_url":"http://api.liwushuo.com/v2/collections/22/posts?limit=20&offset=20"}
     * posts : [{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042456/content","cover_image_url":"http://img02.liwushuo.com/image/160418/r1zmmcdk8.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160418/r1zmmcdk8.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1461031200,"editor_id":1018,"feature_list":[9],"id":1042456,"label_ids":[],"liked":false,"likes_count":11839,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第484期","type":"post","updated_at":1460959497,"url":"http://www.liwushuo.com/posts/1042456"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042297/content","cover_image_url":"http://img01.liwushuo.com/image/160415/vsu8rzbfm.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160415/vsu8rzbfm.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460682260,"editor_id":1020,"feature_list":[9],"id":1042297,"label_ids":[],"liked":false,"likes_count":9308,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第483期","type":"post","updated_at":1460682260,"url":"http://www.liwushuo.com/posts/1042297"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042214/content","cover_image_url":"http://img01.liwushuo.com/image/160414/aq3m2lgfw.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160414/aq3m2lgfw.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460612687,"editor_id":1020,"feature_list":[9],"id":1042214,"label_ids":[],"liked":false,"likes_count":8738,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第482期","type":"post","updated_at":1460612687,"url":"http://www.liwushuo.com/posts/1042214"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042191/content","cover_image_url":"http://img03.liwushuo.com/image/160414/c9yia2jrk.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160414/c9yia2jrk.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460604553,"editor_id":1020,"feature_list":[9],"id":1042191,"label_ids":[],"liked":false,"likes_count":11743,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第481期","type":"post","updated_at":1460604553,"url":"http://www.liwushuo.com/posts/1042191"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042146/content","cover_image_url":"http://img01.liwushuo.com/image/160413/ee7825m3k.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160413/ee7825m3k.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460537918,"editor_id":1018,"feature_list":[9],"id":1042146,"label_ids":[],"liked":false,"likes_count":8344,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第480期","type":"post","updated_at":1460537918,"url":"http://www.liwushuo.com/posts/1042146"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1042076/content","cover_image_url":"http://img02.liwushuo.com/image/160413/nw7dxejqz.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160413/nw7dxejqz.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460533183,"editor_id":1020,"feature_list":[9],"id":1042076,"label_ids":[],"liked":false,"likes_count":8815,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第479期","type":"post","updated_at":1460533183,"url":"http://www.liwushuo.com/posts/1042076"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041993/content","cover_image_url":"http://img02.liwushuo.com/image/160413/3dougq87r.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160413/3dougq87r.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460514996,"editor_id":1020,"feature_list":[9],"id":1041993,"label_ids":[],"liked":false,"likes_count":8117,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第478期","type":"post","updated_at":1460514996,"url":"http://www.liwushuo.com/posts/1041993"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041760/content","cover_image_url":"http://img03.liwushuo.com/image/160411/o3tbchnif.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160411/o3tbchnif.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460354132,"editor_id":1020,"feature_list":[9],"id":1041760,"label_ids":[],"liked":false,"likes_count":9325,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第477期","type":"post","updated_at":1460354132,"url":"http://www.liwushuo.com/posts/1041760"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041754/content","cover_image_url":"http://img02.liwushuo.com/image/160411/u5yvaf0vx.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160411/u5yvaf0vx.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460340713,"editor_id":1020,"feature_list":[9],"id":1041754,"label_ids":[],"liked":false,"likes_count":8528,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第476期","type":"post","updated_at":1460340713,"url":"http://www.liwushuo.com/posts/1041754"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041736/content","cover_image_url":"http://img01.liwushuo.com/image/160413/orn6mrfas.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160413/orn6mrfas.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460253600,"editor_id":1019,"feature_list":[9],"id":1041736,"label_ids":[],"liked":false,"likes_count":8386,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第475期","type":"post","updated_at":1460217326,"url":"http://www.liwushuo.com/posts/1041736"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041654/content","cover_image_url":"http://img01.liwushuo.com/image/160408/izapbswxe.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160408/izapbswxe.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460101519,"editor_id":1020,"feature_list":[9],"id":1041654,"label_ids":[],"liked":false,"likes_count":8275,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第474期","type":"post","updated_at":1460101519,"url":"http://www.liwushuo.com/posts/1041654"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041573/content","cover_image_url":"http://img02.liwushuo.com/image/160408/exb97pxya.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160408/exb97pxya.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1460082557,"editor_id":1020,"feature_list":[9],"id":1041573,"label_ids":[],"liked":false,"likes_count":8672,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第473期","type":"post","updated_at":1460082557,"url":"http://www.liwushuo.com/posts/1041573"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041331/content","cover_image_url":"http://img01.liwushuo.com/image/160406/du5a1jx8h.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160406/du5a1jx8h.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459922891,"editor_id":1020,"feature_list":[9],"id":1041331,"label_ids":[],"liked":false,"likes_count":8260,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第472期","type":"post","updated_at":1459922891,"url":"http://www.liwushuo.com/posts/1041331"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041293/content","cover_image_url":"http://img01.liwushuo.com/image/160406/i3ut77up5.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160406/i3ut77up5.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459910518,"editor_id":1020,"feature_list":[9],"id":1041293,"label_ids":[],"liked":false,"likes_count":8325,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第471期","type":"post","updated_at":1459910518,"url":"http://www.liwushuo.com/posts/1041293"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1041009/content","cover_image_url":"http://img03.liwushuo.com/image/160401/9qf476wtu.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160401/9qf476wtu.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459499534,"editor_id":1020,"feature_list":[9],"id":1041009,"label_ids":[],"liked":false,"likes_count":7577,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第470期","type":"post","updated_at":1459499534,"url":"http://www.liwushuo.com/posts/1041009"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040980/content","cover_image_url":"http://img01.liwushuo.com/image/160401/aos2mzarp.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160401/aos2mzarp.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459498206,"editor_id":1020,"feature_list":[9],"id":1040980,"label_ids":[],"liked":false,"likes_count":7513,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第469期","type":"post","updated_at":1459498206,"url":"http://www.liwushuo.com/posts/1040980"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040965/content","cover_image_url":"http://img03.liwushuo.com/image/160401/y8r7oyd74.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160401/y8r7oyd74.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459497026,"editor_id":1020,"feature_list":[9],"id":1040965,"label_ids":[],"liked":false,"likes_count":8601,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第468期","type":"post","updated_at":1459497026,"url":"http://www.liwushuo.com/posts/1040965"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040627/content","cover_image_url":"http://img03.liwushuo.com/image/160331/lihbt9nn1.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160331/lihbt9nn1.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459405368,"editor_id":1020,"feature_list":[9],"id":1040627,"label_ids":[],"liked":false,"likes_count":9175,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第467期","type":"post","updated_at":1459405368,"url":"http://www.liwushuo.com/posts/1040627"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040639/content","cover_image_url":"http://img02.liwushuo.com/image/160331/dtikl8hjb.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160331/dtikl8hjb.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459408190,"editor_id":1020,"feature_list":[9],"id":1040639,"label_ids":[],"liked":false,"likes_count":8091,"published_at":null,"share_msg":"&#13;","short_title":"","status":0,"template":"","title":"每日10件美好小物送给自己：第466期","type":"post","updated_at":1459408190,"url":"http://www.liwushuo.com/posts/1040639"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784},"content_type":2,"content_url":"http://www.liwushuo.com/posts/1040148/content","cover_image_url":"http://img03.liwushuo.com/image/160328/hy6k3gfyr.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160328/hy6k3gfyr.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1459389622,"editor_id":1020,"feature_list":[9],"id":1040148,"label_ids":[],"liked":false,"likes_count":9343,"published_at":1459389622,"share_msg":"&#13;","short_title":"","status":0,"template":"free.shipment","title":"每日10件美好小物送给自己：第465期","type":"post","updated_at":1459145934,"url":"http://www.liwushuo.com/posts/1040148"}]
     * posts_count : 484
     * status : 0
     * subtitle : 送给自己
     * title : 每日十件美好小物
     * updated_at : 1418184803
     * url : http://www.liwushuo.com/collections/22
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

    @Override
    public String toString() {
        return "GloriousThingBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public static class DataBean {
        private String banner_image_url;
        private String banner_webp_url;
        private String cover_image_url;
        private String cover_webp_url;
        private int created_at;
        private int id;
        /**
         * next_url : http://api.liwushuo.com/v2/collections/22/posts?limit=20&offset=20
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
         * author : {"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"}
         * column : {"banner_image_url":"http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300","category":"礼物","cover_image_url":"http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720","created_at":1466662784,"description":"每日十件小物","id":74,"order":-1,"status":0,"subtitle":"已完结","title":"每日十件美好小物","updated_at":1466662784}
         * content_type : 2
         * content_url : http://www.liwushuo.com/posts/1042456/content
         * cover_image_url : http://img02.liwushuo.com/image/160418/r1zmmcdk8.jpg-w720
         * cover_webp_url : http://img02.liwushuo.com/image/160418/r1zmmcdk8.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1461031200
         * editor_id : 1018
         * feature_list : [9]
         * id : 1042456
         * label_ids : []
         * liked : false
         * likes_count : 11839
         * published_at : null
         * share_msg : &#13;
         * short_title :
         * status : 0
         * template :
         * title : 每日10件美好小物送给自己：第484期
         * type : post
         * updated_at : 1460959497
         * url : http://www.liwushuo.com/posts/1042456
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

        @Override
        public String toString() {
            return "DataBean{" +
                    "banner_image_url='" + banner_image_url + '\'' +
                    ", banner_webp_url='" + banner_webp_url + '\'' +
                    ", cover_image_url='" + cover_image_url + '\'' +
                    ", cover_webp_url='" + cover_webp_url + '\'' +
                    ", created_at=" + created_at +
                    ", id=" + id +
                    ", paging=" + paging +
                    ", posts_count=" + posts_count +
                    ", status=" + status +
                    ", subtitle='" + subtitle + '\'' +
                    ", title='" + title + '\'' +
                    ", updated_at=" + updated_at +
                    ", url='" + url + '\'' +
                    ", posts=" + posts +
                    '}';
        }

        public static class PagingBean {
            private String next_url;

            public String getNext_url() {
                return next_url;
            }

            public void setNext_url(String next_url) {
                this.next_url = next_url;
            }

            @Override
            public String toString() {
                return "PagingBean{" +
                        "next_url='" + next_url + '\'' +
                        '}';
            }
        }

        public static class PostsBean {
            /**
             * avatar_url : http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg
             * avatar_webp_url : null
             * created_at : 1465802857
             * id : 1
             * nickname : 小礼君
             */

            private AuthorBean author;
            /**
             * banner_image_url : http://img02.liwushuo.com/image/160624/1xwm5j9xi.jpg-w300
             * category : 礼物
             * cover_image_url : http://img02.liwushuo.com/image/160624/k71j96qb1.jpg-w720
             * created_at : 1466662784
             * description : 每日十件小物
             * id : 74
             * order : -1
             * status : 0
             * subtitle : 已完结
             * title : 每日十件美好小物
             * updated_at : 1466662784
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
            private Object published_at;
            private String share_msg;
            private String short_title;
            private int status;
            private String template;
            private String title;
            private String type;
            private int updated_at;
            private String url;
            private List<?> ad_monitors;
            private List<Integer> feature_list;
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

            public Object getPublished_at() {
                return published_at;
            }

            public void setPublished_at(Object published_at) {
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

            public List<Integer> getFeature_list() {
                return feature_list;
            }

            public void setFeature_list(List<Integer> feature_list) {
                this.feature_list = feature_list;
            }

            public List<?> getLabel_ids() {
                return label_ids;
            }

            public void setLabel_ids(List<?> label_ids) {
                this.label_ids = label_ids;
            }

            @Override
            public String toString() {
                return "PostsBean{" +
                        "author=" + author +
                        ", column=" + column +
                        ", content_type=" + content_type +
                        ", content_url='" + content_url + '\'' +
                        ", cover_image_url='" + cover_image_url + '\'' +
                        ", cover_webp_url='" + cover_webp_url + '\'' +
                        ", created_at=" + created_at +
                        ", editor_id=" + editor_id +
                        ", id=" + id +
                        ", liked=" + liked +
                        ", likes_count=" + likes_count +
                        ", published_at=" + published_at +
                        ", share_msg='" + share_msg + '\'' +
                        ", short_title='" + short_title + '\'' +
                        ", status=" + status +
                        ", template='" + template + '\'' +
                        ", title='" + title + '\'' +
                        ", type='" + type + '\'' +
                        ", updated_at=" + updated_at +
                        ", url='" + url + '\'' +
                        ", ad_monitors=" + ad_monitors +
                        ", feature_list=" + feature_list +
                        ", label_ids=" + label_ids +
                        '}';
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

                @Override
                public String toString() {
                    return "AuthorBean{" +
                            "avatar_url='" + avatar_url + '\'' +
                            ", avatar_webp_url=" + avatar_webp_url +
                            ", created_at=" + created_at +
                            ", id=" + id +
                            ", nickname='" + nickname + '\'' +
                            '}';
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

                @Override
                public String toString() {
                    return "ColumnBean{" +
                            "banner_image_url='" + banner_image_url + '\'' +
                            ", category='" + category + '\'' +
                            ", cover_image_url='" + cover_image_url + '\'' +
                            ", created_at=" + created_at +
                            ", description='" + description + '\'' +
                            ", id=" + id +
                            ", order=" + order +
                            ", status=" + status +
                            ", subtitle='" + subtitle + '\'' +
                            ", title='" + title + '\'' +
                            ", updated_at=" + updated_at +
                            '}';
                }
            }
        }
    }
}
