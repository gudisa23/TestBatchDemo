package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.CWPWorkList;
import com.model.CWPWorkListArchive;

public class CWPWorkListRowMapper implements RowMapper<CWPWorkList>{
	@Override
	public CWPWorkList mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CWPWorkList cwpWorkList=new CWPWorkList();
		
		cwpWorkList.setCwdocid(rs.getString("CWDOCID"));
		cwpWorkList.setPriority(rs.getInt("PRIORITY"));
		cwpWorkList.setSenderId(rs.getInt("SENDER_ID"));
		cwpWorkList.setParticipantType(rs.getString("PARTICIPANT_TYPE"));
		cwpWorkList.setOrderId(rs.getString("ORDER_ID"));
		cwpWorkList.setOrderVk(rs.getString("ORDER_VK"));
		cwpWorkList.setCreationdate(rs.getDate("CREATION_DATE"));
		cwpWorkList.setDueDate(rs.getDate("DUE_DATE"));
		cwpWorkList.setUserId(rs.getString("USER_ID"));
		cwpWorkList.setStartWorkDate(rs.getDate("START_WORK_DATE"));
		cwpWorkList.setAssignToUserDate(rs.getDate("ASSIGN_TO_USER_DATE"));
		cwpWorkList.setFlags(rs.getInt("FLAGS"));
		cwpWorkList.setOperation(rs.getString("OPERATION"));
		cwpWorkList.setDisable(rs.getInt("DISABLE"));
	    cwpWorkList.setMetadatatypeVer(rs.getInt("METADATATYPE_VER"));
		cwpWorkList.setActivityIndex(rs.getInt("ACTIVITY_INDEX"));
		cwpWorkList.setEffort(rs.getInt("EFFORT"));
		cwpWorkList.setAssociationId(rs.getString("ASSOCIATION_ID"));
		cwpWorkList.setOrderItemId(rs.getString("ORDER_ITEM_ID"));
		cwpWorkList.setDistribtype(rs.getInt("DISTRIBTYPE"));
		cwpWorkList.setChanged(rs.getInt("CHANGED"));
		cwpWorkList.setRevisionNo(rs.getInt("REVISION_NO"));
		cwpWorkList.setFlagreason(rs.getString("FLAGREASON"));
		cwpWorkList.setFlag(rs.getString("FLAG"));
		cwpWorkList.setCompletedby(rs.getString("COMPLETEDBY"));
		cwpWorkList.setCustomerName(rs.getString("CUSTOMER_NAME"));
		cwpWorkList.setWorklistHold(rs.getString("WORKLIST_HOLD"));
		cwpWorkList.setTranstype(rs.getString("TRANSTYPE"));
		cwpWorkList.setAccountType(rs.getString("ACCOUNT_TYPE"));
		cwpWorkList.setTwccsrname(rs.getString("TWCCSRNAME"));
		cwpWorkList.setUpdatedby(rs.getString("UPDATEDBY"));
		cwpWorkList.setCwparentid(rs.getString("CWPARENTID"));
		cwpWorkList.setCwdocid(rs.getString("CWORDERID"));
		cwpWorkList.setLastupdateddate(rs.getDate("LASTUPDATEDDATE"));
		cwpWorkList.setCwdocstamp(rs.getString("CWDOCSTAMP"));
		cwpWorkList.setAccountNo(rs.getString("ACCOUNT_NO"));
		cwpWorkList.setQueuePriv(rs.getString("QUEUE_PRIV"));
		cwpWorkList.setViewPriv(rs.getString("VIEW_PRIV"));
	    cwpWorkList.setTaskState(rs.getString("TASK_STATE"));
		cwpWorkList.setDivision(rs.getString("DIVISION"));
		cwpWorkList.setCreateAssignDays(rs.getInt("CREATE_ASSIGN_DAYS"));
		cwpWorkList.setFirstAssignDate(rs.getDate("FIRST_ASSIGN_DATE"));
		cwpWorkList.setSortDate(rs.getDate("SORT_DATE"));
		cwpWorkList.setTn(rs.getString("TN"));
		cwpWorkList.setErrorCode(rs.getString("ERROR_CODE"));
		cwpWorkList.setOrdertype(rs.getString("ORDERTYPE"));
		cwpWorkList.setOrderVer(rs.getString("ORDER_VER"));
		cwpWorkList.setOrderNo(rs.getString("ORDER_NO"));
		cwpWorkList.setMarket(rs.getString("MARKET"));

		return cwpWorkList;
	}
}
