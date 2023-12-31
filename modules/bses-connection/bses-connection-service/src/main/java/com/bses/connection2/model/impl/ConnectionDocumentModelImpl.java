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

import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.model.ConnectionDocumentModel;
import com.bses.connection2.model.ConnectionDocumentSoap;

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
 * The base model implementation for the ConnectionDocument service. Represents a row in the &quot;bsesconn_ConnectionDocument&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ConnectionDocumentModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConnectionDocumentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentImpl
 * @generated
 */
@JSON(strict = true)
public class ConnectionDocumentModelImpl
	extends BaseModelImpl<ConnectionDocument>
	implements ConnectionDocumentModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a connection document model instance should use the <code>ConnectionDocument</code> interface instead.
	 */
	public static final String TABLE_NAME = "bsesconn_ConnectionDocument";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"connectionDocumentId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"connectionRequestId", Types.BIGINT}, {"documentType", Types.VARCHAR},
		{"documentName", Types.VARCHAR}, {"documentPath", Types.VARCHAR},
		{"clientFileName", Types.VARCHAR}, {"transfered", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("connectionDocumentId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("connectionRequestId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("documentType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("documentPath", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("clientFileName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("transfered", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table bsesconn_ConnectionDocument (uuid_ VARCHAR(75) null,connectionDocumentId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,connectionRequestId LONG,documentType VARCHAR(255) null,documentName VARCHAR(255) null,documentPath VARCHAR(1024) null,clientFileName VARCHAR(255) null,transfered VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table bsesconn_ConnectionDocument";

	public static final String ORDER_BY_JPQL =
		" ORDER BY connectionDocument.connectionDocumentId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY bsesconn_ConnectionDocument.connectionDocumentId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.bses.connection2.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.bses.connection2.model.ConnectionDocument"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.bses.connection2.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.bses.connection2.model.ConnectionDocument"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.bses.connection2.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.bses.connection2.model.ConnectionDocument"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long CONNECTIONREQUESTID_COLUMN_BITMASK = 2L;

	public static final long DOCUMENTTYPE_COLUMN_BITMASK = 4L;

	public static final long GROUPID_COLUMN_BITMASK = 8L;

	public static final long UUID_COLUMN_BITMASK = 16L;

	public static final long CONNECTIONDOCUMENTID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ConnectionDocument toModel(ConnectionDocumentSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ConnectionDocument model = new ConnectionDocumentImpl();

		model.setUuid(soapModel.getUuid());
		model.setConnectionDocumentId(soapModel.getConnectionDocumentId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setConnectionRequestId(soapModel.getConnectionRequestId());
		model.setDocumentType(soapModel.getDocumentType());
		model.setDocumentName(soapModel.getDocumentName());
		model.setDocumentPath(soapModel.getDocumentPath());
		model.setClientFileName(soapModel.getClientFileName());
		model.setTransfered(soapModel.getTransfered());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ConnectionDocument> toModels(
		ConnectionDocumentSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<ConnectionDocument> models = new ArrayList<ConnectionDocument>(
			soapModels.length);

		for (ConnectionDocumentSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.bses.connection2.service.util.ServiceProps.get(
			"lock.expiration.time.com.bses.connection2.model.ConnectionDocument"));

	public ConnectionDocumentModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _connectionDocumentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setConnectionDocumentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connectionDocumentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionDocument.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<ConnectionDocument, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<ConnectionDocument, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ConnectionDocument, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((ConnectionDocument)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<ConnectionDocument, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<ConnectionDocument, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(ConnectionDocument)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<ConnectionDocument, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<ConnectionDocument, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, ConnectionDocument>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			ConnectionDocument.class.getClassLoader(), ConnectionDocument.class,
			ModelWrapper.class);

		try {
			Constructor<ConnectionDocument> constructor =
				(Constructor<ConnectionDocument>)proxyClass.getConstructor(
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

	private static final Map<String, Function<ConnectionDocument, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<ConnectionDocument, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<ConnectionDocument, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<ConnectionDocument, Object>>();
		Map<String, BiConsumer<ConnectionDocument, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<ConnectionDocument, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument, Object uuidObject) {

					connectionDocument.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"connectionDocumentId",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getConnectionDocumentId();
				}

			});
		attributeSetterBiConsumers.put(
			"connectionDocumentId",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object connectionDocumentIdObject) {

					connectionDocument.setConnectionDocumentId(
						(Long)connectionDocumentIdObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object groupIdObject) {

					connectionDocument.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object companyIdObject) {

					connectionDocument.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object userIdObject) {

					connectionDocument.setUserId((Long)userIdObject);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object userNameObject) {

					connectionDocument.setUserName((String)userNameObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object createDateObject) {

					connectionDocument.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object modifiedDateObject) {

					connectionDocument.setModifiedDate(
						(Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"connectionRequestId",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getConnectionRequestId();
				}

			});
		attributeSetterBiConsumers.put(
			"connectionRequestId",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object connectionRequestIdObject) {

					connectionDocument.setConnectionRequestId(
						(Long)connectionRequestIdObject);
				}

			});
		attributeGetterFunctions.put(
			"documentType",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getDocumentType();
				}

			});
		attributeSetterBiConsumers.put(
			"documentType",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object documentTypeObject) {

					connectionDocument.setDocumentType(
						(String)documentTypeObject);
				}

			});
		attributeGetterFunctions.put(
			"documentName",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getDocumentName();
				}

			});
		attributeSetterBiConsumers.put(
			"documentName",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object documentNameObject) {

					connectionDocument.setDocumentName(
						(String)documentNameObject);
				}

			});
		attributeGetterFunctions.put(
			"documentPath",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getDocumentPath();
				}

			});
		attributeSetterBiConsumers.put(
			"documentPath",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object documentPathObject) {

					connectionDocument.setDocumentPath(
						(String)documentPathObject);
				}

			});
		attributeGetterFunctions.put(
			"clientFileName",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getClientFileName();
				}

			});
		attributeSetterBiConsumers.put(
			"clientFileName",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object clientFileNameObject) {

					connectionDocument.setClientFileName(
						(String)clientFileNameObject);
				}

			});
		attributeGetterFunctions.put(
			"transfered",
			new Function<ConnectionDocument, Object>() {

				@Override
				public Object apply(ConnectionDocument connectionDocument) {
					return connectionDocument.getTransfered();
				}

			});
		attributeSetterBiConsumers.put(
			"transfered",
			new BiConsumer<ConnectionDocument, Object>() {

				@Override
				public void accept(
					ConnectionDocument connectionDocument,
					Object transferedObject) {

					connectionDocument.setTransfered((String)transferedObject);
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
	public long getConnectionDocumentId() {
		return _connectionDocumentId;
	}

	@Override
	public void setConnectionDocumentId(long connectionDocumentId) {
		_columnBitmask = -1L;

		_connectionDocumentId = connectionDocumentId;
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
	public long getConnectionRequestId() {
		return _connectionRequestId;
	}

	@Override
	public void setConnectionRequestId(long connectionRequestId) {
		_columnBitmask |= CONNECTIONREQUESTID_COLUMN_BITMASK;

		if (!_setOriginalConnectionRequestId) {
			_setOriginalConnectionRequestId = true;

			_originalConnectionRequestId = _connectionRequestId;
		}

		_connectionRequestId = connectionRequestId;
	}

	public long getOriginalConnectionRequestId() {
		return _originalConnectionRequestId;
	}

	@JSON
	@Override
	public String getDocumentType() {
		if (_documentType == null) {
			return "";
		}
		else {
			return _documentType;
		}
	}

	@Override
	public void setDocumentType(String documentType) {
		_columnBitmask |= DOCUMENTTYPE_COLUMN_BITMASK;

		if (_originalDocumentType == null) {
			_originalDocumentType = _documentType;
		}

		_documentType = documentType;
	}

	public String getOriginalDocumentType() {
		return GetterUtil.getString(_originalDocumentType);
	}

	@JSON
	@Override
	public String getDocumentName() {
		if (_documentName == null) {
			return "";
		}
		else {
			return _documentName;
		}
	}

	@Override
	public void setDocumentName(String documentName) {
		_documentName = documentName;
	}

	@JSON
	@Override
	public String getDocumentPath() {
		if (_documentPath == null) {
			return "";
		}
		else {
			return _documentPath;
		}
	}

	@Override
	public void setDocumentPath(String documentPath) {
		_documentPath = documentPath;
	}

	@JSON
	@Override
	public String getClientFileName() {
		if (_clientFileName == null) {
			return "";
		}
		else {
			return _clientFileName;
		}
	}

	@Override
	public void setClientFileName(String clientFileName) {
		_clientFileName = clientFileName;
	}

	@JSON
	@Override
	public String getTransfered() {
		if (_transfered == null) {
			return "";
		}
		else {
			return _transfered;
		}
	}

	@Override
	public void setTransfered(String transfered) {
		_transfered = transfered;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(ConnectionDocument.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), ConnectionDocument.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ConnectionDocument toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, ConnectionDocument>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ConnectionDocumentImpl connectionDocumentImpl =
			new ConnectionDocumentImpl();

		connectionDocumentImpl.setUuid(getUuid());
		connectionDocumentImpl.setConnectionDocumentId(
			getConnectionDocumentId());
		connectionDocumentImpl.setGroupId(getGroupId());
		connectionDocumentImpl.setCompanyId(getCompanyId());
		connectionDocumentImpl.setUserId(getUserId());
		connectionDocumentImpl.setUserName(getUserName());
		connectionDocumentImpl.setCreateDate(getCreateDate());
		connectionDocumentImpl.setModifiedDate(getModifiedDate());
		connectionDocumentImpl.setConnectionRequestId(getConnectionRequestId());
		connectionDocumentImpl.setDocumentType(getDocumentType());
		connectionDocumentImpl.setDocumentName(getDocumentName());
		connectionDocumentImpl.setDocumentPath(getDocumentPath());
		connectionDocumentImpl.setClientFileName(getClientFileName());
		connectionDocumentImpl.setTransfered(getTransfered());

		connectionDocumentImpl.resetOriginalValues();

		return connectionDocumentImpl;
	}

	@Override
	public int compareTo(ConnectionDocument connectionDocument) {
		int value = 0;

		if (getConnectionDocumentId() <
				connectionDocument.getConnectionDocumentId()) {

			value = -1;
		}
		else if (getConnectionDocumentId() >
					connectionDocument.getConnectionDocumentId()) {

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

		if (!(object instanceof ConnectionDocument)) {
			return false;
		}

		ConnectionDocument connectionDocument = (ConnectionDocument)object;

		long primaryKey = connectionDocument.getPrimaryKey();

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
		_originalConnectionRequestId = _connectionRequestId;

		_setOriginalConnectionRequestId = false;

		_originalDocumentType = _documentType;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<ConnectionDocument> toCacheModel() {
		ConnectionDocumentCacheModel connectionDocumentCacheModel =
			new ConnectionDocumentCacheModel();

		connectionDocumentCacheModel.uuid = getUuid();

		String uuid = connectionDocumentCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			connectionDocumentCacheModel.uuid = null;
		}

		connectionDocumentCacheModel.connectionDocumentId =
			getConnectionDocumentId();

		connectionDocumentCacheModel.groupId = getGroupId();

		connectionDocumentCacheModel.companyId = getCompanyId();

		connectionDocumentCacheModel.userId = getUserId();

		connectionDocumentCacheModel.userName = getUserName();

		String userName = connectionDocumentCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			connectionDocumentCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			connectionDocumentCacheModel.createDate = createDate.getTime();
		}
		else {
			connectionDocumentCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			connectionDocumentCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			connectionDocumentCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		connectionDocumentCacheModel.connectionRequestId =
			getConnectionRequestId();

		connectionDocumentCacheModel.documentType = getDocumentType();

		String documentType = connectionDocumentCacheModel.documentType;

		if ((documentType != null) && (documentType.length() == 0)) {
			connectionDocumentCacheModel.documentType = null;
		}

		connectionDocumentCacheModel.documentName = getDocumentName();

		String documentName = connectionDocumentCacheModel.documentName;

		if ((documentName != null) && (documentName.length() == 0)) {
			connectionDocumentCacheModel.documentName = null;
		}

		connectionDocumentCacheModel.documentPath = getDocumentPath();

		String documentPath = connectionDocumentCacheModel.documentPath;

		if ((documentPath != null) && (documentPath.length() == 0)) {
			connectionDocumentCacheModel.documentPath = null;
		}

		connectionDocumentCacheModel.clientFileName = getClientFileName();

		String clientFileName = connectionDocumentCacheModel.clientFileName;

		if ((clientFileName != null) && (clientFileName.length() == 0)) {
			connectionDocumentCacheModel.clientFileName = null;
		}

		connectionDocumentCacheModel.transfered = getTransfered();

		String transfered = connectionDocumentCacheModel.transfered;

		if ((transfered != null) && (transfered.length() == 0)) {
			connectionDocumentCacheModel.transfered = null;
		}

		return connectionDocumentCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<ConnectionDocument, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<ConnectionDocument, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ConnectionDocument, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((ConnectionDocument)this));
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
		Map<String, Function<ConnectionDocument, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<ConnectionDocument, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<ConnectionDocument, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((ConnectionDocument)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, ConnectionDocument>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _connectionDocumentId;
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
	private long _connectionRequestId;
	private long _originalConnectionRequestId;
	private boolean _setOriginalConnectionRequestId;
	private String _documentType;
	private String _originalDocumentType;
	private String _documentName;
	private String _documentPath;
	private String _clientFileName;
	private String _transfered;
	private long _columnBitmask;
	private ConnectionDocument _escapedModel;

}