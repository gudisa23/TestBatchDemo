package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Dpo;

public class DpoRowMapper implements RowMapper<Dpo>{

	@Override
	public Dpo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dpo dpo=new Dpo();
		dpo.setCworderid(rs.getString("CWORDERID"));
		dpo.setOrder_number(rs.getString("ORDER_NUMBER"));
		dpo.setOrder_version(rs.getString("ORDER_VERSION"));
		dpo.setTn_type(rs.getString("TN_TYPE"));
		dpo.setAccount_no(rs.getString("ACCOUNT_NO"));
		dpo.setOrder_type(rs.getString("ORDER_TYPE"));
		dpo.setOrder_ver_reason(rs.getString("ORDER_VER_REASON"));
		dpo.setRelated_order(rs.getString("RELATED_ORDER"));
		dpo.setCompletionnotice(rs.getString("COMPLETIONNOTICE"));
		dpo.setTwc_division(rs.getString("TWC_DIVISION"));
		dpo.setTwc_csr_name(rs.getString("TWC_CSR_NAME"));
		dpo.setDue_date(rs.getDate("DUE_DATE"));
		dpo.setScheduled_time(rs.getString("SCHEDULED_TIME"));
		dpo.setDisc_date(rs.getDate("DISC_DATE"));
		dpo.setDisc_sched_time(rs.getString("DISC_SCHED_TIME"));
		dpo.setSeasonal_end_date(rs.getString("SEASONAL_END_DATE"));
		dpo.setDisconnect_type(rs.getString("DISCONNECT_TYPE"));
		dpo.setOrig_order_date(rs.getDate("ORIG_ORDER_DATE"));
        dpo.setService_provider_id(rs.getString("SERVICE_PROVIDER_ID"));
		dpo.setOrig_order_due_date(rs.getDate("ORIG_ORDER_DUE_DATE"));
		dpo.setOrder_resched_reason(rs.getString("ORDER_RESCHED_REASON"));
		dpo.setOrder_expedite(rs.getString("ORDER_EXPEDITE"));
		dpo.setExpedite_reason(rs.getString("EXPEDITE_REASON"));
		dpo.setOrder_type_service(rs.getString("ORDER_TYPE_SERVICE"));
		dpo.setRelatedordertype(rs.getString("RELATEDORDERTYPE"));
		dpo.setAccount_type(rs.getString("ACCOUNT_TYPE"));
		dpo.setProject(rs.getString("PROJECT"));
		dpo.setAtn(rs.getString("ATN"));
		dpo.setOut_account_tn(rs.getString("OUT_ACCOUNT_TN"));
		dpo.setBill_name(rs.getString("BILL_NAME"));
        dpo.setBill_secondary_name(rs.getString("BILL_SECONDARY_NAME"));
		dpo.setSaddr_street_no_prefix(rs.getString("SADDR_STREET_NO_PREFIX"));
		dpo.setSaddr_street_no(rs.getString("SADDR_STREET_NO"));
		dpo.setSaddr_street_dir_suffix(rs.getString("SADDR_STREET_NO_SUFFIX"));
		dpo.setSaddr_street_dir_prefix(rs.getString("SADDR_STREET_DIR_PREFIX"));
		dpo.setSaddr_street_name(rs.getString("SADDR_STREET_NAME"));
		dpo.setSaddr_thoroughfare(rs.getString("SADDR_THOROUGHFARE"));
		dpo.setSaddr_street_dir_suffix(rs.getString("SADDR_STREET_DIR_SUFFIX"));
		dpo.setSaddr_location1(rs.getString("SADDR_LOCATION1"));
		dpo.setSaddr_location1_info(rs.getString("SADDR_LOCATION1_INFO"));
		dpo.setSaddr_location2(rs.getString("SADDR_LOCATION2"));
		dpo.setSaddr_location2_info(rs.getString("SADDR_LOCATION2_INFO"));
		dpo.setSaddr_location3(rs.getString("SADDR_LOCATION3"));
        dpo.setSaddr_location3_info(rs.getString("SADDR_LOCATION3_INFO"));
		dpo.setBaddr_city(rs.getString("SADDR_CITY"));
		dpo.setSaddr_state(rs.getString("SADDR_STATE"));
		dpo.setSaddr_zip(rs.getString("SADDR_ZIP"));
		dpo.setMsag_street_direction(rs.getString("MSAG_STREET_DIRECTION"));
		dpo.setMsag_street_address(rs.getString("MSAG_STREET_ADDRESS"));
		dpo.setMsag_direction_suffix(rs.getString("MSAG_DIRECTION_SUFFIX"));
		dpo.setMsag_street_thoroughfare(rs.getString("MSAG_STREET_THOROUGHFARE"));
		dpo.setMsag_county(rs.getString("MSAG_COUNTY"));
		dpo.setMsag_community(rs.getString("MSAG_COMMUNITY"));
		dpo.setEsn(rs.getString("ESN"));
		dpo.setPsap(rs.getString("PSAP"));
		dpo.setSaddr_rate_center(rs.getString("SADDR_RATE_CENTER"));
        dpo.setSaddr_xref_tn(rs.getString("SADDR_XREF_TN"));
		dpo.setBaddr_lidb_id(rs.getString("BADDR_LIDB_ID"));
		dpo.setBaddr_street(rs.getString("BADDR_STREET"));
        dpo.setBaddr_floor(rs.getString("BADDR_FLOOR"));
		dpo.setBaddr_room(rs.getString("BADDR_ROOM"));
		dpo.setBaddr_city(rs.getString("BADDR_CITY"));
		dpo.setBaddr_state(rs.getString("BADDR_STATE"));
		dpo.setBaddr_zip(rs.getString("BADDR_ZIP"));
		dpo.setBill_contact(rs.getString("BILL_CONTACT"));
		dpo.setBill_contact_tn(rs.getString("BILL_CONTACT_TN"));
		dpo.setRemarks(rs.getString("REMARKS"));
		dpo.setOffice_only_flag(rs.getString("OFFICE_ONLY_FLAG"));
		dpo.setFuture_bill_date(rs.getDate("FUTURE_BILL_DATE"));
		dpo.setCheck_in_status(rs.getString("CHECK_IN_STATUS"));
		dpo.setAddtl_tx_info(rs.getString("ADDTL_TX_INFO"));
		dpo.setCompletion_remarks(rs.getString("COMPLETION_REMARKS"));
        dpo.setSubordertype(rs.getString("SUBORDERTYPE"));
		dpo.setCwdocid(rs.getString("CWDOCID"));
		dpo.setCwdocstamp(rs.getString("CWDOCSTAMP"));
        dpo.setLastupdateddate(rs.getDate("LASTUPDATEDDATE"));
		dpo.setCwparentid(rs.getString("CWPARENTID"));
		dpo.setUpdatedby(rs.getString("UPDATEDBY"));
		dpo.setQccreflowcount(rs.getString("QCCREFLOWCOUNT"));
		dpo.setOrder_creation_date(rs.getDate("ORDER_CREATION_DATE"));
        dpo.setBypasscsr(rs.getInt("BYPASSCSR"));
		dpo.setN11querymade(rs.getInt("N11QUERYMADE"));
		dpo.setIsdiffratecentre(rs.getInt("ISDIFFRATECENTRE"));
        dpo.setRecordsonlyaction(rs.getString("RECORDSONLYACTION"));
		dpo.setN11actcallmade(rs.getInt("N11ACTCALLMADE"));
		dpo.setMarket(rs.getString("MARKET"));
		
	
		return dpo;
	}

}
