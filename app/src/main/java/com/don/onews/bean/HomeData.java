package com.don.onews.bean;

import java.util.List;

/**
 * Created by drcom on 2017/3/17.
 */

public class HomeData {

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"b4b38b2f87bbc42c48cba1a95ff6c90f","title":"为这事，北京市委召开全会闭门学习 郭金龙严令：不容七嘴八舌","date":"2017-03-17 14:16","category":"头条","author_name":"北京日报","url":"http://mini.eastday.com/mobile/170317141606697.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170317/20170317141606_1a72e6f0b7a84dd863430f1b8e9b5906_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170317/20170317141606_1a72e6f0b7a84dd863430f1b8e9b5906_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170317/20170317141606_876811bd6f1912e692615058e8f46f80_3_mwpm_03200403.jpeg"},{"uniquekey":"9c351eb8dff259557e368b58e01dc4e4","title":"伊拉克驻华大使： \u201c一带一路\u201d倡议对中东和平有非常积极的作用","date":"2017-03-17 14:27","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170317142745571.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170317/20170317142745_7ad414350af31f184cf7d2dd85c9adab_1_mwpm_03200403.jpeg"},{"uniquekey":"270c3e660eece84036c1f6e0fd6c4cf5","title":"马英九：两岸统一要循序渐进 且必须台湾民众同意","date":"2017-03-17 14:18","category":"头条","author_name":"海外网","url":"http://mini.eastday.com/mobile/170317141833821.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170317/20170317141833_7878f4a8ac2df255de2538afde321d51_1_mwpm_03200403.jpeg"},{"uniquekey":"05a62832859cdb035447c9cc110a2a2b","title":"香港旺角暴乱首宗暴动罪罪成：3男女各被判入狱3年","date":"2017-03-17 14:18","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170317141811690.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170317/20170317141811_313ae712e51661bbfee62f99eb6eb9a2_1_mwpm_03200403.jpeg"},{"uniquekey":"ccf524cec071874b17dadc16b439f967","title":"偷偷与特朗普总统长孙自拍 美国两特工接受调查","date":"2017-03-17 14:13","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170317141342682.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170317/20170317141342_af751d3bd47a25bc25d41b071c1e4fb6_1_mwpm_03200403.jpeg"},{"uniquekey":"02559785d49e62eaaca90d6ae5760e00","title":"马雅舒一家四口现身混血儿女颜值逆天","date":"2017-03-17 13:52","category":"头条","author_name":"凤凰网娱乐","url":"http://mini.eastday.com/mobile/170317135254229.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170317/20170317135254_67e847ac88f760b96d4c6a4d8bad1b51_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170317/20170317135254_67e847ac88f760b96d4c6a4d8bad1b51_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170317/20170317135254_67e847ac88f760b96d4c6a4d8bad1b51_3_mwpm_03200403.jpeg"},{"uniquekey":"2ea9ecdba5fd2cf7d1e0f144b1ab5f1a","title":"史上年纪最小的皇后排行榜：6岁当皇后 15岁成太后","date":"2017-03-17 13:49","category":"头条","author_name":"北青网综合","url":"http://mini.eastday.com/mobile/170317134910568.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170317/20170317134910_0bb4e5dd816934a2b335bdfdb0fea349_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170317/20170317134910_fa6d559744d81024913e4c3b4794214c_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170317/20170317134910_8ff0ca30dfc8db0c9fa83ac49ec889c0_3_mwpm_03200403.jpeg"},{"uniquekey":"ce035f200cdfb7b2f49576118ee92a5d","title":"曾经的巅峰狙击手因长相被迫强制退役，战绩辉煌无比！","date":"2017-03-17 13:47","category":"头条","author_name":"国际百家","url":"http://mini.eastday.com/mobile/170317134704426.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317_57bd6b0f71c835e11a603ce9254501c6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317_e04c7841db0470ef94d815b6dc07cef1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317_08d3d79028d1f3e690c93482808ab54f_mwpm_03200403.jpg"},{"uniquekey":"a09f1d4511e368ae755511705b5b753d","title":"丽江\u201c女游客遭暴打毁容\u201d案进展：法院已依法受理","date":"2017-03-17 13:47","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170317134700834.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170317/20170317134700_8ac7839777f621f28257a6eebb5c8402_1_mwpm_03200403.jpeg"},{"uniquekey":"aae47cfcc5d3f206f3fcde209e155052","title":"100岁高龄800多次当爹，龟界播种机\u201c超级迭哥\u201d！","date":"2017-03-17 13:41","category":"头条","author_name":"中国金鱼","url":"http://mini.eastday.com/mobile/170317134115059.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170317/20170317134115_de9e61825df47f0f786999de32ffb051_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170317/20170317134115_de9e61825df47f0f786999de32ffb051_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170317/20170317134115_de9e61825df47f0f786999de32ffb051_3_mwpm_03200403.jpeg"},{"uniquekey":"9484710fe097fd83853244ae23c87816","title":"生下的女儿眼睛双眼皮，父亲倍感怀疑做完亲子鉴定后，他尴尬了","date":"2017-03-17 13:38","category":"头条","author_name":"育儿微刊","url":"http://mini.eastday.com/mobile/170317133851529.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170317/20170317_6e9dd4e9cfadf8cc3e2713749858f5fb_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170317/20170317_1e8406acb6084fef01e17433df6cc45f_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170317/20170317_a416de6c40e61ab74bc7b895715687a9_cover_mwpm_03200403.jpeg"},{"uniquekey":"1dd849f5071cf097c87f62e7ca6b76d4","title":"塞拉利昂发现一颗706克拉钻石  价值或超4亿元","date":"2017-03-17 13:37","category":"头条","author_name":"Mail Online","url":"http://mini.eastday.com/mobile/170317133752445.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170317/20170317133752_af21c409b5000aed2a3cdd8addf762cc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170317/20170317133752_ac27cab95a42fa8ca4e0ea81661e9a6b_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170317/20170317133752_933cef2ff826ec1d252fe35e2b026a0e_3_mwpm_03200403.jpeg"},{"uniquekey":"eeea5341c72b9302e544161eeba757b7","title":"出生在农历几月出生的女人命最好有旺夫运吧，前五名，有你吗！","date":"2017-03-17 13:32","category":"头条","author_name":"星座命盘","url":"http://mini.eastday.com/mobile/170317133247134.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170317/20170317_e712843c65f571a0dbaf377adc0b7400_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170317/20170317_acefc6d931988a5805d41619252c08d3_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170317/20170317_29521f40d5e85a076716c9df9e36ac57_cover_mwpm_03200403.png"},{"uniquekey":"09277c040047f8365a25ba23549b6323","title":"适合各种人群的核心力量训练法，你还不来试试","date":"2017-03-17 13:29","category":"头条","author_name":"小熊谈健身","url":"http://mini.eastday.com/mobile/170317132916478.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317_73099620082dec6839a793674ea702ef_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317_3d2644934f14d502fc52cc6cd942532d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317_efdd007538c90b91f0a6ef7df063fa1e_cover_mwpm_03200403.jpeg"},{"uniquekey":"a618d0f711a072d17d491a02cc074f3f","title":"古代的女官只是为了满足皇帝的一切需求，而且下场相当凄惨！","date":"2017-03-17 13:19","category":"头条","author_name":"天天身边事","url":"http://mini.eastday.com/mobile/170317131958102.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170317/20170317_b44346fec7cb60801453bd2a0de65b4a_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170317/20170317_2b59efbcd6299bc1de7e6b80b2b6aa57_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170317/20170317_94b4a37229a006eef13852a388247fff_cover_mwpm_03200403.jpeg"},{"uniquekey":"e3ecd9078a68720972efc36bb6392f0a","title":"31省份财政预算一览｜12地下调2017预算收入增长目标","date":"2017-03-17 13:19","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170317131933670.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170317/20170317131933_4e16f6194ecd4ce2a261452d0ed8ffc7_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170317/20170317131933_4e16f6194ecd4ce2a261452d0ed8ffc7_3_mwpm_03200403.jpeg"},{"uniquekey":"61154aca3d13358a93b8545c21157e41","title":"本拉登死之后，他的四位妻子与27个儿女生活怎样！","date":"2017-03-17 13:14","category":"头条","author_name":"国际时事军事","url":"http://mini.eastday.com/mobile/170317131411370.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170317/20170317_59aec994e5f7ecd6c5404002592772f7_mwpm_03200403.png","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170317/20170317_376ca7d2c0dffc13499205a8e475d4c2_mwpm_03200403.png","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170317/20170317_e275b80683ef2b54ae34fc4c58895ab3_mwpm_03200403.png"},{"uniquekey":"6fede63de42394152121e3dd42744740","title":"美国务卿拒绝与韩外长共进晚餐 韩方不高兴","date":"2017-03-17 13:11","category":"头条","author_name":"观察者","url":"http://mini.eastday.com/mobile/170317131149727.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170317/20170317131149_7a8bf312d11f1959e547a4190fb1d89d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170317/20170317131149_7a8bf312d11f1959e547a4190fb1d89d_2_mwpm_03200403.jpeg"},{"uniquekey":"1755b41e9d0eb8313b1787ecc0cec9fb","title":"侵犯11岁女童不成，男子竟用砖头拍死她刚满月的妹妹！","date":"2017-03-17 13:09","category":"头条","author_name":"微观资讯","url":"http://mini.eastday.com/mobile/170317130955010.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170317/20170317_6425361637821d541c07699ac00e0463_cover_mwpm_03200403.jpeg"},{"uniquekey":"df8015140ad8c2451e879a770a182259","title":"女孩一路走进西湖 不是自寻短见竟是被\u201c它\u201d所害！","date":"2017-03-17 13:09","category":"头条","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170317130917867.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317130917_362a575870422803a5bffe854c6a2310_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317130917_a0669d09528a6300acb715ea61617344_2_mwpm_03200403.png","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317130917_e37d2dc504bb7a1516383bb958b45ca3_3_mwpm_03200403.png"},{"uniquekey":"fb1bb039c91269320aadba072bb3bdf6","title":"军媒揭秘真实\u201c钢七连\u201d：巡逻踩到地雷，种菜挖到炮弹","date":"2017-03-17 13:06","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170317130606058.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317130606_532af259c0c47c4ef4cf014fa1441f44_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317130606_532af259c0c47c4ef4cf014fa1441f44_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317130606_532af259c0c47c4ef4cf014fa1441f44_3_mwpm_03200403.jpeg"},{"uniquekey":"5d6ddd3ac2507fe72c38b1c3cec578d3","title":"中国与沙特签650亿美元大单 含嫦娥4号及核反应堆等","date":"2017-03-17 13:04","category":"头条","author_name":"观察者网","url":"http://mini.eastday.com/mobile/170317130444635.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317130444_52665361bcec242e49ffb1951cee8f12_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317130444_52665361bcec242e49ffb1951cee8f12_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317130444_52665361bcec242e49ffb1951cee8f12_3_mwpm_03200403.jpeg"},{"uniquekey":"8317edabf4427642dfda9c07b388d7b9","title":"和马云撞脸的网红小家伙的现实生活是什么样的呢？","date":"2017-03-17 12:59","category":"头条","author_name":"小依说社会","url":"http://mini.eastday.com/mobile/170317125948487.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170317/20170317_a6cd63528d15120ea3259696b98b4cc1_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170317/20170317_f9a3d0ddc9bb12e52d9dc51a6a161160_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170317/20170317_06699cd9fa39231614e8337e32ca0ac1_cover_mwpm_03200403.jpeg"},{"uniquekey":"e4f1041207e3aa04138daf0c4e0a6f27","title":"新加坡一姐郭妃丽，嫁大10岁洋老外满头白发，超级幸福！","date":"2017-03-17 12:57","category":"头条","author_name":"卓不凡","url":"http://mini.eastday.com/mobile/170317125731575.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317_a6ead7cde41f94f4391131e98e8e2d3a_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317_37851e51efc42ac4ad16bfcd22eec99b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317_20a6d9308263a1f553206aa75fbfc706_cover_mwpm_03200403.jpeg"},{"uniquekey":"1dc1a25b00b808a51fcef7369908560c","title":"刚放生的鱼就被人钓走了！做善事竟让好心变杀心","date":"2017-03-17 12:55","category":"头条","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170317125535132.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170317/20170317125535_92dd54818f8a2d362762e6b7522f967c_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170317/20170317125535_6865abdf362a946261fbf61272598282_2_mwpm_03200403.png","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170317/20170317125535_24b4f0a3798f854039e3a32c66385283_3_mwpm_03200403.png"},{"uniquekey":"4703d8f69359b46ae8c5acd345f3de2f","title":"性感女护士走红 前凸后翘身材火辣性感让24万粉丝仰慕","date":"2017-03-17 12:49","category":"头条","author_name":"北方网","url":"http://mini.eastday.com/mobile/170317124916893.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170317/20170317124916_f5617790bc7c21577c43fb5330fa4dd9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170317/20170317124916_f5617790bc7c21577c43fb5330fa4dd9_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170317/20170317124916_f5617790bc7c21577c43fb5330fa4dd9_3_mwpm_03200403.jpeg"},{"uniquekey":"5388842c7d37a2a4527f5c79999c1a7d","title":"24岁嫁入千亿豪门，如今怀第五胎获十亿红包！","date":"2017-03-17 12:46","category":"头条","author_name":"中华网","url":"http://mini.eastday.com/mobile/170317124604541.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170317/20170317124604_1a870d097c685dfc6cd9b750d8a384f3_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170317/20170317124604_1a870d097c685dfc6cd9b750d8a384f3_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170317/20170317124604_1a870d097c685dfc6cd9b750d8a384f3_3_mwpm_03200403.jpeg"},{"uniquekey":"7155e0865c03b441876c67f78a0c712e","title":"中国首个以群岛设立的地级市，如今已成为海洋经济强市","date":"2017-03-17 12:43","category":"头条","author_name":"旅游行者","url":"http://mini.eastday.com/mobile/170317124353824.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170317/20170317124353_5e716b59a90db59634c3e676b4d3ef47_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170317/20170317124353_5e716b59a90db59634c3e676b4d3ef47_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170317/20170317124353_5e716b59a90db59634c3e676b4d3ef47_3_mwpm_03200403.jpeg"},{"uniquekey":"a3982d3ca9f8e8579bfbee59efd02b82","title":"李湘女儿王诗龄为什么如此胖？看看他们家吃什么就知道了","date":"2017-03-17 12:33","category":"头条","author_name":"天师张品漫","url":"http://mini.eastday.com/mobile/170317123301457.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170317/20170317_21b7372de7240eb7a327c7e3514d18ca_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170317/20170317_a23f1772670438fdf8e95117efbb2efd_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170317/20170317_2119e77a7d715a385fc6bdea129100c0_cover_mwpm_03200403.jpeg"},{"uniquekey":"9b4e9cb62d2e6a14c480be078d10c736","title":"张家界导游怎么收费、信誉好的导游多少一天呢？","date":"2017-03-17 12:32","category":"头条","author_name":"一个游子","url":"http://mini.eastday.com/mobile/170317123252103.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170317/20170317123252_83bba4cd25140b933830115b34eab559_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170317/20170317123252_83bba4cd25140b933830115b34eab559_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170317/20170317123252_83bba4cd25140b933830115b34eab559_3_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : b4b38b2f87bbc42c48cba1a95ff6c90f
             * title : 为这事，北京市委召开全会闭门学习 郭金龙严令：不容七嘴八舌
             * date : 2017-03-17 14:16
             * category : 头条
             * author_name : 北京日报
             * url : http://mini.eastday.com/mobile/170317141606697.html
             * thumbnail_pic_s : http://00.imgmini.eastday.com/mobile/20170317/20170317141606_1a72e6f0b7a84dd863430f1b8e9b5906_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://00.imgmini.eastday.com/mobile/20170317/20170317141606_1a72e6f0b7a84dd863430f1b8e9b5906_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://00.imgmini.eastday.com/mobile/20170317/20170317141606_876811bd6f1912e692615058e8f46f80_3_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
