package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 书城信息
 *
 * @author 
 * @email
 */
@TableName("xiaoshuo")
public class XiaoshuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaoshuoEntity() {

	}

	public XiaoshuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 作品名称
     */
    @TableField(value = "xiaoshuo_name")

    private String xiaoshuoName;


    /**
     * 作品封面
     */
    @TableField(value = "xiaoshuo_photo")

    private String xiaoshuoPhoto;


    /**
     * 作者
     */
    @TableField(value = "xiaoshuo_zuozhe")

    private String xiaoshuoZuozhe;


    /**
     * 字数
     */
    @TableField(value = "xiaoshuo_zishu")

    private Integer xiaoshuoZishu;


    /**
     * 作品类型
     */
    @TableField(value = "xiaoshuo_types")

    private Integer xiaoshuoTypes;


    /**
     * 点击次数
     */
    @TableField(value = "xiaoshuo_clicknum")

    private Integer xiaoshuoClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "xiaoshuo_delete")

    private Integer xiaoshuoDelete;


    /**
     * 作品简介
     */
    @TableField(value = "xiaoshuo_content")

    private String xiaoshuoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：作品名称
	 */
    public String getXiaoshuoName() {
        return xiaoshuoName;
    }
    /**
	 * 获取：作品名称
	 */

    public void setXiaoshuoName(String xiaoshuoName) {
        this.xiaoshuoName = xiaoshuoName;
    }
    /**
	 * 设置：作品封面
	 */
    public String getXiaoshuoPhoto() {
        return xiaoshuoPhoto;
    }
    /**
	 * 获取：作品封面
	 */

    public void setXiaoshuoPhoto(String xiaoshuoPhoto) {
        this.xiaoshuoPhoto = xiaoshuoPhoto;
    }
    /**
	 * 设置：作者
	 */
    public String getXiaoshuoZuozhe() {
        return xiaoshuoZuozhe;
    }
    /**
	 * 获取：作者
	 */

    public void setXiaoshuoZuozhe(String xiaoshuoZuozhe) {
        this.xiaoshuoZuozhe = xiaoshuoZuozhe;
    }
    /**
	 * 设置：字数
	 */
    public Integer getXiaoshuoZishu() {
        return xiaoshuoZishu;
    }
    /**
	 * 获取：字数
	 */

    public void setXiaoshuoZishu(Integer xiaoshuoZishu) {
        this.xiaoshuoZishu = xiaoshuoZishu;
    }
    /**
	 * 设置：作品类型
	 */
    public Integer getXiaoshuoTypes() {
        return xiaoshuoTypes;
    }
    /**
	 * 获取：作品类型
	 */

    public void setXiaoshuoTypes(Integer xiaoshuoTypes) {
        this.xiaoshuoTypes = xiaoshuoTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getXiaoshuoClicknum() {
        return xiaoshuoClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setXiaoshuoClicknum(Integer xiaoshuoClicknum) {
        this.xiaoshuoClicknum = xiaoshuoClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXiaoshuoDelete() {
        return xiaoshuoDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setXiaoshuoDelete(Integer xiaoshuoDelete) {
        this.xiaoshuoDelete = xiaoshuoDelete;
    }
    /**
	 * 设置：作品简介
	 */
    public String getXiaoshuoContent() {
        return xiaoshuoContent;
    }
    /**
	 * 获取：作品简介
	 */

    public void setXiaoshuoContent(String xiaoshuoContent) {
        this.xiaoshuoContent = xiaoshuoContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiaoshuo{" +
            "id=" + id +
            ", xiaoshuoName=" + xiaoshuoName +
            ", xiaoshuoPhoto=" + xiaoshuoPhoto +
            ", xiaoshuoZuozhe=" + xiaoshuoZuozhe +
            ", xiaoshuoZishu=" + xiaoshuoZishu +
            ", xiaoshuoTypes=" + xiaoshuoTypes +
            ", xiaoshuoClicknum=" + xiaoshuoClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", xiaoshuoDelete=" + xiaoshuoDelete +
            ", xiaoshuoContent=" + xiaoshuoContent +
            ", createTime=" + createTime +
        "}";
    }
}
