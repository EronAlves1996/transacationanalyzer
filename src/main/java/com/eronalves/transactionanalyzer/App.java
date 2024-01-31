package com.eronalves.transactionanalyzer;

import java.util.function.Supplier;
import java.util.stream.Stream;

import com.eronalves.transactionanalyzer.model.Trader;
import com.eronalves.transactionanalyzer.model.Transaction;
import com.eronalves.transactionanalyzer.model.Transaction.Currency;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    Trader joao = new Trader("João", "Belo Horizonte");
    Trader carlos = new Trader("Carlos", "São Paulo");
    Trader jose = new Trader("Jimmy", "New York");
    Trader leo = new Trader("Leonardo", "Emirados Arabes");

    Supplier<Stream<Transaction>> transactions = () -> Stream.of(
        new Transaction(joao, 2015, 25.52f, Currency.BRL),
        new Transaction(jose, 2023, 54.55f, Currency.JPY),
        new Transaction(carlos, 2012, 24.89f, Currency.AUR),
        new Transaction(leo, 2023, 100.99f, Currency.USD),
        new Transaction(carlos, 2020, 300.40f, Currency.JPY),
        new Transaction(joao, 2014, 15.14f, Currency.AUR),
        new Transaction(leo, 2023, 15.23f, Currency.BRL));
  }
}
