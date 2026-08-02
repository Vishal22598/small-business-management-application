package com.vishal.smallbusinessmanagement.service;

import com.vishal.smallbusinessmanagement.dto.request.ShopRequest;
import com.vishal.smallbusinessmanagement.dto.response.ShopResponse;

import java.util.List;

public interface ShopService {

    ShopResponse createShop(ShopRequest request);
    ShopResponse getShopById(Long shopId);
    List<ShopResponse> getAllShops();
    ShopResponse updateShop(Long shopId, ShopRequest request);
    void deleteShop(Long shopId);
}
