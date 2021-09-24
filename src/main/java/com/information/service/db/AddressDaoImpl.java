package com.information.service.db;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
@Transactional
public class AddressDaoImpl implements AddressDao
{
  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public Address findAddressById(Long id)
  {
    return entityManager.find(Address.class, id);
  }

  @Override
  public void saveAddress(Address address)
  {
    entityManager.persist(address);
  }
}
