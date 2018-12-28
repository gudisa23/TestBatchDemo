package com.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.support.transaction.ResourcelessTransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.PlatformTransactionManager;

import com.mapper.CWOrderInstanceRowMapper;
import com.mapper.CWPWorkListArchiveRowMapper;
import com.mapper.CWPWorkListRowMapper;
import com.mapper.DpoRowMapper;
import com.mapper.LSRRowMapper;
import com.mapper.OrderHistoryRowMapper;
import com.mapper.PRVRowMapper;
import com.mapper.ValiderrorsRowMapper;
import com.model.CWOrderInstance;
import com.model.CWPWorkList;
import com.model.CWPWorkListArchive;
import com.model.Dpo;
import com.model.LSR;
import com.model.OrderHistory;
import com.model.PRV;
import com.model.Validerrors;
import com.processor.CWPWorkListArchiveItemProcessor;
import com.processor.CWPWorkListItemProcessor;
import com.processor.DpoItemProcessor;
import com.processor.LSRItenProcessor;
import com.processor.OrderHistoryItemProcessor;
import com.processor.PRVItemProcessor;
import com.processor.PersonItenProcessor;
import com.processor.ValiderrorsItemProcessor;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	private Environment env;

	// Query for PRV table
	// TODO
	private static final String insetPRVRecord = "Insert into PRV (CWDOCID,CWDOCSTAMP,LASTUPDATEDDATE,CWORDERID,CWPARENTID,UPDATEDBY,REQUEST_TYPE,REQUEST_DATE,RESPONSE_DATE,ACTION,ERROR_CODE,SUBORDERTYPE,SITEID,SOURCEID,NEWCUSTID,DESCRIPTION,SERVICEID,TRANSACTIONID,ACCOUNTNUMBER,WGUSECASE,WGORDERTYPE,WGACCOUNTNUMBER,ACCOUNTTYPE,IDENTIFIER,ORDER_CREATION_DATE,TIMEZONE,TWCDIVISIONID,WGORDERNUMBER,WGEMAIL,WGDUEDATE,WGMAC,WGMDN,WGCSA,WGESN,WGINSURANCEPROVIDER,WGSUBSCRIBERREFERENCE,WGOLDACCOUNTNUMBER,WGSERVICEPROVIDERID,WGRATEPLAN) values (:CWDOCID,:CWDOCSTAMP,:LASTUPDATEDDATE,:CWORDERID,:CWPARENTID,:UPDATEDBY,:REQUEST_TYPE,:REQUEST_DATE,:RESPONSE_DATE,:ACTION,:ERROR_CODE,:SUBORDERTYPE,:SITEID,:SOURCEID,:NEWCUSTID,:DESCRIPTION,:SERVICEID,:TRANSACTIONID,:ACCOUNTNUMBER,:WGUSECASE,:WGORDERTYPE,:WGACCOUNTNUMBER,:ACCOUNTTYPE,:IDENTIFIER,:ORDER_CREATION_DATE,:TIMEZONE,:TWCDIVISIONID,:WGORDERNUMBER,:WGEMAIL,:WGDUEDATE,:WGMAC,:WGMDN,:WGCSA,:WGESN,:WGINSURANCEPROVIDER,:WGSUBSCRIBERREFERENCE,:WGOLDACCOUNTNUMBER,:WGSERVICEPROVIDERID,:WGRATEPLAN)";
	private static final String getPRVList = "select P.CWDOCID,P.CWDOCSTAMP,P.LASTUPDATEDDATE,P.CWORDERID,P.CWPARENTID,P.UPDATEDBY,P.REQUEST_TYPE,P.REQUEST_DATE,P.RESPONSE_DATE,P.ACTION,P.ERROR_CODE,P.SUBORDERTYPE,P.SITEID,P.SOURCEID,P.NEWCUSTID,P.DESCRIPTION,P.SERVICEID,P.TRANSACTIONID,P.ACCOUNTNUMBER,P.WGUSECASE,P.WGORDERTYPE,P.WGACCOUNTNUMBER,P.ACCOUNTTYPE,P.IDENTIFIER,P.ORDER_CREATION_DATE,P.TIMEZONE,P.TWCDIVISIONID,P.WGORDERNUMBER,P.WGEMAIL,P.WGDUEDATE,P.WGMAC,P.WGMDN,P.WGCSA,P.WGESN,P.WGINSURANCEPROVIDER,P.WGSUBSCRIBERREFERENCE,P.WGOLDACCOUNTNUMBER,P.WGSERVICEPROVIDERID,P.WGRATEPLAN from PRV P,CWORDERINSTANCE C WHERE P.CWPARENTID=C.CWDOCID AND C.DUEDATE='30-NOV-2018' AND rowNum<5";

	// Query for CWORDERINSTANCE table
	private static final String insertCWORDERINSTANCERecord = "Insert into CWORDERINSTANCE (CWDOCID,METADATATYPE,STATUS,STATE,VISUALKEY,PRODUCTCODE,CREATIONDATE,CREATEDBY,UPDATEDBY,LASTUPDATEDDATE,PARENTORDER,OWNER,STATE2,HASATTACHMENT,METADATATYPE_VER,ORIGINAL_ORDER_ID,SOURCE_ORDER_ID,KIND_OF_ORDER,ORDER_PHASE,PROJECT_ID,PROCESS_ID,CWORDERSTAMP,CWDOCSTAMP,DUEDATE,MANPROVISIONIND,DELAYEDLSR,RECORDSONLYACTION,DREFDEACTPRV,CSRFALLOUT,CLECFLAG,LSRSUBMITTED,NONPAYONLY,LSRSUBMITTEDDATE,RPDONLY,ACCOUNT_TYPE,RELATEDORDERNO,OMSE_VER_UPDATED,OMSE_VER_CREATED,ORDER_UPDATED_ON,ORDER_UPDATED_BY,LSRTYPE,LSRORDERTYPE,STATE_CHANGE_TIME,CWDOCTYPE,CWPARENTID,CWORDERID,MANUALLYMODIFIED,MANUALLY_CREATED,JOB_ID,CLEC_AUTOMATED,ERROR_CODE,CLEC_INTERFACE,FALLOUT_FLAG,ORDER_STATE,PROCID,ACCOUNT_NO,LAST_NAME,FIRST_NAME,SADDR_ZIP,SADDR_STATE,SADDR_CITY,COMPLETION_DATE,ORIG_ORDER_DATE,DIVISION,ORDER_ACTIVITY,ORDER_LINE_TYPE,ACTIVE,ORDER_VER,BILLING_ORDER_NO,PARENT_ORDER_NO,ORDER_NO,ROOTORDERID,ISSTACKEDEQUIP,NORESCHEDULE,ISBCPPRIORDER,MARKET,SPPIND,AUTOMATEDLSRSUPPLEMENT) values(:cwdocid,:metadatatype,:status,:state,:visualkey,:productcode,:creationdate,:createdby,:updatedby,:lastupdateddate,:parentorder,:owner,:state2,:hasattachment,:metadatatypeVer,:originalOrderId,:sourceOrderId,:kindOfOrder,:orderPhase,:projectId,:processId,:cworderstamp,:cwdocstamp,:duedate,:manprovisionind,:delayedlsr,:recordsonlyaction,:drefdeactprv,:csrfallout,:clecflag,:lsrsubmitted,:nonpayonly,:lsrsubmitteddate,:rpdonly,:accountType,:relatedorderno,:omseVerUpdated,:omseVerCreated,:orderUpdatedOn,:orderUpdatedBy,:lsrtype,:lsrordertype,:stateChangeTime,:cwdoctype,:cwparentid,:cworderid,:manuallymodified,:manuallyCreated,:jobId,:clecAutomated,:errorCode,:clecInterface,:falloutFlag,:orderState,:procid,:accountNo,:lastName,:firstName,:saddrZip,:saddrState,:saddrCity,:completionDate,:origOrderDate,:division,:orderActivity,:orderLineType,:active,:orderVer,:billingOrderNo,:parentOrderNo,:orderNo,:rootorderid,:isstackedequip,:noreschedule,:isbcppriorder,:market,:sppind,:automatedlsrsupplement)";
	private static final String getCWORDERINSTANCEList = "select CWDOCID,METADATATYPE,STATUS,STATE,VISUALKEY,PRODUCTCODE,CREATIONDATE,CREATEDBY,UPDATEDBY,LASTUPDATEDDATE,PARENTORDER,OWNER,STATE2,HASATTACHMENT,METADATATYPE_VER,ORIGINAL_ORDER_ID,SOURCE_ORDER_ID,KIND_OF_ORDER,ORDER_PHASE,PROJECT_ID,PROCESS_ID,CWORDERSTAMP,CWDOCSTAMP,DUEDATE,MANPROVISIONIND,DELAYEDLSR,RECORDSONLYACTION,DREFDEACTPRV,CSRFALLOUT,CLECFLAG,LSRSUBMITTED,NONPAYONLY,LSRSUBMITTEDDATE,RPDONLY,ACCOUNT_TYPE,RELATEDORDERNO,OMSE_VER_UPDATED,OMSE_VER_CREATED,ORDER_UPDATED_ON,ORDER_UPDATED_BY,LSRTYPE,LSRORDERTYPE,STATE_CHANGE_TIME,CWDOCTYPE,CWPARENTID,CWORDERID,MANUALLYMODIFIED,MANUALLY_CREATED,JOB_ID,CLEC_AUTOMATED,ERROR_CODE,CLEC_INTERFACE,FALLOUT_FLAG,ORDER_STATE,PROCID,ACCOUNT_NO,LAST_NAME,FIRST_NAME,SADDR_ZIP,SADDR_STATE,SADDR_CITY,COMPLETION_DATE,ORIG_ORDER_DATE,DIVISION,ORDER_ACTIVITY,ORDER_LINE_TYPE,ACTIVE,ORDER_VER,BILLING_ORDER_NO,PARENT_ORDER_NO,ORDER_NO,ROOTORDERID,ISSTACKEDEQUIP,NORESCHEDULE,ISBCPPRIORDER,MARKET,SPPIND,AUTOMATEDLSRSUPPLEMENT from CWORDERINSTANCE where rowNum<5";

	// Query for LSR table
	private static final String getLSRList = "SELECT L.CCNA,L.PON,L.VER,L.ATN,L.TN,L.DTSENT,L.DDD,L.DFDT,L.DDDTIMEZONE,L.TOS,L.RPON,L.AUTHNM,L.AGAUTH,L.DATED,L.PROJECT,L.REQTYP,L.REQTYP_GUI,L.ACT,L.ACT_GUI,L.MI,L.SUP,L.EXP,L.ONSP,L.OLSP,L.TOA,L.BAN1,L.BILLNM,L.SBILLNM,L.STREET,L.FLOOR,L.ROOMMAILSTOP,L.CITY,L.STATE,L.ZIP,L.BILLCON,L.BILLTELNO,L.INIT,L.TELNO,L.EMAIL,L.IMPCON,L.IMPCONTEL,L.IMPCONEMAIL,L.LSRREMARKS,L.CWDOCID,L.CWDOCSTAMP,L.LASTUPDATEDDATE,L.CWORDERID,L.CWPARENTID,L.UPDATEDBY,L.FOC_DAYS,L.REJECT_DAYS,L.COMPLETION_DAYS,L.CLEC_AUTOMATED,L.IC_SENT_DATE,L.IC_REMARKS,L.ERROR_CODE,L.ERROR_DETAIL,L.LAST_LR_ID,L.CLEC_ID,L.ONSP_GUI,L.BAN1_GUI,L.EUDOCID,L.DISCONNECTTYPE,L.ORDER_CREATION_DATE,L.TNTYPE,L.SERVICEADDRESSRATECENTER from CWORDERINSTANCE C,LSR L WHERE  L.CWPARENTID=C.CWDOCID  AND  C.DUEDATE ='30-NOV-2018' AND rowNum<5";
	private static final String insertLSRRecord = "Insert into LSR (CCNA,PON,VER,ATN,TN,DTSENT,DDD,DFDT,DDDTIMEZONE,TOS,RPON,AUTHNM,AGAUTH,DATED,PROJECT,REQTYP,REQTYP_GUI,ACT,ACT_GUI,MI,SUP,EXP,ONSP,OLSP,TOA,BAN1,BILLNM,SBILLNM,STREET,FLOOR,ROOMMAILSTOP,CITY,STATE,ZIP,BILLCON,BILLTELNO,INIT,TELNO,EMAIL,IMPCON,IMPCONTEL,IMPCONEMAIL,LSRREMARKS,CWDOCID,CWDOCSTAMP,LASTUPDATEDDATE,CWORDERID,CWPARENTID,UPDATEDBY,FOC_DAYS,REJECT_DAYS,COMPLETION_DAYS,CLEC_AUTOMATED,IC_SENT_DATE,IC_REMARKS,ERROR_CODE,ERROR_DETAIL,LAST_LR_ID,CLEC_ID,ONSP_GUI,BAN1_GUI,EUDOCID,DISCONNECTTYPE,ORDER_CREATION_DATE,TNTYPE,SERVICEADDRESSRATECENTER) values(:ccna,:pon,:ver,:atn,:tn,:dtsent,:ddd,:dfdt,:dddtimezone,:tos,:rpon,:authnm,:agauth,:dated,:project,:reqtyp,:reqtyp_gui,:act,:act_gui,:mi,:sup,:exp,:onsp,:olsp,:toa,:ban1,:billnm,:sbillnm,:street,:floor,:roommailstop,:city,:state,:zip,:billcon,:billtelno,:init,:telno,:email,:impcon,:impcontel,:impconemail,:lsrremarks,:cwdocid,:cwdocstamp,:lASTUPDATEDDATE,:cworderid,:cwparentid,:UPDATEDBY,:foc_days,:reject_days,:completion_days,:clec_automated,:IC_SENT_DATE,:ic_remarks,:error_code,:error_detail,:last_lr_id,:clec_id,:onsp_gui,:ban1_gui,:eudocid,:disconnecttype,:ORDER_CREATION_DATE,:tntype,:serviceaddressratecenter)";

	// Query for Dpo table

	private static final String insetDpoRecord = "Insert into DPO (CWORDERID,ORDER_NUMBER,ORDER_VERSION,TN_TYPE,ACCOUNT_NO,ORDER_TYPE,ORDER_VER_REASON,RELATED_ORDER,COMPLETIONNOTICE,TWC_DIVISION,TWC_CSR_NAME,DUE_DATE,SCHEDULED_TIME,DISC_DATE,DISC_SCHED_TIME,SEASONAL_END_DATE,DISCONNECT_TYPE,ORIG_ORDER_DATE,SERVICE_PROVIDER_ID,ORIG_ORDER_DUE_DATE,ORDER_RESCHED_REASON,ORDER_EXPEDITE,EXPEDITE_REASON,ORDER_TYPE_SERVICE,RELATEDORDERTYPE,ACCOUNT_TYPE,PROJECT,ATN,OUT_ACCOUNT_TN,BILL_NAME,BILL_SECONDARY_NAME,SADDR_STREET_NO_PREFIX,SADDR_STREET_NO,SADDR_STREET_NO_SUFFIX,SADDR_STREET_DIR_PREFIX,SADDR_STREET_NAME,SADDR_THOROUGHFARE,SADDR_STREET_DIR_SUFFIX,SADDR_LOCATION1,SADDR_LOCATION1_INFO,SADDR_LOCATION2,SADDR_LOCATION2_INFO,SADDR_LOCATION3,SADDR_LOCATION3_INFO,SADDR_CITY,SADDR_STATE,SADDR_ZIP,MSAG_STREET_DIRECTION,MSAG_STREET_ADDRESS,MSAG_DIRECTION_SUFFIX,MSAG_STREET_THOROUGHFARE,MSAG_COUNTY,MSAG_COMMUNITY,ESN,PSAP,SADDR_RATE_CENTER,SADDR_XREF_TN,BADDR_LIDB_ID,BADDR_STREET,BADDR_FLOOR,BADDR_ROOM,BADDR_CITY,BADDR_STATE,BADDR_ZIP,BILL_CONTACT,BILL_CONTACT_TN,REMARKS,OFFICE_ONLY_FLAG,FUTURE_BILL_DATE,CHECK_IN_STATUS,ADDTL_TX_INFO,COMPLETION_REMARKS,SUBORDERTYPE,CWDOCID,CWDOCSTAMP,LASTUPDATEDDATE,CWPARENTID,UPDATEDBY,QCCREFLOWCOUNT,ORDER_CREATION_DATE,BYPASSCSR,N11QUERYMADE,ISDIFFRATECENTRE,RECORDSONLYACTION,N11ACTCALLMADE,MARKET) values(:cworderid,:order_number,:order_version,:tn_type,:account_no,:order_type,:order_ver_reason,:related_order,:completionnotice,:twc_division,:twc_csr_name,:due_date,:scheduled_time,:disc_date,:disc_sched_time,:seasonal_end_date,:disconnect_type,:orig_order_date,:service_provider_id,:orig_order_due_date,:order_resched_reason,:order_expedite,:expedite_reason,:order_type_service,:relatedordertype,:account_type,:project,:atn,:out_account_tn,:bill_name,:bill_secondary_name,:saddr_street_no_prefix,:saddr_street_no,:saddr_street_no_suffix,:saddr_street_dir_prefix,:saddr_street_name,:saddr_thoroughfare,:saddr_street_dir_suffix,:saddr_location1,:saddr_location1_info,:saddr_location2,:saddr_location2_info,:saddr_location3,:saddr_location3_info,:saddr_city,:saddr_state,:saddr_zip,:msag_street_direction,:msag_street_address,:msag_direction_suffix,:msag_street_thoroughfare,:msag_county,:msag_community,:esn,:psap,:saddr_rate_center,:saddr_xref_tn,:baddr_lidb_id,:baddr_street,:baddr_floor,:baddr_room,:baddr_city,:baddr_state,:baddr_zip,:bill_contact,:bill_contact_tn,:remarks,:office_only_flag,:future_bill_date,:check_in_status,:addtl_tx_info,:completion_remarks,:subordertype,:cwdocid,:cwdocstamp,:lastupdateddate,:cwparentid,:updatedby,:qccreflowcount,:order_creation_date,:bypasscsr,:n11querymade,:isdiffratecentre,:recordsonlyaction,:n11actcallmade,:market)";
	private static final String getDoRecordList = "select CWORDERID,ORDER_NUMBER,ORDER_VERSION,TN_TYPE,ACCOUNT_NO,ORDER_TYPE,ORDER_VER_REASON,RELATED_ORDER,COMPLETIONNOTICE,TWC_DIVISION,TWC_CSR_NAME,DUE_DATE,SCHEDULED_TIME,DISC_DATE,DISC_SCHED_TIME,SEASONAL_END_DATE,DISCONNECT_TYPE,ORIG_ORDER_DATE,SERVICE_PROVIDER_ID,ORIG_ORDER_DUE_DATE,ORDER_RESCHED_REASON,ORDER_EXPEDITE,EXPEDITE_REASON,ORDER_TYPE_SERVICE,RELATEDORDERTYPE,ACCOUNT_TYPE,PROJECT,ATN,OUT_ACCOUNT_TN,BILL_NAME,BILL_SECONDARY_NAME,SADDR_STREET_NO_PREFIX,SADDR_STREET_NO,SADDR_STREET_NO_SUFFIX,SADDR_STREET_DIR_PREFIX,SADDR_STREET_NAME,SADDR_THOROUGHFARE,SADDR_STREET_DIR_SUFFIX,SADDR_LOCATION1,SADDR_LOCATION1_INFO,SADDR_LOCATION2,SADDR_LOCATION2_INFO,SADDR_LOCATION3,SADDR_LOCATION3_INFO,SADDR_CITY,SADDR_STATE,SADDR_ZIP,MSAG_STREET_DIRECTION,MSAG_STREET_ADDRESS,MSAG_DIRECTION_SUFFIX,MSAG_STREET_THOROUGHFARE,MSAG_COUNTY,MSAG_COMMUNITY,ESN,PSAP,SADDR_RATE_CENTER,SADDR_XREF_TN,BADDR_LIDB_ID,BADDR_STREET,BADDR_FLOOR,BADDR_ROOM,BADDR_CITY,BADDR_STATE,BADDR_ZIP,BILL_CONTACT,BILL_CONTACT_TN,REMARKS,OFFICE_ONLY_FLAG,FUTURE_BILL_DATE,CHECK_IN_STATUS,ADDTL_TX_INFO,COMPLETION_REMARKS,SUBORDERTYPE,CWDOCID,CWDOCSTAMP,LASTUPDATEDDATE,CWPARENTID,UPDATEDBY,QCCREFLOWCOUNT,ORDER_CREATION_DATE,BYPASSCSR,N11QUERYMADE,ISDIFFRATECENTRE,RECORDSONLYACTION,N11ACTCALLMADE,MARKET DPO WHERE DUE_DATE='30-NOV-2018' AND rowNum<5";

	// Query for CWPWorkListArchive table
	private static final String insetCWPWorkListArchiveRecord = "Insert into CWPWORKLISTARCHIVE (CWDOCID,PRIORITY,SENDER_ID,PARTICIPANT_TYPE,ORDER_ID,ORDER_VK,CREATION_DATE,DUE_DATE,USER_ID,START_WORK_DATE,ASSIGN_TO_USER_DATE,FLAGS,COMPLETE_DATE,OPERATION,DISABLE,METADATATYPE_VER,EFFORT,ASSOCIATION_ID,ORDER_ITEM_ID,ACTION,DISTRIBTYPE,COMPLETEDBY,DUEDATECOMPUTED,ACCOUNT_TYPE,TWCCSRNAME,ACCOUNT_NO,TN,ERROR_CODE,CREATE_COMPLETE_DAYS,ASSIGN_COMPLETE_DAYS,CREATE_ASSIGN_DAYS,FIRST_ASSIGN_DATE,SORT_DATE,ORDERTYPE,ORDER_VER,ORDER_NO,TASK_STATE,VIEW_PRIV,QUEUE_PRIV,DIVISION,MARKET)  values(:cwdocid,:priority,:senderId,:participantType,:orderId,:orderVk,:creationdate,:dueDate,:userId,:startWorkDate,:assignToUserDate,:flags,:completeDate,:operation,:disable,:metadatatypeVer,:effort,:associationId,:orderItemId,:action,:distribtype,:completedby,:duedatecomputed,:accountType,:twccsrname,:accountNo,:tn,:errorCode,:createCompleteDays,:assignCompleteDays,:createAssignDays,:firstAssignDate,:sortDate,:ordertype,:orderVer,:orderNo,:taskState,:viewPriv,:queuePriv,:division,:market)";
	private static final String getCWPWorkListArchiveList = "SELECT  CWDOCID,PRIORITY,SENDER_ID,PARTICIPANT_TYPE,ORDER_ID,ORDER_VK,CREATION_DATE,DUE_DATE,USER_ID,START_WORK_DATE,ASSIGN_TO_USER_DATE,FLAGS,COMPLETE_DATE,OPERATION,DISABLE,METADATATYPE_VER,EFFORT,ASSOCIATION_ID,ORDER_ITEM_ID,ACTION,DISTRIBTYPE,COMPLETEDBY,DUEDATECOMPUTED,ACCOUNT_TYPE,TWCCSRNAME,ACCOUNT_NO,TN,ERROR_CODE,CREATE_COMPLETE_DAYS,ASSIGN_COMPLETE_DAYS,CREATE_ASSIGN_DAYS,FIRST_ASSIGN_DATE,SORT_DATE,ORDERTYPE,ORDER_VER,ORDER_NO,TASK_STATE,VIEW_PRIV,QUEUE_PRIV,DIVISION,MARKET  from CWPWORKLISTARCHIVE where rowNum<5";
	/*
	 * @Autowired CWOrderInstanceRepositoy cWOrderInstanceRepositoy;
	 */

	// Query for CWPWorkList table
	private static final String insertCWPWorkListRecord = "Insert into CWPWORKLIST(CWDOCID,PRIORITY,SENDER_ID,PARTICIPANT_TYPE,ORDER_ID,ORDER_VK,CREATION_DATE,DUE_DATE,USER_ID,START_WORK_DATE,ASSIGN_TO_USER_DATE,FLAGS,SENDER_TYPE,OPERATION,DISABLE,METADATATYPE_VER,ACTIVITY_INDEX,EFFORT,ASSOCIATION_ID,ORDER_ITEM_ID,DISTRIBTYPE,CHANGED,REVISION_NO,FLAGREASON,FLAG,COMPLETEDBY,CUSTOMER_NAME,WORKLIST_HOLD,TRANSTYPE,ACCOUNT_TYPE,TWCCSRNAME,UPDATEDBY,CWPARENTID,CWORDERID,LASTUPDATEDDATE,CWDOCSTAMP,ACCOUNT_NO,QUEUE_PRIV,VIEW_PRIV,TASK_STATE,DIVISION,CREATE_ASSIGN_DAYS,FIRST_ASSIGN_DATE,SORT_DATE,TN,ERROR_CODE,ORDERTYPE,ORDER_VER,ORDER_NO,MARKET) values(:cwdocid,:priority,:senderId,:participantType,:orderId,:orderVk,:creationdate,:dueDate,:userId,:startWorkDate,:assignToUserDate,:flags,:senderType,:operation,:disable,:metadatatypeVer,:ActivityIndex,:effort,:associationId,:orderItemId,:distribtype,:changed,:revisionNo,:flagreason,:flag,:completedby,:customerName,:worklistHold,:transtype,:accountType,:twccsrname,:updatedby,:cwparentid,:cworderid,:lastupdateddate,:cwdocstamp,:accountNo,:queuePriv,:viewPriv,:taskState,:division,:createAssignDays,:firstAssignDate,:sortDate,:tn,:errorCode,:ordertype,:orderVer,:orderNo,:market)";
	private static final String getCWPWorkList = "select CWDOCID,PRIORITY,SENDER_ID,PARTICIPANT_TYPE,ORDER_ID,ORDER_VK,CREATION_DATE,DUE_DATE,USER_ID,START_WORK_DATE,ASSIGN_TO_USER_DATE,FLAGS,SENDER_TYPE,OPERATION,DISABLE,METADATATYPE_VER,ACTIVITY_INDEX,EFFORT,ASSOCIATION_ID,ORDER_ITEM_ID,DISTRIBTYPE,CHANGED,REVISION_NO,FLAGREASON,FLAG,COMPLETEDBY,CUSTOMER_NAME,WORKLIST_HOLD,TRANSTYPE,ACCOUNT_TYPE,TWCCSRNAME,UPDATEDBY,CWPARENTID,CWORDERID,LASTUPDATEDDATE,CWDOCSTAMP,ACCOUNT_NO,QUEUE_PRIV,VIEW_PRIV,TASK_STATE,DIVISION,CREATE_ASSIGN_DAYS,FIRST_ASSIGN_DATE,SORT_DATE,TN,ERROR_CODE,ORDERTYPE,ORDER_VER,ORDER_NO,MARKET from CWPWORKLIST where rowNum<5";

	// Query for OrderHistory table
	private static final String insertOrderHistoryRecord = "Insert into Order_History(ID,ORDERID,ORDER_STATE,USER_ID,ERROR_CODE,UPDATE_DATE,ORDER_NO,ORDER_VER,ORDER_CREATION_DATE) values(:id,:orderid,:orderState,:userId,:errorCode,:updateDate,:orderNo,:orderVer,:orderCreationDate)";
	private static final String getOrderHistoryList = "select O.ID,O.ORDERID,O.ORDER_STATE,O.USER_ID,O.ERROR_CODE,O.UPDATE_DATE,O.ORDER_NO,O.ORDER_VER,O.ORDER_CREATION_DATE FROM ORDER_HISTORY O,CWORDERINSTANCE C WHERE O.ORDERID =C.CWDOCID AND C.DUEDATE ='30-NOV-2018' AND rowNum<5";

	// Query for Validerrors table
	private static final String insertValiderrorsRecord = "Insert into VALIDERRORS(CWDOCID,ORDERNUMBER,ORDERVERSION,ORDERID,TN,SERVICEPROVIDERID,QCCORDERINTERVAL,TNTYPE,ERRCODE,ERRTEXT) values(:cwdocid,:ordernumber,:orderversion,:orderid,:tn,:serviceproviderid,:qccorderinterval,:tntype,:errcode,:errtext)";
	private static final String getValiderrorsList = "select L.CWDOCID,L.ORDERNUMBER,L.ORDERVERSION,L.ORDERID,L.TN,L.SERVICEPROVIDERID,L.QCCORDERINTERVAL,L.TNTYPE,L.ERRCODE,L.ERRTEXT FROM VALIDERRORS L,CWORDERINSTANCE C WHERE L.ORDERID =C.CWDOCID AND  C.DUEDATE ='30-NOV-2018' AND rowNum<5";

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	@Qualifier("sourceDb")
	DataSource dataSourceSou;

	@Autowired
	@Qualifier("destinationDb")
	DataSource dataSourceDest;

	@Bean
	public PlatformTransactionManager getTransactionManager() {
		return new ResourcelessTransactionManager();
	}

	@Bean
	public JobRepository getJobRepo() throws Exception {
		return new MapJobRepositoryFactoryBean(getTransactionManager()).getObject();
	}

	@Bean
	public JdbcCursorItemReader<CWOrderInstance> readerCWOrderInstance() {
		System.out.println(env.getProperty("spring.datasource.username"));

		JdbcCursorItemReader<CWOrderInstance> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);
		cursorItemReader.setSql(getCWORDERINSTANCEList);
		cursorItemReader.setRowMapper(new CWOrderInstanceRowMapper());
		return cursorItemReader;
	}

	@Bean
	public PersonItenProcessor processorCWOrderInstance() {
		return new PersonItenProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<CWOrderInstance> writerCWOrderInstance() {
		return new JdbcBatchItemWriterBuilder<CWOrderInstance>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
				.sql(insertCWORDERINSTANCERecord).dataSource(dataSourceDest).build();
	}

	@Bean
	public JdbcCursorItemReader<LSR> readerLSR() {
		// List<CWOrderInstance>
		// CWOrderInstance=cWOrderInstanceRepositoy.findAll();

		JdbcCursorItemReader<LSR> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);
		cursorItemReader.setSql(getLSRList);
		cursorItemReader.setRowMapper(new LSRRowMapper());
		return cursorItemReader;
	}

	@Bean
	public LSRItenProcessor processorLSR() {
		return new LSRItenProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<LSR> writerLSR() {
		return new JdbcBatchItemWriterBuilder<LSR>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>()).sql(insertLSRRecord)
				.dataSource(dataSourceDest).build();
	}

	@Bean
	public JdbcCursorItemReader<Dpo> readerDpo() { // List<CWOrderInstance>

		JdbcCursorItemReader<Dpo> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);
		cursorItemReader.setSql(getDoRecordList);
		cursorItemReader.setRowMapper(new DpoRowMapper());
		return cursorItemReader;
	}

	@Bean
	public DpoItemProcessor processorDpo() {
		return new DpoItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<Dpo> writerDpo() {
		return new JdbcBatchItemWriterBuilder<Dpo>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>()).sql(insetDpoRecord)
				.dataSource(dataSourceDest).build();
	}

	@Bean
	public JdbcCursorItemReader<CWPWorkList> readerCWPWorkList() {
		// List<CWOrderInstance>
		// CWOrderInstance=cWOrderInstanceRepositoy.findAll();

		JdbcCursorItemReader<CWPWorkList> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);

		cursorItemReader.setSql(getCWPWorkList);
		cursorItemReader.setRowMapper(new CWPWorkListRowMapper());
		return cursorItemReader;
	}

	@Bean
	public CWPWorkListItemProcessor processorCWPWorkListItemProcessorItemProcessor() {
		return new CWPWorkListItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<CWPWorkList> writerCWPWorkList() {

		return new JdbcBatchItemWriterBuilder<CWPWorkList>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
				.sql(insertCWPWorkListRecord).dataSource(dataSourceDest).build();
	}

	/*
	 * @Bean public Job exportPerosnJob(){ return
	 * jobBuilderFactory.get("exportPeronJob").incrementer(newRunIdIncrementer()
	 * ). flow(step1()).end().build(); }
	 */

	@Bean
	public JdbcCursorItemReader<CWPWorkListArchive> readerCWPWorkListArchive() {
		// List<CWOrderInstance>
		// CWOrderInstance=cWOrderInstanceRepositoy.findAll();

		JdbcCursorItemReader<CWPWorkListArchive> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);

		cursorItemReader.setSql(getCWPWorkListArchiveList);
		cursorItemReader.setRowMapper(new CWPWorkListArchiveRowMapper());
		return cursorItemReader;
	}

	@Bean
	public CWPWorkListArchiveItemProcessor processorCWPWorkListArchive() {
		return new CWPWorkListArchiveItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<CWPWorkListArchive> writerCWPWorkListArchive() {

		return new JdbcBatchItemWriterBuilder<CWPWorkListArchive>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
				.sql(insetCWPWorkListArchiveRecord).dataSource(dataSourceDest).build();
	}

	@Bean
	public JdbcCursorItemReader<OrderHistory> readerOrderHistory() {
		// List<CWOrderInstance>
		// CWOrderInstance=cWOrderInstanceRepositoy.findAll();

		JdbcCursorItemReader<OrderHistory> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);

		cursorItemReader.setSql(getOrderHistoryList);
		cursorItemReader.setRowMapper(new OrderHistoryRowMapper());
		return cursorItemReader;
	}

	@Bean
	public OrderHistoryItemProcessor processorOrderHistoryItemProcessorItemProcessor() {
		return new OrderHistoryItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<OrderHistory> writerOrderHistory() {

		return new JdbcBatchItemWriterBuilder<OrderHistory>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
				.sql(insertOrderHistoryRecord).dataSource(dataSourceDest).build();
	}

	@Bean
	public JdbcCursorItemReader<Validerrors> readerValiderrors() {

		JdbcCursorItemReader<Validerrors> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);

		cursorItemReader.setSql(getValiderrorsList);
		cursorItemReader.setRowMapper(new ValiderrorsRowMapper());
		return cursorItemReader;
	}

	@Bean
	public ValiderrorsItemProcessor processorValiderrorsItemProcessorItemProcessor() {
		return new ValiderrorsItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<Validerrors> writerValiderrors() {

		return new JdbcBatchItemWriterBuilder<Validerrors>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
				.sql(insertValiderrorsRecord).dataSource(dataSourceDest).build();
	}

	@Bean
	public Step step8() {
		return stepBuilderFactory.get("step8").<Validerrors, Validerrors>chunk(100).reader(readerValiderrors())
				.processor(processorValiderrorsItemProcessorItemProcessor()).writer(writerValiderrors()).build();
	}

	@Bean
	public JdbcCursorItemReader<PRV> readerPRV() {

		JdbcCursorItemReader<PRV> cursorItemReader = new JdbcCursorItemReader<>();
		cursorItemReader.setDataSource(dataSourceSou);

		cursorItemReader.setSql(getPRVList);
		cursorItemReader.setRowMapper(new PRVRowMapper());
		return cursorItemReader;
	}

	@Bean
	public PRVItemProcessor processorPRVItemProcessor() {
		return new PRVItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<PRV> writerPRV() {

		return new JdbcBatchItemWriterBuilder<PRV>()
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>()).sql(insetPRVRecord)
				.dataSource(dataSourceDest).build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<CWOrderInstance, CWOrderInstance>chunk(100)
				.reader(readerCWOrderInstance()).processor(processorCWOrderInstance()).writer(writerCWOrderInstance())
				.build();
	}

	@Bean
	public Step step2() {
		return stepBuilderFactory.get("step2").<LSR, LSR>chunk(100).reader(readerLSR()).processor(processorLSR())
				.writer(writerLSR()).build();
	}

	@Bean
	public Step step3() {
		return stepBuilderFactory.get("step3").<Dpo, Dpo>chunk(100).reader(readerDpo()).processor(processorDpo())
				.writer(writerDpo()).build();
	}

	@Bean
	public Step step4() {
		return stepBuilderFactory.get("step4").<CWPWorkListArchive, CWPWorkListArchive>chunk(100)
				.reader(readerCWPWorkListArchive()).processor(processorCWPWorkListArchive())
				.writer(writerCWPWorkListArchive()).build();
	}

	@Bean
	public Step step5() {
		return stepBuilderFactory.get("step5").<PRV, PRV>chunk(100).reader(readerPRV())
				.processor(processorPRVItemProcessor()).writer(writerPRV()).build();
	}

	@Bean
	public Step step6() {
		return stepBuilderFactory.get("step6").<CWPWorkList, CWPWorkList>chunk(100).reader(readerCWPWorkList())
				.processor(processorCWPWorkListItemProcessorItemProcessor()).writer(writerCWPWorkList()).build();
	}

	@Bean
	public Step step7() {
		return stepBuilderFactory.get("step7").<OrderHistory, OrderHistory>chunk(100).reader(readerOrderHistory())
				.processor(processorOrderHistoryItemProcessorItemProcessor()).writer(writerOrderHistory()).build();
	}

	/*
	 * @Bean public Job exportPerosnJob() { return
	 * jobBuilderFactory.get("exportPeronJob").start(step5()).build(); }
	 */

	@Bean
	public Job exportPerosnJob() {
		return jobBuilderFactory.get("exportPeronJob").start(step1()).next(step2()).next(step3()).next(step4()).next(step5())
				.next(step6()).next(step7()).next(step8()).build();
	}

}
