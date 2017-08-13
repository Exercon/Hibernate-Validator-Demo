package mainpackage;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class BankCustomer implements Customer{

    @NotNull(message= "is required")
    @Size(min = 1, message = "is required")
    private String name;

    @NotNull(message="is required")
    @Size(min = 1, message = "is required")
    private String surname;

    @NotNull(message="is required")
    @Size(min = 1, message = "is required")
    private String email;

    @NotNull(message= "is required")
    @Pattern(regexp= "^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
    private Integer customerID;

    @NotNull(message = "is required")
    @Code
    private String bankCode;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
