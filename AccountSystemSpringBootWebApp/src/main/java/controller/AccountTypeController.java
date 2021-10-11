package controller;


import flow.CreateAccountTypeFlow;
import flow.FetchAccountTypeFlow;
import dto.AccountTypeDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.GeneralResponse;

@RestController
@RequestMapping("account-type")
public class AccountTypeController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountTypeController.class);
    private FetchAccountTypeFlow fetchAccountTypeFlow;
    private final CreateAccountTypeFlow createAccountTypeFlow;

    @Autowired
    public AccountTypeController (FetchAccountTypeFlow fetchAccountTypeFlow, @Qualifier("createAccountTypeFlowName")CreateAccountTypeFlow createAccountTypeFlow){
        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
        this.createAccountTypeFlow = createAccountTypeFlow;
        LOGGER.info("THE create AccountTypeFlow is: {}", createAccountTypeFlow);
    }

    @Autowired
    public AccountTypeController (CreateAccountTypeFlow createAccountTypeFlow){
        this.createAccountTypeFlow = createAccountTypeFlow;

    }

    @GetMapping("/ping")
    @ApiOperation(value = "Echo the Ping.", notes = "This echo the ping back to the client")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "The Ping was received and echoed", response = GeneralResponse.class), @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
    @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
    @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<String> ping(
            @RequestParam(value = "value that will be echoed", defaultValue = "pong") String echo) {
         return new ResponseEntity<>(echo, HttpStatus.OK);
        }
    @PostMapping("")
    @ApiOperation(value = "Creates a new AccountType", notes = "Creates a new AccountType in the DB")
    @ApiResponses(value = {@ApiResponse(code = 201,message = "The AccountType was created successfully", response = GeneralResponse.class),@ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),@ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})

    public ResponseEntity<GeneralResponse<AccountTypeDto>> create(@ApiParam(value = "Request body to create a new AccountType.",required = true) @RequestBody AccountTypeDto accountType){
        AccountTypeDto accountTypeResponse = createAccountTypeFlow.create(accountType);
        GeneralResponse<AccountTypeDto> response = new GeneralResponse<>(true ,accountTypeResponse);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }





}