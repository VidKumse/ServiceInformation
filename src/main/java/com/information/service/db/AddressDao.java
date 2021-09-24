package com.information.service.db;

public interface AddressDao
{
  Address findAddressById(Long id);

  void saveAddress(Address address);
}
