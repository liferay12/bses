create table DSS_SEVAKENDRA_MST (
	DISTRICT VARCHAR(75) not null,
	SK_ADDRESS_P2 VARCHAR(75) not null,
	ACTIVE VARCHAR(75) null,
	ENTRY_DATE DATE null,
	DC_MACHINEIP VARCHAR(75) null,
	SK_ADDRESS_P1 VARCHAR(75) null,
	TELEPHONE_NO VARCHAR(75) null,
	NAME VARCHAR(75) null,
	APOINTMENT_DAYSINTERVAL INTEGER,
	APP_SLOT_CNT INTEGER,
	GPS_LINK VARCHAR(75) null,
	YOU_TUBE_ENGLISH VARCHAR(75) null,
	YOU_TUBE_HINDI VARCHAR(75) null,
	DSKMANAGER VARCHAR(75) null,
	DSKMANAGERCONTACTNO VARCHAR(75) null,
	DSKTELECALLERNO VARCHAR(75) null,
	DSKMANAGEREMAILID VARCHAR(75) null,
	BUSINESSMANAGER VARCHAR(75) null,
	BUSINESSMANAGERCONTACTNO VARCHAR(75) null,
	BUSINESSMANAGEREMAILID VARCHAR(75) null,
	AMPS VARCHAR(75) null,
	AMPSCONTACTNO VARCHAR(75) null,
	AMPSEMAILID VARCHAR(75) null,
	BUSINESSADDRESS VARCHAR(75) null,
	primary key (DISTRICT, SK_ADDRESS_P2)
);