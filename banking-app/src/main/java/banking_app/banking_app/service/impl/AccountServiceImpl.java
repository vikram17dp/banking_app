package banking_app.banking_app.service.impl;

import banking_app.banking_app.Dto.AccountDto;
import banking_app.banking_app.repository.AccountRepository;
import banking_app.banking_app.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
