package flow;

import dto.AccountTypeDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface CreateAccountTypeFlow {
    AccountTypeDto create(AccountTypeDto accountType);

    static final Logger LOGGER = LoggerFactory.getLogger(CreateAccountTypeFlow.class);
}
