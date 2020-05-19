package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExerciseUserMappingDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.servindustry.exercise.memberphone.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-31 16:05:22
 */
public class KoubeiServindustryExerciseMemberphoneSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1877292116396886952L;

	/** 
	 * 健身用户手机号与健身用户id映射
	 */
	@ApiListField("mapping_list")
	@ApiField("exercise_user_mapping_d_t_o")
	private List<ExerciseUserMappingDTO> mappingList;

	public void setMappingList(List<ExerciseUserMappingDTO> mappingList) {
		this.mappingList = mappingList;
	}
	public List<ExerciseUserMappingDTO> getMappingList( ) {
		return this.mappingList;
	}

}
