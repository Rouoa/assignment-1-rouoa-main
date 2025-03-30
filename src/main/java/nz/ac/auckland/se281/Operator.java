package nz.ac.auckland.se281;

import nz.ac.auckland.se281.Types.Location; //lets us use location type

public class Operator {
private String operatorName;//private classes so a new oporator needs to be created before 
private Location location;

public Operator(String name,Location location){//constructor with the name of the oporator and the location
  this.operatorName=name;
  this.location=location;
}
public String getOporatorName(){
  return this.operatorName;//returns the oporator name as a string type
}
public Location getLocation(){
  return this.location;//returns the location name as a location type
}

}
