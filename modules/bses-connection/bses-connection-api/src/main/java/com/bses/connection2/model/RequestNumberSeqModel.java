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

package com.bses.connection2.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the RequestNumberSeq service. Represents a row in the &quot;bsesconn_RequestNumberSeq&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.bses.connection2.model.impl.RequestNumberSeqImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeq
 * @generated
 */
@ProviderType
public interface RequestNumberSeqModel
	extends BaseModel<RequestNumberSeq>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a request number seq model instance should use the {@link RequestNumberSeq} interface instead.
	 */

	/**
	 * Returns the primary key of this request number seq.
	 *
	 * @return the primary key of this request number seq
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this request number seq.
	 *
	 * @param primaryKey the primary key of this request number seq
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this request number seq.
	 *
	 * @return the uuid of this request number seq
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this request number seq.
	 *
	 * @param uuid the uuid of this request number seq
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the request number seq ID of this request number seq.
	 *
	 * @return the request number seq ID of this request number seq
	 */
	public long getRequestNumberSeqId();

	/**
	 * Sets the request number seq ID of this request number seq.
	 *
	 * @param requestNumberSeqId the request number seq ID of this request number seq
	 */
	public void setRequestNumberSeqId(long requestNumberSeqId);

	/**
	 * Returns the group ID of this request number seq.
	 *
	 * @return the group ID of this request number seq
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this request number seq.
	 *
	 * @param groupId the group ID of this request number seq
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this request number seq.
	 *
	 * @return the company ID of this request number seq
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this request number seq.
	 *
	 * @param companyId the company ID of this request number seq
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this request number seq.
	 *
	 * @return the user ID of this request number seq
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this request number seq.
	 *
	 * @param userId the user ID of this request number seq
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this request number seq.
	 *
	 * @return the user uuid of this request number seq
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this request number seq.
	 *
	 * @param userUuid the user uuid of this request number seq
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this request number seq.
	 *
	 * @return the user name of this request number seq
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this request number seq.
	 *
	 * @param userName the user name of this request number seq
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this request number seq.
	 *
	 * @return the create date of this request number seq
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this request number seq.
	 *
	 * @param createDate the create date of this request number seq
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this request number seq.
	 *
	 * @return the modified date of this request number seq
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this request number seq.
	 *
	 * @param modifiedDate the modified date of this request number seq
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the seq date of this request number seq.
	 *
	 * @return the seq date of this request number seq
	 */
	@AutoEscape
	public String getSeqDate();

	/**
	 * Sets the seq date of this request number seq.
	 *
	 * @param seqDate the seq date of this request number seq
	 */
	public void setSeqDate(String seqDate);

	/**
	 * Returns the seq number of this request number seq.
	 *
	 * @return the seq number of this request number seq
	 */
	public long getSeqNumber();

	/**
	 * Sets the seq number of this request number seq.
	 *
	 * @param seqNumber the seq number of this request number seq
	 */
	public void setSeqNumber(long seqNumber);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(RequestNumberSeq requestNumberSeq);

	@Override
	public int hashCode();

	@Override
	public CacheModel<RequestNumberSeq> toCacheModel();

	@Override
	public RequestNumberSeq toEscapedModel();

	@Override
	public RequestNumberSeq toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}