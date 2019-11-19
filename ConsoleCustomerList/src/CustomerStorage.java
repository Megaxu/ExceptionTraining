import exception.IncorrectComponentsException;
import exception.IncorrectEmailException;
import exception.IncorrectNameAndSecondNameException;
import exception.IncorrectNumberException;

import java.util.HashMap;

public class CustomerStorage {

  private HashMap<String, Customer> storage;
  private static final String REGEX_EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
  private static final String REGEX_NUMBER = "[+79][0-9]+";

  public CustomerStorage() {
    storage = new HashMap<>();
  }

  public void addCustomer(String data) {
    String[] components = data.split("\\s+");
    if (components.length != 4) {
      throw new IncorrectComponentsException(data);
    }
    if (!components[2].matches(REGEX_EMAIL)) {
      throw new IncorrectEmailException(components[2]);
    }
    if (!components[3].matches(REGEX_NUMBER)) {
      throw new IncorrectNumberException(components[3]);
    }
    String name = components[0] + " " + components[1];
    storage.put(name, new Customer(name, components[3], components[2]));
  }

  public void listCustomers() {
    storage.values().forEach(System.out::println);
  }

  public void removeCustomer(String name) {
    String[] components = name.split("\\s+", 2);
    if (components.length != 2) {
      throw new IncorrectNameAndSecondNameException(name);
      // не знаю, нужна ли проверка на ввод букв или нет, поэтому не добавил.
    }
    storage.remove(name);
  }

  public int getCount() {
    return storage.size();
  }
}