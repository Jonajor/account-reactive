package com.nbank.accountcommand.enums;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NonNull;

@Getter
public enum AccountEnum {
    USD("Dólar Comercial"),
    USDT("Dólar Turismo"),
    CAD("Dólar Canadense"),
    EUR("Euro"),
    GBP("Libra Esterlina"),
    ARS("Peso Argentino"),
    BTC("Bitcoin"),
    LTC("Litecoin"),
    JPY("Iene Japonês"),
    CHF("Franco Suíço"),
    AUD("Dólar Australiano"),
    CNY("Yuan Chinês"),
    ILS("Novo Shekel Israelense"),
    ETH("Ethereum"),
    XRP("Ripple");

    private String descricao;

    AccountEnum(String descricao){
        this.descricao = descricao;
    }

}
