package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.Validerrors;

public class ValiderrorsRowMapper implements RowMapper<Validerrors>{

	@Override
	public Validerrors mapRow(ResultSet rs, int rowNum) throws SQLException {
		Validerrors validerrors=new Validerrors();
		validerrors.setCwdocid(rs.getString("CWDOCID"));
		validerrors.setOrdernumber(rs.getString("ORDERNUMBER"));
		validerrors.setOrderversion(rs.getString("ORDERVERSION"));
		validerrors.setOrderid(rs.getString("ORDERID"));
		validerrors.setTn(rs.getString("TN"));
		validerrors.setServiceproviderid(rs.getString("SERVICEPROVIDERID"));
		validerrors.setQccorderinterval(rs.getInt("QCCORDERINTERVAL"));
		validerrors.setTntype(rs.getString("TNTYPE"));
		validerrors.setErrcode(rs.getString("ERRCODE"));
		validerrors.setErrtext(rs.getString("ERRTEXT"));		
     	return validerrors;
	}

}
