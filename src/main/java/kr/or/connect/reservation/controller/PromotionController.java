package kr.or.connect.reservation.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import kr.or.connect.reservation.dto.GetResponse;
import kr.or.connect.reservation.dto.Promotion;
import kr.or.connect.reservation.service.PromotionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/promotions")
public class PromotionController {
    @Autowired
    PromotionService promotionService;

    @ApiOperation(value = "프로모션 목록 가져오기")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 500, message = "Exception")
    })
    @GetMapping
    public GetResponse get() {
        List<Promotion> promotions = promotionService.getPromotions();
        return new GetResponse(promotions.size(), promotions);
    }
}
