package com.information.service.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;

public class AddressDto
{
  @ApiModelProperty(notes = "Street number")
  @NotBlank(message = "StreetNo is mandatory")
  private String streetNo;

  @ApiModelProperty(notes = "Street")
  @NotBlank(message = "Street is mandatory")
  private String street;

  @ApiModelProperty(notes = "City")
  @NotBlank(message = "City is mandatory")
  private String city;

  @ApiModelProperty(notes = "Post")
  @NotBlank(message = "Post is mandatory")
  private String post;

  @ApiModelProperty(notes = "Post number")
  @Min(1)
  private Long postNo;

  public AddressDto()
  {
  }

  public AddressDto(String streetNo, String street, String city, String post, Long postNo)
  {
    this.streetNo = streetNo;
    this.street = street;
    this.city = city;
    this.post = post;
    this.postNo = postNo;
  }

  public String getStreetNo()
  {
    return streetNo;
  }

  public String getStreet()
  {
    return street;
  }

  public String getCity()
  {
    return city;
  }

  public String getPost()
  {
    return post;
  }

  public Long getPostNo()
  {
    return postNo;
  }
}
