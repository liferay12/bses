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

package com.bses.connection2.service.base;

import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.service.ConnectionDocumentService;
import com.bses.connection2.service.ConnectionDocumentServiceUtil;
import com.bses.connection2.service.persistence.ConnectionDocumentPersistence;
import com.bses.connection2.service.persistence.ConnectionRequestPersistence;
import com.bses.connection2.service.persistence.LocalityDivisionPersistence;
import com.bses.connection2.service.persistence.OTPPersistence;
import com.bses.connection2.service.persistence.RequestNumberSeqPersistence;

import com.liferay.asset.kernel.service.persistence.AssetEntryPersistence;
import com.liferay.asset.kernel.service.persistence.AssetTagPersistence;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.lang.reflect.Field;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the connection document remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.bses.connection2.service.impl.ConnectionDocumentServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.bses.connection2.service.impl.ConnectionDocumentServiceImpl
 * @generated
 */
public abstract class ConnectionDocumentServiceBaseImpl
	extends BaseServiceImpl
	implements ConnectionDocumentService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ConnectionDocumentService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ConnectionDocumentServiceUtil</code>.
	 */

	/**
	 * Returns the connection document local service.
	 *
	 * @return the connection document local service
	 */
	public com.bses.connection2.service.ConnectionDocumentLocalService
		getConnectionDocumentLocalService() {

		return connectionDocumentLocalService;
	}

	/**
	 * Sets the connection document local service.
	 *
	 * @param connectionDocumentLocalService the connection document local service
	 */
	public void setConnectionDocumentLocalService(
		com.bses.connection2.service.ConnectionDocumentLocalService
			connectionDocumentLocalService) {

		this.connectionDocumentLocalService = connectionDocumentLocalService;
	}

	/**
	 * Returns the connection document remote service.
	 *
	 * @return the connection document remote service
	 */
	public ConnectionDocumentService getConnectionDocumentService() {
		return connectionDocumentService;
	}

	/**
	 * Sets the connection document remote service.
	 *
	 * @param connectionDocumentService the connection document remote service
	 */
	public void setConnectionDocumentService(
		ConnectionDocumentService connectionDocumentService) {

		this.connectionDocumentService = connectionDocumentService;
	}

	/**
	 * Returns the connection document persistence.
	 *
	 * @return the connection document persistence
	 */
	public ConnectionDocumentPersistence getConnectionDocumentPersistence() {
		return connectionDocumentPersistence;
	}

	/**
	 * Sets the connection document persistence.
	 *
	 * @param connectionDocumentPersistence the connection document persistence
	 */
	public void setConnectionDocumentPersistence(
		ConnectionDocumentPersistence connectionDocumentPersistence) {

		this.connectionDocumentPersistence = connectionDocumentPersistence;
	}

	/**
	 * Returns the connection request local service.
	 *
	 * @return the connection request local service
	 */
	public com.bses.connection2.service.ConnectionRequestLocalService
		getConnectionRequestLocalService() {

		return connectionRequestLocalService;
	}

	/**
	 * Sets the connection request local service.
	 *
	 * @param connectionRequestLocalService the connection request local service
	 */
	public void setConnectionRequestLocalService(
		com.bses.connection2.service.ConnectionRequestLocalService
			connectionRequestLocalService) {

		this.connectionRequestLocalService = connectionRequestLocalService;
	}

	/**
	 * Returns the connection request remote service.
	 *
	 * @return the connection request remote service
	 */
	public com.bses.connection2.service.ConnectionRequestService
		getConnectionRequestService() {

		return connectionRequestService;
	}

	/**
	 * Sets the connection request remote service.
	 *
	 * @param connectionRequestService the connection request remote service
	 */
	public void setConnectionRequestService(
		com.bses.connection2.service.ConnectionRequestService
			connectionRequestService) {

		this.connectionRequestService = connectionRequestService;
	}

	/**
	 * Returns the connection request persistence.
	 *
	 * @return the connection request persistence
	 */
	public ConnectionRequestPersistence getConnectionRequestPersistence() {
		return connectionRequestPersistence;
	}

	/**
	 * Sets the connection request persistence.
	 *
	 * @param connectionRequestPersistence the connection request persistence
	 */
	public void setConnectionRequestPersistence(
		ConnectionRequestPersistence connectionRequestPersistence) {

		this.connectionRequestPersistence = connectionRequestPersistence;
	}

	/**
	 * Returns the locality division local service.
	 *
	 * @return the locality division local service
	 */
	public com.bses.connection2.service.LocalityDivisionLocalService
		getLocalityDivisionLocalService() {

		return localityDivisionLocalService;
	}

	/**
	 * Sets the locality division local service.
	 *
	 * @param localityDivisionLocalService the locality division local service
	 */
	public void setLocalityDivisionLocalService(
		com.bses.connection2.service.LocalityDivisionLocalService
			localityDivisionLocalService) {

		this.localityDivisionLocalService = localityDivisionLocalService;
	}

	/**
	 * Returns the locality division remote service.
	 *
	 * @return the locality division remote service
	 */
	public com.bses.connection2.service.LocalityDivisionService
		getLocalityDivisionService() {

		return localityDivisionService;
	}

	/**
	 * Sets the locality division remote service.
	 *
	 * @param localityDivisionService the locality division remote service
	 */
	public void setLocalityDivisionService(
		com.bses.connection2.service.LocalityDivisionService
			localityDivisionService) {

		this.localityDivisionService = localityDivisionService;
	}

	/**
	 * Returns the locality division persistence.
	 *
	 * @return the locality division persistence
	 */
	public LocalityDivisionPersistence getLocalityDivisionPersistence() {
		return localityDivisionPersistence;
	}

	/**
	 * Sets the locality division persistence.
	 *
	 * @param localityDivisionPersistence the locality division persistence
	 */
	public void setLocalityDivisionPersistence(
		LocalityDivisionPersistence localityDivisionPersistence) {

		this.localityDivisionPersistence = localityDivisionPersistence;
	}

	/**
	 * Returns the otp local service.
	 *
	 * @return the otp local service
	 */
	public com.bses.connection2.service.OTPLocalService getOTPLocalService() {
		return otpLocalService;
	}

	/**
	 * Sets the otp local service.
	 *
	 * @param otpLocalService the otp local service
	 */
	public void setOTPLocalService(
		com.bses.connection2.service.OTPLocalService otpLocalService) {

		this.otpLocalService = otpLocalService;
	}

	/**
	 * Returns the otp remote service.
	 *
	 * @return the otp remote service
	 */
	public com.bses.connection2.service.OTPService getOTPService() {
		return otpService;
	}

	/**
	 * Sets the otp remote service.
	 *
	 * @param otpService the otp remote service
	 */
	public void setOTPService(
		com.bses.connection2.service.OTPService otpService) {

		this.otpService = otpService;
	}

	/**
	 * Returns the otp persistence.
	 *
	 * @return the otp persistence
	 */
	public OTPPersistence getOTPPersistence() {
		return otpPersistence;
	}

	/**
	 * Sets the otp persistence.
	 *
	 * @param otpPersistence the otp persistence
	 */
	public void setOTPPersistence(OTPPersistence otpPersistence) {
		this.otpPersistence = otpPersistence;
	}

	/**
	 * Returns the request number seq local service.
	 *
	 * @return the request number seq local service
	 */
	public com.bses.connection2.service.RequestNumberSeqLocalService
		getRequestNumberSeqLocalService() {

		return requestNumberSeqLocalService;
	}

	/**
	 * Sets the request number seq local service.
	 *
	 * @param requestNumberSeqLocalService the request number seq local service
	 */
	public void setRequestNumberSeqLocalService(
		com.bses.connection2.service.RequestNumberSeqLocalService
			requestNumberSeqLocalService) {

		this.requestNumberSeqLocalService = requestNumberSeqLocalService;
	}

	/**
	 * Returns the request number seq remote service.
	 *
	 * @return the request number seq remote service
	 */
	public com.bses.connection2.service.RequestNumberSeqService
		getRequestNumberSeqService() {

		return requestNumberSeqService;
	}

	/**
	 * Sets the request number seq remote service.
	 *
	 * @param requestNumberSeqService the request number seq remote service
	 */
	public void setRequestNumberSeqService(
		com.bses.connection2.service.RequestNumberSeqService
			requestNumberSeqService) {

		this.requestNumberSeqService = requestNumberSeqService;
	}

	/**
	 * Returns the request number seq persistence.
	 *
	 * @return the request number seq persistence
	 */
	public RequestNumberSeqPersistence getRequestNumberSeqPersistence() {
		return requestNumberSeqPersistence;
	}

	/**
	 * Sets the request number seq persistence.
	 *
	 * @param requestNumberSeqPersistence the request number seq persistence
	 */
	public void setRequestNumberSeqPersistence(
		RequestNumberSeqPersistence requestNumberSeqPersistence) {

		this.requestNumberSeqPersistence = requestNumberSeqPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService
		getClassNameService() {

		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {

		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {

		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the asset entry local service.
	 *
	 * @return the asset entry local service
	 */
	public com.liferay.asset.kernel.service.AssetEntryLocalService
		getAssetEntryLocalService() {

		return assetEntryLocalService;
	}

	/**
	 * Sets the asset entry local service.
	 *
	 * @param assetEntryLocalService the asset entry local service
	 */
	public void setAssetEntryLocalService(
		com.liferay.asset.kernel.service.AssetEntryLocalService
			assetEntryLocalService) {

		this.assetEntryLocalService = assetEntryLocalService;
	}

	/**
	 * Returns the asset entry remote service.
	 *
	 * @return the asset entry remote service
	 */
	public com.liferay.asset.kernel.service.AssetEntryService
		getAssetEntryService() {

		return assetEntryService;
	}

	/**
	 * Sets the asset entry remote service.
	 *
	 * @param assetEntryService the asset entry remote service
	 */
	public void setAssetEntryService(
		com.liferay.asset.kernel.service.AssetEntryService assetEntryService) {

		this.assetEntryService = assetEntryService;
	}

	/**
	 * Returns the asset entry persistence.
	 *
	 * @return the asset entry persistence
	 */
	public AssetEntryPersistence getAssetEntryPersistence() {
		return assetEntryPersistence;
	}

	/**
	 * Sets the asset entry persistence.
	 *
	 * @param assetEntryPersistence the asset entry persistence
	 */
	public void setAssetEntryPersistence(
		AssetEntryPersistence assetEntryPersistence) {

		this.assetEntryPersistence = assetEntryPersistence;
	}

	/**
	 * Returns the asset tag local service.
	 *
	 * @return the asset tag local service
	 */
	public com.liferay.asset.kernel.service.AssetTagLocalService
		getAssetTagLocalService() {

		return assetTagLocalService;
	}

	/**
	 * Sets the asset tag local service.
	 *
	 * @param assetTagLocalService the asset tag local service
	 */
	public void setAssetTagLocalService(
		com.liferay.asset.kernel.service.AssetTagLocalService
			assetTagLocalService) {

		this.assetTagLocalService = assetTagLocalService;
	}

	/**
	 * Returns the asset tag remote service.
	 *
	 * @return the asset tag remote service
	 */
	public com.liferay.asset.kernel.service.AssetTagService
		getAssetTagService() {

		return assetTagService;
	}

	/**
	 * Sets the asset tag remote service.
	 *
	 * @param assetTagService the asset tag remote service
	 */
	public void setAssetTagService(
		com.liferay.asset.kernel.service.AssetTagService assetTagService) {

		this.assetTagService = assetTagService;
	}

	/**
	 * Returns the asset tag persistence.
	 *
	 * @return the asset tag persistence
	 */
	public AssetTagPersistence getAssetTagPersistence() {
		return assetTagPersistence;
	}

	/**
	 * Sets the asset tag persistence.
	 *
	 * @param assetTagPersistence the asset tag persistence
	 */
	public void setAssetTagPersistence(
		AssetTagPersistence assetTagPersistence) {

		this.assetTagPersistence = assetTagPersistence;
	}

	public void afterPropertiesSet() {
		_setServiceUtilService(connectionDocumentService);
	}

	public void destroy() {
		_setServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ConnectionDocumentService.class.getName();
	}

	protected Class<?> getModelClass() {
		return ConnectionDocument.class;
	}

	protected String getModelClassName() {
		return ConnectionDocument.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				connectionDocumentPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(
		ConnectionDocumentService connectionDocumentService) {

		try {
			Field field = ConnectionDocumentServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, connectionDocumentService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@BeanReference(
		type = com.bses.connection2.service.ConnectionDocumentLocalService.class
	)
	protected com.bses.connection2.service.ConnectionDocumentLocalService
		connectionDocumentLocalService;

	@BeanReference(type = ConnectionDocumentService.class)
	protected ConnectionDocumentService connectionDocumentService;

	@BeanReference(type = ConnectionDocumentPersistence.class)
	protected ConnectionDocumentPersistence connectionDocumentPersistence;

	@BeanReference(
		type = com.bses.connection2.service.ConnectionRequestLocalService.class
	)
	protected com.bses.connection2.service.ConnectionRequestLocalService
		connectionRequestLocalService;

	@BeanReference(
		type = com.bses.connection2.service.ConnectionRequestService.class
	)
	protected com.bses.connection2.service.ConnectionRequestService
		connectionRequestService;

	@BeanReference(type = ConnectionRequestPersistence.class)
	protected ConnectionRequestPersistence connectionRequestPersistence;

	@BeanReference(
		type = com.bses.connection2.service.LocalityDivisionLocalService.class
	)
	protected com.bses.connection2.service.LocalityDivisionLocalService
		localityDivisionLocalService;

	@BeanReference(
		type = com.bses.connection2.service.LocalityDivisionService.class
	)
	protected com.bses.connection2.service.LocalityDivisionService
		localityDivisionService;

	@BeanReference(type = LocalityDivisionPersistence.class)
	protected LocalityDivisionPersistence localityDivisionPersistence;

	@BeanReference(type = com.bses.connection2.service.OTPLocalService.class)
	protected com.bses.connection2.service.OTPLocalService otpLocalService;

	@BeanReference(type = com.bses.connection2.service.OTPService.class)
	protected com.bses.connection2.service.OTPService otpService;

	@BeanReference(type = OTPPersistence.class)
	protected OTPPersistence otpPersistence;

	@BeanReference(
		type = com.bses.connection2.service.RequestNumberSeqLocalService.class
	)
	protected com.bses.connection2.service.RequestNumberSeqLocalService
		requestNumberSeqLocalService;

	@BeanReference(
		type = com.bses.connection2.service.RequestNumberSeqService.class
	)
	protected com.bses.connection2.service.RequestNumberSeqService
		requestNumberSeqService;

	@BeanReference(type = RequestNumberSeqPersistence.class)
	protected RequestNumberSeqPersistence requestNumberSeqPersistence;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserService.class
	)
	protected com.liferay.portal.kernel.service.UserService userService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetEntryLocalService.class
	)
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetEntryService.class
	)
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@ServiceReference(type = AssetEntryPersistence.class)
	protected AssetEntryPersistence assetEntryPersistence;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetTagLocalService.class
	)
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@ServiceReference(
		type = com.liferay.asset.kernel.service.AssetTagService.class
	)
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

	@ServiceReference(type = AssetTagPersistence.class)
	protected AssetTagPersistence assetTagPersistence;

}