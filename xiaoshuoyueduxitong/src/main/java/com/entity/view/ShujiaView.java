package com.entity.view;

import com.entity.ShujiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 书架信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shujia")
public class ShujiaView extends ShujiaEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xiaoshuo
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
				* 作品类型的值
				*/
				private String xiaoshuoValue;
			/**
			* 点击次数
			*/
			private Integer xiaoshuoClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer xiaoshuoDelete;
			/**
			* 作品简介
			*/
			private String xiaoshuoContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ShujiaView() {

	}

	public ShujiaView(ShujiaEntity shujiaEntity) {
		try {
			BeanUtils.copyProperties(this, shujiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set xiaoshuo

					/**
					* 获取： 作品名称
					*/
					public String getXiaoshuoName() {
						return xiaoshuoName;
					}
					/**
					* 设置： 作品名称
					*/
					public void setXiaoshuoName(String xiaoshuoName) {
						this.xiaoshuoName = xiaoshuoName;
					}

					/**
					* 获取： 作品封面
					*/
					public String getXiaoshuoPhoto() {
						return xiaoshuoPhoto;
					}
					/**
					* 设置： 作品封面
					*/
					public void setXiaoshuoPhoto(String xiaoshuoPhoto) {
						this.xiaoshuoPhoto = xiaoshuoPhoto;
					}

					/**
					* 获取： 作者
					*/
					public String getXiaoshuoZuozhe() {
						return xiaoshuoZuozhe;
					}
					/**
					* 设置： 作者
					*/
					public void setXiaoshuoZuozhe(String xiaoshuoZuozhe) {
						this.xiaoshuoZuozhe = xiaoshuoZuozhe;
					}

					/**
					* 获取： 字数
					*/
					public Integer getXiaoshuoZishu() {
						return xiaoshuoZishu;
					}
					/**
					* 设置： 字数
					*/
					public void setXiaoshuoZishu(Integer xiaoshuoZishu) {
						this.xiaoshuoZishu = xiaoshuoZishu;
					}

					/**
					* 获取： 作品类型
					*/
					public Integer getXiaoshuoTypes() {
						return xiaoshuoTypes;
					}
					/**
					* 设置： 作品类型
					*/
					public void setXiaoshuoTypes(Integer xiaoshuoTypes) {
						this.xiaoshuoTypes = xiaoshuoTypes;
					}


						/**
						* 获取： 作品类型的值
						*/
						public String getXiaoshuoValue() {
							return xiaoshuoValue;
						}
						/**
						* 设置： 作品类型的值
						*/
						public void setXiaoshuoValue(String xiaoshuoValue) {
							this.xiaoshuoValue = xiaoshuoValue;
						}

					/**
					* 获取： 点击次数
					*/
					public Integer getXiaoshuoClicknum() {
						return xiaoshuoClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setXiaoshuoClicknum(Integer xiaoshuoClicknum) {
						this.xiaoshuoClicknum = xiaoshuoClicknum;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getXiaoshuoDelete() {
						return xiaoshuoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setXiaoshuoDelete(Integer xiaoshuoDelete) {
						this.xiaoshuoDelete = xiaoshuoDelete;
					}

					/**
					* 获取： 作品简介
					*/
					public String getXiaoshuoContent() {
						return xiaoshuoContent;
					}
					/**
					* 设置： 作品简介
					*/
					public void setXiaoshuoContent(String xiaoshuoContent) {
						this.xiaoshuoContent = xiaoshuoContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
