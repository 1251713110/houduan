package com.yzw.shop_online.common.convert;

import com.yzw.shop_online.entity.UserShippingAddress;
import com.yzw.shop_online.vo.UserAddressVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserAddressConvert {

    UserAddressConvert INSTANCE = Mappers.getMapper(UserAddressConvert.class);


    UserAddressVO convertToUserAddressVO(UserShippingAddress userShippingAddress);


    List<UserAddressVO> convertToUserAddressVOList(List<UserShippingAddress> list);
}