package com.entity.model;

import com.entity.XiaoshuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 书城信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoshuoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作品名称
     */
    private String xiaoshuoName;


    /**
     * 作品封面
     */
    private String xiaoshuoPhoto;


    /**
     * 作者
     */
    private String xiaoshuoZuozhe;


    /**
     * 字数
     */
    private Integer xiaoshuoZishu;


    /**
     * 作品类型
     */
    private Integer xiaoshuoTypes;


    /**
     * 点击次数
     */
    private Integer xiaoshuoClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer xiaoshuoDelete;


    /**
     * 作品简介
     */
    private String xiaoshuoContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：作品名称
	 */
    public String getXiaoshuoName() {
        return xiaoshuoName;
    }


    /**
	 * 设置：作品名称
	 */
    public void setXiaoshuoName(String xiaoshuoName) {
        this.xiaoshuoName = xiaoshuoName;
    }
    /**
	 * 获取：作品封面
	 */
    public String getXiaoshuoPhoto() {
        return xiaoshuoPhoto;
    }


    /**
	 * 设置：作品封面
	 */
    public void setXiaoshuoPhoto(String xiaoshuoPhoto) {
        this.xiaoshuoPhoto = xiaoshuoPhoto;
    }
    /**
	 * 获取：作者
	 */
    public String getXiaoshuoZuozhe() {
        return xiaoshuoZuozhe;
    }


    /**
	 * 设置：作者
	 */
    public void setXiaoshuoZuozhe(String xiaoshuoZuozhe) {
        this.xiaoshuoZuozhe = xiaoshuoZuozhe;
    }
    /**
	 * 获取：字数
	 */
    public Integer getXiaoshuoZishu() {
        return xiaoshuoZishu;
    }


    /**
	 * 设置：字数
	 */
    public void setXiaoshuoZishu(Integer xiaoshuoZishu) {
        this.xiaoshuoZishu = xiaoshuoZishu;
    }
    /**
	 * 获取：作品类型
	 */
    public Integer getXiaoshuoTypes() {
        return xiaoshuoTypes;
    }


    /**
	 * 设置：作品类型
	 */
    public void setXiaoshuoTypes(Integer xiaoshuoTypes) {
        this.xiaoshuoTypes = xiaoshuoTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getXiaoshuoClicknum() {
        return xiaoshuoClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setXiaoshuoClicknum(Integer xiaoshuoClicknum) {
        this.xiaoshuoClicknum = xiaoshuoClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXiaoshuoDelete() {
        return xiaoshuoDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setXiaoshuoDelete(Integer xiaoshuoDelete) {
        this.xiaoshuoDelete = xiaoshuoDelete;
    }
    /**
	 * 获取：作品简介
	 */
    public String getXiaoshuoContent() {
        return xiaoshuoContent;
    }


    /**
	 * 设置：作品简介
	 */
    public void setXiaoshuoContent(String xiaoshuoContent) {
        this.xiaoshuoContent = xiaoshuoContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
