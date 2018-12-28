package com.model;

import java.util.Date;

public class Dpo {
	
	private String    cworderid;
	private String    order_number;
	private String    order_version;
	private String    tn_type;
	private String    account_no;
	private String    order_type;
	private String    order_ver_reason;
	private String    related_order;
	private String    completionnotice;
	private String    twc_division;
	private String    twc_csr_name;
	private Date      due_date;
	private String    scheduled_time;
	private Date      disc_date;
	private String    disc_sched_time;
	private String    seasonal_end_date;
	private String    disconnect_type;
	private Date      orig_order_date;
	private String    service_provider_id;
	private Date      orig_order_due_date;
	private String    order_resched_reason;
	private String    order_expedite;
	private String    expedite_reason;
	private String    order_type_service;
	private String    relatedordertype;
	private String    account_type;
	private String    project;
	private String    atn;
	private String    out_account_tn;
	private String    bill_name;
	private String    bill_secondary_name;
	private String    saddr_street_no_prefix;
	private String    saddr_street_no;
	private String    saddr_street_no_suffix;
	private String    saddr_street_dir_prefix;
	private String    saddr_street_name;
	private String    saddr_thoroughfare;
	private String    saddr_street_dir_suffix;
	private String    saddr_location1;
	private String    saddr_location1_info;
	private String    saddr_location2;
	private String    saddr_location2_info;
	private String    saddr_location3;
	private String    saddr_location3_info;
	private String    saddr_city;
	private String    saddr_state;
	private String    saddr_zip;
	private String    msag_street_direction;
	private String    msag_street_address;
	private String    msag_direction_suffix;
	private String    msag_street_thoroughfare;
	private String    msag_county;
	private String    msag_community;
	private String    esn;
	private String    psap;
	private String    saddr_rate_center;
	private String    saddr_xref_tn;
	private String    baddr_lidb_id;
	private String    baddr_street;
	private String    baddr_floor;
	private String    baddr_room;
	private String    baddr_city;
	private String    baddr_state;
	private String    baddr_zip;
	private String    bill_contact;
	private String    bill_contact_tn;
	private String    remarks;
	private String    office_only_flag;
	private Date      future_bill_date;
	private String    check_in_status;
	private String    addtl_tx_info;
	private String    completion_remarks;
	private String    subordertype;
	private String    cwdocid;
	private String    cwdocstamp;
	private Date      lastupdateddate;
	private String    cwparentid;
	private String    updatedby;
	private String    qccreflowcount;
	private Date      order_creation_date;
	private Integer    bypasscsr;
	private Integer    n11querymade;
	private Integer    isdiffratecentre;
	private String    recordsonlyaction;
	private Integer    n11actcallmade;
	private String    market;
	public String getCworderid() {
		return cworderid;
	}
	public void setCworderid(String cworderid) {
		this.cworderid = cworderid;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getOrder_version() {
		return order_version;
	}
	public void setOrder_version(String order_version) {
		this.order_version = order_version;
	}
	public String getTn_type() {
		return tn_type;
	}
	public void setTn_type(String tn_type) {
		this.tn_type = tn_type;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public String getOrder_ver_reason() {
		return order_ver_reason;
	}
	public void setOrder_ver_reason(String order_ver_reason) {
		this.order_ver_reason = order_ver_reason;
	}
	public String getRelated_order() {
		return related_order;
	}
	public void setRelated_order(String related_order) {
		this.related_order = related_order;
	}
	public String getCompletionnotice() {
		return completionnotice;
	}
	public void setCompletionnotice(String completionnotice) {
		this.completionnotice = completionnotice;
	}
	public String getTwc_division() {
		return twc_division;
	}
	public void setTwc_division(String twc_division) {
		this.twc_division = twc_division;
	}
	public String getTwc_csr_name() {
		return twc_csr_name;
	}
	public void setTwc_csr_name(String twc_csr_name) {
		this.twc_csr_name = twc_csr_name;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public String getScheduled_time() {
		return scheduled_time;
	}
	public void setScheduled_time(String scheduled_time) {
		this.scheduled_time = scheduled_time;
	}
	public Date getDisc_date() {
		return disc_date;
	}
	public void setDisc_date(Date disc_date) {
		this.disc_date = disc_date;
	}
	public String getDisc_sched_time() {
		return disc_sched_time;
	}
	public void setDisc_sched_time(String disc_sched_time) {
		this.disc_sched_time = disc_sched_time;
	}
	public String getSeasonal_end_date() {
		return seasonal_end_date;
	}
	public void setSeasonal_end_date(String seasonal_end_date) {
		this.seasonal_end_date = seasonal_end_date;
	}
	public String getDisconnect_type() {
		return disconnect_type;
	}
	public void setDisconnect_type(String disconnect_type) {
		this.disconnect_type = disconnect_type;
	}
	public Date getOrig_order_date() {
		return orig_order_date;
	}
	public void setOrig_order_date(Date orig_order_date) {
		this.orig_order_date = orig_order_date;
	}
	public String getService_provider_id() {
		return service_provider_id;
	}
	public void setService_provider_id(String service_provider_id) {
		this.service_provider_id = service_provider_id;
	}
	public Date getOrig_order_due_date() {
		return orig_order_due_date;
	}
	public void setOrig_order_due_date(Date orig_order_due_date) {
		this.orig_order_due_date = orig_order_due_date;
	}
	public String getOrder_resched_reason() {
		return order_resched_reason;
	}
	public void setOrder_resched_reason(String order_resched_reason) {
		this.order_resched_reason = order_resched_reason;
	}
	public String getOrder_expedite() {
		return order_expedite;
	}
	public void setOrder_expedite(String order_expedite) {
		this.order_expedite = order_expedite;
	}
	public String getExpedite_reason() {
		return expedite_reason;
	}
	public void setExpedite_reason(String expedite_reason) {
		this.expedite_reason = expedite_reason;
	}
	public String getOrder_type_service() {
		return order_type_service;
	}
	public void setOrder_type_service(String order_type_service) {
		this.order_type_service = order_type_service;
	}
	public String getRelatedordertype() {
		return relatedordertype;
	}
	public void setRelatedordertype(String relatedordertype) {
		this.relatedordertype = relatedordertype;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getAtn() {
		return atn;
	}
	public void setAtn(String atn) {
		this.atn = atn;
	}
	public String getOut_account_tn() {
		return out_account_tn;
	}
	public void setOut_account_tn(String out_account_tn) {
		this.out_account_tn = out_account_tn;
	}
	public String getBill_name() {
		return bill_name;
	}
	public void setBill_name(String bill_name) {
		this.bill_name = bill_name;
	}
	public String getBill_secondary_name() {
		return bill_secondary_name;
	}
	public void setBill_secondary_name(String bill_secondary_name) {
		this.bill_secondary_name = bill_secondary_name;
	}
	public String getSaddr_street_no_prefix() {
		return saddr_street_no_prefix;
	}
	public void setSaddr_street_no_prefix(String saddr_street_no_prefix) {
		this.saddr_street_no_prefix = saddr_street_no_prefix;
	}
	public String getSaddr_street_no() {
		return saddr_street_no;
	}
	public void setSaddr_street_no(String saddr_street_no) {
		this.saddr_street_no = saddr_street_no;
	}
	public String getSaddr_street_no_suffix() {
		return saddr_street_no_suffix;
	}
	public void setSaddr_street_no_suffix(String saddr_street_no_suffix) {
		this.saddr_street_no_suffix = saddr_street_no_suffix;
	}
	public String getSaddr_street_dir_prefix() {
		return saddr_street_dir_prefix;
	}
	public void setSaddr_street_dir_prefix(String saddr_street_dir_prefix) {
		this.saddr_street_dir_prefix = saddr_street_dir_prefix;
	}
	public String getSaddr_street_name() {
		return saddr_street_name;
	}
	public void setSaddr_street_name(String saddr_street_name) {
		this.saddr_street_name = saddr_street_name;
	}
	public String getSaddr_thoroughfare() {
		return saddr_thoroughfare;
	}
	public void setSaddr_thoroughfare(String saddr_thoroughfare) {
		this.saddr_thoroughfare = saddr_thoroughfare;
	}
	public String getSaddr_street_dir_suffix() {
		return saddr_street_dir_suffix;
	}
	public void setSaddr_street_dir_suffix(String saddr_street_dir_suffix) {
		this.saddr_street_dir_suffix = saddr_street_dir_suffix;
	}
	public String getSaddr_location1() {
		return saddr_location1;
	}
	public void setSaddr_location1(String saddr_location1) {
		this.saddr_location1 = saddr_location1;
	}
	public String getSaddr_location1_info() {
		return saddr_location1_info;
	}
	public void setSaddr_location1_info(String saddr_location1_info) {
		this.saddr_location1_info = saddr_location1_info;
	}
	public String getSaddr_location2() {
		return saddr_location2;
	}
	public void setSaddr_location2(String saddr_location2) {
		this.saddr_location2 = saddr_location2;
	}
	public String getSaddr_location2_info() {
		return saddr_location2_info;
	}
	public void setSaddr_location2_info(String saddr_location2_info) {
		this.saddr_location2_info = saddr_location2_info;
	}
	public String getSaddr_location3() {
		return saddr_location3;
	}
	public void setSaddr_location3(String saddr_location3) {
		this.saddr_location3 = saddr_location3;
	}
	public String getSaddr_location3_info() {
		return saddr_location3_info;
	}
	public void setSaddr_location3_info(String saddr_location3_info) {
		this.saddr_location3_info = saddr_location3_info;
	}
	public String getSaddr_city() {
		return saddr_city;
	}
	public void setSaddr_city(String saddr_city) {
		this.saddr_city = saddr_city;
	}
	public String getSaddr_state() {
		return saddr_state;
	}
	public void setSaddr_state(String saddr_state) {
		this.saddr_state = saddr_state;
	}
	public String getSaddr_zip() {
		return saddr_zip;
	}
	public void setSaddr_zip(String saddr_zip) {
		this.saddr_zip = saddr_zip;
	}
	public String getMsag_street_direction() {
		return msag_street_direction;
	}
	public void setMsag_street_direction(String msag_street_direction) {
		this.msag_street_direction = msag_street_direction;
	}
	public String getMsag_street_address() {
		return msag_street_address;
	}
	public void setMsag_street_address(String msag_street_address) {
		this.msag_street_address = msag_street_address;
	}
	public String getMsag_direction_suffix() {
		return msag_direction_suffix;
	}
	public void setMsag_direction_suffix(String msag_direction_suffix) {
		this.msag_direction_suffix = msag_direction_suffix;
	}
	public String getMsag_street_thoroughfare() {
		return msag_street_thoroughfare;
	}
	public void setMsag_street_thoroughfare(String msag_street_thoroughfare) {
		this.msag_street_thoroughfare = msag_street_thoroughfare;
	}
	public String getMsag_county() {
		return msag_county;
	}
	public void setMsag_county(String msag_county) {
		this.msag_county = msag_county;
	}
	public String getMsag_community() {
		return msag_community;
	}
	public void setMsag_community(String msag_community) {
		this.msag_community = msag_community;
	}
	public String getEsn() {
		return esn;
	}
	public void setEsn(String esn) {
		this.esn = esn;
	}
	public String getPsap() {
		return psap;
	}
	public void setPsap(String psap) {
		this.psap = psap;
	}
	public String getSaddr_rate_center() {
		return saddr_rate_center;
	}
	public void setSaddr_rate_center(String saddr_rate_center) {
		this.saddr_rate_center = saddr_rate_center;
	}
	public String getSaddr_xref_tn() {
		return saddr_xref_tn;
	}
	public void setSaddr_xref_tn(String saddr_xref_tn) {
		this.saddr_xref_tn = saddr_xref_tn;
	}
	public String getBaddr_lidb_id() {
		return baddr_lidb_id;
	}
	public void setBaddr_lidb_id(String baddr_lidb_id) {
		this.baddr_lidb_id = baddr_lidb_id;
	}
	public String getBaddr_street() {
		return baddr_street;
	}
	public void setBaddr_street(String baddr_street) {
		this.baddr_street = baddr_street;
	}
	public String getBaddr_floor() {
		return baddr_floor;
	}
	public void setBaddr_floor(String baddr_floor) {
		this.baddr_floor = baddr_floor;
	}
	public String getBaddr_room() {
		return baddr_room;
	}
	public void setBaddr_room(String baddr_room) {
		this.baddr_room = baddr_room;
	}
	public String getBaddr_city() {
		return baddr_city;
	}
	public void setBaddr_city(String baddr_city) {
		this.baddr_city = baddr_city;
	}
	public String getBaddr_state() {
		return baddr_state;
	}
	public void setBaddr_state(String baddr_state) {
		this.baddr_state = baddr_state;
	}
	public String getBaddr_zip() {
		return baddr_zip;
	}
	public void setBaddr_zip(String baddr_zip) {
		this.baddr_zip = baddr_zip;
	}
	public String getBill_contact() {
		return bill_contact;
	}
	public void setBill_contact(String bill_contact) {
		this.bill_contact = bill_contact;
	}
	public String getBill_contact_tn() {
		return bill_contact_tn;
	}
	public void setBill_contact_tn(String bill_contact_tn) {
		this.bill_contact_tn = bill_contact_tn;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getOffice_only_flag() {
		return office_only_flag;
	}
	public void setOffice_only_flag(String office_only_flag) {
		this.office_only_flag = office_only_flag;
	}
	public Date getFuture_bill_date() {
		return future_bill_date;
	}
	public void setFuture_bill_date(Date future_bill_date) {
		this.future_bill_date = future_bill_date;
	}
	public String getCheck_in_status() {
		return check_in_status;
	}
	public void setCheck_in_status(String check_in_status) {
		this.check_in_status = check_in_status;
	}
	public String getAddtl_tx_info() {
		return addtl_tx_info;
	}
	public void setAddtl_tx_info(String addtl_tx_info) {
		this.addtl_tx_info = addtl_tx_info;
	}
	public String getCompletion_remarks() {
		return completion_remarks;
	}
	public void setCompletion_remarks(String completion_remarks) {
		this.completion_remarks = completion_remarks;
	}
	public String getSubordertype() {
		return subordertype;
	}
	public void setSubordertype(String subordertype) {
		this.subordertype = subordertype;
	}
	public String getCwdocid() {
		return cwdocid;
	}
	public void setCwdocid(String cwdocid) {
		this.cwdocid = cwdocid;
	}
	public String getCwdocstamp() {
		return cwdocstamp;
	}
	public void setCwdocstamp(String cwdocstamp) {
		this.cwdocstamp = cwdocstamp;
	}
	public Date getLastupdateddate() {
		return lastupdateddate;
	}
	public void setLastupdateddate(Date lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}
	public String getCwparentid() {
		return cwparentid;
	}
	public void setCwparentid(String cwparentid) {
		this.cwparentid = cwparentid;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public String getQccreflowcount() {
		return qccreflowcount;
	}
	public void setQccreflowcount(String qccreflowcount) {
		this.qccreflowcount = qccreflowcount;
	}
	public Date getOrder_creation_date() {
		return order_creation_date;
	}
	public void setOrder_creation_date(Date order_creation_date) {
		this.order_creation_date = order_creation_date;
	}
	public Integer getBypasscsr() {
		return bypasscsr;
	}
	public void setBypasscsr(Integer bypasscsr) {
		this.bypasscsr = bypasscsr;
	}
	public Integer getN11querymade() {
		return n11querymade;
	}
	public void setN11querymade(Integer n11querymade) {
		this.n11querymade = n11querymade;
	}
	public Integer getIsdiffratecentre() {
		return isdiffratecentre;
	}
	public void setIsdiffratecentre(Integer isdiffratecentre) {
		this.isdiffratecentre = isdiffratecentre;
	}
	public String getRecordsonlyaction() {
		return recordsonlyaction;
	}
	public void setRecordsonlyaction(String recordsonlyaction) {
		this.recordsonlyaction = recordsonlyaction;
	}
	public Integer getN11actcallmade() {
		return n11actcallmade;
	}
	public void setN11actcallmade(Integer n11actcallmade) {
		this.n11actcallmade = n11actcallmade;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}

}
