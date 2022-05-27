package com.tencent.lbssearch.object.result;

import com.tencent.lbssearch.httpresponse.BaseObject;
import com.tencent.lbssearch.object.Location;

public class Address2GeoResultObject extends BaseObject {
  public Address2GeoResult result;
  
  public class Address2GeoResult {
    public AddressComponent address_components;
    
    public float deviation;
    
    public Location location;
    
    public int reliability;
    
    public float similarity;
  }
}


/* Location:              F:\何章易\项目文件夹\项目24\va\classes_merge.jar!\com\tencent\lbssearch\object\result\Address2GeoResultObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */