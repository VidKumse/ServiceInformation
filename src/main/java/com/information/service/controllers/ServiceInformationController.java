package com.information.service.controllers;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import com.information.service.dto.AddressDto;
import com.information.service.provider.ServiceProvider;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@Validated
@RequestMapping("/rest")
public class ServiceInformationController
{
  private ServiceProvider serviceProvider;

  @Autowired
  public void setServiceProvider(ServiceProvider serviceProvider)
  {
    this.serviceProvider = serviceProvider;
  }


  @GetMapping(path = "/address", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value="Get address by Id")
  public ResponseEntity<AddressDto> getAddressById(
      @RequestParam final Long id)
  {
    AddressDto address = serviceProvider.getAddressById(id);

    return new ResponseEntity<>(address, HttpStatus.OK);
  }


  @PutMapping(path = "/address/{addressId}", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value="Change an existing address by Id")
  public AddressDto patchAddressById(@Valid @RequestBody final AddressDto address,
                                     @Min(1) @PathVariable Long addressId)
  {
    return new AddressDto("23", "Trzaska cesta", "Ljubljana", "Ljubljana", 1000L);
  }


  @DeleteMapping(path = "/address")
  @ApiOperation(value = "Delete an existing address by Id")
  public String deleteAddressById(
      @RequestParam final Long addressId)
  {
    return "addressId deleted";
  }

  @PostMapping(path = "/address", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value="create new address")
  public ResponseEntity<String> createAddress(
      @Valid @RequestBody final AddressDto address)
  {
    serviceProvider.createAddress(address);
    return ResponseEntity.ok("Address created");
  }

  @PostMapping(path = "/address/addressId/service/{serviceId}", produces = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value="create new service for particulat address")
  public ResponseEntity<String> createService(
      @Valid @RequestBody final AddressDto address)
  {
    serviceProvider.createAddress(address);
    return ResponseEntity.ok("Address created");
  }
}
