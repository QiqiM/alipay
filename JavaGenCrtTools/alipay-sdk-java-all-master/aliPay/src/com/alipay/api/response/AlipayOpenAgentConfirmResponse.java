package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.agent.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-27 17:35:06
 */
public class AlipayOpenAgentConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 8574419557529514425L;

	/** 
	 * 应用授权令牌
	 */
	@ApiField("app_auth_token")
	private String appAuthToken;

	/** 
	 * 刷新令牌
	 */
	@ApiField("app_refresh_token")
	private String appRefreshToken;

	/** 
	 * 授权商户的appid
	 */
	@ApiField("auth_app_id")
	private String authAppId;

	/** 
	 * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("expires_in")
	private String expiresIn;

	/** 
	 * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒
	 */
	@ApiField("re_expires_in")
	private String reExpiresIn;

	/** 
	 * 授权商户的user_id
	 */
	@ApiField("user_id")
	private String userId;

	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}
	public String getAppAuthToken( ) {
		return this.appAuthToken;
	}

	public void setAppRefreshToken(String appRefreshToken) {
		this.appRefreshToken = appRefreshToken;
	}
	public String getAppRefreshToken( ) {
		return this.appRefreshToken;
	}

	public void setAuthAppId(String authAppId) {
		this.authAppId = authAppId;
	}
	public String getAuthAppId( ) {
		return this.authAppId;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}
	public String getExpiresIn( ) {
		return this.expiresIn;
	}

	public void setReExpiresIn(String reExpiresIn) {
		this.reExpiresIn = reExpiresIn;
	}
	public String getReExpiresIn( ) {
		return this.reExpiresIn;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
