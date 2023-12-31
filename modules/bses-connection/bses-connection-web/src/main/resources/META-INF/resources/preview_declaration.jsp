<%@page import="com.bses.connection2.web.portlet.PreviewHelper"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp"%>
<%
	long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
	if(connectionRequestId==0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID)!=null){
		connectionRequestId=(Long)portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	}
	
	System.out.println("preview_request.jsp- connectionRequestId - "+connectionRequestId);
	ConnectionRequest cr = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
	PreviewHelper ph = new PreviewHelper(cr);
%>

<style>
.declaration-view {
	margin: 4px;
	padding: 4px;
	border: 2px solid #ced4da;
	width: 100%;
	text-align: justify;
}

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

table.center {
  margin-left: auto; 
  margin-right: auto;
}
</style>

	<div class="container-fluid mt-3"><%-- bg-white shadow p-5 my-3"> --%>
		<div class="row">
			<div class="col-md-12">
				<h5 class="text-uppercase text-body font-weight-bold bg-light p-3 text-center">
					<liferay-ui:message key="declaration-section-title" />
				</h5>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 declaration-view">
			<%--	<div class="declaration-view"> --%>
				<p>
					I, <a id="firstName1" style="font-weight: bold;"><%=ph.getIndividualName() %></a> Son/Daughter/Wife of <a id="fatherName1" style="font-weight: bold;"><%=ph.getFatherName() %></a>
					Resident of <a id="address1" style="font-weight: bold;"><%=ph.getIndividualAddress() %></a> (hereinafter
					referred to as "Applicant", which term shall mean and include executors, administrators, heirs, successors and assigns), do hereby swear and
					declare as under:
				</p>
				Or
				<p>
					The <a id="firmName1" style="font-weight: bold;"><%=ph.getFirmName() %></a>, a company incorporated under the provisions of the Companies Act, 2013 or as amended,
					having its registered office at <a id="registeredOffice1" style="font-weight: bold;"><%=ph.getFirmAddress() %></a> (hereinafter referred to as "Applicant", which
					expression shall, unless repugnant to the context or meaning thereof, include its successors and assigns), through its duly Authorized
					Representative Mr. <a id="authorizedSignature1" style="font-weight: bold;"><%=ph.getAuthorizedSignatory() %></a> do hereby swear and declare as under:
				</p>
				Or
				<p>
					A Sole proprietorship/ a partnership firm having its office at <a id="address2" style="font-weight: bold;"><%=ph.getFirmAddress() %></a> (hereinafter referred to as
					the applicant which unless the context otherwise provides includes its successors and assigns), through Mr. <a id="authorizedSignature2"
						style="font-weight: bold;"><%=ph.getAuthorizedSignatory() %></a> , who is a partner or a duly authorized representative do hereby swear and declare as under:
				</p>
				
				<p>
				THAT the Applicant is a lawful occupant of the premises at <span id="address3"  class="dec_firm_address" style="font-weight: bold;"><%=ph.getIndividualOrFirmAddress() %></span>(hereinafter the "Premises").
				</p>
				
				
					<%@ include file="/declaration_part_1_static_content.jsp" %>  
				<p></p>
				<center>
					<u><b>UNDERTAKING WITH APPLICATION OF NEW CONNECTION</b></u>
				</center>
				<p></p>

				<p>BSES welcomes its esteemed consumers in its family. Our vision is to be the most admired trusted and integrated utility in the world. We
					are committed to provide quality, safe and reliable services to our consumers and committed for consumer satisfaction &amp; operational
					excellence. For complying DERC norms, we therefore request you to go through the undertaking and please submit the signed copy along with other
					necessary documents at the time of application of connection.</p>

				<p>
					I, <a id="fullName" style="font-weight: bold;"><%=ph.getDeclarationBy() %></a> son/daughter/Authorized representative of <a id="fatherName2"
						style="font-weight: bold;"><%=ph.getFatherOrFirmName() %></a> resident of <a id="fullAddress" style="font-weight: bold;"><%=ph.getIndividualOrFirmAddress() %></a> Connection applied address 
						<a id="fullAddress1" style="font-weight: bold;"><%=ph.getIndividualAddress() %></a> hereby undertake that I shall:-
				</p>

				<p>1. Provide suitable and adequate space at immediate entry or outside the premises when permanent connection is applied in such a manner
					that meter is always accessible to meter reader as notified in DERC Supply Code and Performance Standards Regulations 2017 Chapter-V
					Article-29(3). I shall provide minimum space required for meter installation as per the dimensions of meters boxes and bus bar given in below
					table:-</p>

				<table class="center" style="width: 60%; text-align: center;">
					<tbody>
						<tr style="background-color: black; color: white;">
							<th style="text-align: center;">Meter &amp; Bus bar</th>
							<th style="text-align: center;">Length(mm)</th>
							<th style="text-align: center;">Width(mm)</th>
						</tr>
						<tr>
							<td>1 phase meter with box</td>
							<td>250</td>
							<td>150</td>
						</tr>
						<tr>
							<td>3 phase meters with box</td>
							<td>420</td>
							<td>350</td>
						</tr>
						<tr>
							<td>1 Ph 2-way Bus bar</td>
							<td>250</td>
							<td>220</td>
						</tr>
						<tr>
							<td>1 Ph 4-way Bus bar</td>
							<td>320</td>
							<td>300</td>
						</tr>
						<tr>
							<td>3 Ph 2-way Bus bar</td>
							<td>350</td>
							<td>500</td>
						</tr>
						<tr>
							<td>3 Ph 4-way Bus bar</td>
							<td>350</td>
							<td>500</td>
						</tr>
						<tr>
							<td>3 Ph 8-way Bus bar</td>
							<td>300</td>
							<td>500</td>
						</tr>
					</tbody>
				</table>
				&nbsp;
				<p>2. Provide fire clearance certificate when permanent connection is applied in
					<p>A. Residential Building:For the dwelling units which are above the heights of 15 meters without stilt parking and which are above the height of 17.5 meters with stilt parking of the building.</p>
					
					<p>B. Other than Residential Building:
					
						<p>� Hotels and Guest Houses having height more than 12 meters</p>
						
						<p>� Institutional Buildings having height more than 9 meters</p>
						
						<p>� Business Buildings having height more than 15 meters.</p>

				<p>3. Provide seperate meter room at safe and acceessible location or lockable and weather proof, fireproof/metal made compartment according
					to requisite dimensions mentioned in the table given below for meter installation in the panel as per Regulation 29(2) of DERC (Supply Code and
					Performance Standards) Regulations,2017:</p>

				<table class="center" style="width: 70%; text-align: center;">
					<tbody>
						<tr style="background-color: black; color: white; text-align: center;">
							<th style="text-align: center;">Meter &amp; Bus bar Panel</th>
							<th style="text-align: center;">Length(mm)</th>
							<th style="text-align: center;">Width(mm)</th>
							<th style="text-align: center;">Depth(mm)</th>
						</tr>
						<tr>
							<td>1 Phase Meter Panel(Each)</td>
							<td>425</td>
							<td>400</td>
							<td>175</td>
						</tr>
						<tr>
							<td>3 Phase Meter Panel(Each)</td>
							<td>500</td>
							<td>500</td>
							<td>260</td>
						</tr>
						<tr>
							<td>1 Phase Bus bar Panel</td>
							<td>425</td>
							<td>525</td>
							<td>175</td>
						</tr>
						<tr>
							<td>3 Phase Bus bar Panel</td>
							<td>625</td>
							<td>475</td>
							<td>260</td>
						</tr>
						<tr>
							<td>MCCB/ELCB Box</td>
							<td>300</td>
							<td>250</td>
							<td>260</td>
						</tr>
					</tbody>
				</table>
				&nbsp;
				<p>4. Provide space for meter installation only on the ground floor of my premise having proper ventilation. I shall ensure that no parking of
					bike/car provided near meter installation space and the space must have adequate illumination not blocking and entry/exit as per Regulation 29(4)
					of DERC (Supply Code and Performance Standards) Regulations, 2017 and DDA unified building Bye-Laws for Delhi 2016 dated 24.02.2021.</p>

				<p>
					5. I will provide fire retardant closed panel to install meter box, circuit breaker, main switch, switch gear, electrical vehicle charging point
					and associated equipment and same will not install under or near the staircase of my premise as per the notification of <b>DDA unified
						building Bye-Law for Delhi 2016 dated 24.02.2021</b> and letter no. <b>CEI/1/9/2020/263-294 dated 03.05.2021</b> specially in multi storied
					buildings.
				</p>

				<p>6. I agree to provide space for meter installation in a premise at one location so that all meters can be installed at one place and
					energized from same feeding point to avoid safety hazards.</p>

				<p>
					7. I will provide space for meter installation at two different location (on opposite wall) if electricity of my <b>premise/Entire building</b>
					is supplied through two different feeding points on HVDS area.
				</p>

				<p>8. It is my responsibliy to install fire extinguisher near the meter installation location in case of multiple meters are installed at one
					location and I shall be responsible for keeping the fire extinguisher in working condition and be responsible for its yearly maintenance.</p>

				<p>9. I will lay underground HDPE pipe &amp; make trench for laying cable inside the premise up to the position of meter installation
					condidering future load growth in case of underground service cable, as per the table given below.</p>

				<table class="center" style="width: 80%">
					<tbody>
						<tr style="background-color: black; color: white; text-align: center;">
							<th colspan="3" style="text-align: center;">HDPE Pipe Sizes for laying of Underground Cables*</th>
						</tr>
						<tr style="background-color: #808080;">
							<td>Load</td>
							<td>Cable Size(Sq.mm)</td>
							<td>Proposed pipe size Dia (mm)</td>
						</tr>
						<tr>
							<td>Up to 5 KW</td>
							<td>2*10</td>
							<td>30</td>
						</tr>
						<tr>
							<td>6-10 KW</td>
							<td>2*25</td>
							<td>36</td>
						</tr>
						<tr>
							<td>11-20 KW</td>
							<td>4*25</td>
							<td>40</td>
						</tr>
						<tr>
							<td>21-50 KW</td>
							<td>4*50</td>
							<td>45</td>
						</tr>
						<tr>
							<td>51-99 KW</td>
							<td>4*150</td>
							<td>65</td>
						</tr>
						<tr>
							<td>100-140 KW</td>
							<td>4*300</td>
							<td>90</td>
						</tr>
					</tbody>
				</table>
				&nbsp;
				<p>10. It is my responsibility to ensure that electrical installation and other related work in my premise to be maintained in such a manner
					as to prevent danger due to shock, fire hazards and installation is carried out in accordance with the relevant code and practice.</p>

				<p>
					11. It is my responsibility that no other service pipes and cables shall be taken along the ducts provided for laying power cables and all ducts
					provided for power cables and other services shall be provided with fire barrier at each floor crossing in multistoried buildings to adhere the
					safety guideline issued vide letter no. <b>CEI/1/9/2020/263-294 dated 03.05.2021.</b>
				</p>

				<p>12. I shall provide space for fixing MS angle (L or I shape of suitable strength)/Anchor hook bolt 10/12 mm to fix on wall of premise,
					above 15 feet height from road level to support overhead cables.</p>

				<p>13. I do hereby undertake and abide to maintain safe distance between my premise and BSES network always as per the below prescribed norms.</p>

				<table class="center" style="width: 100%">
					<tbody>
						<tr style="background-color: black; color: white; text-align: center;">
							<th style="text-align: center;">Sr.No</th>
							<th style="text-align: center;">Lines/Installation</th>
							<th style="text-align: center;">Min. Vertical Clearance</th>
							<th style="text-align: center;">Min Horizontal Clearance</th>
						</tr>
						<tr style="background-color: #808080;">
							<td></td>
							<td>Where line is passing</td>
							<td>(i.e., above a building/structure/balcony etc)</td>
							<td>(i.e., adjacent to a building/structure/balcony etc)</td>
						</tr>
						<tr>
							<td>1</td>
							<td><b>Line of voltage up to 650 volts</b></td>
							<td>2.5 meter from the highest Point</td>
							<td>1.2 meter from the nearest Point</td>
						</tr>
						<tr>
							<td>2</td>
							<td><b>High Voltage line exceeding 650 volts up to and including 11000 volts</b></td>
							<td>3.7 meter from the highest Point</td>
							<td>1.2 meter from the nearest Point</td>
						</tr>
						<tr>
							<td>3</td>
							<td><b>High Voltage line above 11000 volts and up to and including 33000 volts</b></td>
							<td>3.7 meter from the highest Point</td>
							<td>2 meters from the nearest Point</td>
						</tr>
						<tr>
							<td>4</td>
							<td><b>Extra High Voltage (EHV) Line exceeding 33 KV</b></td>
							<td>3.7 meter (plus 0.30 meter for every addtional 33000 volts or parts thereof)</td>
							<td>2 meters (plus 0.30 meter for every additional 33kv or part thereof)</td>
						</tr>

					</tbody>
				</table>
				&nbsp;
				<p>14. I shall provide space for substation wherever required in accordance with Regulation 21 of the Delhi Electricity Regulatory Commision
					(Supply Code and Performance Standards) Regulations 2017 ("Supply Code, 2017") read with this Hon'ble Commissions Order dated 31.08.2017
					reschedule of Charges and the procedure under Delhi Electricity Regulatory Commission (Supply Code and Performance Standards) Regulations 2017
					("Schedule of Charges Order") and the subsequent amendments thereto.</p>

				<p>15. I shall install ELCB at site of load above 1 KW. In order to proper fixation. I shall fix the ELCB on the DIN rail channel as per
					Regulation 7(5) of DERC (Supply Code and Performance Standards) Regulations, 2017 and the subsequent amendments thereto</p>

				<p>16. I shall install protective equipment ELCB as well as MCB/MCCB according to the rating required for sanctioned load applied and as
					notified by BRPL.</p>

				<p>17. I shall complete internal wiring of premise as per Regulation 7 (3),(4) and (5) of DERC (Supply Code and Performance Standards)
					Regulations, 2017. I do hereby agree and undertake that I shall ensure that wiring shall be done as per the BIS standards (IS 732) as well as
					verified by Govt. of NCR certified contractors. ELCB will be installed preferably near meter and in case lack of space ELCB can be installed near
					distribution box.</p>

				<p>18. I undertake to provide the space outside the house/outside staircase area/common entrance/ corridor/ common parking area/ fire escape
					area in building to avoid accidents &amp; I shall ensure to keep escape route safe and free all the time so that the same can be used in case of
					calamity. I understand that the compliance of the terms of this undertaking and the other terms as agreed by me in the undertaking documents is a
					pre-requisite for the release of electricity connection to me and in case of mine non-compliance of the terms of this undertaking and/or failure
					to provide adequate space, BRPL shall be well within its rights to refuse the release of electricity connections, at any stage, without any
					liability for any claim from any party whatsoever.</p>

				<p>19. I shall provide adequate arrangements to make seperate earthing provision before installation of any type of three phase energy meter
					in compliance of the provisions of DERC(Supply Code and Performance Standards) Regulations, 2017 and the subsequent amendments thereto.</p>


				<p></p>
				<center style="text-decoration-line: underline;">
					<b>Undertaking Format for release of connection or re connection based on DERC 6th Amendment Order for Building Height</b>
				</center>
				<p></p>
				<p></p>
				<center>
					<b>SELF - DECLARATION / UNDERTAKING</b>
				</center>
				<p></p>
				<p>
					I, <a id="detail1" style="font-weight: bold;"><%=ph.getDeclarationBy() %></a> Son/Daughter/Wife of <a id="detail2" style="font-weight: bold;"><%=ph.getFatherName() %></a>
					Resident of <a id="detail3" style="font-weight: bold;"><%=ph.getIndividualAddress() %></a> (hereinafter referred to as "Applicant", which term shall mean and include
					executors, administrators, heirs, successors and assigns), do hereby swear and declare as under:
				</p>

				<p>
					A. That the Applicant / deponent is owner / occupant of the premises bearing no. , situated at <a id="detail4" style="font-weight: bold;"><%=ph.getIndividualOrFirmAddress() %>
						</a>
				</p>

				<p>
					B. That I have applied for <a id="detail5" style="font-weight: bold;"><%=ph.getTariffCategoryValue() %></a>- new connection (Domestic/ Non-domestic/ Industrial at the
					above-mentioned address
					<!-- [Google Coordinates - <a id="detail61" style="font-weight: bold;"></a> (Latitude) & <a id="detail62" style="font-weight: bold;"></a> (Longitude)] -->
				</p>

				<p>C. That I have submitted the ownership / occupancy documents of the said premises / property / flat.</p>

				<p>D. I understand that mere release of electrify connection / installation of meter/issuance of bill for the use of electricity shall not be
					termed as confirming any ownership or other rights over the concerned land or premise.</p>

				<p>E. The deponent undertakes:-</p>

				<p>
					<i>(a) The dwelling unit where electricity connection is applied is within the height of 15 meters without stilt parking/ 17.5 meters with
						stilt parking of the building. </i>
				</p>

				<p>
					<i>(b) The electricity connection granted to the premises will not be used for extending electricity supply to other dwelling units.</i>
				</p>

				<p>
					<i>(c) In case, it comes to my knowledge that there is illegal extension of supply or electricity is used at dwelling units beyond the height
						of 15 meters without stilt parking/ 17.5 meters with stilt parking of the building, I will promptly bring the same to the DISCOM's notice.</i>
				</p>

				<p>
					<i>(d) I do hereby confirm and agree that I shall ensure that NO illegal extension of supply or electricity is used at dwelling units beyond
						the height of 15 meters without stilt parking / 17.5 meters with stilt parking of the building from my connection. I do hereby undertake that in
						case the illegal extension of supply or electricity is used from my connection at dwelling units beyond the height of 15 meters without stilt
						parking / 17.5 meters with stilt parking of the building, I shall be liable to pay all outstanding bill of the said unit along with the bill as
						assessed by BSES without disputing the assessment and / or raising any claim whatsoever and the DISCOM shall be free to disconnect the
						electricity connection immediately, without any notice.</i>
				</p>

				<p>F. I hereby undertake that I shall be using electricity for purposes applied for &amp; shall not use / permit to use in any other manner.</p>

				<p>G. I agree and confirm that in case of any declaration containing in the instant undertaking is found false at any later occasion, the same
					shall be mutatis mutandis be termed as breach of the</p>

				<p>agreement between BRPL and the deponent, and BRPL shall be free to take all such action as permitted under law including the same related
					to breach of terms of agreement.</p>

				<p>H. I declare that the above statements are true and correct, and I shall be unequivocally liable to abide the terms stated in this
					undertaking cum affidavit.</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12 mt-3 mb-2">
			<aui:form role="form"  name ="declarationForm"  >
				<div class="form-check-inline">
						<aui:input cssClass="mr-2" type="checkbox" style="cursor:default !important" value="1" name="selfDeclaration" label="declaration-check" disabled="true"/>
				</aui:form>
			</div>
		</div>
	</div>
<%--</div> --%>

<script>
$(document).ready(function() {
var checked=<%=cr.isSelfDeclaration()%>;
	if(checked==true){
		$("#<portlet:namespace/>selfDeclaration").prop( "checked", true );
	}	
});
</script>


<script>  
/**
$(document).ready(function(){  
	
	var valueExist = false;

	$('#<portlet:namespace/>consumerForm').find('input:text')
    .each(function () {
    
    	if($(this).val() != "")
    	{
    		valueExist =  true;
    		return true;
    	}
    	
     });
	
	if(valueExist == true)
	{
		updateName();
	}
	 
	valueExist = false;
	
	 $('#<portlet:namespace/>addressForm').find('input:text')
    .each(function () {
    	
    	if($(this).val() != "")
    	{
    		valueExist =  true;
    		return true;
    	}
    	
     });
	
	
	if(valueExist == true)
	{
		updateAddress();
	}
}); 
	
function updateName()
{
	var consumerType = $("#<portlet:namespace/>consumerType").val();
	if(consumerType == "Individual")
	{
		updateNameDetails();
	}
	else
	{
		updateFirmNameDetails();
	}
}

function updateFirmNameDetails()
{
	$("#detail1").text(($("#<portlet:namespace/>nameOfAuthorizedSignatory").val()));
	$("#fullName").text(($("#<portlet:namespace/>nameOfAuthorizedSignatory").val()));
	$("#fatherName2").text(($("#<portlet:namespace/>firmName").val()));	
	$("#authorizedSignature1").text(($("#<portlet:namespace/>nameOfAuthorizedSignatory").val()));
	$("#firmName1").text(($("#<portlet:namespace/>firmName").val()));	
	$("#firstName1").text("___");
	$("#fatherName1").text("___");
	$("#address1").text("___");
}

function updateNameDetails()
{
	$("#fatherName1").text($("#<portlet:namespace/>fatherOrHusbandName").val());
	$("#fatherName2").text($("#<portlet:namespace/>fatherOrHusbandName").val());
	$("#detail2").text($("#<portlet:namespace/>fatherOrHusbandName").val());	
	
	$("#firmName1").text("___");
	$("#registeredOffice1").text("___");
	$("#authorizedSignature1").text("___");
	$("#address2").text("___");
	$("#authorizedSignature2").text("___");
	
}


function updateAddress()
{

	var house = $("#<portlet:namespace/>houseNo").val();
	var floor = $("#<portlet:namespace/>floor :selected").text().replace("-Select-","");
	var buildingName = $("#<portlet:namespace/>buildingName").val();
	var street = $("#<portlet:namespace/>street").val();
	var colony = $("#<portlet:namespace/>colonyArea").val();
	var lendmark = $("#<portlet:namespace/>landmark :selected").text().replace("-Select-","");
	var lendmarkDetails = $("#<portlet:namespace/>landmarkDetail").val();
	var locality = $("#<portlet:namespace/>locality :selected").text().replace("-Select-","");
	var district = $("#<portlet:namespace/>district").val();
	var cityPostalCode = $("#<portlet:namespace/>pinCode").val();
	
	var arr = [floor,buildingName,house,street,colony,lendmark,lendmarkDetails,locality,district,cityPostalCode];	
	
	//const match = /\r|\n/.exec(floor);
	//	console.log(match) 
	
		var fullAddress = arr.filter(function(x) {
		
		if(x !== '' && x !== "\n\n\n\t\n")
		 {
			return x+",";
		 }
	});
	  	  
	 var consumerType = $("#<portlet:namespace/>consumerType").val();
		
	 if(consumerType == "Individual")
	 {
		   $("#address1").text(fullAddress); 
		 	$("#firmName1").text("___");
			$("#registeredOffice1").text("___");
			$("#authorizedSignature1").text("___");
			$("#address2").text("___");
			$("#authorizedSignature2").text("___");
	 }
	 else
	 {
		 $("#address2").text(fullAddress);
		 $("#registeredOffice1").text(fullAddress);
		 $("#authorizedSignature2").text(fullAddress);	 
		 $("#firstName1").text("___");
		 $("#fatherName1").text("___");
		 $("#address1").text("___");
	 }
	  $("#address3").text(fullAddress);
	  $("#fullAddress").text(fullAddress);
	  $("#fullAddress1").text(fullAddress);
	  $("#detail3").text(fullAddress);
	  $("#detail4").text(fullAddress);
	  
}

*/
</script>
