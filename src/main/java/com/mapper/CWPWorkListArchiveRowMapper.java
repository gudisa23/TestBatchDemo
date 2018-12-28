package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.CWPWorkListArchive;

public class CWPWorkListArchiveRowMapper implements RowMapper<CWPWorkListArchive>{
	@Override
	public CWPWorkListArchive mapRow(ResultSet rs, int rowNum) throws SQLException {
		CWPWorkListArchive cwpWorkListArchive=new CWPWorkListArchive();
		cwpWorkListArchive.setCwdocid(rs.getString("CWDOCID"));
		cwpWorkListArchive.setPriority(rs.getInt("PRIORITY"));
		cwpWorkListArchive.setSenderId(rs.getInt("SENDER_ID"));
		cwpWorkListArchive.setParticipantType(rs.getString("PARTICIPANT_TYPE"));
		cwpWorkListArchive.setOrderId(rs.getString("ORDER_ID"));
		cwpWorkListArchive.setOrderVk(rs.getString("ORDER_VK"));
		cwpWorkListArchive.setCreationdate(rs.getDate("CREATION_DATE"));
		cwpWorkListArchive.setDueDate(rs.getDate("DUE_DATE"));
		cwpWorkListArchive.setUserId(rs.getString("USER_ID"));
		cwpWorkListArchive.setStartWorkDate(rs.getDate("START_WORK_DATE"));
		cwpWorkListArchive.setAssignToUserDate(rs.getDate("ASSIGN_TO_USER_DATE"));
		cwpWorkListArchive.setFlags(rs.getString("FLAGS"));
		cwpWorkListArchive.setCompleteDate(rs.getDate("COMPLETE_DATE"));
		cwpWorkListArchive.setOperation(rs.getString("OPERATION"));
		cwpWorkListArchive.setDisable(rs.getInt("DISABLE"));
		cwpWorkListArchive.setMetadatatypeVer(rs.getInt("METADATATYPE_VER"));
		cwpWorkListArchive.setEffort(rs.getInt("EFFORT"));
		cwpWorkListArchive.setAssociationId(rs.getString("ASSOCIATION_ID"));
		cwpWorkListArchive.setOrderItemId(rs.getString("ORDER_ITEM_ID"));
		cwpWorkListArchive.setAction(rs.getString("ACTION"));
		cwpWorkListArchive.setDistribtype(rs.getInt("DISTRIBTYPE"));
		cwpWorkListArchive.setCompletedby(rs.getString("COMPLETEDBY"));
		cwpWorkListArchive.setDuedatecomputed(rs.getDate("DUEDATECOMPUTED"));
		cwpWorkListArchive.setAccountType(rs.getString("ACCOUNT_TYPE"));
		cwpWorkListArchive.setTwccsrname(rs.getString("TWCCSRNAME"));
		cwpWorkListArchive.setAccountNo(rs.getString("ACCOUNT_NO"));
		cwpWorkListArchive.setTn(rs.getString("TN"));
		cwpWorkListArchive.setErrorCode(rs.getString("ERROR_CODE"));
		cwpWorkListArchive.setCreateCompleteDays(rs.getInt("CREATE_COMPLETE_DAYS"));
		cwpWorkListArchive.setAssignCompleteDays(rs.getInt("ASSIGN_COMPLETE_DAYS"));
		cwpWorkListArchive.setCreateAssignDays(rs.getInt("CREATE_ASSIGN_DAYS"));
		cwpWorkListArchive.setFirstAssignDate(rs.getDate("FIRST_ASSIGN_DATE"));
		cwpWorkListArchive.setSortDate(rs.getDate("SORT_DATE"));
		cwpWorkListArchive.setOrdertype(rs.getString("ORDERTYPE"));
		cwpWorkListArchive.setOrderVer(rs.getString("ORDER_VER"));
		cwpWorkListArchive.setOrderNo(rs.getString("ORDER_NO"));
		cwpWorkListArchive.setTaskState(rs.getString("TASK_STATE"));
		cwpWorkListArchive.setViewPriv(rs.getString("VIEW_PRIV"));
		cwpWorkListArchive.setQueuePriv(rs.getString("QUEUE_PRIV"));
		cwpWorkListArchive.setDivision(rs.getString("DIVISION"));
		cwpWorkListArchive.setMarket(rs.getString("MARKET"));

		return cwpWorkListArchive;
	}
}
