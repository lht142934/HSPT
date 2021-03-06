package org.hspt.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hspt.entity.dto.AnswerDTO;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * <b> 问卷回收基础信息 </b>
 * <p>
 * 功能描述:
 * </p>
 *
 */
@Data
@ApiModel("问卷回收响应实体信息")
public class ResRetrieveInfo implements Serializable {

    @ApiModelProperty("问卷回收编号")
    @NotNull
    private Integer deliveryId;    //问卷回收编号

    @ApiModelProperty("答卷时间")
    @NotNull
    private Date retrieveDate;    //答卷时间

    @ApiModelProperty("问卷")
    @NotNull
    private Long surveyId;    //问卷

    @ApiModelProperty("分发病人")
    @NotNull
    private Integer patientId;    //分发病人

    @ApiModelProperty("所有答案")
    @NotNull
    private Set<AnswerDTO> answers;

    @NotBlank
    @ApiModelProperty("由该医生添加")
    private String byDoctor; //由该医生添加

    public ResRetrieveInfo() {
    }
}
