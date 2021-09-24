package com.information.service.provider;

import com.information.service.db.Address;
import com.information.service.db.AddressDao;
import com.information.service.dto.AddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceProvider
{
  private AddressDao addressDao;

  @Autowired
  public void setAddressDao(AddressDao addressDao)
  {
    this.addressDao = addressDao;
  }

  public AddressDto getAddressById(Long id)
  {
    Address addressEntity = addressDao.findAddressById(id);

    AddressDto addressDto = new AddressDto(
          addressEntity.getStreetNo(),
          addressEntity.getStreet(),
          addressEntity.getCity(),
          addressEntity.getPost(),
          addressEntity.getPostNo());

      return addressDto;
  }

  public void createAddress(AddressDto addressDto)
  {
    Address addressEntity = new Address();
    addressEntity.setCity(addressDto.getCity());
    addressEntity.setPost(addressDto.getPost());
    addressEntity.setStreet(addressDto.getStreet());
    addressEntity.setPostNo(addressDto.getPostNo());
    addressEntity.setStreetNo(addressDto.getStreetNo());

    addressDao.saveAddress(addressEntity);
  }
}
