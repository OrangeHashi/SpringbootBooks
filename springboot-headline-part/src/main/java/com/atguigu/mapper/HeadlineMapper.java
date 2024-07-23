package com.atguigu.mapper;

import com.atguigu.pojo.Headline;
import com.atguigu.pojo.vo.PortalVo;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author orange
* @description 针对表【news_headline】的数据库操作Mapper
* @createDate 2024-07-21 21:59:47
* @Entity com.atguigu.domain.Headline
*/
public interface HeadlineMapper extends BaseMapper<Headline> {

    IPage<Map> selectMyPage(IPage iPage,@Param("portalVo") PortalVo portalVo);

    Map queryDetialMap(Integer hid);
}




