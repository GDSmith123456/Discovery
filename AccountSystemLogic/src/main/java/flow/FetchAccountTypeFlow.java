package flow;

import dto.AccountTypeDto;

import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountTypeDto> getAllAccountTypes();
}
