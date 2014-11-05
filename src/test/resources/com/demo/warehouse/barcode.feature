Feature:
  As a warehouse worker
  I want to be able to manage inventory items
  So that customers may buy them

  Background:
    Given I am logged on as a warehouse manager
    And an item with SKU of "SOME_SKU"

  Scenario: Associating a barcode with a SKU
    When I associate it to barcode "123456789"
    Then it is available for sale

  Scenario: Associating a bad barcode with a SKU
    Given an invalid barcode
    Then I cannot associate it to a SKU

  Scenario: Deactivating a barcode
    Given an item with barcode "666666"
    When it is marked "Damaged"
    Then it is removed from sales
