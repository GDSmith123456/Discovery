package flow;

import dto.AccountTypeDto;
import org.springframework.stereotype.Component;
import javax.transaction.Transactional;
import flow.CreateAccountTypeFlow;
import java.time.LocalDate;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImp implements CreateAccountTypeFlow{

    private final AccountTypeTranslator accountTypeTranslator;

    public CreateAccountTypeFlowImp(AccountTypeTranslator accountTypeTranslator)
    {
        this.accountTypeTranslator = accountTypeTranslator;
    }

    @Override
    public AccountTypeDto create(AccountTypeDto accountType) {
        if(null == accountType.getCreationDate()){
            accountType.setCreationDate(LocalDate.now());
        }
        return accountTypeTranslator.create(accountType);
    }
}
