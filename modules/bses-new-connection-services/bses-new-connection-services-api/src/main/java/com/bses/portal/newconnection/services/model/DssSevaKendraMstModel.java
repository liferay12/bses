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

package com.bses.portal.newconnection.services.model;

import aQute.bnd.annotation.ProviderType;

import com.bses.portal.newconnection.services.service.persistence.DssSevaKendraMstPK;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DssSevaKendraMst service. Represents a row in the &quot;DSS_SEVAKENDRA_MST&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMst
 * @generated
 */
@ProviderType
public interface DssSevaKendraMstModel extends BaseModel<DssSevaKendraMst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dss seva kendra mst model instance should use the {@link DssSevaKendraMst} interface instead.
	 */

	/**
	 * Returns the primary key of this dss seva kendra mst.
	 *
	 * @return the primary key of this dss seva kendra mst
	 */
	public DssSevaKendraMstPK getPrimaryKey();

	/**
	 * Sets the primary key of this dss seva kendra mst.
	 *
	 * @param primaryKey the primary key of this dss seva kendra mst
	 */
	public void setPrimaryKey(DssSevaKendraMstPK primaryKey);

	/**
	 * Returns the district of this dss seva kendra mst.
	 *
	 * @return the district of this dss seva kendra mst
	 */
	@AutoEscape
	public String getDistrict();

	/**
	 * Sets the district of this dss seva kendra mst.
	 *
	 * @param district the district of this dss seva kendra mst
	 */
	public void setDistrict(String district);

	/**
	 * Returns the sk addr p2 of this dss seva kendra mst.
	 *
	 * @return the sk addr p2 of this dss seva kendra mst
	 */
	@AutoEscape
	public String getSkAddrP2();

	/**
	 * Sets the sk addr p2 of this dss seva kendra mst.
	 *
	 * @param skAddrP2 the sk addr p2 of this dss seva kendra mst
	 */
	public void setSkAddrP2(String skAddrP2);

	/**
	 * Returns the active of this dss seva kendra mst.
	 *
	 * @return the active of this dss seva kendra mst
	 */
	@AutoEscape
	public String getActive();

	/**
	 * Sets the active of this dss seva kendra mst.
	 *
	 * @param active the active of this dss seva kendra mst
	 */
	public void setActive(String active);

	/**
	 * Returns the entry date of this dss seva kendra mst.
	 *
	 * @return the entry date of this dss seva kendra mst
	 */
	public Date getEntryDate();

	/**
	 * Sets the entry date of this dss seva kendra mst.
	 *
	 * @param entryDate the entry date of this dss seva kendra mst
	 */
	public void setEntryDate(Date entryDate);

	/**
	 * Returns the dc machine ip of this dss seva kendra mst.
	 *
	 * @return the dc machine ip of this dss seva kendra mst
	 */
	@AutoEscape
	public String getDcMachineIp();

	/**
	 * Sets the dc machine ip of this dss seva kendra mst.
	 *
	 * @param dcMachineIp the dc machine ip of this dss seva kendra mst
	 */
	public void setDcMachineIp(String dcMachineIp);

	/**
	 * Returns the sk address p1 of this dss seva kendra mst.
	 *
	 * @return the sk address p1 of this dss seva kendra mst
	 */
	@AutoEscape
	public String getSkAddressP1();

	/**
	 * Sets the sk address p1 of this dss seva kendra mst.
	 *
	 * @param skAddressP1 the sk address p1 of this dss seva kendra mst
	 */
	public void setSkAddressP1(String skAddressP1);

	/**
	 * Returns the telephone no of this dss seva kendra mst.
	 *
	 * @return the telephone no of this dss seva kendra mst
	 */
	@AutoEscape
	public String getTelephoneNo();

	/**
	 * Sets the telephone no of this dss seva kendra mst.
	 *
	 * @param telephoneNo the telephone no of this dss seva kendra mst
	 */
	public void setTelephoneNo(String telephoneNo);

	/**
	 * Returns the name of this dss seva kendra mst.
	 *
	 * @return the name of this dss seva kendra mst
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this dss seva kendra mst.
	 *
	 * @param name the name of this dss seva kendra mst
	 */
	public void setName(String name);

	/**
	 * Returns the appoitnment days interval of this dss seva kendra mst.
	 *
	 * @return the appoitnment days interval of this dss seva kendra mst
	 */
	public Integer getAppoitnmentDaysInterval();

	/**
	 * Sets the appoitnment days interval of this dss seva kendra mst.
	 *
	 * @param appoitnmentDaysInterval the appoitnment days interval of this dss seva kendra mst
	 */
	public void setAppoitnmentDaysInterval(Integer appoitnmentDaysInterval);

	/**
	 * Returns the appslotcount of this dss seva kendra mst.
	 *
	 * @return the appslotcount of this dss seva kendra mst
	 */
	public Integer getAppslotcount();

	/**
	 * Sets the appslotcount of this dss seva kendra mst.
	 *
	 * @param appslotcount the appslotcount of this dss seva kendra mst
	 */
	public void setAppslotcount(Integer appslotcount);

	/**
	 * Returns the gpslink of this dss seva kendra mst.
	 *
	 * @return the gpslink of this dss seva kendra mst
	 */
	@AutoEscape
	public String getGpslink();

	/**
	 * Sets the gpslink of this dss seva kendra mst.
	 *
	 * @param gpslink the gpslink of this dss seva kendra mst
	 */
	public void setGpslink(String gpslink);

	/**
	 * Returns the youtubelinkenglish of this dss seva kendra mst.
	 *
	 * @return the youtubelinkenglish of this dss seva kendra mst
	 */
	@AutoEscape
	public String getYoutubelinkenglish();

	/**
	 * Sets the youtubelinkenglish of this dss seva kendra mst.
	 *
	 * @param youtubelinkenglish the youtubelinkenglish of this dss seva kendra mst
	 */
	public void setYoutubelinkenglish(String youtubelinkenglish);

	/**
	 * Returns the youtubelinkhindi of this dss seva kendra mst.
	 *
	 * @return the youtubelinkhindi of this dss seva kendra mst
	 */
	@AutoEscape
	public String getYoutubelinkhindi();

	/**
	 * Sets the youtubelinkhindi of this dss seva kendra mst.
	 *
	 * @param youtubelinkhindi the youtubelinkhindi of this dss seva kendra mst
	 */
	public void setYoutubelinkhindi(String youtubelinkhindi);

	/**
	 * Returns the dsk manager of this dss seva kendra mst.
	 *
	 * @return the dsk manager of this dss seva kendra mst
	 */
	@AutoEscape
	public String getDskManager();

	/**
	 * Sets the dsk manager of this dss seva kendra mst.
	 *
	 * @param dskManager the dsk manager of this dss seva kendra mst
	 */
	public void setDskManager(String dskManager);

	/**
	 * Returns the dsk manager contact no of this dss seva kendra mst.
	 *
	 * @return the dsk manager contact no of this dss seva kendra mst
	 */
	@AutoEscape
	public String getDskManagerContactNo();

	/**
	 * Sets the dsk manager contact no of this dss seva kendra mst.
	 *
	 * @param dskManagerContactNo the dsk manager contact no of this dss seva kendra mst
	 */
	public void setDskManagerContactNo(String dskManagerContactNo);

	/**
	 * Returns the dsk tele caller no of this dss seva kendra mst.
	 *
	 * @return the dsk tele caller no of this dss seva kendra mst
	 */
	@AutoEscape
	public String getDskTeleCallerNo();

	/**
	 * Sets the dsk tele caller no of this dss seva kendra mst.
	 *
	 * @param dskTeleCallerNo the dsk tele caller no of this dss seva kendra mst
	 */
	public void setDskTeleCallerNo(String dskTeleCallerNo);

	/**
	 * Returns the dsk manager email ID of this dss seva kendra mst.
	 *
	 * @return the dsk manager email ID of this dss seva kendra mst
	 */
	@AutoEscape
	public String getDskManagerEmailId();

	/**
	 * Sets the dsk manager email ID of this dss seva kendra mst.
	 *
	 * @param dskManagerEmailId the dsk manager email ID of this dss seva kendra mst
	 */
	public void setDskManagerEmailId(String dskManagerEmailId);

	/**
	 * Returns the business manager of this dss seva kendra mst.
	 *
	 * @return the business manager of this dss seva kendra mst
	 */
	@AutoEscape
	public String getBusinessManager();

	/**
	 * Sets the business manager of this dss seva kendra mst.
	 *
	 * @param businessManager the business manager of this dss seva kendra mst
	 */
	public void setBusinessManager(String businessManager);

	/**
	 * Returns the business manager contact no of this dss seva kendra mst.
	 *
	 * @return the business manager contact no of this dss seva kendra mst
	 */
	@AutoEscape
	public String getBusinessManagerContactNo();

	/**
	 * Sets the business manager contact no of this dss seva kendra mst.
	 *
	 * @param businessManagerContactNo the business manager contact no of this dss seva kendra mst
	 */
	public void setBusinessManagerContactNo(String businessManagerContactNo);

	/**
	 * Returns the business manager email ID of this dss seva kendra mst.
	 *
	 * @return the business manager email ID of this dss seva kendra mst
	 */
	@AutoEscape
	public String getBusinessManagerEmailId();

	/**
	 * Sets the business manager email ID of this dss seva kendra mst.
	 *
	 * @param businessManagerEmailId the business manager email ID of this dss seva kendra mst
	 */
	public void setBusinessManagerEmailId(String businessManagerEmailId);

	/**
	 * Returns the amps of this dss seva kendra mst.
	 *
	 * @return the amps of this dss seva kendra mst
	 */
	@AutoEscape
	public String getAmps();

	/**
	 * Sets the amps of this dss seva kendra mst.
	 *
	 * @param amps the amps of this dss seva kendra mst
	 */
	public void setAmps(String amps);

	/**
	 * Returns the amps contact no of this dss seva kendra mst.
	 *
	 * @return the amps contact no of this dss seva kendra mst
	 */
	@AutoEscape
	public String getAmpsContactNo();

	/**
	 * Sets the amps contact no of this dss seva kendra mst.
	 *
	 * @param ampsContactNo the amps contact no of this dss seva kendra mst
	 */
	public void setAmpsContactNo(String ampsContactNo);

	/**
	 * Returns the amps email ID of this dss seva kendra mst.
	 *
	 * @return the amps email ID of this dss seva kendra mst
	 */
	@AutoEscape
	public String getAmpsEmailId();

	/**
	 * Sets the amps email ID of this dss seva kendra mst.
	 *
	 * @param ampsEmailId the amps email ID of this dss seva kendra mst
	 */
	public void setAmpsEmailId(String ampsEmailId);

	/**
	 * Returns the business address of this dss seva kendra mst.
	 *
	 * @return the business address of this dss seva kendra mst
	 */
	@AutoEscape
	public String getBusinessAddress();

	/**
	 * Sets the business address of this dss seva kendra mst.
	 *
	 * @param businessAddress the business address of this dss seva kendra mst
	 */
	public void setBusinessAddress(String businessAddress);

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
	public int compareTo(DssSevaKendraMst dssSevaKendraMst);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DssSevaKendraMst> toCacheModel();

	@Override
	public DssSevaKendraMst toEscapedModel();

	@Override
	public DssSevaKendraMst toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}