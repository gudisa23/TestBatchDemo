package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.model.CWOrderInstance;
import com.model.OrderHistory;
import com.model.Validerrors;

public class OrderHistoryRowMapper implements RowMapper<OrderHistory>{

	@Override
	public OrderHistory mapRow(ResultSet rs, int rowNum) throws SQLException {
		OrderHistory orderHistory=new OrderHistory();
		orderHistory.setId(rs.getString("ID"));
		orderHistory.setOrderid(rs.getString("ORDERID"));
		orderHistory.setOrderState(rs.getString("ORDER_STATE"));
		orderHistory.setUserId(rs.getString("USER_ID"));
		orderHistory.setErrorCode(rs.getString("ERROR_CODE"));
		orderHistory.setUpdateDate(rs.getDate("UPDATE_DATE"));
		orderHistory.setOrderNo(rs.getString("ORDER_NO"));
		orderHistory.setOrderVer(rs.getString("ORDER_VER"));
		orderHistory.setOrderCreationDate(rs.getDate("ORDER_CREATION_DATE"));
		
     	return orderHistory;
	}

}
