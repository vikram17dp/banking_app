package banking_app.banking_app.Dto;

import lombok.Data;

@Data
public class AccountDto {
    private Long id;
    private String accountHoldername;
    private double balance;
}
