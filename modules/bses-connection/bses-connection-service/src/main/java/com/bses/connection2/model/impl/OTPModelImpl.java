/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.bses.connection2.model.impl;

import com.bses.connection2.model.OTP;
import com.bses.connection2.model.OTPModel;
import com.bses.connection2.model.OTPSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the OTP service. Represents a row in the &quot;bsesconn_OTP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>OTPModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OTPImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OTPImpl
 * @generated
 */
@JSON(strict = true)
public class OTPModelImpl extends BaseModelImpl<OTP> implements OTPModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a otp model instance should use the <code>OTP</code> interface instead.
	 */
	public static final String TABLE_NAME = "bsesconn_OTP";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"otpId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"otp", Types.VARCHAR}, {"mobileNo", Types.VARCHAR},
		{"emailId", Types.VARCHAR}, {"expiryTime", Types.TIMESTAMP},
		{"caNumber", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("otpId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("otp", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mobileNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("expiryTime", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("caNumber", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table bsesconn_OTP (uuid_ VARCHAR(75) null,otpId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,otp VARCHAR(75) null,mobileNo VARCHAR(75) null,emailId VARCHAR(75) null,expiryTime DATE null,caNumber VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table bsesconn_OTP";

	public static final String ORDER_BY_JPQL = " ORDER BY otp.otpId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY bsesconn_OTP.otpId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.bses.connection2.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.bses.connection2.model.OTP"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.bses.connection2.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.bses.connection2.model.OTP"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.bses.connection2.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.bses.connection2.model.OTP"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long EMAILID_COLUMN_BITMASK = 2L;

	public static final long GROUPID_COLUMN_BITMASK = 4L;

	public static final long MOBILENO_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

	public static final long OTPID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static OTP toModel(OTPSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		OTP model = new OTPImpl();

		model.setUuid(soapModel.getUuid());
		model.setOtpId(soapModel.getOtpId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setOtp(soapModel.getOtp());
		model.setMobileNo(soapModel.getMobileNo());
		model.setEmailId(soapModel.getEmailId());
		model.setExpiryTime(soapModel.getExpiryTime());
		model.setCaNumber(soapModel.getCaNumber());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<OTP> toModels(OTPSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<OTP> models = new ArrayList<OTP>(soapModels.length);

		for (OTPSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.bses.connection2.service.util.ServiceProps.get(
			"lock.expiration.time.com.bses.connection2.model.OTP"));

	public OTPModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _otpId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setOtpId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _otpId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return OTP.class;
	}

	@Override
	public String getModelClassName() {
		return OTP.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<OTP, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<OTP, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OTP, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((OTP)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<OTP, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<OTP, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((OTP)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<OTP, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<OTP, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, OTP>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			OTP.class.getClassLoader(), OTP.class, ModelWrapper.class);

		try {
			Constructor<OTP> constructor =
				(Constructor<OTP>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<OTP, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<OTP, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<OTP, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<OTP, Object>>();
		Map<String, BiConsumer<OTP, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<OTP, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object uuidObject) {
					otp.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"otpId",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getOtpId();
				}

			});
		attributeSetterBiConsumers.put(
			"otpId",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object otpIdObject) {
					otp.setOtpId((Long)otpIdObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object groupIdObject) {
					otp.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object companyIdObject) {
					otp.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object userIdObject) {
					otp.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object userNameObject) {
					otp.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object createDateObject) {
					otp.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object modifiedDateObject) {
					otp.setModifiedDate((Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"otp",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getOtp();
				}

			});
		attributeSetterBiConsumers.put(
			"otp",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object otpObject) {
					otp.setOtp((String)otpObject);
				}

			});
		attributeGetterFunctions.put(
			"mobileNo",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getMobileNo();
				}

			});
		attributeSetterBiConsumers.put(
			"mobileNo",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object mobileNoObject) {
					otp.setMobileNo((String)mobileNoObject);
				}

			});
		attributeGetterFunctions.put(
			"emailId",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getEmailId();
				}

			});
		attributeSetterBiConsumers.put(
			"emailId",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object emailIdObject) {
					otp.setEmailId((String)emailIdObject);
				}

			});
		attributeGetterFunctions.put(
			"expiryTime",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getExpiryTime();
				}

			});
		attributeSetterBiConsumers.put(
			"expiryTime",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object expiryTimeObject) {
					otp.setExpiryTime((Date)expiryTimeObject);
				}

			});
		attributeGetterFunctions.put(
			"caNumber",
			new Function<OTP, Object>() {

				@Override
				public Object apply(OTP otp) {
					return otp.getCaNumber();
				}

			});
		attributeSetterBiConsumers.put(
			"caNumber",
			new BiConsumer<OTP, Object>() {

				@Override
				public void accept(OTP otp, Object caNumberObject) {
					otp.setCaNumber((String)caNumberObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getOtpId() {
		return _otpId;
	}

	@Override
	public void setOtpId(long otpId) {
		_columnBitmask = -1L;

		_otpId = otpId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getOtp() {
		if (_otp == null) {
			return "";
		}
		else {
			return _otp;
		}
	}

	@Override
	public void setOtp(String otp) {
		_otp = otp;
	}

	@JSON
	@Override
	public String getMobileNo() {
		if (_mobileNo == null) {
			return "";
		}
		else {
			return _mobileNo;
		}
	}

	@Override
	public void setMobileNo(String mobileNo) {
		_columnBitmask |= MOBILENO_COLUMN_BITMASK;

		if (_originalMobileNo == null) {
			_originalMobileNo = _mobileNo;
		}

		_mobileNo = mobileNo;
	}

	public String getOriginalMobileNo() {
		return GetterUtil.getString(_originalMobileNo);
	}

	@JSON
	@Override
	public String getEmailId() {
		if (_emailId == null) {
			return "";
		}
		else {
			return _emailId;
		}
	}

	@Override
	public void setEmailId(String emailId) {
		_columnBitmask |= EMAILID_COLUMN_BITMASK;

		if (_originalEmailId == null) {
			_originalEmailId = _emailId;
		}

		_emailId = emailId;
	}

	public String getOriginalEmailId() {
		return GetterUtil.getString(_originalEmailId);
	}

	@JSON
	@Override
	public Date getExpiryTime() {
		return _expiryTime;
	}

	@Override
	public void setExpiryTime(Date expiryTime) {
		_expiryTime = expiryTime;
	}

	@JSON
	@Override
	public String getCaNumber() {
		if (_caNumber == null) {
			return "";
		}
		else {
			return _caNumber;
		}
	}

	@Override
	public void setCaNumber(String caNumber) {
		_caNumber = caNumber;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(OTP.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), OTP.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public OTP toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, OTP> escapedModelProxyProviderFunction =
				EscapedModelProxyProviderFunctionHolder.
					_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OTPImpl otpImpl = new OTPImpl();

		otpImpl.setUuid(getUuid());
		otpImpl.setOtpId(getOtpId());
		otpImpl.setGroupId(getGroupId());
		otpImpl.setCompanyId(getCompanyId());
		otpImpl.setUserId(getUserId());
		otpImpl.setUserName(getUserName());
		otpImpl.setCreateDate(getCreateDate());
		otpImpl.setModifiedDate(getModifiedDate());
		otpImpl.setOtp(getOtp());
		otpImpl.setMobileNo(getMobileNo());
		otpImpl.setEmailId(getEmailId());
		otpImpl.setExpiryTime(getExpiryTime());
		otpImpl.setCaNumber(getCaNumber());

		otpImpl.resetOriginalValues();

		return otpImpl;
	}

	@Override
	public int compareTo(OTP otp) {
		int value = 0;

		if (getOtpId() < otp.getOtpId()) {
			value = -1;
		}
		else if (getOtpId() > otp.getOtpId()) {
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

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OTP)) {
			return false;
		}

		OTP otp = (OTP)object;

		long primaryKey = otp.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_originalUuid = _uuid;

		_originalGroupId = _groupId;

		_setOriginalGroupId = false;

		_originalCompanyId = _companyId;

		_setOriginalCompanyId = false;

		_setModifiedDate = false;

		_originalMobileNo = _mobileNo;

		_originalEmailId = _emailId;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<OTP> toCacheModel() {
		OTPCacheModel otpCacheModel = new OTPCacheModel();

		otpCacheModel.uuid = getUuid();

		String uuid = otpCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			otpCacheModel.uuid = null;
		}

		otpCacheModel.otpId = getOtpId();

		otpCacheModel.groupId = getGroupId();

		otpCacheModel.companyId = getCompanyId();

		otpCacheModel.userId = getUserId();

		otpCacheModel.userName = getUserName();

		String userName = otpCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			otpCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			otpCacheModel.createDate = createDate.getTime();
		}
		else {
			otpCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			otpCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			otpCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		otpCacheModel.otp = getOtp();

		String otp = otpCacheModel.otp;

		if ((otp != null) && (otp.length() == 0)) {
			otpCacheModel.otp = null;
		}

		otpCacheModel.mobileNo = getMobileNo();

		String mobileNo = otpCacheModel.mobileNo;

		if ((mobileNo != null) && (mobileNo.length() == 0)) {
			otpCacheModel.mobileNo = null;
		}

		otpCacheModel.emailId = getEmailId();

		String emailId = otpCacheModel.emailId;

		if ((emailId != null) && (emailId.length() == 0)) {
			otpCacheModel.emailId = null;
		}

		Date expiryTime = getExpiryTime();

		if (expiryTime != null) {
			otpCacheModel.expiryTime = expiryTime.getTime();
		}
		else {
			otpCacheModel.expiryTime = Long.MIN_VALUE;
		}

		otpCacheModel.caNumber = getCaNumber();

		String caNumber = otpCacheModel.caNumber;

		if ((caNumber != null) && (caNumber.length() == 0)) {
			otpCacheModel.caNumber = null;
		}

		return otpCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<OTP, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<OTP, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OTP, Object> attributeGetterFunction = entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((OTP)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<OTP, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<OTP, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<OTP, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((OTP)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, OTP>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _otpId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _otp;
	private String _mobileNo;
	private String _originalMobileNo;
	private String _emailId;
	private String _originalEmailId;
	private Date _expiryTime;
	private String _caNumber;
	private long _columnBitmask;
	private OTP _escapedModel;

}