package com.vishal.smallbusinessmanagement.mapper;

import com.vishal.smallbusinessmanagement.dto.request.ShopRequest;
import com.vishal.smallbusinessmanagement.dto.response.ShopResponse;
import com.vishal.smallbusinessmanagement.entity.Shop;

public class ShopMapper {
    private ShopMapper(){

    }

    /**
     * Convert Request DTO -> Entity
     */
    public static Shop toEntity(ShopRequest request) {

        if(request == null){
            return null;
        }

        Shop shop = new Shop();
        shop.setShopName(request.getShopName());
        shop.setOwnerName(request.getOwnerName());
        shop.setEmail(request.getEmail());
        shop.setPhone(request.getPhone());
        shop.setGstNumber(request.getGstNumber());
        shop.setAddress(request.getAddress());
        shop.setCity(request.getCity());
        shop.setState(request.getState());
        shop.setPincode(request.getPincode());

        return shop;
    }

    /**
     * Convert Entity -> Response DTO
     */
    public static ShopResponse toResponse(Shop shop) {

        if(shop == null){
            return null;
        }

        return ShopResponse.builder()
                .shopId(shop.getShopId())
                .shopName(shop.getShopName())
                .ownerName(shop.getOwnerName())
                .email(shop.getEmail())
                .phone(shop.getPhone())
                .gstNumber(shop.getGstNumber())
                .address(shop.getAddress())
                .city(shop.getCity())
                .state(shop.getState())
                .pincode(shop.getPincode())
                .status(shop.getStatus())
                .build();
    }

    /**
     * Update existing entity from Request DTO
     */
    public static void updateEntity(Shop shop, ShopRequest request) {

        if(shop == null || request == null){
            return;
        }
        
        shop.setShopName(request.getShopName());
        shop.setOwnerName(request.getOwnerName());
        shop.setEmail(request.getEmail());
        shop.setPhone(request.getPhone());
        shop.setGstNumber(request.getGstNumber());
        shop.setAddress(request.getAddress());
        shop.setCity(request.getCity());
        shop.setState(request.getState());
        shop.setPincode(request.getPincode());
    }
}
