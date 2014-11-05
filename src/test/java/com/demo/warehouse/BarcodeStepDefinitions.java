package com.demo.warehouse;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BarcodeStepDefinitions {
    Manager manager;
    SKU sku;

    @Given("^I am logged on as a warehouse manager$")
    public void i_am_logged_on_as_a_warehouse_manager() throws Throwable {
        manager = new Manager();
        Assert.assertTrue(manager.LogIn(true));
    }

    @Given("^an item with SKU of \"(.*?)\"$")
    public void an_item_with_SKU_of(String skuNumber) throws Throwable {
        sku = new SKU(skuNumber);
    }

    @When("^I associate it to barcode \"(.*?)\"$")
    public void i_associate_it_to_barcode(String barCode) throws Throwable {
        sku.addBarcode(barCode);
    }

    @Then("^it is available for sale$")
    public void it_is_available_for_sale() throws Throwable {
        assert(sku.isForSale());
    }

    @Given("^an invalid barcode$")
    public void an_invalid_barcode() throws Throwable {
        sku.addBarcode("barCode");
    }

    @Then("^I cannot associate it to a SKU$")
    public void i_cannot_associate_it_to_a_SKU() throws Throwable {
        assert(sku.isForSale() == false);
    }

    @Given("^an item with barcode \"(.*?)\"$")
    public void an_item_with_barcode(String barCode) throws Throwable {
    }

    @When("^it is marked \"(.*?)\"$")
    public void it_is_marked(String state) throws Throwable {
    }

    @Then("^it is removed from sales$")
    public void it_is_removed_from_sales() throws Throwable {
    }
}
