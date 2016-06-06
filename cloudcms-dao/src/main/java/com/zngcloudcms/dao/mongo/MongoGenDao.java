package com.zngcloudcms.dao.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public abstract class MongoGenDao<T> {
	@Autowired
    protected MongoTemplate mongoTemplate;

    
    /**
     * 保存一个对象
     *
     * @author
     *                
     * @param t
     * @return
     */
    public void save(T t){
        this.mongoTemplate.save(t);
    }    
    
    /**
     * 为属性自动注入bean服务
     *
     * @author
     *                
     * @param mongoTemplate
     */
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
