package org.hspt.entity.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <b>  </b>
 * <p>
 * 功能描述:
 * </p>
 */
@Data
@ApiModel("错误日志信息")
public class ResErrLog implements Serializable {

    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty(value = "模块地址")
    private String serUrl;

    @ApiModelProperty(value = "模块端口")
    private String serPort;

    @ApiModelProperty(value = "应用名称")
    private String appName;

    @ApiModelProperty(value = "模块名称")
    private String appSer;

    @ApiModelProperty(value = "数据中心ID")
    private long dataCenterId;

    @ApiModelProperty(value = "工作平台ID")
    private long workerId;

    @ApiModelProperty(value = "请求地址")
    private String reqUrl;

    @ApiModelProperty(value = "请求参数")
    private String parameters;

    @ApiModelProperty(value = "执行日期")
    private String execDate;

    @ApiModelProperty(value = "执行时间")
    private String execTime;


    public ResErrLog() {
        super();
    }
}
