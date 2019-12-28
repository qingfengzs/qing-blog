- 分类表
CREATE TABLE `category` (
  `category_id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT '分类id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `is_effective` tinyint(1) DEFAULT '1' COMMENT '表示当前数据是否有效，默认为1有效，0则无效',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
CREATE TABLE `article_category` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
    `aid` bigint NOT NULL,
    `cid` bigint NOT NULL,
    PRIMARY KEY(`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `article_view` (
  `id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `aid` bigint(40) NOT NULL COMMENT '文章ID',
  `user_name` varchar(64) NOT NULL COMMENT '浏览者用户名',
  `ip` varchar(20) NOT NULL COMMENT '访问IP',
  `create_by` datetime NOT NULL COMMENT '访问时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `sys_log` (
  `id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ip` varchar(20) NOT NULL DEFAULT '' COMMENT '操作地址的IP',
  `operate_user` varchar(64) COMMENT '操作者',
  `create_time` datetime NOT NULL COMMENT '操作时间',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '操作内容',
  `operate_url` varchar(50) NOT NULL DEFAULT '' COMMENT '操作的访问地址'
  `operate_by` varchar(20) DEFAULT '' COMMENT '操作的浏览器',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `article_picture` (
  `id` bigint(40) NOT NULL AUTO_INCREMENT,
  `article_id` bigint(40) NOT NULL COMMENT '对应文章id',
  `picture_url` varchar(100) NOT NULL DEFAULT '' COMMENT '图片url',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `is_active` tinyint COMMENT '是否生效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='这张表用来保存题图url，每一篇文章都应该有题图';