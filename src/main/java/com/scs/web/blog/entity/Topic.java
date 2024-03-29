package com.scs.web.blog.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author mq_xu
 * @ClassName Topic
 * @Description TODO
 * @Date 23:56 2019/11/13
 * @Version 1.0
 **/
@Data
public class Topic {
    private Long id;
    private String name;
    private String logo;
    private Integer articles;
    private Integer follows;
    private LocalDateTime createTime;
}
