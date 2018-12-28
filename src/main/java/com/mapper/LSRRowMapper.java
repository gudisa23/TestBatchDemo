package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.model.LSR;

public class LSRRowMapper implements RowMapper<LSR>{

	@Override
	public LSR mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		LSR lsr=new LSR();
		lsr.setAct(rs.getString("act"));
		lsr.setAct_gui(rs.getString("act_gui"));
		lsr.setAgauth(rs.getInt("agauth"));
		lsr.setAtn(rs.getString("atn"));
		lsr.setAuthnm(rs.getString("authnm"));
		lsr.setBan1(rs.getString("ban1"));
		lsr.setBan1_gui(rs.getString("ban1_gui"));
		lsr.setBillcon(rs.getString("billcon"));
		lsr.setBillnm(rs.getString("billnm"));
		lsr.setBilltelno(rs.getString("billtelno"));
		
		lsr.setCcna(rs.getString("ccna"));
		lsr.setCity(rs.getString("city"));
		lsr.setClec_automated(rs.getInt("clec_automated"));
		lsr.setClec_id(rs.getString("clec_id"));
		lsr.setCompletion_days(rs.getInt("completion_days"));
		lsr.setCwdocid(rs.getString("cwdocid"));
		lsr.setCwdocstamp(rs.getString("cwdocstamp"));
		lsr.setCworderid(rs.getString("cworderid"));
		lsr.setCwparentid(rs.getString("cwparentid"));
		lsr.setDated(rs.getDate("dated"));
		lsr.setDdd(rs.getDate("ddd"));
		lsr.setDddtimezone(rs.getString("dddtimezone"));
		lsr.setDfdt(rs.getString("dfdt"));
		lsr.setDisconnecttype(rs.getString("disconnecttype"));
		lsr.setDtsent(rs.getDate("dtsent"));
		
		lsr.setError_code(rs.getString("error_code"));
		
		lsr.setEmail(rs.getString("email"));
		lsr.setError_detail(rs.getString("error_detail"));
		lsr.setEudocid(rs.getString("eudocid"));
		lsr.setExp(rs.getInt("exp"));
		
		lsr.setFloor(rs.getString("floor"));
		lsr.setFoc_days(rs.getInt("foc_days"));
		
		lsr.setIc_remarks(rs.getString("ic_remarks"));
		lsr.setIC_SENT_DATE(rs.getDate("IC_SENT_DATE"));
		lsr.setImpcon(rs.getString("impcon"));
		lsr.setImpconemail(rs.getString("impconemail"));
		lsr.setImpcontel(rs.getString("impcontel"));
		lsr.setInit(rs.getString("init"));
		
		lsr.setLast_lr_id(rs.getString("last_lr_id"));
		lsr.setLASTUPDATEDDATE(rs.getDate("lASTUPDATEDDATE"));
		lsr.setLsrremarks(rs.getString("lsrremarks"));
		lsr.setTelno(rs.getString("telno"));
		
		lsr.setMi(rs.getString("mi"));
		
		lsr.setOlsp(rs.getString("olsp"));
		lsr.setOnsp(rs.getString("onsp"));
		lsr.setOnsp_gui(rs.getString("onsp_gui"));
		lsr.setORDER_CREATION_DATE(rs.getDate("ORDER_CREATION_DATE"));
		
		lsr.setPon(rs.getString("pon"));
		lsr.setProject(rs.getString("project"));
		
		lsr.setReject_days(rs.getInt("reject_days"));
		lsr.setReqtyp(rs.getString("reqtyp"));
		lsr.setReqtyp_gui(rs.getString("reqtyp_gui"));
		lsr.setRoommailstop(rs.getString("roommailstop"));
		lsr.setRpon(rs.getString("rpon"));
		
		lsr.setSbillnm(rs.getString("sbillnm"));
		lsr.setServiceaddressratecenter(rs.getString("serviceaddressratecenter"));
		lsr.setState(rs.getString("state"));
		lsr.setStreet(rs.getString("street"));
		lsr.setSup(rs.getString("sup"));
		
		lsr.setTelno(rs.getString("telno"));
		lsr.setTn(rs.getString("tn"));
		lsr.setTntype(rs.getString("tntype"));
		lsr.setToa(rs.getString("toa"));
		lsr.setTos(rs.getString("tos"));
		
		lsr.setUPDATEDBY(rs.getString("uPDATEDBY"));
		
		lsr.setVer(rs.getString("ver"));
		
		lsr.setZip(rs.getString("zip"));
		return lsr;
	}

}
