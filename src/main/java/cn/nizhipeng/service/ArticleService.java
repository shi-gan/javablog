package cn.nizhipeng.service;

import cn.nizhipeng.domain.Article;
import cn.nizhipeng.domain.PageBean;
import cn.nizhipeng.domain.Reply;
import cn.nizhipeng.domain.Words;

import java.util.List;
import java.util.Map;

/**
 * @author TyCoding
 * @date 2018/5/3 上午8:36
 */
public interface ArticleService {

    void saveArticle(Article article);

    PageBean<Article> findByPage(int pageCode, int pageSize, Map<String, Object> conMap);

    void delete(int r_id);

    void update(Article article);

    Article findById(int r_id);

    void clean(int r_id);

    void restore(int r_id);

    void saveWords(Words words);

    void saveReply(Reply reply);

    List<Words> findByWords();

    List<Reply> findByReply();
}
