package com.information.service.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address
{
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private long id;

  @Column(nullable = false)
  private String streetNo;

  @Column(nullable = false)
  private String street;

  @Column(nullable = false)
  private String city;

  @Column(nullable = false)
  private String post;

  @Column(nullable = false)
  private Long postNo;

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public String getStreetNo()
  {
    return streetNo;
  }

  public void setStreetNo(String streetNo)
  {
    this.streetNo = streetNo;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getPost()
  {
    return post;
  }

  public void setPost(String post)
  {
    this.post = post;
  }

  public Long getPostNo()
  {
    return postNo;
  }

  public void setPostNo(Long postNo)
  {
    this.postNo = postNo;
  }
}
