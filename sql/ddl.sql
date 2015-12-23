-- 用户
CREATE TABLE `b_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(64) NOT NULL DEFAULT '' COMMENT '名称',
  `deleted` tinyint NOT NULL DEFAULT '0' COMMENT '是否删除: 0 否, 1 是',
  `created_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `modify_time` DATETIME DEFAULT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

