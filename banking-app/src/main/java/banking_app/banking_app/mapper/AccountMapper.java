//package banking_app.banking_app.mapper;
//
//import banking_app.banking_app.Dto.AccountDto;
//import banking_app.banking_app.entity.Account;
//
//public class AccountMapper {
//    public static Account mapToAccount(AccountDto accountDto) {
//        return new Account(
//                accountDto.getId(),
//                accountDto.getAccountHolderName(),
//                accountDto.getBalance()
//        );
//    }
//
//    public static AccountDto mapToAccountDto(Account account) {
//        return new AccountDto(
//                account.getId(),
//                account.getAccountHolderName(),
//                account.getBalance()
//        );
//    }
//}