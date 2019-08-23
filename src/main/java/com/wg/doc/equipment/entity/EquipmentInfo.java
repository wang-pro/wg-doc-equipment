package com.wg.doc.equipment.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_equipment_info")
@Data
@ApiModel
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class EquipmentInfo {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "标识")
    private long id;

    @Column
    @ApiModelProperty(value = "设备名称")
    private String equipmentName;

    @Column
    @ApiModelProperty(value = "设备等级")
    private String equipmentLevel;


}
