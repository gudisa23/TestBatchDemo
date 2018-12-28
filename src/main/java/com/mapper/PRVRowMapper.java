package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.PRV;

public class PRVRowMapper implements RowMapper<PRV>{

	@Override
	public PRV mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRV prv=new PRV();
		prv.setACCOUNTNUMBER(rs.getString("ACCOUNTNUMBER"));
		prv.setACCOUNTTYPE(rs.getString("ACCOUNTTYPE"));
		prv.setACTION(rs.getString("ACTION"));
		prv.setCWDOCID(rs.getString("CWDOCID"));
		prv.setCWDOCSTAMP(rs.getString("CWDOCSTAMP"));
		prv.setCWORDERID(rs.getString("CWORDERID"));
		prv.setCWPARENTID(rs.getString("CWPARENTID"));
		prv.setDESCRIPTION(rs.getString("DESCRIPTION"));
		prv.setERROR_CODE(rs.getString("ERROR_CODE"));
		prv.setIDENTIFIER(rs.getInt("IDENTIFIER"));
		prv.setLASTUPDATEDDATE(rs.getDate("LASTUPDATEDDATE"));
		prv.setNEWCUSTID(rs.getString("NEWCUSTID"));
		prv.setORDER_CREATION_DATE(rs.getDate("ORDER_CREATION_DATE"));
		prv.setREQUEST_DATE(rs.getDate("REQUEST_DATE"));
		prv.setREQUEST_TYPE(rs.getString("REQUEST_TYPE"));
		prv.setRESPONSE_DATE(rs.getDate("RESPONSE_DATE"));
		prv.setSERVICEID(rs.getString("SERVICEID"));
		prv.setSITEID(rs.getString("SITEID"));
		prv.setSOURCEID(rs.getString("SOURCEID"));
		prv.setSUBORDERTYPE(rs.getString("SUBORDERTYPE"));
		prv.setTIMEZONE(rs.getString("TIMEZONE"));
		prv.setTRANSACTIONID(rs.getString("TRANSACTIONID"));
		prv.setTWCDIVISIONID(rs.getString("TWCDIVISIONID"));
		prv.setUPDATEDBY(rs.getString("UPDATEDBY"));
		prv.setWGACCOUNTNUMBER(rs.getString("WGACCOUNTNUMBER"));
		prv.setWGCSA(rs.getString("WGCSA"));
		prv.setWGDUEDATE(rs.getDate("WGDUEDATE"));
		prv.setWGEMAIL(rs.getString("WGEMAIL"));
		prv.setWGESN(rs.getString("WGESN"));
		prv.setWGINSURANCEPROVIDER(rs.getString("WGINSURANCEPROVIDER"));
		prv.setWGMAC(rs.getString("WGMAC"));
		prv.setWGMDN(rs.getString("WGMDN"));
		prv.setWGOLDACCOUNTNUMBER(rs.getString("WGOLDACCOUNTNUMBER"));
		prv.setWGORDERNUMBER(rs.getString("WGORDERNUMBER"));
		prv.setWGORDERTYPE(rs.getString("WGORDERTYPE"));
		prv.setWGRATEPLAN(rs.getString("WGRATEPLAN"));
		prv.setWGSERVICEPROVIDERID(rs.getInt("WGSERVICEPROVIDERID"));
		prv.setWGSUBSCRIBERREFERENCE(rs.getString("WGSUBSCRIBERREFERENCE"));
		prv.setWGUSECASE(rs.getInt("WGUSECASE"));
		return prv;
	}

}
