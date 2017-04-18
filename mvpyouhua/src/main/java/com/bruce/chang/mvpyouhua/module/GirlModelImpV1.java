package com.bruce.chang.mvpyouhua.module;


import com.bruce.chang.mvpyouhua.bean.GirlBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator
 * Date:2017/2/18
 * Time:21:56
 * Author:BruceChang
 * Function:IGirlModel接口的实现类，负责加载（获取）数据
 */

public class GirlModelImpV1 implements IGirlModel {


    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<GirlBean> data = new ArrayList<GirlBean>();
        //模仿本地或者网络加载数据
        data.add(new GirlBean("http://wx1.sinaimg.cn/mw690/4b7a8989ly1fcusukwifaj21jk2bch9l.jpg", "姚晨", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        data.add(new GirlBean("http://wx2.sinaimg.cn/mw690/5fe0e4fbgy1fcutkcmflkj20et0m8dho.jpg", "林志颖", "这次要和粉丝们一起去游重庆啰！[耶]第一次坐绿皮火车非常新鲜"));
        data.add(new GirlBean("http://wx2.sinaimg.cn/mw690/490c9f28gy1fcus6u06x6j20yi0puqd7.jpg", "吕一", "自由，旅行，探索，故事，是为了更好的重塑自我，迎接接下来的每一个挑战"));
        data.add(new GirlBean("http://wx4.sinaimg.cn/mw690/67433fffly1fcurd2gl0xj20qo140gqn.jpg", "潘长江", "越到最后，越有很多不舍，想给大家带去更多的快乐，喜剧难弄，农村喜剧更难"));
        data.add(new GirlBean("http://wx1.sinaimg.cn/mw690/64354652gy1fcur4swt00j20le0sgdki.jpg", "刘若英", "此次西班牙、法蘭克福最後一趟的登機完成！沒有準備零食上飛機，有點空虛"));
        data.add(new GirlBean("http://wx1.sinaimg.cn/mw690/687b6bfdly1fcuqtf46ivj21sg1sg7wl.jpg", "姚晨1", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        data.add(new GirlBean("http://wx2.sinaimg.cn/mw690/4d207c8bgy1fcumh546o3j21hr1zkkjo.jpg", "姚晨2", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        data.add(new GirlBean("http://wx1.sinaimg.cn/mw690/4b7a8989ly1fcusukwifaj21jk2bch9l.jpg", "姚晨3", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        data.add(new GirlBean("http://wx3.sinaimg.cn/mw690/743352c8ly1fctg9bdo3uj20fc0mcmzd.jpg", "姚晨4", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        data.add(new GirlBean("http://wx1.sinaimg.cn/mw690/4b7a8989ly1fcusukwifaj21jk2bch9l.jpg", "姚晨5", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        data.add(new GirlBean("http://wx1.sinaimg.cn/mw690/4b7a8989ly1fcusukwifaj21jk2bch9l.jpg", "姚晨6", "哺乳期肥真是一种无法言说的肥，好在摄影师够好"));
        //回调监听
        girlOnLoadListener.onComplete(data);
    }
}
