package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.CWOrderInstance;

public class CWOrderInstanceRowMapper implements RowMapper<CWOrderInstance>{

	@Override
	public CWOrderInstance mapRow(ResultSet rs, int rowNum) throws SQLException {
		CWOrderInstance cWOrderInstance=new CWOrderInstance();
		cWOrderInstance.setAccountNo(rs.getString("ACCOUNT_NO"));
		cWOrderInstance.setAccountType(rs.getString("ACCOUNT_TYPE"));
		cWOrderInstance.setActive(rs.getInt("ACTIVE"));
		cWOrderInstance.setAutomatedlsrsupplement(rs.getInt("automatedlsrsupplement"));
		cWOrderInstance.setBillingOrderNo(rs.getString("billing_Order_No"));
		cWOrderInstance.setClecAutomated(rs.getInt("clec_Automated"));
		cWOrderInstance.setClecflag(rs.getString("clecflag"));
		cWOrderInstance.setClecInterface(rs.getString("clec_Interface"));
		cWOrderInstance.setCompletionDate(rs.getDate("completion_Date"));
		cWOrderInstance.setCreatedby(rs.getString("createdby"));
		cWOrderInstance.setCreationdate(rs.getDate("creationdate"));
		cWOrderInstance.setCsrfallout(rs.getInt("csrfallout"));
		cWOrderInstance.setCwdocid(rs.getString("cwdocid"));
		cWOrderInstance.setCwdocstamp(rs.getString("cwdocstamp"));
		cWOrderInstance.setCwdoctype(rs.getString("cwdoctype"));
		cWOrderInstance.setCworderid(rs.getString("cworderid"));
		cWOrderInstance.setCworderstamp(rs.getString("cworderstamp"));
		cWOrderInstance.setCwparentid(rs.getString("cwparentid"));
		cWOrderInstance.setErrorCode(rs.getString("error_Code"));
		cWOrderInstance.setFalloutFlag(rs.getInt("fallout_Flag"));
		cWOrderInstance.setFirstName(rs.getString("first_Name"));
		cWOrderInstance.setHasattachment(rs.getInt("hasattachment"));
		cWOrderInstance.setIsbcppriorder(rs.getInt("isbcppriorder"));
		cWOrderInstance.setIsstackedequip(rs.getInt("isstackedequip"));
		cWOrderInstance.setJobId(rs.getString("job_Id"));
		cWOrderInstance.setKindOfOrder(rs.getString("kind_Of_Order"));
		cWOrderInstance.setLastName(rs.getString("last_Name"));
		cWOrderInstance.setLastupdateddate(rs.getDate("lastupdateddate"));
		cWOrderInstance.setLsrordertype(rs.getString("lsrordertype"));
		cWOrderInstance.setLsrsubmitted(rs.getInt("lsrsubmitted"));
		cWOrderInstance.setLsrsubmitteddate(rs.getDate("lsrsubmitteddate"));
		cWOrderInstance.setLsrtype(rs.getString("lsrtype"));
		cWOrderInstance.setManprovisionind(rs.getInt("manprovisionind"));
		cWOrderInstance.setManuallyCreated(rs.getInt("manually_Created"));
		cWOrderInstance.setManuallymodified(rs.getInt("manuallymodified"));
		cWOrderInstance.setMarket(rs.getString("market"));
		cWOrderInstance.setMetadatatype(rs.getInt("metadatatype"));
		cWOrderInstance.setMetadatatypeVer(rs.getInt("metadatatype_Ver"));
		cWOrderInstance.setNonpayonly(rs.getString("nonpayonly"));
		cWOrderInstance.setNoreschedule(rs.getInt("noreschedule"));
		cWOrderInstance.setOmseVerCreated(rs.getString("omse_Ver_Created"));
		cWOrderInstance.setOmseVerUpdated(rs.getString("omse_Ver_Updated"));
		cWOrderInstance.setOrderActivity(rs.getString("order_Activity"));
		cWOrderInstance.setOrderLineType(rs.getString("order_Line_Type"));
		cWOrderInstance.setOrderNo(rs.getString("order_No"));
		cWOrderInstance.setOrderPhase(rs.getString("order_Phase"));
		cWOrderInstance.setOrderState(rs.getString("order_State"));
		cWOrderInstance.setOrderUpdatedBy(rs.getString("order_Updated_By"));
		cWOrderInstance.setOrderUpdatedOn(rs.getDate("order_Updated_On"));
		cWOrderInstance.setOrderVer(rs.getString("order_Ver"));
		cWOrderInstance.setOriginalOrderId(rs.getString("original_Order_Id"));
		cWOrderInstance.setOrigOrderDate(rs.getDate("orig_Order_Date"));
		cWOrderInstance.setOwner(rs.getString("owner"));
		cWOrderInstance.setProductcode(rs.getString("productcode"));
		cWOrderInstance.setParentorder(rs.getString("parentorder"));
		cWOrderInstance.setParentOrderNo(rs.getString("parent_Order_No"));
		cWOrderInstance.setProcessId(rs.getString("process_Id"));
		cWOrderInstance.setProcid(rs.getString("procid"));
		cWOrderInstance.setProjectId(rs.getInt("project_Id"));
		cWOrderInstance.setRecordsonlyaction(rs.getString("recordsonlyaction"));
		cWOrderInstance.setRelatedorderno(rs.getString("relatedorderno"));
		cWOrderInstance.setRootorderid(rs.getString("rootorderid"));
//		cWOrderInstance.setRponly(rs.getString("rpdonly"));
		cWOrderInstance.setSaddrCity(rs.getString("saddr_City"));
		cWOrderInstance.setSaddrState(rs.getString("saddr_State"));
		cWOrderInstance.setSaddrZip(rs.getString("saddr_Zip"));
		cWOrderInstance.setSourceOrderId(rs.getString("source_Order_Id"));
		cWOrderInstance.setSppind(rs.getString("sppind"));
		cWOrderInstance.setState(rs.getString("state"));
		cWOrderInstance.setStateChangeTime(rs.getDate("state_Change_Time"));
		cWOrderInstance.setStatus(rs.getString("status"));
		cWOrderInstance.setOrderState(rs.getString("order_State"));
		cWOrderInstance.setUpdatedby(rs.getString("updatedby"));
		cWOrderInstance.setVisualkey(rs.getString("visualkey"));
		return cWOrderInstance;
	}

}
