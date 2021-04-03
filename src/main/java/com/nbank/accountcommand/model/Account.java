package com.nbank.accountcommand.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nbank.accountcommand.enums.AccountEnum;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Builder
@Data
@Document
public class Account {
    @Id
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "account_id")
    private String accountID = UUID.randomUUID().toString();
    @JsonProperty(value = "owner_name")
    @NotBlank
    private String ownerName;
    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    @JsonProperty(value = "age")
    private Integer age;
    @NonNull
    private AccountEnum coin;
}
