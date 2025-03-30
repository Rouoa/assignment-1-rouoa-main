package nz.ac.auckland.se281;
//UPI: rcla135
//ID:  578717208
import nz.ac.auckland.se281.Types.Location;

public class OperatorManagementSystem {

  // Do not change the parameters of the constructor
  public OperatorManagementSystem() {}


  public void searchOperators(String keyword) {
    System.out.println("There are no matching operators found.");
  }

  public void createOperator(String operatorName, String location) {
    Location wantedLocation=Location.fromString(location);// gets the string into a Location type (to put in the oporator class)
Operator oporator=new Operator(operatorName,wantedLocation);//creates a new oporator with our oporatorName(string) and our 
String message = MessageCli.OPERATOR_CREATED.getMessage(oporator.getOporatorName(), "WACT-AKL-001", oporator.getLocation().toString());  // get the message
System.out.println(message);  // prints the name, operator ID (not yet implemented so hard coding the one location), location(string type) 
  }

  public void viewActivities(String operatorId) {
    // TODO implement
  }

  public void createActivity(String activityName, String activityType, String operatorId) {
    // TODO implement
  }

  public void searchActivities(String keyword) {
    // TODO implement
  }

  public void addPublicReview(String activityId, String[] options) {
    // TODO implement
  }

  public void addPrivateReview(String activityId, String[] options) {
    // TODO implement
  }

  public void addExpertReview(String activityId, String[] options) {
    // TODO implement
  }

  public void displayReviews(String activityId) {
    // TODO implement
  }

  public void endorseReview(String reviewId) {
    // TODO implement
  }

  public void resolveReview(String reviewId, String response) {
    // TODO implement
  }

  public void uploadReviewImage(String reviewId, String imageName) {
    // TODO implement
  }

  public void displayTopActivities() {
    // TODO implement
  }
}
