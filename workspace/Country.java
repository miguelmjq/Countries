//  Class author:  Miguel Mirabal Q
//  Date created: 1/13/26
//  General description: A class that creates a country object. has methods for getting the instance variables

public class Country {
  // add private instance variables for the name, capital, language, and image
  // file.
  private String name;
  private String capital;
  private String language;
  private String imageFile;

  // add constructors
  public Country(String n, String c, String l, String i) {
    name = n;
    capital = c;
    language = l;
    imageFile = i;
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String getName() {
    return name;
  }

  public String getCapital() {
    return capital;
  }

  public String getLanguage() {
    return language;
  }

  public String getFile() {
    return imageFile;
  }

  // Write a toString() method that returns a concatenated String of 3 of the
  // instance variables in a sentence like "..'s capital is .. and its primary
  // language is ..."
  public String toString() {
    String message = name + "'s capital is " + capital + " and its primary language is " + language;
    System.out.println(message);
    return message;
  }

}