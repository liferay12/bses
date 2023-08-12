package org.tempuri;

public class WebServiceSoapProxy implements org.tempuri.WebServiceSoap {
  private String _endpoint = null;
  private org.tempuri.WebServiceSoap webServiceSoap = null;
  
  public WebServiceSoapProxy() {
    _initWebServiceSoapProxy();
  }
  
  public WebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceSoapProxy();
  }
  
  private void _initWebServiceSoapProxy() {
    try {
      webServiceSoap = (new org.tempuri.WebServiceLocator()).getWebServiceSoap();
      if (webServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceSoap != null)
      ((javax.xml.rpc.Stub)webServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebServiceSoap getWebServiceSoap() {
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap;
  }
  
  public org.tempuri.ZBAPIDOCLISTResponseZBAPIDOCLISTResult ZBAPIDOCLIST(java.lang.String strAufnr, java.lang.String strC_001, java.lang.String strC_002, java.lang.String strC_003, java.lang.String strC_004, java.lang.String strC_005, java.lang.String strC_007, java.lang.String strC_008, java.lang.String strC_009, java.lang.String strC_010, java.lang.String strC_011, java.lang.String strC_012, java.lang.String strC_013, java.lang.String strC_014, java.lang.String strC_015, java.lang.String strC_016, java.lang.String strC_017, java.lang.String strC_018, java.lang.String strC_019, java.lang.String strC_020, java.lang.String strC_021, java.lang.String strC_022, java.lang.String strC_023, java.lang.String strC_024, java.lang.String strC_025, java.lang.String strC_026, java.lang.String strC_027, java.lang.String strC_028, java.lang.String strC_029, java.lang.String strC_030, java.lang.String strC_031, java.lang.String strC_032, java.lang.String strC_033, java.lang.String strC_034, java.lang.String strC_035, java.lang.String strC_036, java.lang.String strC_037, java.lang.String strC_038, java.lang.String strC_039, java.lang.String strC_040, java.lang.String strC_041, java.lang.String strC_070, java.lang.String strR_Cdll, java.lang.String strR_Occ, java.lang.String strR_Own, java.lang.String strZ_Appltype) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPIDOCLIST(strAufnr, strC_001, strC_002, strC_003, strC_004, strC_005, strC_007, strC_008, strC_009, strC_010, strC_011, strC_012, strC_013, strC_014, strC_015, strC_016, strC_017, strC_018, strC_019, strC_020, strC_021, strC_022, strC_023, strC_024, strC_025, strC_026, strC_027, strC_028, strC_029, strC_030, strC_031, strC_032, strC_033, strC_034, strC_035, strC_036, strC_037, strC_038, strC_039, strC_040, strC_041, strC_070, strR_Cdll, strR_Occ, strR_Own, strZ_Appltype);
  }
  
  public org.tempuri.ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult ZBAPI_DISPLAY_BILL_WEB(java.lang.String strCANumber, java.lang.String strBillMonth) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DISPLAY_BILL_WEB(strCANumber, strBillMonth);
  }
  
  public org.tempuri.ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult ZBAPI_IVR_CREATESO_ISU(java.lang.String strCANumber, java.lang.String strCACrn, java.lang.String strCAKNumber, java.lang.String strMeterNumber, java.lang.String strISUOrder, java.lang.String strComplaintType, java.lang.String strContractNumber, java.lang.String strTelephoneNo, java.lang.String strDescription) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_IVR_CREATESO_ISU(strCANumber, strCACrn, strCAKNumber, strMeterNumber, strISUOrder, strComplaintType, strContractNumber, strTelephoneNo, strDescription);
  }
  
  public org.tempuri.Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult z_BAPI_CMS_ISU_CA_DISPLAY(java.lang.String strCANumber, java.lang.String strSerialNumber, java.lang.String strConsumerNumber, java.lang.String strTelephoneNumber, java.lang.String strKNumber, java.lang.String strContractNumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_CMS_ISU_CA_DISPLAY(strCANumber, strSerialNumber, strConsumerNumber, strTelephoneNumber, strKNumber, strContractNumber);
  }
  
  public org.tempuri.ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult ZBAPI_CREATESO_POST(java.lang.String strPMAufart, java.lang.String strPlanPlant, java.lang.String strRegioGroup, java.lang.String strShortText, java.lang.String strILA, java.lang.String strMFText, java.lang.String strUserFieldCH20, java.lang.String strControkey, java.lang.String strSerialNumber, java.lang.String strComplaintGroup, java.lang.String strCANumber, java.lang.String strContract, java.lang.String strMFText1) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CREATESO_POST(strPMAufart, strPlanPlant, strRegioGroup, strShortText, strILA, strMFText, strUserFieldCH20, strControkey, strSerialNumber, strComplaintGroup, strCANumber, strContract, strMFText1);
  }
  
  public org.tempuri.ZBAPI_CALERTResponseZBAPI_CALERTResult ZBAPI_CALERT(java.lang.String strCompanyCode, java.lang.String strDate, java.lang.String strDivision, java.lang.String strUnit) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CALERT(strCompanyCode, strDate, strDivision, strUnit);
  }
  
  public org.tempuri.ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult ZBAPI_ONLINE_BILL_PDF(java.lang.String strCANumber, java.lang.String strEBSKNO) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ONLINE_BILL_PDF(strCANumber, strEBSKNO);
  }
  
  public org.tempuri.ZBAPI_DSS_SOResponseZBAPI_DSS_SOResult ZBAPI_DSS_SO(java.lang.String PARTNERCATEGORY, java.lang.String PARTNERTYPE, java.lang.String TITLE_KEY, java.lang.String FIRSTNAME, java.lang.String LASTNAME, java.lang.String MIDDLENAME, java.lang.String FATHERSNAME, java.lang.String HOUSE_NO, java.lang.String BUILDING, java.lang.String STR_SUPPL1, java.lang.String STR_SUPPL2, java.lang.String STR_SUPPL3, java.lang.String POSTL_COD1, java.lang.String CITY, java.lang.String e_MAIL, java.lang.String LANDLINE, java.lang.String MOBILE, java.lang.String FEMALE, java.lang.String MALE, java.lang.String JOBGR, java.lang.String LEGITTYPE, java.lang.String IDNUMBER, java.lang.String ORDER_TYPE, java.lang.String SHORTTEXT, java.lang.String PLANNINGPLANT, java.lang.String WORKCENTRE, java.lang.String SYSTEMCOND, java.lang.String PMACTIVITYTYPE, java.lang.String REQUESTNUM, java.lang.String NNUMBER, java.lang.String APPLIEDCAT, java.lang.String APPLIEDLOAD, java.lang.String CONNECTIONTYPE, java.lang.String ORDERID, java.lang.String FLAG) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DSS_SO(PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, LEGITTYPE, IDNUMBER, ORDER_TYPE, SHORTTEXT, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, PMACTIVITYTYPE, REQUESTNUM, NNUMBER, APPLIEDCAT, APPLIEDLOAD, CONNECTIONTYPE, ORDERID, FLAG);
  }
  
  public org.tempuri.ZBAPI_DSS_SO_ECCResponseZBAPI_DSS_SO_ECCResult ZBAPI_DSS_SO_ECC(java.lang.String PARTNERCATEGORY, java.lang.String PARTNERTYPE, java.lang.String TITLE_KEY, java.lang.String FIRSTNAME, java.lang.String LASTNAME, java.lang.String MIDDLENAME, java.lang.String FATHERSNAME, java.lang.String HOUSE_NO, java.lang.String BUILDING, java.lang.String STR_SUPPL1, java.lang.String STR_SUPPL2, java.lang.String STR_SUPPL3, java.lang.String POSTL_COD1, java.lang.String CITY, java.lang.String e_MAIL, java.lang.String LANDLINE, java.lang.String MOBILE, java.lang.String FEMALE, java.lang.String MALE, java.lang.String JOBGR, java.lang.String IDTYPE, java.lang.String IDNUMBER, java.lang.String ORDER_TYPE, java.lang.String SHORTTEXT, java.lang.String PLANNINGPLANT, java.lang.String WORKCENTRE, java.lang.String SYSTEMCOND, java.lang.String PMACTIVITYTYPE, java.lang.String REQUESTNUM, java.lang.String NNUMBER, java.lang.String APPLIEDCAT, java.lang.String APPLIEDLOAD, java.lang.String CONNECTIONTYPE, java.lang.String ORDERID, java.lang.String FLAG) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DSS_SO_ECC(PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, IDTYPE, IDNUMBER, ORDER_TYPE, SHORTTEXT, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, PMACTIVITYTYPE, REQUESTNUM, NNUMBER, APPLIEDCAT, APPLIEDLOAD, CONNECTIONTYPE, ORDERID, FLAG);
  }
  
  public org.tempuri.Z_BAPI_ZDSS_WEB_LINKResponseZ_BAPI_ZDSS_WEB_LINKResult z_BAPI_ZDSS_WEB_LINK(java.lang.String i_ILART, java.lang.String i_VKONT, java.lang.String i_VKONA, java.lang.String PARTNERCATEGORY, java.lang.String PARTNERTYPE, java.lang.String TITLE_KEY, java.lang.String FIRSTNAME, java.lang.String LASTNAME, java.lang.String MIDDLENAME, java.lang.String FATHERSNAME, java.lang.String HOUSE_NO, java.lang.String BUILDING, java.lang.String STR_SUPPL1, java.lang.String STR_SUPPL2, java.lang.String STR_SUPPL3, java.lang.String POSTL_COD1, java.lang.String CITY, java.lang.String e_MAIL, java.lang.String LANDLINE, java.lang.String MOBILE, java.lang.String FEMALE, java.lang.String MALE, java.lang.String JOBGR, java.lang.String IDTYPE, java.lang.String IDNUMBER, java.lang.String PLANNINGPLANT, java.lang.String WORKCENTRE, java.lang.String SYSTEMCOND, java.lang.String APPLIEDCAT, java.lang.String APPLIEDLOAD, java.lang.String APPLIEDLOADKVA, java.lang.String CONNECTIONTYPE, java.lang.String STATEMENT_CA, java.lang.String START_DATE, java.lang.String START_TIME, java.lang.String FINISH_DATE, java.lang.String FINISH_TIME, java.lang.String SORTFIELD, java.lang.String ABKRS) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_ZDSS_WEB_LINK(i_ILART, i_VKONT, i_VKONA, PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, IDTYPE, IDNUMBER, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, APPLIEDCAT, APPLIEDLOAD, APPLIEDLOADKVA, CONNECTIONTYPE, STATEMENT_CA, START_DATE, START_TIME, FINISH_DATE, FINISH_TIME, SORTFIELD, ABKRS);
  }
  
  public org.tempuri.ZBAPI_ENFORCEMENTResponseZBAPI_ENFORCEMENTResult ZBAPI_ENFORCEMENT(java.lang.String strCANumber, java.lang.String strContract) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ENFORCEMENT(strCANumber, strContract);
  }
  
  public org.tempuri.ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult ZBI_WEBBILL_HIST(java.lang.String strCANumber, java.lang.String strBillMonth) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBI_WEBBILL_HIST(strCANumber, strBillMonth);
  }
  
  public org.tempuri.Z_BAPI_IVRSResponseZ_BAPI_IVRSResult z_BAPI_IVRS(java.lang.String strContractAccountNumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_IVRS(strContractAccountNumber);
  }
  
  public org.tempuri.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult z_BAPI_DSS_ISU_CA_DISPLAY(java.lang.String strCANumber, java.lang.String strCRNNumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_DSS_ISU_CA_DISPLAY(strCANumber, strCRNNumber);
  }
  
  public org.tempuri.ZBAPIEBIZORDSTATUSResponseZBAPIEBIZORDSTATUSResult ZBAPIEBIZORDSTATUS(java.lang.String stOrderNumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPIEBIZORDSTATUS(stOrderNumber);
  }
  
  public org.tempuri.ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult ZBAPI_UPDATE_TNO(java.lang.String strCA_no, java.lang.String strTelephone, java.lang.String strMobile, java.lang.String strEmail, java.lang.String strLandmark, java.lang.String strDISPATCH_CTRL) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_UPDATE_TNO(strCA_no, strTelephone, strMobile, strEmail, strLandmark, strDISPATCH_CTRL);
  }
  
  public org.tempuri.Update_Dispatch_ControlResponseUpdate_Dispatch_ControlResult update_Dispatch_Control(java.lang.String strCA_no, java.lang.String strTelephone, java.lang.String strMobile, java.lang.String strEmail, java.lang.String strLandmark, java.lang.String strDISPATCH_CTRL) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.update_Dispatch_Control(strCA_no, strTelephone, strMobile, strEmail, strLandmark, strDISPATCH_CTRL);
  }
  
  public org.tempuri.ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult ZBAPI_IDENTIFICATION(java.lang.String strBP_NO, java.lang.String strType_ID, java.lang.String strID_Num) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_IDENTIFICATION(strBP_NO, strType_ID, strID_Num);
  }
  
  public org.tempuri.ZBAPI_ZCS_CLI_WEBResponseZBAPI_ZCS_CLI_WEBResult ZBAPI_ZCS_CLI_WEB(java.lang.String strTelephoneNumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ZCS_CLI_WEB(strTelephoneNumber);
  }
  
  public org.tempuri.ZBAPI_TEAM_ALLOCATIONResponseZBAPI_TEAM_ALLOCATIONResult ZBAPI_TEAM_ALLOCATION(java.lang.String strIEMINumber, java.lang.String strILART, java.lang.String strDate, java.lang.String strTime) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_TEAM_ALLOCATION(strIEMINumber, strILART, strDate, strTime);
  }
  
  public org.tempuri.ZBAPI_BI_EMAIL_COUNTResponseZBAPI_BI_EMAIL_COUNTResult ZBAPI_BI_EMAIL_COUNT(java.lang.String strCRONAM, java.lang.String strOBJTP, java.lang.String strDateYYYYMMDD, java.lang.String strTime) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_BI_EMAIL_COUNT(strCRONAM, strOBJTP, strDateYYYYMMDD, strTime);
  }
  
  public org.tempuri.ZBAPI_EDISTRICTResponseZBAPI_EDISTRICTResult ZBAPI_EDISTRICT(java.lang.String strCANumber, java.lang.String strCRNNumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_EDISTRICT(strCANumber, strCRNNumber);
  }
  
  public org.tempuri.Z_BAPI_INPUT_CP_DETAILSResponseZ_BAPI_INPUT_CP_DETAILSResult z_BAPI_INPUT_CP_DETAILS(java.lang.String new_Ca, java.lang.String old_Ca, java.lang.String theft_Type, java.lang.String zbilled_Ratcat, java.lang.String zbill_Days, java.lang.String zbill_Type, java.lang.String zcaseid, java.lang.String zcomp_Id, java.lang.String zconn_Load, java.lang.String zinsp_Date, java.lang.String zinsp_Mtrread, java.lang.String znew_Meterno, java.lang.String zold_Meterno, java.lang.String zphase, org.tempuri.Z_BAPI_INPUT_CP_DETAILSDsInputTable dsInputTable) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_INPUT_CP_DETAILS(new_Ca, old_Ca, theft_Type, zbilled_Ratcat, zbill_Days, zbill_Type, zcaseid, zcomp_Id, zconn_Load, zinsp_Date, zinsp_Mtrread, znew_Meterno, zold_Meterno, zphase, dsInputTable);
  }
  
  public org.tempuri.ZBAPI_DEMAND_NOTE_ONLINEResponseZBAPI_DEMAND_NOTE_ONLINEResult ZBAPI_DEMAND_NOTE_ONLINE(java.lang.String strOrder) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DEMAND_NOTE_ONLINE(strOrder);
  }
  
  public org.tempuri.ZBAPI_ISUACCOUNT_CHANGEResponseZBAPI_ISUACCOUNT_CHANGEResult ZBAPI_ISUACCOUNT_CHANGE(java.lang.String strCONTRACT_ACCOUNT, java.lang.String strPartner, java.lang.String strValidDAte, java.lang.String strCONTRACTACCOUNTDATA, java.lang.String strCONTRACTACCOUNTDATAX) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ISUACCOUNT_CHANGE(strCONTRACT_ACCOUNT, strPartner, strValidDAte, strCONTRACTACCOUNTDATA, strCONTRACTACCOUNTDATAX);
  }
  
  public org.tempuri.ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult ZBAPI_FICA_DEMAND_NOTE(java.lang.String strORDER_NO) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_FICA_DEMAND_NOTE(strORDER_NO);
  }
  
  public org.tempuri.ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult ZBAPI_CNT_APP_DETAIL_MOB(java.lang.String strORDER_TYPE, java.lang.String strDIVISION, java.lang.String strAPPOINTMENT_START_DATE, java.lang.String strAPPOINTMENT_TIME, java.lang.String strREC_COUNT) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CNT_APP_DETAIL_MOB(strORDER_TYPE, strDIVISION, strAPPOINTMENT_START_DATE, strAPPOINTMENT_TIME, strREC_COUNT);
  }
  
  public org.tempuri.ZBAPI_STATUS163ResponseZBAPI_STATUS163Result ZBAPI_STATUS163(java.lang.String strVKONT) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_STATUS163(strVKONT);
  }
  
  public org.tempuri.ZBAPI_DFKKOP_PUSHResponseZBAPI_DFKKOP_PUSHResult ZBAPI_DFKKOP_PUSH(java.lang.String strZAUFNR, java.lang.String strZBUKRS, java.lang.String strZVKONT, java.lang.String strZBETRW, java.lang.String strZTRAN_ID, java.lang.String strZTRAN_DT, java.lang.String strFLAG, java.lang.String strPay_Type, java.lang.String strPay_Method) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DFKKOP_PUSH(strZAUFNR, strZBUKRS, strZVKONT, strZBETRW, strZTRAN_ID, strZTRAN_DT, strFLAG, strPay_Type, strPay_Method);
  }
  
  public org.tempuri.ZBAPI_DISPLAY_BILL_WEB_EXTResponseZBAPI_DISPLAY_BILL_WEB_EXTResult ZBAPI_DISPLAY_BILL_WEB_EXT(java.lang.String strCA_Number, java.lang.String strBillMmonth) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DISPLAY_BILL_WEB_EXT(strCA_Number, strBillMmonth);
  }
  
  public org.tempuri.ZBAPI_CS_ORD_STATResponseZBAPI_CS_ORD_STATResult ZBAPI_CS_ORD_STAT(java.lang.String strAufnr) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CS_ORD_STAT(strAufnr);
  }
  
  public org.tempuri.ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult ZBAPI_CS_MOBILE_APPCNT(java.lang.String strMobileNO, java.lang.String strPM_Activity, java.lang.String strPriod, java.lang.String strVAPLZ) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CS_MOBILE_APPCNT(strMobileNO, strPM_Activity, strPriod, strVAPLZ);
  }
  
  public org.tempuri.ZBI_BAPI_CA_DUES_NICResponseZBI_BAPI_CA_DUES_NICResult ZBI_BAPI_CA_DUES_NIC(java.lang.String strCA_number) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBI_BAPI_CA_DUES_NIC(strCA_number);
  }
  
  public org.tempuri.ZBAPI_CS_NIC_UPDT_DETResponseZBAPI_CS_NIC_UPDT_DETResult ZBAPI_CS_NIC_UPDT_DET(java.lang.String strPARTNER, java.lang.String strNAME_FIRST, java.lang.String strNAMEMIDDLE, java.lang.String strNAME_LAST, java.lang.String strNAME_LST2, java.lang.String strNAME_ORG1, java.lang.String strNAME_ORG2, java.lang.String strNAME_ORG3, java.lang.String strNAME_ORG4, java.lang.String strTEL_NUMBER, java.lang.String strSMTP_ADDR) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CS_NIC_UPDT_DET(strPARTNER, strNAME_FIRST, strNAMEMIDDLE, strNAME_LAST, strNAME_LST2, strNAME_ORG1, strNAME_ORG2, strNAME_ORG3, strNAME_ORG4, strTEL_NUMBER, strSMTP_ADDR);
  }
  
  public org.tempuri.ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult ZBAPI_PREPAID_RTGS(java.lang.String strCOMP_CODE, java.lang.String strCONTRACT_ACCOUNT, java.lang.String strACCOUNT_TYPE, java.lang.String strAMOUNT, java.lang.String strFLAG) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_PREPAID_RTGS(strCOMP_CODE, strCONTRACT_ACCOUNT, strACCOUNT_TYPE, strAMOUNT, strFLAG);
  }
  
  public org.tempuri.ZBAPI_PREPAID_RTGS_CommonResponseZBAPI_PREPAID_RTGS_CommonResult ZBAPI_PREPAID_RTGS_Common(java.lang.String strCOMP_CODE, java.lang.String strCONTRACT_ACCOUNT, java.lang.String strACCOUNT_TYPE, java.lang.String strAMOUNT, java.lang.String strFLAG) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_PREPAID_RTGS_Common(strCOMP_CODE, strCONTRACT_ACCOUNT, strACCOUNT_TYPE, strAMOUNT, strFLAG);
  }
  
  public org.tempuri.ZBAPI_FICA_PREPAID_MTRResponseZBAPI_FICA_PREPAID_MTRResult ZBAPI_FICA_PREPAID_MTR(java.lang.String strDOC_ID, java.lang.String strTRANS_ID, java.lang.String strCA, java.lang.String strCOMPANY, java.lang.String strCONSUMER_TYPE, java.lang.String strMETER_MANFR, java.lang.String strCONTRACT, java.lang.String strCA_VALID_ISU, java.lang.String strENTRY_DATE, java.lang.String strS_ENC_TKN_1, java.lang.String strS_ENC_TKN_2, java.lang.String strS_ENC_TKN_3, java.lang.String strS_ENC_TKN_4, java.lang.String strGENUS_RESP_CODE, java.lang.String strMETER_NO, java.lang.String strACC_CLASS, java.lang.String strAMNT_BANK, java.lang.String strAMNT_ISU, java.lang.String strADDRESS, java.lang.String strTARIFTYP, java.lang.String strTARIFID, java.lang.String strPAY_METHOD) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_FICA_PREPAID_MTR(strDOC_ID, strTRANS_ID, strCA, strCOMPANY, strCONSUMER_TYPE, strMETER_MANFR, strCONTRACT, strCA_VALID_ISU, strENTRY_DATE, strS_ENC_TKN_1, strS_ENC_TKN_2, strS_ENC_TKN_3, strS_ENC_TKN_4, strGENUS_RESP_CODE, strMETER_NO, strACC_CLASS, strAMNT_BANK, strAMNT_ISU, strADDRESS, strTARIFTYP, strTARIFID, strPAY_METHOD);
  }
  
  public org.tempuri.ZBAPI_MDI_USER_CONResponseZBAPI_MDI_USER_CONResult ZBAPI_MDI_USER_CON(java.lang.String strVKONT) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_MDI_USER_CON(strVKONT);
  }
  
  public org.tempuri.ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult ZBAPI_MDI_RES_ORDER(java.lang.String strVKONT) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_MDI_RES_ORDER(strVKONT);
  }
  
  public org.tempuri.ZBAPI_CS_FETCH_LOADResponseZBAPI_CS_FETCH_LOADResult ZBAPI_CS_FETCH_LOAD(java.lang.String strINORDERNO, java.lang.String strINBUSINESSPART, java.lang.String strINCONTRACTACCNT, java.lang.String strINMETERNUM) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CS_FETCH_LOAD(strINORDERNO, strINBUSINESSPART, strINCONTRACTACCNT, strINMETERNUM);
  }
  
  public org.tempuri.ZBAPI_FICA_ENF_CONSResponseZBAPI_FICA_ENF_CONSResult ZBAPI_FICA_ENF_CONS(java.lang.String strCOMPANY_CODE, java.lang.String strCONTRACT_ACCOUNT) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_FICA_ENF_CONS(strCOMPANY_CODE, strCONTRACT_ACCOUNT);
  }
  
  public org.tempuri.ZBAPI_MSO_POST_DETResponseZBAPI_MSO_POST_DETResult ZBAPI_MSO_POST_DET(java.lang.String strCA_Number) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_MSO_POST_DET(strCA_Number);
  }
  
  public org.tempuri.ZBAPI_FETCH_ENFCAResponseZBAPI_FETCH_ENFCAResult ZBAPI_FETCH_ENFCA(java.lang.String strBPNo) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_FETCH_ENFCA(strBPNo);
  }
  
  public org.tempuri.BAPI_MTRREADDOC_GETLISTResponseBAPI_MTRREADDOC_GETLISTResult BAPI_MTRREADDOC_GETLIST(java.lang.String METERNO) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.BAPI_MTRREADDOC_GETLIST(METERNO);
  }
  
  public org.tempuri.ZBAPI_LAST_MODE_PAYResponseZBAPI_LAST_MODE_PAYResult ZBAPI_LAST_MODE_PAY(java.lang.String CA, java.lang.String FLAG) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_LAST_MODE_PAY(CA, FLAG);
  }
  
  public org.tempuri.BAPI_ZBAPI_BI_NOCResponseBAPI_ZBAPI_BI_NOCResult BAPI_ZBAPI_BI_NOC(java.lang.String strCA) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.BAPI_ZBAPI_BI_NOC(strCA);
  }
  
  public org.tempuri.ZBAPI_REAPPOINT_FETCHResponseZBAPI_REAPPOINT_FETCHResult ZBAPI_REAPPOINT_FETCH(java.lang.String strOrderNo) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_REAPPOINT_FETCH(strOrderNo);
  }
  
  public org.tempuri.ZBAPI_ADD_IDENTIFICATIONResponseZBAPI_ADD_IDENTIFICATIONResult ZBAPI_ADD_IDENTIFICATION(java.lang.String IV_CONTRACT_ACCOUNT, java.lang.String IV_PARTNER_GUID, java.lang.String IV_IDENTIFICATIONCATEGORY, java.lang.String IV_IDENTIFICATIONNUMBER, java.lang.String IV_X_SAVE, java.lang.String IV_IDENTIFICATIONTYPE) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ADD_IDENTIFICATION(IV_CONTRACT_ACCOUNT, IV_PARTNER_GUID, IV_IDENTIFICATIONCATEGORY, IV_IDENTIFICATIONNUMBER, IV_X_SAVE, IV_IDENTIFICATIONTYPE);
  }
  
  public org.tempuri.Z_BI_BAPI_SMART_MTR_DTLResponseZ_BI_BAPI_SMART_MTR_DTLResult z_BI_BAPI_SMART_MTR_DTL(java.lang.String strIn_Run_Date, java.lang.String strInCompany, java.lang.String strInManuf) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BI_BAPI_SMART_MTR_DTL(strIn_Run_Date, strInCompany, strInManuf);
  }
  
  public org.tempuri.Z_BI_BAPI_SMART_MTR_UPDTResponseZ_BI_BAPI_SMART_MTR_UPDTResult z_BI_BAPI_SMART_MTR_UPDT(java.lang.String strCANumber, java.lang.String strOPBEL, java.lang.String strReturnCode) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BI_BAPI_SMART_MTR_UPDT(strCANumber, strOPBEL, strReturnCode);
  }
  
  public org.tempuri.ZBAPI_CREATE_ORDER_WIFIResponseZBAPI_CREATE_ORDER_WIFIResult ZBAPI_CREATE_ORDER_WIFI(java.lang.String strPARTNERCATEGORY, java.lang.String strPARTNERTYPE, java.lang.String strTITLE_KEY, java.lang.String strFIRSTNAME, java.lang.String strLASTNAME, java.lang.String strMIDDLENAME, java.lang.String strFATHERSNAME, java.lang.String strHOUSE_NO, java.lang.String strBUILDING, java.lang.String strSTR_SUPPL1, java.lang.String strSTR_SUPPL2, java.lang.String strSTR_SUPPL3, java.lang.String strPOSTL_COD1, java.lang.String strCITY, java.lang.String strE_MAIL, java.lang.String strLANDLINE, java.lang.String strMOBILE, java.lang.String strFEMALE, java.lang.String strMALE, java.lang.String strJOBGR, java.lang.String strIDTYPE, java.lang.String strIDNUMBER, java.lang.String strI_VKONT, java.lang.String strI_ILART, java.lang.String strI_VAPLZ, java.lang.String strPLANNINGPLANT, java.lang.String strWORKCENTRE, java.lang.String strSYSTEMCOND, java.lang.String strAPPLIEDCAT, java.lang.String strAPPLIEDLOAD, java.lang.String strAPPLIEDLOADKVA, java.lang.String strCONNECTIONTYPE, java.lang.String strSTATEMENT_CA, java.lang.String strSTART_DATE, java.lang.String strSTART_TIME, java.lang.String strFINISH_DATE, java.lang.String strFINISH_TIME, java.lang.String strSORTFIELD, java.lang.String strABKRS) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CREATE_ORDER_WIFI(strPARTNERCATEGORY, strPARTNERTYPE, strTITLE_KEY, strFIRSTNAME, strLASTNAME, strMIDDLENAME, strFATHERSNAME, strHOUSE_NO, strBUILDING, strSTR_SUPPL1, strSTR_SUPPL2, strSTR_SUPPL3, strPOSTL_COD1, strCITY, strE_MAIL, strLANDLINE, strMOBILE, strFEMALE, strMALE, strJOBGR, strIDTYPE, strIDNUMBER, strI_VKONT, strI_ILART, strI_VAPLZ, strPLANNINGPLANT, strWORKCENTRE, strSYSTEMCOND, strAPPLIEDCAT, strAPPLIEDLOAD, strAPPLIEDLOADKVA, strCONNECTIONTYPE, strSTATEMENT_CA, strSTART_DATE, strSTART_TIME, strFINISH_DATE, strFINISH_TIME, strSORTFIELD, strABKRS);
  }
  
  public org.tempuri.ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult ZCSUPDAT_PERSONAL_DETAILS(java.lang.String strPARTNER, java.lang.String strNAME_FIRST, java.lang.String strNAMEMIDDLE, java.lang.String strNAME_LAST, java.lang.String strNAME_LST2, java.lang.String strSTR_SUPPL1, java.lang.String strSTR_SUPPL2, java.lang.String strHOUSE_NUM1, java.lang.String strSTREET, java.lang.String strSTR_SUPPL3, java.lang.String strTEL_NUMBER, java.lang.String strSMTP_ADDR, java.lang.String strFAX_NUMBER) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZCSUPDAT_PERSONAL_DETAILS(strPARTNER, strNAME_FIRST, strNAMEMIDDLE, strNAME_LAST, strNAME_LST2, strSTR_SUPPL1, strSTR_SUPPL2, strHOUSE_NUM1, strSTREET, strSTR_SUPPL3, strTEL_NUMBER, strSMTP_ADDR, strFAX_NUMBER);
  }
  
  public org.tempuri.Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult z_BAPI_CA_DISPLAY_WHATSAPP(java.lang.String strCA_NUMBER, java.lang.String strCONTRACT, java.lang.String strSERIALNO, java.lang.String strIMPORT_CRNNUMBER, java.lang.String strIMPORT_TELEPHONE_NO, java.lang.String strIMPORT_KNUMBER) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_CA_DISPLAY_WHATSAPP(strCA_NUMBER, strCONTRACT, strSERIALNO, strIMPORT_CRNNUMBER, strIMPORT_TELEPHONE_NO, strIMPORT_KNUMBER);
  }
  
  public org.tempuri.ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult ZBAPI_EXEMPT_MOBILE(java.lang.String strMobileNo) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_EXEMPT_MOBILE(strMobileNo);
  }
  
  public org.tempuri.ZBAPI_USTATUSResponseZBAPI_USTATUSResult ZBAPI_USTATUS(java.lang.String strAufnr, java.lang.String strTXT_04) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_USTATUS(strAufnr, strTXT_04);
  }
  
  public org.tempuri.Z_BAPI_ZDSS_WEB_LINK_NICResponseZ_BAPI_ZDSS_WEB_LINK_NICResult z_BAPI_ZDSS_WEB_LINK_NIC(java.lang.String i_ILART, java.lang.String i_VKONT, java.lang.String i_VKONA, java.lang.String PARTNERCATEGORY, java.lang.String PARTNERTYPE, java.lang.String TITLE_KEY, java.lang.String FIRSTNAME, java.lang.String LASTNAME, java.lang.String MIDDLENAME, java.lang.String FATHERSNAME, java.lang.String HOUSE_NO, java.lang.String BUILDING, java.lang.String STR_SUPPL1, java.lang.String STR_SUPPL2, java.lang.String STR_SUPPL3, java.lang.String POSTL_COD1, java.lang.String CITY, java.lang.String e_MAIL, java.lang.String LANDLINE, java.lang.String MOBILE, java.lang.String FEMALE, java.lang.String MALE, java.lang.String JOBGR, java.lang.String IDTYPE, java.lang.String IDNUMBER, java.lang.String PLANNINGPLANT, java.lang.String WORKCENTRE, java.lang.String SYSTEMCOND, java.lang.String APPLIEDCAT, java.lang.String APPLIEDLOAD, java.lang.String APPLIEDLOADKVA, java.lang.String CONNECTIONTYPE, java.lang.String STATEMENT_CA, java.lang.String START_DATE, java.lang.String START_TIME, java.lang.String FINISH_DATE, java.lang.String FINISH_TIME, java.lang.String SORTFIELD, java.lang.String ABKRS) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BAPI_ZDSS_WEB_LINK_NIC(i_ILART, i_VKONT, i_VKONA, PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, IDTYPE, IDNUMBER, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, APPLIEDCAT, APPLIEDLOAD, APPLIEDLOADKVA, CONNECTIONTYPE, STATEMENT_CA, START_DATE, START_TIME, FINISH_DATE, FINISH_TIME, SORTFIELD, ABKRS);
  }
  
  public org.tempuri.Z_BI_BAPI_ONLINE_BILLResponseZ_BI_BAPI_ONLINE_BILLResult z_BI_BAPI_ONLINE_BILL(java.lang.String strCANumber, java.lang.String strInvoiceNo) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.z_BI_BAPI_ONLINE_BILL(strCANumber, strInvoiceNo);
  }
  
  public org.tempuri.ZBAPI_SMARTMTR_TBLResponseZBAPI_SMARTMTR_TBLResult ZBAPI_SMARTMTR_TBL(java.lang.String COMPCODE, java.util.Calendar rundate, java.lang.String newcon, java.lang.String masterdata) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_SMARTMTR_TBL(COMPCODE, rundate, newcon, masterdata);
  }
  
  public org.tempuri.ZBAPI_SMARTMTR_updResponseZBAPI_SMARTMTR_updResult ZBAPI_SMARTMTR_upd(java.lang.String COMPCODE, java.util.Calendar rundate, java.lang.String flag, java.lang.String contract, java.lang.String meterno) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_SMARTMTR_upd(COMPCODE, rundate, flag, contract, meterno);
  }
  
  public org.tempuri.ZBAPI_WHATSAPP_INTEGRATIONResponseZBAPI_WHATSAPP_INTEGRATIONResult ZBAPI_WHATSAPP_INTEGRATION(java.lang.String strOrderID, java.lang.String strIFlag) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_WHATSAPP_INTEGRATION(strOrderID, strIFlag);
  }
  
  public org.tempuri.ZBAPI_DUNNING_NOTICE_WHATSAPPResponseZBAPI_DUNNING_NOTICE_WHATSAPPResult ZBAPI_DUNNING_NOTICE_WHATSAPP(java.lang.String strBUKRS, java.lang.String strVKONT) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_DUNNING_NOTICE_WHATSAPP(strBUKRS, strVKONT);
  }
  
  public org.tempuri.ZBAPI_WHATSAPP_STATUSResponseZBAPI_WHATSAPP_STATUSResult ZBAPI_WHATSAPP_STATUS(java.lang.String strOrd_Date, java.lang.String strCom_Code, java.lang.String strIFlag) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_WHATSAPP_STATUS(strOrd_Date, strCom_Code, strIFlag);
  }
  
  public org.tempuri.ZBAPI_SMARTMTR_TBL_BYPLResponseZBAPI_SMARTMTR_TBL_BYPLResult ZBAPI_SMARTMTR_TBL_BYPL(java.lang.String COMPCODE, java.lang.String rundate, java.lang.String newcon, java.lang.String masterdata) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_SMARTMTR_TBL_BYPL(COMPCODE, rundate, newcon, masterdata);
  }
  
  public org.tempuri.ZBAPI_FICA_DEMAND_DUE_DATEResponseZBAPI_FICA_DEMAND_DUE_DATEResult ZBAPI_FICA_DEMAND_DUE_DATE(java.lang.String strORDER_NO) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_FICA_DEMAND_DUE_DATE(strORDER_NO);
  }
  
  public org.tempuri.ZBAPI_ZCAL_HIGH_AVG_MDIResponseZBAPI_ZCAL_HIGH_AVG_MDIResult ZBAPI_ZCAL_HIGH_AVG_MDI(java.lang.String CA_NUMBER, java.lang.String appDate, java.lang.String appLoad) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ZCAL_HIGH_AVG_MDI(CA_NUMBER, appDate, appLoad);
  }
  
  public org.tempuri.ZBAPI_ZBI_PREPAID_MTRResponseZBAPI_ZBI_PREPAID_MTRResult ZBAPI_ZBI_PREPAID_MTR(java.lang.String CA_NUMBER) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ZBI_PREPAID_MTR(CA_NUMBER);
  }
  
  public org.tempuri.ZBAPI_IDENTIFY_DUESResponseZBAPI_IDENTIFY_DUESResult ZBAPI_IDENTIFY_DUES(java.lang.String CA_NUMBER) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_IDENTIFY_DUES(CA_NUMBER);
  }
  
  public org.tempuri.ZBAPI_ELNOTICE_WHATSAPPResponseZBAPI_ELNOTICE_WHATSAPPResult ZBAPI_ELNOTICE_WHATSAPP(java.lang.String companyCode, java.lang.String CANumber) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_ELNOTICE_WHATSAPP(companyCode, CANumber);
  }
  
  public org.tempuri.KYSResponseKYSResult KYS(java.lang.String CANO) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.KYS(CANO);
  }
  
  public org.tempuri.ZBAPI_MCR_DOC_NUMResponseZBAPI_MCR_DOC_NUMResult ZBAPI_MCR_DOC_NUM(java.lang.String strAR_DATE, java.lang.String strCOMPANY_CODE) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_MCR_DOC_NUM(strAR_DATE, strCOMPANY_CODE);
  }
  
  public org.tempuri.ZBAPI_CS_APT_TBL_UPDTResponseZBAPI_CS_APT_TBL_UPDTResult ZBAPI_CS_APT_TBL_UPDT(java.lang.String strORDER_NUMBER, java.lang.String strMAIN_WORK_CENTER) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_CS_APT_TBL_UPDT(strORDER_NUMBER, strMAIN_WORK_CENTER);
  }
  
  public org.tempuri.ZBAPI_PAY_IN_SLIPResponseZBAPI_PAY_IN_SLIPResult ZBAPI_PAY_IN_SLIP(java.lang.String strCompanyCode, java.lang.String strCA_Number) throws java.rmi.RemoteException{
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap.ZBAPI_PAY_IN_SLIP(strCompanyCode, strCA_Number);
  }
  
  
}