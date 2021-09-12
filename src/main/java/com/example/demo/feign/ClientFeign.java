package com.example.demo.feign;

import com.example.demo.models.dto.ClientDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "eureka-client-service")
public interface ClientFeign {

    @PostMapping("api/v1/client/save")
    ClientDto saveClient(ClientDto clientDto);
}
