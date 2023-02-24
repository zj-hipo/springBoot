package com.zj.springboot.desinPattern.observer;


/**
 * 订阅者者接口
 * 当博客更新文章时,有哪些地方需要同步更新?
 * 1. 个人文章统计总数+1
 *2. 个人积分数+n
 *3. 关注者消息推送+1
 *4. 分类推送添加...
 */

public interface Reader {
    public void update(String title,String message);
}
