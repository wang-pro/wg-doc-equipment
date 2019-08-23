package com.wg.doc.equipment.service.impl;

import com.wg.doc.equipment.dao.EquipmentInfoRepository;
import com.wg.doc.equipment.entity.EquipmentInfo;
import com.wg.doc.equipment.service.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentInfoServiceImpl implements EquipmentInfoService {

    @Autowired
    private EquipmentInfoRepository equipmentInfoRepository;

    @Override
    public EquipmentInfo getEquipment(long id) {
        return equipmentInfoRepository.getOne(id);
    }
}
