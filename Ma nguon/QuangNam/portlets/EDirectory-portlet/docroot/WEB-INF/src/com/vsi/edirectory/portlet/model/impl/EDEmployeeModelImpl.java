/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vsi.edirectory.portlet.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.vsi.edirectory.portlet.model.EDEmployee;
import com.vsi.edirectory.portlet.model.EDEmployeeModel;
import com.vsi.edirectory.portlet.model.EDEmployeeSoap;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the EDEmployee service. Represents a row in the &quot;EDEmployee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.vsi.edirectory.portlet.model.EDEmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EDEmployeeImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a e d employee model instance should use the {@link com.vsi.edirectory.portlet.model.EDEmployee} interface instead.
 * </p>
 *
 * @author vinhnt
 * @see EDEmployeeImpl
 * @see com.vsi.edirectory.portlet.model.EDEmployee
 * @see com.vsi.edirectory.portlet.model.EDEmployeeModel
 * @generated
 */
public class EDEmployeeModelImpl extends BaseModelImpl<EDEmployee>
	implements EDEmployeeModel {
	public static final String TABLE_NAME = "EDEmployee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", new Integer(Types.VARCHAR) },
			{ "id_", new Integer(Types.BIGINT) },
			{ "createdDate", new Integer(Types.TIMESTAMP) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "title", new Integer(Types.VARCHAR) },
			{ "name", new Integer(Types.VARCHAR) },
			{ "birthday", new Integer(Types.TIMESTAMP) },
			{ "homeSide", new Integer(Types.VARCHAR) },
			{ "family", new Integer(Types.VARCHAR) },
			{ "race", new Integer(Types.VARCHAR) },
			{ "home", new Integer(Types.VARCHAR) },
			{ "homePhone", new Integer(Types.VARCHAR) },
			{ "workPhone", new Integer(Types.VARCHAR) },
			{ "mobilePhone", new Integer(Types.VARCHAR) },
			{ "email", new Integer(Types.VARCHAR) },
			{ "departmentId", new Integer(Types.BIGINT) },
			{ "majorLevel", new Integer(Types.VARCHAR) },
			{ "philosophism", new Integer(Types.VARCHAR) },
			{ "foreignLanguage", new Integer(Types.VARCHAR) },
			{ "joinDate", new Integer(Types.TIMESTAMP) },
			{ "image", new Integer(Types.VARCHAR) },
			{ "isShowTree", new Integer(Types.BOOLEAN) },
			{ "otherInfo", new Integer(Types.VARCHAR) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "languageId", new Integer(Types.VARCHAR) },
			{ "displayOrder", new Integer(Types.BIGINT) },
			{ "sex", new Integer(Types.VARCHAR) },
			{ "status", new Integer(Types.BIGINT) },
			{ "show", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table EDEmployee (uuid_ VARCHAR(75) null,id_ LONG not null primary key,createdDate DATE null,modifiedDate DATE null,title VARCHAR(75) null,name VARCHAR(500) null,birthday DATE null,homeSide VARCHAR(500) null,family VARCHAR(500) null,race VARCHAR(500) null,home VARCHAR(500) null,homePhone VARCHAR(500) null,workPhone VARCHAR(500) null,mobilePhone VARCHAR(500) null,email VARCHAR(500) null,departmentId LONG,majorLevel VARCHAR(500) null,philosophism VARCHAR(500) null,foreignLanguage VARCHAR(500) null,joinDate DATE null,image VARCHAR(500) null,isShowTree BOOLEAN,otherInfo VARCHAR(1000) null,companyId LONG,groupId LONG,userId LONG,languageId VARCHAR(75) null,displayOrder LONG,sex VARCHAR(75) null,status LONG,show VARCHAR(150) null)";
	public static final String TABLE_SQL_DROP = "drop table EDEmployee";
	public static final String ORDER_BY_JPQL = " ORDER BY edEmployee.displayOrder ASC";
	public static final String ORDER_BY_SQL = " ORDER BY EDEmployee.displayOrder ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.vsi.edirectory.portlet.model.EDEmployee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.vsi.edirectory.portlet.model.EDEmployee"),
			true);

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EDEmployee toModel(EDEmployeeSoap soapModel) {
		EDEmployee model = new EDEmployeeImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setCreatedDate(soapModel.getCreatedDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTitle(soapModel.getTitle());
		model.setName(soapModel.getName());
		model.setBirthday(soapModel.getBirthday());
		model.setHomeSide(soapModel.getHomeSide());
		model.setFamily(soapModel.getFamily());
		model.setRace(soapModel.getRace());
		model.setHome(soapModel.getHome());
		model.setHomePhone(soapModel.getHomePhone());
		model.setWorkPhone(soapModel.getWorkPhone());
		model.setMobilePhone(soapModel.getMobilePhone());
		model.setEmail(soapModel.getEmail());
		model.setDepartmentId(soapModel.getDepartmentId());
		model.setMajorLevel(soapModel.getMajorLevel());
		model.setPhilosophism(soapModel.getPhilosophism());
		model.setForeignLanguage(soapModel.getForeignLanguage());
		model.setJoinDate(soapModel.getJoinDate());
		model.setImage(soapModel.getImage());
		model.setIsShowTree(soapModel.getIsShowTree());
		model.setOtherInfo(soapModel.getOtherInfo());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setLanguageId(soapModel.getLanguageId());
		model.setDisplayOrder(soapModel.getDisplayOrder());
		model.setSex(soapModel.getSex());
		model.setStatus(soapModel.getStatus());
		model.setShow(soapModel.getShow());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EDEmployee> toModels(EDEmployeeSoap[] soapModels) {
		List<EDEmployee> models = new ArrayList<EDEmployee>(soapModels.length);

		for (EDEmployeeSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.vsi.edirectory.portlet.model.EDEmployee"));

	public EDEmployeeModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		if (!_setOriginalId) {
			_setOriginalId = true;

			_originalId = _id;
		}

		_id = id;
	}

	public long getOriginalId() {
		return _originalId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getHomeSide() {
		if (_homeSide == null) {
			return StringPool.BLANK;
		}
		else {
			return _homeSide;
		}
	}

	public void setHomeSide(String homeSide) {
		_homeSide = homeSide;
	}

	public String getFamily() {
		if (_family == null) {
			return StringPool.BLANK;
		}
		else {
			return _family;
		}
	}

	public void setFamily(String family) {
		_family = family;
	}

	public String getRace() {
		if (_race == null) {
			return StringPool.BLANK;
		}
		else {
			return _race;
		}
	}

	public void setRace(String race) {
		_race = race;
	}

	public String getHome() {
		if (_home == null) {
			return StringPool.BLANK;
		}
		else {
			return _home;
		}
	}

	public void setHome(String home) {
		_home = home;
	}

	public String getHomePhone() {
		if (_homePhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _homePhone;
		}
	}

	public void setHomePhone(String homePhone) {
		_homePhone = homePhone;
	}

	public String getWorkPhone() {
		if (_workPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _workPhone;
		}
	}

	public void setWorkPhone(String workPhone) {
		_workPhone = workPhone;
	}

	public String getMobilePhone() {
		if (_mobilePhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _mobilePhone;
		}
	}

	public void setMobilePhone(String mobilePhone) {
		_mobilePhone = mobilePhone;
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_email = email;
	}

	public long getDepartmentId() {
		return _departmentId;
	}

	public void setDepartmentId(long departmentId) {
		if (!_setOriginalDepartmentId) {
			_setOriginalDepartmentId = true;

			_originalDepartmentId = _departmentId;
		}

		_departmentId = departmentId;
	}

	public long getOriginalDepartmentId() {
		return _originalDepartmentId;
	}

	public String getMajorLevel() {
		if (_majorLevel == null) {
			return StringPool.BLANK;
		}
		else {
			return _majorLevel;
		}
	}

	public void setMajorLevel(String majorLevel) {
		_majorLevel = majorLevel;
	}

	public String getPhilosophism() {
		if (_philosophism == null) {
			return StringPool.BLANK;
		}
		else {
			return _philosophism;
		}
	}

	public void setPhilosophism(String philosophism) {
		_philosophism = philosophism;
	}

	public String getForeignLanguage() {
		if (_foreignLanguage == null) {
			return StringPool.BLANK;
		}
		else {
			return _foreignLanguage;
		}
	}

	public void setForeignLanguage(String foreignLanguage) {
		_foreignLanguage = foreignLanguage;
	}

	public Date getJoinDate() {
		return _joinDate;
	}

	public void setJoinDate(Date joinDate) {
		_joinDate = joinDate;
	}

	public String getImage() {
		if (_image == null) {
			return StringPool.BLANK;
		}
		else {
			return _image;
		}
	}

	public void setImage(String image) {
		_image = image;
	}

	public boolean getIsShowTree() {
		return _isShowTree;
	}

	public boolean isIsShowTree() {
		return _isShowTree;
	}

	public void setIsShowTree(boolean isShowTree) {
		_isShowTree = isShowTree;
	}

	public String getOtherInfo() {
		if (_otherInfo == null) {
			return StringPool.BLANK;
		}
		else {
			return _otherInfo;
		}
	}

	public void setOtherInfo(String otherInfo) {
		_otherInfo = otherInfo;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getLanguageId() {
		if (_languageId == null) {
			return StringPool.BLANK;
		}
		else {
			return _languageId;
		}
	}

	public void setLanguageId(String languageId) {
		_languageId = languageId;
	}

	public long getDisplayOrder() {
		return _displayOrder;
	}

	public void setDisplayOrder(long displayOrder) {
		_displayOrder = displayOrder;
	}

	public String getSex() {
		if (_sex == null) {
			return StringPool.BLANK;
		}
		else {
			return _sex;
		}
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	public long getStatus() {
		return _status;
	}

	public void setStatus(long status) {
		_status = status;
	}

	public String getShow() {
		if (_show == null) {
			return StringPool.BLANK;
		}
		else {
			return _show;
		}
	}

	public void setShow(String show) {
		_show = show;
	}

	public EDEmployee toEscapedModel() {
		if (isEscapedModel()) {
			return (EDEmployee)this;
		}
		else {
			return (EDEmployee)Proxy.newProxyInstance(EDEmployee.class.getClassLoader(),
				new Class[] { EDEmployee.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					EDEmployee.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		EDEmployeeImpl edEmployeeImpl = new EDEmployeeImpl();

		edEmployeeImpl.setUuid(getUuid());

		EDEmployeeModelImpl edEmployeeModelImpl = edEmployeeImpl;

		edEmployeeModelImpl._originalUuid = edEmployeeModelImpl._uuid;

		edEmployeeImpl.setId(getId());

		edEmployeeModelImpl._originalId = edEmployeeModelImpl._id;

		edEmployeeModelImpl._setOriginalId = false;
		edEmployeeImpl.setCreatedDate(getCreatedDate());

		edEmployeeImpl.setModifiedDate(getModifiedDate());

		edEmployeeImpl.setTitle(getTitle());

		edEmployeeImpl.setName(getName());

		edEmployeeImpl.setBirthday(getBirthday());

		edEmployeeImpl.setHomeSide(getHomeSide());

		edEmployeeImpl.setFamily(getFamily());

		edEmployeeImpl.setRace(getRace());

		edEmployeeImpl.setHome(getHome());

		edEmployeeImpl.setHomePhone(getHomePhone());

		edEmployeeImpl.setWorkPhone(getWorkPhone());

		edEmployeeImpl.setMobilePhone(getMobilePhone());

		edEmployeeImpl.setEmail(getEmail());

		edEmployeeImpl.setDepartmentId(getDepartmentId());

		edEmployeeModelImpl._originalDepartmentId = edEmployeeModelImpl._departmentId;

		edEmployeeModelImpl._setOriginalDepartmentId = false;
		edEmployeeImpl.setMajorLevel(getMajorLevel());

		edEmployeeImpl.setPhilosophism(getPhilosophism());

		edEmployeeImpl.setForeignLanguage(getForeignLanguage());

		edEmployeeImpl.setJoinDate(getJoinDate());

		edEmployeeImpl.setImage(getImage());

		edEmployeeImpl.setIsShowTree(getIsShowTree());

		edEmployeeImpl.setOtherInfo(getOtherInfo());

		edEmployeeImpl.setCompanyId(getCompanyId());

		edEmployeeImpl.setGroupId(getGroupId());

		edEmployeeModelImpl._originalGroupId = edEmployeeModelImpl._groupId;

		edEmployeeModelImpl._setOriginalGroupId = false;
		edEmployeeImpl.setUserId(getUserId());

		edEmployeeImpl.setLanguageId(getLanguageId());

		edEmployeeImpl.setDisplayOrder(getDisplayOrder());

		edEmployeeImpl.setSex(getSex());

		edEmployeeImpl.setStatus(getStatus());

		edEmployeeImpl.setShow(getShow());

		return edEmployeeImpl;
	}

	public int compareTo(EDEmployee edEmployee) {
		int value = 0;

		if (getDisplayOrder() < edEmployee.getDisplayOrder()) {
			value = -1;
		}
		else if (getDisplayOrder() > edEmployee.getDisplayOrder()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		EDEmployee edEmployee = null;

		try {
			edEmployee = (EDEmployee)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = edEmployee.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(63);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", id=");
		sb.append(getId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", birthday=");
		sb.append(getBirthday());
		sb.append(", homeSide=");
		sb.append(getHomeSide());
		sb.append(", family=");
		sb.append(getFamily());
		sb.append(", race=");
		sb.append(getRace());
		sb.append(", home=");
		sb.append(getHome());
		sb.append(", homePhone=");
		sb.append(getHomePhone());
		sb.append(", workPhone=");
		sb.append(getWorkPhone());
		sb.append(", mobilePhone=");
		sb.append(getMobilePhone());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", departmentId=");
		sb.append(getDepartmentId());
		sb.append(", majorLevel=");
		sb.append(getMajorLevel());
		sb.append(", philosophism=");
		sb.append(getPhilosophism());
		sb.append(", foreignLanguage=");
		sb.append(getForeignLanguage());
		sb.append(", joinDate=");
		sb.append(getJoinDate());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", isShowTree=");
		sb.append(getIsShowTree());
		sb.append(", otherInfo=");
		sb.append(getOtherInfo());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", languageId=");
		sb.append(getLanguageId());
		sb.append(", displayOrder=");
		sb.append(getDisplayOrder());
		sb.append(", sex=");
		sb.append(getSex());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", show=");
		sb.append(getShow());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(97);

		sb.append("<model><model-name>");
		sb.append("com.vsi.edirectory.portlet.model.EDEmployee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthday</column-name><column-value><![CDATA[");
		sb.append(getBirthday());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>homeSide</column-name><column-value><![CDATA[");
		sb.append(getHomeSide());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>family</column-name><column-value><![CDATA[");
		sb.append(getFamily());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>race</column-name><column-value><![CDATA[");
		sb.append(getRace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>home</column-name><column-value><![CDATA[");
		sb.append(getHome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>homePhone</column-name><column-value><![CDATA[");
		sb.append(getHomePhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>workPhone</column-name><column-value><![CDATA[");
		sb.append(getWorkPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobilePhone</column-name><column-value><![CDATA[");
		sb.append(getMobilePhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>departmentId</column-name><column-value><![CDATA[");
		sb.append(getDepartmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>majorLevel</column-name><column-value><![CDATA[");
		sb.append(getMajorLevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>philosophism</column-name><column-value><![CDATA[");
		sb.append(getPhilosophism());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>foreignLanguage</column-name><column-value><![CDATA[");
		sb.append(getForeignLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>joinDate</column-name><column-value><![CDATA[");
		sb.append(getJoinDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isShowTree</column-name><column-value><![CDATA[");
		sb.append(getIsShowTree());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>otherInfo</column-name><column-value><![CDATA[");
		sb.append(getOtherInfo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>languageId</column-name><column-value><![CDATA[");
		sb.append(getLanguageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>displayOrder</column-name><column-value><![CDATA[");
		sb.append(getDisplayOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sex</column-name><column-value><![CDATA[");
		sb.append(getSex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>show</column-name><column-value><![CDATA[");
		sb.append(getShow());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private String _originalUuid;
	private long _id;
	private long _originalId;
	private boolean _setOriginalId;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _title;
	private String _name;
	private Date _birthday;
	private String _homeSide;
	private String _family;
	private String _race;
	private String _home;
	private String _homePhone;
	private String _workPhone;
	private String _mobilePhone;
	private String _email;
	private long _departmentId;
	private long _originalDepartmentId;
	private boolean _setOriginalDepartmentId;
	private String _majorLevel;
	private String _philosophism;
	private String _foreignLanguage;
	private Date _joinDate;
	private String _image;
	private boolean _isShowTree;
	private String _otherInfo;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private String _languageId;
	private long _displayOrder;
	private String _sex;
	private long _status;
	private String _show;
	private transient ExpandoBridge _expandoBridge;
}