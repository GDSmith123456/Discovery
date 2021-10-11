package flow;

import dto.AccountTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import persistanceTestWeb.AccountType;
import persistence.AccountTypeRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public abstract class AccountTypeTranslatorImpl implements AccountTypeTranslator {

    private final AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeTranslatorImpl(AccountTypeRepository accountTypeRepository){
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){

        List<AccountTypeDto> accountTypeDto= new ArrayList<>();
        try{
            for (AccountType accountType : accountTypeRepository.findAll()) {
                accountTypeDto.add(new AccountTypeDto(accountType));

            }
        }catch (Exception e){
            throw new RuntimeException("Unable to read from the DB", e);

        }
        return accountTypeDto;
    }


}
