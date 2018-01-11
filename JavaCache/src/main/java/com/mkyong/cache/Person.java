package com.mkyong.cache;

import java.io.Serializable;

/**
 *
 * @author GGIB
 */
public class Person implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int ssn;
    private final String firstName;
    private final String lastName;

    public Person(int ssn, String firstName, String lastName)
    {
      this.ssn = ssn;
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }
}
