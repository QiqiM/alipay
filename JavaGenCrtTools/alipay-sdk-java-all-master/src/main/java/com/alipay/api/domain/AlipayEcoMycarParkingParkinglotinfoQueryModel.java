package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 停车场信息查询
 *
 * @author auto create
 * @since 1.0, 2020-04-26 14:33:40
 */
public class AlipayEcoMycarParkingParkinglotinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5653887481496384986L;

	/**
	 * ISV停车场ID，由ISV定义的停车场标识，系统唯一，parking_id和out_parking_id不能同时为空
	 */
	@ApiField("out_parking_id")
	private String outParkingId;

	/**
	 * 支付宝停车平台ID，由支付宝定义的该停车场标识，系统唯一, parking_id和out_parking_id不能同时为空
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getOutParkingId() {
		return this.outParkingId;
	}
	public void setOutParkingId(String outParkingId) {
		this.outParkingId = outParkingId;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
